public class TestAnimal {
    public static void main(String[] args) {
        Fish d = new Fish("Nemo");
        Cat c = new Cat("Fluffy");
        Animal a = new Fish("Pedro");
        Animal e = new Spider();
        Pet p = new Cat();

        // Print out information about the fish
        System.out.println("Fish Information:");
        System.out.println("The fish's name is " + d.getName()); // Print the fish's name
        d.eat();
        d.walk();
        // Testing out different ways to print out the fish's name and other info
        a.eat();
        a.walk();

        // Print out information about the cat
        System.out.println("\nCat Information:");
        c.eat(); // Calling the eat method from the Cat class
        c.play();
        c.walk();
        p.play();
        p.setName("Kitty"); // Set cat1's name to "Kitty"
        ((Cat) p).play(); // Casting cat1 to a Cat object
        ((Cat) p).eat();
        ((Cat) p).walk();
       
        // Testing out different ways to print out the cat's name
        System.out.println("\nThe cat's name is " + c.getName()); // Print the cat's name that was given in the constructor
        System.out.println("The cat's name is " + p.getName());
        System.out.println("The cat's name is " + ((Cat) p).getName());
    

        // Print out information about the spider
        System.out.println("\nSpider Information:");
        e.walk(); // Calling the walk method from the Animal class
        e.eat(); // Calling the eat method from the Spider class
        ((Spider)e).eat(); // Casting spider to a Spider object




    }
}