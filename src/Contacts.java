public class Contacts {
    private String firstName;

    private String lastName;
    double phoneNumber;

    public Contacts(String firstName, String lastName, double phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public static HashMap<String, Contacts> contacts = new HashMap<>();
//
//
//    public static void main(String[] args) {
//        System.out.println(contacts);
//    }
//    contacts.put("Jack Blank", "024-234-5678");
//    contacts.put("Jane Doe", "678-456-8907");
//    contacts.put("Sam Space", "334-345-8345");

}

