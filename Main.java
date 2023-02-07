import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputValues = sc.nextLine();

        // extracting values 
        List<Integer> values = Arrays.stream(inputValues.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        int multiple = values.get(0);
        int num = values.get(1);

        // checking is multiple or not
        if(Utility.isMultiple(multiple, num)) {
            System.out.println("Is a multiple");
        } else {
            System.out.println("Is not a multiple");
        }

        // closing resource
        sc.close();
    }
}
