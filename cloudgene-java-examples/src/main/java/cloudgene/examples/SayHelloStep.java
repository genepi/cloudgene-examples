package cloudgene.examples;

import cloudgene.sdk.CloudgeneStep;
import cloudgene.sdk.internal.WorkflowContext;

public class SayHelloStep extends CloudgeneStep {

	public boolean run(WorkflowContext context) {

		// parameters defined in yaml file
		String name = context.get("name");

		if (name == null || name.isEmpty()) {
			context.error("Please enter your name.");
			return false;
		}

		// some outputs
		context.ok("Hi " + name + ". This is as okey message");
		context.error("Hi " + name + ". This is as error message");
		context.warning("Hi " + name + ". This is as warning message");		

		// your application logic
		context.beginTask("Working....");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			context.endTask("Work failed.", e);
			return false;
		}
		context.endTask("Work done.", WorkflowContext.OK);

		return true;

	}

}