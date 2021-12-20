public class Operator {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        int result1 = a * b;
        int result2 = a % b;

        System.out.printf("result1 : %d\n",result1);
        System.out.printf("result1 : %d\n",result2);
        System.out.println("---------------------");

        a++;
        b *= 2;

        System.out.printf("a++ : %d\n",a);
        System.out.printf("b *= 2 : %d\n",b);
        System.out.println("--------------");

        System.out.printf("a++ : %d\n",a++);
        System.out.printf("--a : %d",--a); 

    }

}