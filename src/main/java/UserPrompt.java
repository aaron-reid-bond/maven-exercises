import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class UserPrompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a something");
        String num = scanner.nextLine();

        System.out.println("You entered:" + num);

        if(StringUtils.isNumeric(num)){
            System.out.printf("%s is a number!%n", num);
        } else {
            System.out.printf("%s is not a number!%n", num);
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(num));

        System.out.println("Reversed: " + StringUtils.reverse(num));
    }
}
