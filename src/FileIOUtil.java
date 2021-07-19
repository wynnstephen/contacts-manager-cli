import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class FileIOUtil {

    public static List<String> tryGetContent(){

        try {
            return Files.readAllLines(Paths.get("src/contacts.text"));
        } catch(IOException e){
            System.out.println("Could not read from file.");
        }
        return null;
    }
    public static HashMap<String, Contact> getContacts(List<String> contactStrings){
        HashMap<String, Contact> contactsMap = new HashMap<>();
        for (String contactString : contactStrings) {
            String[] arr = contactString.split(",");
            Contact contact = new Contact(arr[0], arr[1]);
            contactsMap.put(arr[0], contact);
        }
        return contactsMap;
    }
}
