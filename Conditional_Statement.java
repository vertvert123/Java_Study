import java.util.Scanner;

public class Conditional_Statement { //if문
    void login() {
        Scanner scan = new Scanner(System.in);

        System.out.print("## 아이디를 입력하세요 : ");
        String uname = scan.next();

        System.out.print("# 비밀번호를 입력하세요");
        String pwd = scan.next();

        if (uname.equals("vert") && pwd.equals("123")) {
            System.out.println("OKAY!!-> LOGIN OK");
        } else {
            System.out.println("Incorrect");
        }
    }
    void check() { // 3항연산
        int count = 10;
        String Msg = count > 0 ? "new mail!" : "no new mail"; //조건? ture값 : false값
        System.out.println(Msg);

    }
    public static void main(String[] args) {

        Conditional_Statement con = new Conditional_Statement();
        while (true) {
            System.out.printf("# 메뉴를 선택하세요 (1:로그인, 2: 쪽지확인, x: 종료)==>");
            Scanner scan = new Scanner(System.in);
            String sel = scan.next();

            switch (sel) { //switch문
                case "1":
                    con.login();
                    break;
                case "2":
                    con.check();
                    break;
                case "x":
                    System.exit(0);
                default:
                    System.out.println("Wrong value");
            }

        }

    }
}