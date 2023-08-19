package controlandswitch;

import java.util.Scanner;

public class SwitchProgram {
    public static void main(String[] args) {

        //int x=6;

        //taking input from user
        Scanner scanner = new Scanner(System.in);
        //


        String result = null;
        int x = scanner.nextInt();
        if (x > 10)
            System.out.println("Invalid Input");
        else {
            switch (x) {
                case 1:
                    result = "|";
                    break;
                case 2:
                    result = "||";
                    break;
                case 3:
                    result = "|||";
                    break;
                case 4:
                    result = "|V";
                    break;
                case 5:
                    result = "V";
                    break;
                case 6:
                    result = "V|";
                    break;
                case 7:
                    result = "V||";
                    break;
                case 8:
                    result = "V|||";
                    break;
                case 9:
                    result = "|X";
                    break;
                case 10:
                    result = "X";
                    break;
                default:
                    result = "invalid Input";
            }

            System.out.println("Your result for Input=" + x + " is = " + result);
        }
    }
}

