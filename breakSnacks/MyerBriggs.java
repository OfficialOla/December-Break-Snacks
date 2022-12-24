package breakSnacks;

import java.util.Scanner;

public class MyerBriggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        int option = 0;
        int value1 = 0, value2 = 0, value3 = 0, value4 = 0, value5 = 0;
//        while (!userInput.equals("quit")){
//            System.out.println("Enter input: ");
//            userInput = scanner.next().toLowerCase();
////            System.out.println(userInput);
//        }
//        while (true) {
            System.out.println("""
                    Question 1
                    A. expend energy, enjoy groups
                    B. conserve energy, enjoy one-on-one""");
            System.out.println("Enter option A or B ");
            userInput = scanner.next();
            while (!userInput.equalsIgnoreCase("A") && (!userInput.equalsIgnoreCase("B"))){
                System.out.println("Enter valid input: ");
                userInput = scanner.next();
            if (userInput.equalsIgnoreCase("a")){
                value1++;
            }

            }
        System.out.println("""
                    Question 2
                    A. expend energy, enjoy groups
                    B. conserve energy, enjoy one-on-one""");
        System.out.println("Enter option A or B ");
        userInput = scanner.next();
        while (!userInput.equalsIgnoreCase("A") && (!userInput.equalsIgnoreCase("B"))){
            System.out.println("Enter valid input: ");
            userInput = scanner.next();
        if (userInput.equalsIgnoreCase("a")){
                value1++;
            }
        }
        System.out.println("""
                            Question 3
                            A. logical, thinking, questioning;
                            B. empathetic, feeling, accommodating""");
        System.out.println("Enter option A OR B: ");
        userInput = scanner.next();
        while (!userInput.equalsIgnoreCase("A") && (!userInput.equalsIgnoreCase("B"))) {
            System.out.println("Enter valid input: ");
            userInput = scanner.next();
        if (userInput.equalsIgnoreCase("a")){
                value1++;
            }
        }
        System.out.println("""
                            Question 4
                            A. organized, orderly;
                            B. flexible, adaptable""");
        System.out.println("Enter option A OR B: ");
        userInput = scanner.next();
        while (!userInput.equalsIgnoreCase("A") && (!userInput.equalsIgnoreCase("B"))) {
            System.out.println("Enter valid input: ");
            userInput = scanner.next();
        if (userInput.equalsIgnoreCase("a")){
                value1++;
            }
        }
        System.out.println("""
                            Question 5
                            A. more outgoing, think out loud;
                            B. more reserved, think to yourself""");
        System.out.println("Enter option A OR B: ");
        userInput = scanner.next();
        while (!userInput.equalsIgnoreCase("A") && (!userInput.equalsIgnoreCase("B"))) {
            System.out.println("Enter valid input: ");
            userInput = scanner.next();
            option = Integer.parseInt(userInput);
        if (userInput.equalsIgnoreCase("a")){
                option++;
            }
        }
        System.out.println(option);
    for (int i = 0; i < userInput.length(); i++) {
            if (option >= 3){
                System.out.println("Extrovert");
            } else System.out.println("Introvert");
        }
        System.out.println(userInput.length());
//            if (userInput.equalsIgnoreCase("A") && (userInput.equalsIgnoreCase("B"))) break;
//            System.out.println("Enter a valid option ");}
//
//        while (true){
//            System.out.println("""
//                            Question 2
//                            A. interpret literally
//                            B. look for meaning and possibilities""");
//            System.out.println("Enter option A OR B: ");
//            userInput = scanner.next();
//            if (userInput.equalsIgnoreCase("A") || userInput.equalsIgnoreCase("B"))break ;
//            System.out.println("Enter a valid option ");
//        }

    }
    public static String getOption(Scanner input){
        String option;
        while (true){
            try {
                option = input.nextLine();
                if(option.trim().equalsIgnoreCase("A".trim()) || option.trim().equalsIgnoreCase("B".trim())){
                    return option;
                }else {
                    throw new IllegalArgumentException("Wrong choice; choose A or B");
                }
            }catch (IllegalArgumentException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}
