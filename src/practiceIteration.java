public class practiceIteration
{
    public static void main (String[] args)
    {
        final double MinBalance = 25000.0;
        final double SavingRate = 0.2;
        String[] customers = {"Alex Löfström", "Anna Kinnunen", "Fredde Schiller","Mickan Schiller", "Ove Sundberg"};
        double[] balances = {10000.0, 25000.0, 5000.0, 75000.0, 200000.0};
        double[] savings = {0.0, 0.0, 0.0, 0.0, 0.0};

        for (int i = 0 ; i < customers.length; i++)
        {
            System.out.println(String.join("",
                    "- ", customers[i], " har ", Double.toString(balances[i]), " på sitt konto " +
                    "samt ", Double.toString(savings[i]), " sparat på sitt sparkonto."));

            // Om kapitalet är mindre än 25K, gör inget
            if (balances[i] < MinBalance)
                continue;

            // annars så spara en del.
            double saveBalance = balances[i] * SavingRate;
            if (saveBalance < MinBalance)
                saveBalance = MinBalance;
            balances[i] -= saveBalance;
            savings[i] += saveBalance;

            System.out.println("-- Ditt saldo har uppdaterats:");
            System.out.println(String.join("", "\tBalans på bankkontot: ",
                    Double.toString(balances[i])));
            System.out.println(String.join("", "\tBalans på sparkontot: ",
                    Double.toString(savings[i])));

            System.out.println();
        }

    }
}
