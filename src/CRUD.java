import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CRUD
{
    static Scanner scanner = new Scanner(System.in);

    private static boolean checkSize (ArrayList<Person> people)
    {
        if (people.size() == 0)
            System.out.println("Listan är tom, vänligen lägga personer till listan först.");
        return people.size() > 0;
    }

    private static int findIndex (String firstName, String lastName, ArrayList<Person> people)
    {
        for (Person person1 : people)
        {
            if (person1.getFirstName().equals(firstName) && person1.getLastName().equals(lastName))
            {
                return people.indexOf(person1);
            }
        }
        return -1;
    }

    private static String[] getName ()
    {
        System.out.print("Skriv personens förnamn: ");
        String oldFirstName = scanner.next();

        System.out.print("Skriv personens efternamn: ");
        String oldLastName = scanner.next();

        return new String[]{oldFirstName, oldLastName};
    }

    public static Person create ()
    {
        System.out.print("Skriv ditt förnamn: ");
        String firstName = scanner.next();
        System.out.print("Skriv ditt efternamn: ");
        String lastName = scanner.next();
        System.out.print("Hur gammal är du: ");
        int age = scanner.nextInt();
        return new Person(firstName, lastName, age);
    }

    public static void read (ArrayList<Person> people)
    {
        if (!checkSize(people))
            return;
        for (Person person : people)
            System.out.println(person.toString());
    }

    public static ArrayList<Person> update (ArrayList<Person> people)
    {
        if (!checkSize(people))
            return people;

        String[] name = getName();

        int index = findIndex(name[0], name[1], people);

        if (index < 0)
        {
            System.out.println("Personen finns inte med i listan.");
            return people;
        }

        System.out.print("Skriv nya förnamnet: ");
        String newFirstName = scanner.next();
        System.out.print("Skriv det nya efternamnet: ");
        String newLastName = scanner.next();
        System.out.print("Skriv den nya åldern: ");
        int newAge = scanner.nextInt();

        Person newPerson = new Person(newFirstName, newLastName, newAge);

        people.set(index, newPerson);

        return people;

    }


    public static ArrayList<Person> delete (ArrayList<Person> people)
    {
        if (!checkSize(people))
            return people;
        String[] name = getName();
        int index = findIndex(name[0], name[1], people);
        if (index == -1)
        {
            System.out.println("Personen finns inte med i listan.");
            return people;
        }
        people.remove(index);
        return people;
    }

}