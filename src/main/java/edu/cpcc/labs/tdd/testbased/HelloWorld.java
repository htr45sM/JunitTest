package edu.cpcc.labs.tdd.testbased;

public class HelloWorld {

	public String sayHelloTo(String username) {
		
		if (username == null) {
			throw new NullPointerException();
		}
		StringBuilder builder = new StringBuilder();
		builder.append("Hello ");
		builder.append(username);
		return builder.toString();
	}

}
