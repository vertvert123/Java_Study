public class Operator2 {
    public static void main(String[] args) {
        int a = 50;
        System.out.printf("정수값 a : %d, %s\n", a, Integer.toBinaryString(a));

        int result1 = a >> 1;
        System.out.printf("a >> 1 : %d, %s\n", result1, Integer.toBinaryString(result1));

        int result2 = a << 1;
        System.out.printf("a << 1 : %d, %s\n", result2, Integer.toBinaryString(result2));

        System.out.println("---------------------");

        int pw = 123456;
        int encpw, decpw;
        int key = 4040;

        System.out.println("암호화 전 비밀번호 :" + pw);

        encpw = pw ^ key;

        System.out.println("암호화 후 비밀번호 : " + encpw);

        decpw = encpw ^ key;
        System.out.println("복호화 후 비밀번호 : " + decpw);

    }

}