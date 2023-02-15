public class challenge02
{
    public static void main (String[] args)
    {
        final int AgeTwenty = 20;
        final int AgeThirty = 30;
        final int BreakAge = 40;
        String[] names = {"Elena Gilbert", "Stefan Salvatore", "Damon Salvatore", "Caroline Forbes", "Bonnie Bennett",
                "Tyler Lockwood", "Matt Donovan", "Alaric Saltzman", "Klaus Mikaelson", "Rebekah Mikaelson"};
        int[] ages = {17, 162, 177, 17, 17, 22, 19, 41, 1000, 1012};
        String youngestName = names[0];
        int youngestAge = ages[0];
        String oldestName = names[0];
        int oldestAge = ages[0];
        System.out.println("==========================");
        System.out.println("Alla som är under 20:");
        for (int i = 0; i < names.length; i++)
        {
            if (ages[i] < AgeTwenty)
                System.out.println(String.join("", "- " ,names[i], ": ", Integer.toString(ages[i])));
            if (ages[i] < youngestAge)
            {
                youngestAge = ages[i];
                youngestName = names[i];
            }
            if (ages[i] > oldestAge)
            {
                oldestAge = ages[i];
                oldestName = names[i];
            }
        }

        System.out.println("==========================");
        System.out.println("Alla som är 20 eller över 20, och under 30.");
        for (int i = 0; i < names.length; i++)
        {
            if (ages[i] >= AgeTwenty && ages[i] < AgeThirty)
                System.out.println(String.join("", "- " ,names[i], ": ", Integer.toString(ages[i])));
        }

        System.out.println("==========================");
        System.out.println("Alla som är yngre än 20 och äldre än 30.");
        for (int i = 0; i < names.length; i++)
        {
            if (ages[i] < AgeTwenty || ages[i] >= AgeThirty)
                System.out.println(String.join("", "- " ,names[i], ": ", Integer.toString(ages[i])));
        }

        System.out.println("==========================");
        System.out.println("Alla som har jämna tal i sina ålder");
        for (int i = 0; i < names.length; i++)
        {
            if (ages[i] % 2 == 0)
                System.out.println(String.join("", "- " ,names[i], ": ", Integer.toString(ages[i])));
        }

        System.out.println("==========================");
        System.out.println("Körningen stoppas om åldern är över 40.");
        for (int i = 0; i < names.length; i++)
        {
            if (ages[i] > BreakAge)
                break;
            System.out.println(String.join("", "- " ,names[i], ": ", Integer.toString(ages[i])));
        }

        System.out.println("==========================");
        System.out.println("Yngsta personen är:");
        // print youngest
        System.out.println(String.join("", "- " ,youngestName, " is the youngest, he/she is ",
                Integer.toString(youngestAge), " years old."));

        System.out.println("==========================");
        System.out.println("Äldsta personen är:");
        // print oldest
        System.out.println(String.join("", "- " ,oldestName, " is the oldest, he/she is ", Integer.toString(oldestAge)));


    }
}
