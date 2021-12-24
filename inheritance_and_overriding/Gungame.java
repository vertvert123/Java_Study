package inheritance_and_overriding;

public class Gungame {
    public static void main(String[] args) {
        //Gun gun = new shotgun("shotgun");
        Gun gun = new Rifle("shotgun");
        gun.fire();
    }
}
