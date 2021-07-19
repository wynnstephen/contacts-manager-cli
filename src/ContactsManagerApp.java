import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ContactsManagerApp {
    public static void main(String[] args) throws IOException {
        menuMap();
    }


    //    public static void init(){
//        HashMap<String, Contact > contactsMap = FileIOUtil.getContacts(FileIOUtil.tryGetContent());
//        printContacts(contactsMap);
//    }
//
//
//    public static void printContacts(HashMap<String, Contact> contactsMap){
//
//        List<Contact> contacts = new ArrayList<>(contactsMap.values());
//        for (Contact contact : contacts){
//            System.out.println(contact.contactToString());
//        }
//    }
    //this is how we connect to the txt file
    public static void printContacts() throws IOException {
        Path contactPaths = Paths.get("src", "contacts.txt");
        List<String> contactList = Files.readAllLines(contactPaths);
        //this "i" will go through/"iterate" the txt file from beginning to end by one.
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }
    }


    public static void menuMap() throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("1. View Contacts");
            System.out.println("2. Add A New Contact");
            System.out.println("3. Search A Contact By Name");
            System.out.println("4. Delete An Existing Contact");
            System.out.println("5. Exit");
            System.out.println("Enter an option (1, 2, 3, 4 or 5): ");
            int userInput = scanner.nextInt();
            //user will choose 1-5 to direct to method.
            if (userInput == 1) {
                printContacts();
                menuMap();
            } else if (userInput == 2) {
             ContactUtil.addContact();
             menuMap();
            } else if (userInput == 3) {
                ContactUtil.searchContact();
             menuMap();
            } else if (userInput == 4) {
                ContactUtil.deleteContact();
             menuMap();
            } else if (userInput == 5) {
                System.out.println("Buh Bye");
                System.exit(0);
            } else {
                menuMap();
            }


        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            e.printStackTrace();
            //Will print out if user puts in an invalid input.
            menuMap();
        }

    }


}
