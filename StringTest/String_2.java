package StringTest;

import java.util.Arrays;
import java.util.StringJoiner;

public class String_2 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        String[] carArr = {
            "hyundai",
            "mercedes",
            "bmw"
        };
        for (String s: carArr) {
            sj.add(s.toUpperCase());
        }
        System.out.println(sj.toString());
        String s1 = " Hello World   ";
        String s2 = s1.trim();
        System.out.printf("#%s#\n",s1);
        System.out.printf("#%s#\n",s2);

        String s3=s1.substring(1,3);
        System.out.println(s3);

        System.out.println(s1.replace('l', 'k'));

        char[] carr = s2.toCharArray();
        System.out.println(Arrays.toString(carr));
    }
}