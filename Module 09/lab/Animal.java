
public abstract class Animal {
    protected Integer legs;

    protected Animal(Integer legs) {
        this.legs = legs;
    }
    
    
    public abstract void eat();

  


    public Integer getLegs() {
        return legs;
    }


    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("This animal walks on " + legs + " legs");
    }
}
