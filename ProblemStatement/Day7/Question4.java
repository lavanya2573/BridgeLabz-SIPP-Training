import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (char c : str.toCharArray()) {
            if (result.indexOf(c) == -1)
                result += c;
        }
        System.out.println(result);
    }
}
