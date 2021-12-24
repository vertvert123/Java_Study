public class Car { // Class and instance
    private String color;
    private String model;
    private int power;
    private int carSpeed;


    public Car() { //기본생성자
        carSpeed = 0;
    }

    public Car(String color, String model, int power) {
        this.color = color;
        this.model = model;
        this.power = power;
    }

    public void go() {
        if (power < 200) {
            carSpeed += 10;
        } else if (power >= 200) {
            carSpeed += 20;
        }
        System.out.printf("Accelerate %s %s, Current Speed %d\n", model,color, carSpeed);
    }
    public void stop(){
        carSpeed = 0;
    }
    public static void main(String[] args) {
        Car c1 = new Car("RED","Morning",300);
        c1.go();
    }
}

