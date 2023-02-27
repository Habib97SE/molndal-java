import java.util.ArrayList;
import java.util.Scanner;

public class challenge03
{
    static Scanner scanner = new Scanner(System.in);


    public static void main (String[] args)
    {
        final String equalSigns = "=============";
        ArrayList<String> nameList = new ArrayList<>();

        String[] menuItems = new String[]{"Exit", "Create new name", "Read names", "Update a name", "Delete a name"};


        boolean continueLoop = true;

        while (continueLoop)
        {
            System.out.println("Menu: ");
            System.out.println(equalSigns);
            for (int i = 0; i < menuItems.length; i++)
                System.out.println(String.join("", Integer.toString(i), "- ", menuItems[i]));
            System.out.println(equalSigns);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case (0):
                    // exit
                    continueLoop = false;
                    break;
                case (1):
                    // create
                    System.out.print("Enter the new name: ");
                    String newName = scanner.next();
                    nameList.add(newName);
                    break;
                case (2):
                    // read
                    if (nameList.size() == 0)
                    {
                        System.out.println("You should at least add one name to the list before using this function!");
                        break;
                    }
                    for (String name : nameList)
                        System.out.println(name);
                    break;
                case (3):
                    // update
                    if (nameList.size() == 0)
                    {
                        System.out.println("You should at least add one name to the list before using this function!");
                        break;
                    }
                    System.out.print("Enter the old name: ");
                    String oldName = scanner.next();

                    int nameIndex = nameList.indexOf(oldName);

                    if (nameIndex >= 0)
                    {
                        System.out.print("Enter the new name: ");
                        newName = scanner.next();
                        nameList.set(nameIndex, newName);
                        System.out.println("Name has been changed successfully.");
                    } else
                        System.out.println("Name was not found!");
                    break;
                case (4):
                    // delete
                    if (nameList.size() == 0)
                    {
                        System.out.println("You should at least add one name to the list before using this function!");
                        break;
                    }
                    System.out.println("Which name do you want to delete: ");
                    String deleteName = scanner.next();

                    boolean nameFound = nameList.remove(deleteName);
                    if (nameFound)
                        System.out.println(String.join("", deleteName, " has been deleted successfully."));
                    else
                        System.out.println("Name was not found!");
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }

    }

}
