package com.java8;

public class LambdaEXpressionScope {
	
	final static String salutation = "Hello! ";
	   
	   public static void main(String args[]) {
	      GreetingService greetService1 = message -> System.out.println(salutation + message);
	      greetService1.sayMessage("Mahesh");
	      GreetingService greetService2 = message -> System.out.println(salutation + message);
	      greetService2.sayMessage("shilpa");
	   }
		
	   interface GreetingService {
	      void sayMessage(String message);
	   }

}
