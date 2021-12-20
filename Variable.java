public class Variable {
    int first;// 멤버변수, 인스턴스 변수

    static int second;//멤버변수, 클래스 변수

    public void printName(String name){
        //지역변수
        String prtMsg = name + "Hello";
        System.out.println(prtMsg);
    }
    
    public static void main(String[] args) {
        //인스턴스 생성
        Variable mc = new Variable();
        //인스턴스 변수 사용
        mc.first = 100;
        //클래스 변수사용
        Variable.second = 50; // b = 50으로 사용해도된다.

        mc.printName("vert");

        System.out.printf("%d,%d",mc.first,Variable.second);

        


    }
}
