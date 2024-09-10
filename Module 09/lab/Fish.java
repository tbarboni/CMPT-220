public class Fish extends Animal implements Pet{
    private String name;

    // Set legs to 0 due to most unmutated fish having no legs
    public Fish(String name) {
        super(0);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // Override walk because fish can't walk
    @Override
    public void walk() {
        System.out.println("Fish don't walk");
    }

    // I know fish don't typically eat spiders, but that idea is funny to me.
    @Override
    public void eat() {
        System.out.println("The fish eats spiders");
    }

    // I've never seen a typical fish "play" with anything. But they sure do have a lot of pebbles to play with
    public void play() {
        System.out.println("Fish plays with pebbles");
    }

    
}
