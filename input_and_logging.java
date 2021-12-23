import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class input_and_logging {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Please write your name");
        String name = scan.next();
        System.out.println("Please write your age");
        int age = scan.nextInt();

        System.out.println("HI!"+ name);
        System.out.println("Your Korean age is "+ (int)(age+1));

        // Logger 부분은 이해를 못하겠음 
        Logger logger = Logger.getLogger("Mylogger");

        logger.info("Main program started !!");
        logger.log(Level.WARNING, "Data file size too big");
        logger.setLevel(Level.FINE);
        ConsoleHandler ch =  new ConsoleHandler();
        ch.setLevel(Level.FINE);
        logger.addHandler(ch);

        logger.fine("Shutdown mainProgram!");

        scan.close();


    }
}
