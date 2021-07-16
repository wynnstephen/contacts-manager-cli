import java.util.HashMap;

public class Contacts {

    public static HashMap<String, Contacts> contacts = new HashMap<>();





    public static void main(String[] args) {
        System.out.println(contacts);
    }
    contacts.put("Jack Blank", "024-234-5678");
    contacts.put("Jane Doe", "678-456-8907");
    contacts.put("Sam Space", "334-345-8345");
}

