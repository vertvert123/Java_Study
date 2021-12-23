public class Loop_statement {

    public static void main(String[] args) {
        int count = 12;
        String people[] = {
            "vert",
            "vertvert",
            "vertvert123"
        };
        for (int i = 0; i < 10; i++) { //for문 기초
            System.out.println(i);
        }
        for (int i = 0; i < people.length; i++) { //for문으로 배열출력
            System.out.println(people[i]);
        }
        for(String name : people){
            System.out.println(name);
        }

        while (count > 10) { //while 문
            System.out.println("go");
            count--;
        }
        System.out.println("exit");

    }
}