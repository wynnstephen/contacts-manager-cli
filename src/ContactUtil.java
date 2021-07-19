import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ContactUtil {

    public static List<String> getContacts() {
        return new ArrayList<>();
    }


    //addContact
    public static void addContact() {

        try {
            Path pathToFile = Paths.get("src", "contacts.txt");
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
            Files.write(pathToFile, Arrays.asList(firstN + " " + lastN + " | " + phoneNum), StandardOpenOption.APPEND);
            getContacts().add(String.valueOf(new Contact(firstN, lastN, phoneNum)));
            //this adds and saves the info.
            System.out.println(firstN + lastN + " has been saved to your contact list.");
            //tells user that the info has been saved.
        } catch (InputMismatchException | IOException e) {
            System.out.println("Could not save. ");
        }
    }

    //searchContact
    public static void searchContact() {

        try {
            Path pathToFiles = Paths.get("src", "contacts.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter an existing name or number.");
            String findContact = scanner.nextLine();
            List<String> lists = Files.readAllLines(pathToFiles);

            for (String list : lists){
                if (list.contains(findContact)){
                    System.out.println(list);
                }
            }

        } catch (IOException e) {
            System.out.println("No such thing.");
        }


    }

    public static void deleteContact(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a name");
            String delete = sc.next();
            List<String> lines = Files.readAllLines(Paths.get("src", "contacts.txt"));
            List<String> newList = new ArrayList<>();
            for (String line : lines){
                if (line.contains(delete)){
                    newList.remove(delete);
                    continue;
                }
                newList.add(line);
                Files.write(Paths.get("src", "contacts.txt"), newList);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
