import java.util.Scanner;

public class Operation {
    public static void main(String[] args) throws Exception {
        PhoneBook phoneBook = new PhoneBook();
        displayMenu(phoneBook);
    }

    public static void displayMenu(PhoneBook p) throws Exception {
        Scanner sc = new Scanner(System.in);

        while(1>0){
            System.out.println("What do you want to do?");
            System.out.println("1. Add contact");
            System.out.println("2. Look up contact by name");
            System.out.println("3. Delete contact");
            System.out.println("4. Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch){
            case 1:
                System.out.println("Enter the number you want to add");
                String inputNumber = sc.nextLine();
                System.out.println("Enter the name you want to add");
                String inputName = sc.nextLine();
                p.insert(inputNumber, inputName);
                break;
            case 2:
                System.out.println("Enter the name you want to search");
                String lookUp = sc.nextLine();
                p.lookUp(lookUp);
                break;
            case 3:
                System.out.println("Delete the last name contact you search");
                p.delete();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                break;
        }}

    }
}
