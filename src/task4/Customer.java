package task4;

public class Customer {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;



    // Методи для зміни даних користувача

    public void changeName(String firstName, String lastName) {

        this.firstName = firstName;

        this.lastName = lastName;

    }



    public void changeContactInfo(String phoneNumber, String email) {

        this.phoneNumber = phoneNumber;

        this.email = email;

    }



    // Методи для виведення даних користувача

    public void displayFullName() {

        System.out.println(firstName + " " + lastName);

    }



    public void displayContactInfo() {

        System.out.println(phoneNumber + ", " + email);

    }

}