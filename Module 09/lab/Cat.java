public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }
    public Cat() {
        this(" ");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats fish");
    }
    

    // I'm more of a dog person, I don't know what cats like to play with.
    public void play() {
        System.out.println("The cat plays with the cat-toy");
        
    }
    
    // Setters and Getters for name
    public void setName(String name) {
        this.name = name;
        
    }
    public String getName() {
        return name;
    }
    
}
