package day19_TypeCasting;

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

//______________MAIN METHOD___________
public class AD_Rules_Object_TypeCasting {

	public static void main(String[] args) {
		// Rules to avoid run time, compile time exceptions
		
// Rule 1 - Conversion is valid or not (compile time error)
		// the type of Cat and animal must have some parent child or child parent relationship
		
		Animal animal = new Dog();
		Cat cat = (Cat) animal; // valid as per rule 1 (animal is parent for Cat)
		
		//	Dog dog = new Dog();
		//	Cat cat = (Cat) dog; // invalid as per rule 1 (no relation between Cat and dog)
		
// Rule 2 -Assignment is valid or not (compile time error)
		// (Cat) must be either same or child of Cat
		// after conversion the (Cat) animaltwo should be assigned to Cat type only
		
		Animal animaltwo = new Dog();
		Cat cattwo = (Cat) animaltwo; // valid as per rule 2 ((Cat) is same type of Cat)
	//   A	  b		   C	   d
		
	// eg Animal animal = new Dog();
	//	  Cat cat = (Dog) animal;  // valid as per rule 1, but invalid as per rule 2
		
// Rule 3 - The underlying object type must be same or child of Class	(run time error)
		// The underlying object type of animal must be either same or child of (Cat)
		
		Animal animalthree = new Dog();
		Cat catthree = (Cat) animalthree;// invalid as per rule 3 (underlying object type of animalthree is dog)
		
		
		// Rule 1, 2, 3
		
		Animal an = new Dog();
		Dog dg = (Dog) an;  // Rule 1 satisfied >> (Dog) and an has a relationship
							// Rule 2 satisfied >> storing (Dog) type of object to Dog type variable
							// Rule 3 satisfied >> underlying object of an = Dog, is same as conversion (Dog)
		
		
	}

}
