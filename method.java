public class method {

    String name;

    method(){//생성자 메소드
        name = "vert";
        System.out.printf("#생성자 : %s\n",name);
    }
    //인자가 없는 메소드
    void printName(){
        System.out.printf("#printname()","%s\n",name);
    }
    //인자가 하나인 메소드(메소드 오버로딩), 인자값이 출력됨.
    void printName(String name){
        System.out.printf("#printName(),%s\n",name);
    }

    //가변인자를 사용한 메소드
    void printNames(String...name){
        System.out.println("#printNames(String...name)");
        for(String s : name){
            System.out.println(s);
        }
    }
    //인자가 2개인 메소드
    int calc(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        method m = new method();
        m.printName();
        m.printName("vertvert");
        m.printNames("aa","bb","cc");
        System.out.printf("#calc(int a, int b): %d",m.calc(10, 20));
        
    }
}
