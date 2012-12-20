package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import start.popup.actions.Start;


public class MyTestRunner {
	
	private static int size;
	private static String message;

	public static void start(){
		
		Result result = JUnitCore.runClasses(Start.class);
		size = result.getFailureCount();
		for (Failure failure : result.getFailures()) 
		      System.out.println(message = failure.toString());
		
		
	}

}
