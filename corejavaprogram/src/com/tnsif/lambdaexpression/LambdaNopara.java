package com.tnsif.lambdaexpression;

@FunctionalInterface
interface Sayble{
	public String Say();
}

public class LambdaNopara {
public static void main(String[] args) {
	Sayble s=()->{return "i have nothing to say";};
	System.out.println(s.Say());
}

}
