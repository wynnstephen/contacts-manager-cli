import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContactsManagerApp {
     //type out main for the Main Method
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
}
