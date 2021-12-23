import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        
        
        // toString() => 배열을 단순 출력시 object ID가 출력된다. toString을 이용하여 출력하면 값을 출력할 수 있다.
        System.out.println("# 1. Declare and initialize an array");
        int[] nums = {
            10,
            20,
            30,
            40
        };
        nums[2] = 90; // 배열의 요소를 변경한다.
        System.out.println(nums);

        // asList() => 배열을 ArrayList로 변환시켜준다. 반환되는 ArrayList는 크기가 고정되어있다.
        System.out.println("\n# 2. Arrays method: toString(), asList()");
        String[] names = {
            "A",
            "B",
            "C",
            "D"
        };
        List<String> name_list = Arrays.asList(names);
        System.out.println(name_list);
        System.out.println(name_list.get(2));

        // sort() => 배열의 원소들을 정렬한다.
        System.out.println("\n# 3. Arrays method: sort(array, Comparator), sort(array, int fromindex, int toindex)");
        Arrays.sort(names);
        System.out.println(Arrays.asList(names));

        Arrays.sort(names, Collections.reverseOrder());
        System.out.println(Arrays.asList(names)+ " = Collections.reverseOrder()");

        Arrays.sort(names,0,2);
        System.out.println(Arrays.asList(names)+"= names,0,2");

        // copyOf() => 배열을 복사해서 새로운 배열로 반환해준다.
        // copyOfRange => 배열의 특정범위를 복사해서 배열로 반환한다.
        System.out.println("\n# 4. Arrays method: copyOf, copyOfRange");
        String[] names_copy1 = Arrays.copyOf(names, names.length);
        System.out.println(Arrays.asList(names_copy1));

        String[] names_copy2 = Arrays.copyOfRange(names,0,2);
        System.out.println(Arrays.asList(names_copy2));

        // n차원배열 =>  배열요소를 n-1 배열을 가지는 배열
        System.out.println("\n# 5. Multiple Array");
        int[][][] allScores = {
                { { 90, 85, 70, 55, 60 }, { 96, 88, 81, 91, 75 }, { 96, 88, 81, 91, 75 }, { 96, 88, 81, 91, 75 } },
                { { 91, 82, 73, 54, 65 }, { 96, 87, 88, 99, 80 }, { 91, 82, 83, 94, 75 }, { 96, 87, 88, 99, 70 } },
                { { 92, 83, 74, 55, 66 }, { 97, 88, 89, 90, 71 }, { 92, 83, 84, 95, 76 }, { 97, 88, 89, 90, 71 } } };
        System.out.println(allScores[1][2][0]);

    }
}