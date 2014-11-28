package main.java.inheritance;

public class Dog extends Animal {
	public Dog() {
		super();
		System.out.println("A new dog has been created!");
	}
	
	@Override
	public void sleep() {
		System.out.println("A dog sleeps...");
		System.out.println("...");
	}
	
	@Override
	public void eat() {
		System.out.println("A dog eats...");
	}
}
