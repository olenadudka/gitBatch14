package HW;

public class Dog {

	String name;
	String breed;
	String color;
	String size;
	boolean isFriendly;

	void bark() {
		if(breed.equals("Bulldog")){
			System.out.println("His burking can scare  anyone");
			
		}else {
			System.out.println(breed+" is barking");
		}
		}
	void eating(){
	System.out.println(breed+ " loves to eat a lot");	
	}
	
	public static void main (String[] args) {
		Dog dog1=new Dog();
		dog1.breed="Husky";
		dog1.size="big";
		dog1.color="grey";
		dog1.bark();
		System.out.println(dog1.breed+ " is a "+dog1.size+ " dog  ");
	
	Dog dog2=new Dog();
	dog2.breed="Bulldog";
	dog2.eating();
	dog2.bark();
	Dog dog3=new Dog();
	dog3.breed="Labrador";
	dog3.color="golden";
	dog3.bark();
	
}
}