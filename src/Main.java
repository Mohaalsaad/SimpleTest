import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Chatbot!");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello! I'm the Java Chatbot. What's your name?");

        String userName = myScanner.nextLine();
        System.out.println("Nice to meet you, " + userName + "! Do you want to learn about Math? (yes/no)");

        String answer;
        String answer2;
        int chance = 3;

        do {
            answer = myScanner.nextLine();
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("I do not understand you :)");
                System.out.println("Do you want to learn about Math? (yes/no)");
            }
        } while (!answer.equals("yes") && !answer.equals("no"));

        if (answer.equals("yes")) {
            System.out.println("Great! Let's start with an easy question, " +
                    "What is the result for 24 * 8? Do not use a calculator :)");
            answer2 = myScanner.nextLine();
            while (!answer2.equals("224") && chance > 0) {
                System.out.println("Sorry, wrong answer!");
                chance--;
                if (chance > 0) {
                    System.out.println("You still have " + chance + " chance(s). Please try again:");
                    answer2 = myScanner.nextLine();
                }
            }
            if (answer2.equals("224")) {
                System.out.println("Great! You will become a mathematician :)");
            } else {
                System.out.println("You've run out of chances. Better luck next time!");
            }
        } else if (answer.equals("no")) {
            System.out.println("Okay, maybe next time!");
        }
    }
}


// arbatry lose