package java_40;

public class Test {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		BabyDog bd = new BabyDog();
//		bd.eat();
//		bd.bark();
//		bd.weep();
		
		Cat c = new Cat();
		c.eat();
		c.meow();
		
		Bird b = new Bird();
		b.eat();
		b.fly();
	}

}

//	OUTPUT:
//I'm eating
//Worf worf
//I'm eating
//Meow meow
//I'm eating
//I'm flying
