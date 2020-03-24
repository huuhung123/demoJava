/*
INTRODUCTION
  - Write once, run anywhere
  - Java is used to develop mobile apps, web apps, desktop apps, games and much more.
  - Java is a popular programming language, created in 1995.It is owned by Oracle, and more than 3 billion devices run Java. Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.) 
  - It is one of the most popular programming language in the world
  - It is easy to learn and simple to use. It is open-source and free, case sensative
 */

/*
SET UP JAVA ENVIRONMENT
  - Dowload Java Developer Kit (JDK)
  - Set environment variable
  - IntelliJ IDEA, Netbeans or Eclipse (IDE)
  
*/
/*
HOW TO JAVA RUN?
    Java Code(.java) ->> JAVAC compiler ->> Byte Code(.class) ->> JVM (Windows, Linux, Mac)
*/

/*
OBJECT
String, Math, Arrays : String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
                       int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
*/

/*
FOR - EACH LOOP
   - There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

   for (type variableName : arrayName) {
     // code block to be executed
   }

  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
  for (String i : cars) {
    System.out.println(i);
  }

/*
DATA TYPE
   - Names are case sensitive
   - CONST final
*/

/*
OPERATORS
   parameter(tham số)  <==>  argument(đối số)
*/

/*
FUNCTION 
   modifier returnType nameOfMethod (Parameter List) { 
     //method body 
   }
*/

/*
STRING
*/ 


/*
JAVA METHODS
   - A method is a block of code which only runs when it is called.You can pass data, known as parameters, into a method.Methods are used to perform certain actions, and they are also known as functions.
   - Why Methods? 
     To reuse code: define the code once, and use it many times.
*/

/*
JAVA OOP
   - Classes and objects are the two main aspects of object-oriented programming.
       Ex: class                        object
           fruit                        apple, banana, mango
           car                          mercedes, toyota, honda
  -> a class is a template for objects, and an object is an instance of a class. A class should always start with an uppercase first letter
 
      public class MyClass {                     public static void main(String[] args) {
         int x = 5;                                      MyClass myObj = new MyClass();
         public void myMethod() {                        myObj.myMethod();
            System.out.println("Hello World");           int a= myObj.x;
         }                                                }
                                                      }
*/

/*
JAVA CONSTRUCTOR
   - A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes

   public class Car {                                    public static void main(String[] args) {
       int modelYear;// Create a class attribute             //Create an object of class Car
       String modelName;                                     Car myCar = new Car(1969, "Mustang");
       // Create a class constructor for the MyClass class   }   
       public Car(int year, String name) {                 }
          modelYear = year;
          modelName = name;                             // Outputs 1969 Mustang
       }
   - The constructor name must match the class name, and it cannot have a return type (like void). 
     All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.
*/

/*
JAVA ACCESS MODIFIERS
   - For classes, you can use either  or default:
     + public: the class is accessible by any other class
     + default: the class is only accessible by classes in the same package. This is used when you don't specify a modifier
     + final:	the class cannot be inherited by other classes 
     + abstract: the class cannot be used to create objects (To access an abstract class, it must be inherited from another class.)
   - For attributes, methods and constructors, you can use the one of the following:
     + public: the code is accessible for all classes	
     + private:	the code is only accessible within the declared class	
     + default:	the code is only accessible in the same package. This is used when you don't specify a modifier
     + protected:	the code is accessible in the same package and subclasses.
     + final:	attributes and methods cannot be overridden/modified
     + static: attributes and methods belongs to the class, rather than an object( without creating objects)
     + abstract: can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from)
     + transient, synchronized, volatile,....

  // Code from filename: Person.java                     // Code from filename: MyClass.java
  abstract class Person {                                 class MyClass {
     public String fname = "John";                        public static void main(String[] args) {
     public int age = 24;                                // create an object of the Student class 
                                                         // which inherits attributes and methods from Person
     public abstract void study(); // abstract method       Student myObj = new Student();
     }                                                      System.out.println("Name: " + myObj.fname);
                                                            System.out.println("Age: " + myObj.age);
  // Subclass (inherit from Person)      System.out.println("Graduation Year: " + myObj.graduationYear);
  class Student extends Person {                             myObj.study(); // call abstract method
     public int graduationYear = 2018;                           }
     public void study() {                                 }
     // the body of the abstract method is provided here             //Name: John
        System.out.println("Studying all day long");                 //Age: 24
     }                                                               //Graduation Year: 2018
  }                                                                 //Studying all day long
*/

/*
JAVA ENCAPSULATION
   - The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
      + declare class variables/attributes as private
      + provide public get and set methods to access and update the value of a private variable
   - Get and Set
        You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.The get method returns the variable value, and the set method sets the value.
   - Why Encapsulation?
      + better control of class attributes and methods
      + class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
      + flexible: the programmer can change one part of the code without affecting other parts
      + increased security of data

  public class Person {
     private String name; // private = restricted access
     public String getName() {
       return name;    // Getter
     }
     public void setName(String newName) {
       this.name = newName;  // Setter
     }
  }

  //ERROR                                        //CORRECT
  public class MyClass {                         public class MyClass {
     public static void main(String[] args) {    public static void main(String[] args) {
     Person myObj = new Person();                   Person myObj = new Person();
     myObj.name = "John";  // error                 // Set the value of the name variable to "John"
     System.out.println(myObj.name); // error       myObj.setName("John"); 
     }                                              System.out.println(myObj.getName());
  }                                                 }
      // Outputs "John"                          }
*/

/*
JAVA PACKAGES AND API
   - A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:
     + built-in Packages (packages from the Java API)
     + user-defined Packages (create your own packages)
   - Built-in Packages :The library contains components for managing input, database programming, and much much more. The complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/.To use a class or a package from the library, you need to use the import keyword:
     + import package.name.Class;   // Import a single class    Ex import java.util.Scanner;
      //In the example above, java.util is a package, while Scanner is a class of the java.util package.
    To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read a complete line

   import java.util.Scanner;           
   class MyClass {                               String userName = myObj.nextLine();
      public static void main(String[] args) {   System.out.println("Username is: " + userName);
      Scanner myObj = new Scanner(System.in);           }
      System.out.println("Enter username");      }
   
     + import package.name.*;   // Import the whole package    Ex: import java.util.*;

   - User-defined Packages

*/

/*
JAVA INHERITANCE(SUBCLASS AND SUPERCLASS)
   - In Java, it is possible to inherit attributes and methods from one class to another.To inherit from a class, use the extends keyword. We group the "inheritance concept" into two categories:
     + subclass (child) - the class that inherits from another class
     + superclass (parent) - the class being inherited from

  class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
    }
  }
  class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {
    Car myCar = new Car();      // Create a myCar object
    myCar.honk();    // Call the honk() method (from the Vehicle class) on the myCar object
    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
    }
  }
  - Why Inheritance?
    It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
*/

/*
JAVA POLYMORPHISM
   - Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
   - Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.)
   - Why Polymorphism?
     It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

  class Animal {                                          class MyMainClass {
     public void animalSound() {                            public static void main(String[] args) {
     System.out.println("The animal makes a sound");           Animal myAnimal = new Animal();
    }                                                          Animal myPig = new Pig();
  }                                                            Animal myDog = new Dog();
  class Pig extends Animal {                                   myAnimal.animalSound();
     public void animalSound() {                               myPig.animalSound();
     System.out.println("The pig says: wee wee");              myDog.animalSound();
    }                                                      }
  }                                                      }
 class Dog extends Animal {
    public void animalSound() {
    System.out.println("The dog says: bow wow");
    }
  }
*/

/*
JAVA INNER CLASSES
*/

/*
JAVA ABSTRACTION
   - Data abstraction is the process of hiding certain details and showing only essential information to the user.
   - The abstract keyword is a non-access modifier, used for classes and methods:
      + abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class). An abstract class can have both abstract and regular methods
      + abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
   - Why abstraction?
     To achieve security - hide certain details and only show the important details of an object.

  // Abstract class
  abstract class Animal {
  public abstract void animalSound();   // Abstract method (does not have a body)
  public void sleep() {         // Regular method
    System.out.println("Zzz");
    }                                               class MyMainClass {
  }                                                    public static void main(String[] args) {
  // Subclass (inherit from Animal)                    Pig myPig = new Pig(); // Create a Pig object
  class Pig extends Animal {                           myPig.animalSound();
     public void animalSound() {                       myPig.sleep();
     // The body of animalSound() is provided here     }
     System.out.println("The pig says: wee wee");   }
    }
  }
*/

/*
JAVA INTERFACE
*/

/*
JAVA ENUMS
   - An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:
   - You can also have an enum inside(or outside) a class
   - Why Enums?
     Use enums when you have values that you know aren't going to change, like month days, days, colors,deck of cards, etc.

   enum Level {
      LOW,
      MEDIUM,
      HIGH
   }
   public class MyClass {
       public static void main(String[] args) {
         Level myVar = Level.MEDIUM;
         switch(myVar) {
           case LOW:
           System.out.println("Low level");
           break;                                   //Medium level
           case MEDIUM:
           System.out.println("Medium level");
           break;
           case HIGH:
           System.out.println("High level");
           break;
        }
      }
   }
*/

/*
JAVA USER INPUT (Scanner)

import java.util.Scanner;  // Import the Scanner class
class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");
    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}

import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
*/

/*
JAVA EXCEPTIONS - TRY ... CATCH
*/