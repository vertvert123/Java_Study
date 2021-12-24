package inheritance_and_overriding;

public class Rifle extends Gun{
    public void fire() {
        bulletcount -= 5;
        System.out.printf("%s => => => => => , %d\n",model, bulletcount);
    }

    public Rifle(String model) {
    	super(model);
        bulletcount = 40;
    }	

}
