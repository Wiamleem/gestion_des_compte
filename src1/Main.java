import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Methods methods=new Methods();

            while (true){
                System.out.println("\n===  Menu ===");
                System.out.println("1. Add a user");
                System.out.println("2. Display all users");
                System.out.println("3. Search a user");
                System.out.println("4. Remove a user");
                System.out.println("5. Edit a user");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                int option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {
                    case 1:
                        methods.add();
                        break;
                    case 2:
                        methods.display();
                        break;
                    case 3:
                        methods.search();
                        break;
                    case 4:
                        methods.remove();
                        break;
                    case 5:
                        methods.edit();
                        break;
                    case 6:
                        System.out.println("Goodbye...<3!");
                        return;
                    default:
                        System.out.println("Invalid option. Please enter a number between 1 and 6.");
                }


        }
    }
}