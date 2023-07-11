import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Person person = new Person("Kevin","London");  //creates object by calling the constructor in Person.java
        Person person2 = new Person("Sandra","Morelia");

        System.out.println(person.getName());
        System.out.println(person2.getName());

        String personGreeting = person.greet("morning");
        String person2Greeting = person2.greet("evening");

        System.out.println(personGreeting);
        System.out.println(person2Greeting);

        person.finishCourse();

        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person2);

        for (Person human : people) {
            System.out.println(human.getName() +" "+ human.getTown() +" "+ human.getCourse());
        }
    }

}
