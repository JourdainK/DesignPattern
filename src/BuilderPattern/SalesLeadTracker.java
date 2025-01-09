package BuilderPattern;

import java.time.LocalDate;

public class SalesLeadTracker {

    public static void main(String[] args) {

//        var person1 = new Person("Tracy", null,
//                "Westbay", LocalDate.of(1985,1,1),
//                "tracy@example.com",null);

        var person1 = new Person.PersonBuilder("Tracy", "Westbay")
                .dateOfBirth(LocalDate.of(1985,1,1))
                .emailAddress("example@example.com").build();

        addPersonToLeadTracker(person1);

//        var person2 = new Person("Jerome", "Henry",
//                "Donaldson", null,
//                null, "123456789");

        var person2 = new Person.PersonBuilder("Jerome", "Donaldson")
                .middleName("Henry")
                .phoneNumber("123456789").build();

        addPersonToLeadTracker(person2);
    }
    public static void addPersonToLeadTracker(Person person){
        System.out.println("Person added to lead tracker: " + person);
    }
}
