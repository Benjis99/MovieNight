package program;

import java.io.Serializable;
import java.util.Scanner;

public class Dialog implements Serializable {
    private static Scanner console = new Scanner(System.in);


    public static int dialog(int min, int max) {
        while (true) {
            try {
                int number = Integer.parseInt(console.nextLine());
                if (number >= min && number <= max)
                    return number;
                else {
                    System.out.println(TEXT_RED+"Wrong input!"+TEXT_RESET);
                }
            } catch (Exception e) {
                System.out.println(TEXT_RED+"Wrong input!"+TEXT_RESET);
            }
        }
    }

    public static int dialogScore(int min, int max) {
        while (true) {
            try {
                int number = Integer.parseInt(console.nextLine());
                if (number >= min && number <= max)
                    return number;
                else {
                    System.out.println(TEXT_RED+"Score is between 0-5!"+TEXT_RESET);
                }
            } catch (Exception e) {
                System.out.println(TEXT_RED+"Wrong input!"+TEXT_RESET);
            }
        }
    }

    public static int dialog2(String text, int min, int max) {
        while (true) {
            System.out.println(text);
            try {
                int number = Integer.parseInt(console.nextLine());
                if (number >= min && number <= max)
                    return number;
                else {
                    System.out.println(TEXT_RED+"Wrong input!"+TEXT_RESET);
                }
            } catch (Exception e) {
                System.out.println(TEXT_RED+"Wrong input!"+TEXT_RESET);
            }
        }
    }

    public static int dialog3(String text, int min, int max) {
        while (true) {
            System.out.println(text);
            try {
                int number = Integer.parseInt(console.nextLine());
                if (number >= min && number <= max)
                    return number;
                else {
                    System.out.println(TEXT_RED+"Wrong input!"+TEXT_RESET);
                }
            } catch (Exception e) {
                System.out.println(TEXT_RED+"Wrong input!"+TEXT_RESET);
            }
        }
    }


    public static int dialogWithoutMax(String text) {
        while (true) {
            System.out.println(text);
            try {
                return Integer.parseInt(console.nextLine());

            } catch (Exception e) {
                System.out.println(TEXT_RED+"Wrong input!"+TEXT_RESET);
            }
        }
    }


    public static String dialogString(String text) {
        System.out.println(text);
        return console.nextLine();
    }

    public static String dialogStringReturn() {
        return console.nextLine();
    }

    public static String enterButton() {
        String enterToContinue = console.nextLine();
        return enterToContinue;
    }


    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
}
