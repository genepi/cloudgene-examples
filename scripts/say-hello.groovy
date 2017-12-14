import genepi.hadoop.common.WorkflowContext

def run(WorkflowContext context) {

	def name = context.get("name");

	for (int i = 1; i <= 10; i++){
		context.ok("Hello ${name}! This is message number " + i);
	}

	return true;
}
