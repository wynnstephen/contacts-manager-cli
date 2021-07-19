import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class ContactsManagerApp {
    public static void main(String[] args) {

        init();

    }


    public static void init(){
        HashMap<String, Contact> contactsMap = FileIOUtil.getContacts(FileIOUtil.tryGetContent());
        printContacts(contactsMap);
    }


    public static void printContacts(HashMap<String, Contact> contactsMap){

        List<Contact> contacts = new ArrayList<>(contactsMap.values());
        for (Contact contact : contacts){
            System.out.println(contact.contactToString());
        }
    }
    public static void menuMap(Path path) throws IOException{
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("1. View Contacts");
            System.out.println("2. Add A New Contact");
            System.out.println("3. Search A Contacts By Name");
            System.out.println("4. Delete An Existing Contact");
            System.out.println("5. Exit");
            System.out.println("Enter an option (1, 2, 3, 4 or 5)");
            Byte userInput = scanner.nextByte();
            //user will choose 1-5 to direct to method.

            menuDirect(userInput, path);

        } catch(InputMismatchException e){
            System.out.println("Invalid input");
            e.printStackTrace();
            //Will print out if user puts in an invalid input.
            menuMap(path);
        }
    }

    public static void menuDirect(Byte userInput, Path path) throws IOException{
        }
}
