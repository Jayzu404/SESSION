import java.util.Scanner;

public class SessionWeek3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// ============= for loop =============

//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

//        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 10; i++) {
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

// ============= while loop =============

//        int secretNumber = 5;
//        int attempt = 0;
//        int guess = 0;
//
//        while (guess != secretNumber) {
//            System.out.print("Enter your guess: ");
//            guess = sc.nextInt();
//            attempt++;
//
//            if (guess < secretNumber) {
//                System.out.println("\nWrong guess, too low!\n");
//            } else if (guess > secretNumber) {
//                System.out.println("\nWrong guess, too high!\n");
//            } else {
//                System.out.println("\nCongrats you guessed it in " + attempt + " attempts!\n");
//            }
//        }

// ============= do-while loop =============

//        int choice = 0;
//
//        do {
//            System.out.println("[1] Greet");
//            System.out.println("[2] Say hi");
//            System.out.println("[3] Say hello");
//            System.out.println("[4] Exit");
//            System.out.println("===============");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("\nGood day mate!\n");
//                    break;
//                case 2:
//                    System.out.println("\nHi there!\n");
//                    break;
//                case 3:
//                    System.out.println("\nHello there!\n");
//                    break;
//                case 4:
//                    System.out.println("\nExiting...\n");
//                    break;
//                default:
//                    System.out.println("\nInvalid choice, please try again\n");
//            }
//        } while (choice != 4);
    }
}