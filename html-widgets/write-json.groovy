import genepi.hadoop.common.WorkflowContext
import groovy.json.JsonSlurper
import groovy.json.JsonBuilder

class Quote {
  String quote
  Integer number
}

def run(WorkflowContext context) {

  def url = new URL("https://gist.githubusercontent.com/robatron/a66acc0eed3835119817/raw/0e216f8b6036b82de5fdd93526e1d496d8e1b412/quotes.txt")
  def content = url.getText()
  def lines = content.split("\n")

  def list = []

  def output = context.getConfig("output")

  for (int i = 1; i <= 100; i++){
    int random = new Random().nextInt(lines.length); // get random line number
    String randomLine = lines[random]; // get random line
    def quote = new Quote(quote: randomLine, number: i);
    list << quote;
  }

  new File(output).write(new JsonBuilder(list).toPrettyString())

	return true;
}
