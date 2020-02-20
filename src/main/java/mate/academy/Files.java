package mate.academy;

import java.util.Scanner;

public enum Files {
    WORD("words.txt");

    private String name;

    Files(String name) {
        this.name = name;
    }

    public static String chooseFile() {
        System.out.println("Please, choose file to work with from that list:"
                + "\n1. words.txt\n0. Exit");
        System.out.println("Enter the number of file");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int choose = Integer.parseInt(scanner.next());
                switch (choose) {
                    case 1:
                        return WORD.getName();
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("You have entered the wrong number.Try again");
                }
            } catch (NumberFormatException e){
                System.out.println("You are allowed to enter only numbers.Try again");
            }
        }
    }

    public String getName() {
        return name;
    }
}
