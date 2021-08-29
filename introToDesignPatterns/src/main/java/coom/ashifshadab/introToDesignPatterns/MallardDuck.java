package coom.ashifshadab.introToDesignPatterns;

public class MallardDuck extends Duck {
	
	

	public MallardDuck() {
		
		super();
		
		flyBehavior = new FlyWithWings();
		
		quackBehavior = new Quack();
	}

	@Override
	public void display() {

		System.out.println("I am real Mallard Duck");

	}

}
