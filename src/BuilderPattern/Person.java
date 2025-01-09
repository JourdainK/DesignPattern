package BuilderPattern;

import java.time.LocalDate;

public class Person {

    private final String firstName;
    private final String middleName;
    private final String lastName;

    private final LocalDate dateOfBirth;

    private final String emailAddress;
    private final String phoneNumber;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.dateOfBirth = builder.dateOfBirth;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("First name and last name are required");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class PersonBuilder{
        private final String firstName;
        private String middleName;
        private final String lastName;

        private LocalDate dateOfBirth;

        private String emailAddress;
        private String phoneNumber;


        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder middleName(String middleName){
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder dateOfBirth(LocalDate dateOfBirth){
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public PersonBuilder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

        public PersonBuilder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
