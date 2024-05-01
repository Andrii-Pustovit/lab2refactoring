package task4;

public class Customer {
    private PersonalInfo personalInfo;
    private ContactInfo contactInfo;

    public Customer(PersonalInfo personalInfo, ContactInfo contactInfo) {
        this.personalInfo = personalInfo;
        this.contactInfo = contactInfo;
    }

    // Методи для виведення даних користувача
    public void displayFullName() {
        System.out.println(personalInfo.getFirstName() + " " + personalInfo.getLastName());
    }

    public void displayContactInfo() {
        System.out.println(contactInfo.getPhoneNumber() + ", " + contactInfo.getEmail());
    }

    // Методи для зміни даних користувача
    public void changeName(String firstName, String lastName) {
        personalInfo.setFirstName(firstName);
        personalInfo.setLastName(lastName);
    }

    public void changeContactInfo(String phoneNumber, String email) {
        contactInfo.setPhoneNumber(phoneNumber);
        contactInfo.setEmail(email);
    }
}
