package inheritance_and_overriding;

public class Gun { // inheritance and overriding

    protected String model;
    protected int bulletcount;

    public void fire() {
        System.out.println(model + "=>");
        bulletcount -= 1;
    }

    public Gun(String model) {
        bulletcount = 10;
        this.model = model;
    }

}