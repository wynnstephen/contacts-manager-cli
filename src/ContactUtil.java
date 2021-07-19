import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ContactUtil {

    public static List<String> getContacts(){
        return new ArrayList<>();
    }


    //addContact
    public static void addContact(Path path) {
        System.out.println(path);
        try {
            Path pathToFile = Paths.get("ContactsManagerApp", "src", "contacts.text");
            Scanner sc = new Scanner(System.in);
            System.out.println("You have selected : Add a new contact");
            //user selected option 2
            System.out.print("First Name: ");
            //user input first name
            String firstN = sc.nextLine();
            System.out.println("Last Name: ");
            //user input last name
            String lastN = sc.nextLine();
            System.out.print("Phone Number: ");
            //user input phone #
            String phoneNum = sc.nextLine();
            Files.write(pathToFile, Collections.singletonList(firstN + lastN + phoneNum), StandardOpenOption.APPEND);
            getContacts().add(String.valueOf(new Contact(firstN, lastN, phoneNum)));
            //this adds and saves the info.
            System.out.println(firstN + lastN + " has been saved to your contact list.");
            //tells user that the info has been saved.
        }catch (InputMismatchException | IOException e) {
            System.out.println("Could not save. ");
        }
        }
    }
