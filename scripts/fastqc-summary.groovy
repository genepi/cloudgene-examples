import genepi.hadoop.common.WorkflowContext

def run(WorkflowContext context) {

  def directoryName = context.getConfig("fastqc_output")

  def findFilenameClosure = {
     //find summary file
     if (it.name.endsWith('summary.txt')){
       //read line by line
      def lines = it.readLines()
      for (line in lines){
        // get method name and reports status to Cloudgene
        def label = line.split('\t')[1]
        if (line.contains('PASS')){
          context.ok(label)
        } else if (line.contains('WARN')){
          context.warning(label)
        } else {
          context.error(label)
        }
      }
     }
  }

  def directory = new File(directoryName)
  directory.eachFileRecurse(findFilenameClosure)
  return true;

}
