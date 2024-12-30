import java.util.ArrayList;
import java.util.Scanner;
public class Methods {

    ArrayList<User> users = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String role;
    void add(){
        //to fix git
        System.out.print("enter id: ");
        String id = sc.nextLine();
        System.out.print("enter name: ");
        String name = sc.nextLine();
        System.out.print("enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("enter email: ");
        String email = sc.nextLine();
        System.out.print("enter password: ");
        String password = sc.nextLine();
        System.out.print("enter role: ");
        role = sc.nextLine();
        Role userRole = new Role(role);
        users.add(new User(id,name,age,email,password,userRole));
    }
    Role userRole = new Role(role);
    void display(){
        if (users.isEmpty()){
            System.out.println("No users were added yet !");
        }else {
            for (User user : users){
                System.out.println(user);
            }
        }
    }

        void search(){
            System.out.print("Enter name: ");
            String searchName = sc.nextLine();
            for (User user : users){
                if (user.getName().equalsIgnoreCase(searchName)){
                    System.out.println(user);
                    return;
                }
            }
            System.out.printf("%s not found", searchName);
        }
        void remove(){
            System.out.print("Enter name of the user you want to delete: ");
            String searchName = sc.nextLine();
            for (int i=0; i<users.size();i++){
                if (users.get(i).getName().equalsIgnoreCase(searchName)){
                    users.remove(i);
                    System.out.println("user deleted succefully");
                    return;
                }
            }
            System.out.printf("%s not found", searchName);
        }
        void edit() {
            System.out.print("Enter name of the user you want to edit: ");
            String searchName = sc.nextLine();
            for (User user : users) {
                if (user.getName().equalsIgnoreCase(searchName)) {
                    System.out.println("1. edit name" + "\n" + "2. edit age" + "3. edit email" + "\n" + "4. edit password" + "5. edit role" + "\n");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.print("enter new name: ");
                            user.setName(sc.nextLine());
                            break;
                        case 2:
                            System.out.print("enter new age: ");
                            user.setAge(sc.nextInt());
                            break;
                        case 3:
                            System.out.print("enter new Email: ");
                            user.setEmail(sc.nextLine());
                            break;
                        case 4:
                            System.out.print("enter new Password: ");
                            user.setPassword(sc.nextLine());
                            break;
                        case 5:
                            System.out.print("enter new role: ");
                            userRole.setRole(sc.nextLine());
                            break;
                        default:
                            System.out.println("invalid choice");
                    }
                }
            }


        }
    }



















