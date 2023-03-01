import java.util.ArrayList;
import java.util.Scanner;

public class CrudMain
{
    static Scanner scanner = new Scanner(System.in);

    /**
     * Skriver ut menyalternativen samt tar in användarens inmatning för menyalternativ
     *
     * @param menuItems : Array med alla alternativ som ska visas ut
     * @return returnerar integer av användarens val
     */
    public static int printMainMenu (String[] menuItems)
    {
        System.out.println("================================");
        for (int i = 0; i < menuItems.length; i++)
            System.out.println(String.join("", Integer.toString(i), ". ", menuItems[i]));
        System.out.println("================================");
        System.out.print("Skriv in ditt val: ");
        return scanner.nextInt();
    }

    public static void main (String[] args)
    {
        ArrayList<Person> people = new ArrayList<>();

        String[] menuItems = new String[]{"Avsluta", "Skapa en ny person", "Skriv ut person lista", "Ändra en " +
                "befintlig person", "Radera en befintlig person"};

        boolean continueLoop = true;
        while (continueLoop)
        {
            int choice = printMainMenu(menuItems);
            switch (choice)
            {
                case 0:
                    // exit
                    continueLoop = false;
                    break;
                case 1:
                    // create
                    people.add(CRUD.create());
                    break;
                case 2:
                    // read
                    CRUD.read(people);
                    break;
                case 3:
                    // update
                    CRUD.update(people);
                    break;
                case 4:
                    // delete
                    CRUD.delete(people);
                    break;
                default:
                    // wrong input
                    System.out.println("Fel inmatning, försök igen.");
                    break;
            }
        }

    }
}