package Practice_Problem5;

class Dog {
    // Attributes (Fields) - Kept private for encapsulation
    private String name;
    private int age;
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Behaviors (Methods)
    public void bark() {
        System.out.println(name + " is barking! Woof Woof!");
    }

    public void spin() {
        System.out.println(name + " spins around in a circle!");
    }

    public void run() {
        System.out.println(name + " is running fast!");
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age can't be negative.");
        }
    }

//    public void setBreed(String breed) {
//        this.breed = breed;
//    }

     // display dog info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Breed: " + breed);
    }
}

public class DogFun {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Labrador");

        myDog.displayInfo();
        myDog.bark();
        myDog.spin();
        myDog.run();

        // Change name and age
        myDog.setName("Rocky");
        myDog.setAge(4);

        System.out.println("\nUpdated Info:");
        myDog.displayInfo();
    }
}
