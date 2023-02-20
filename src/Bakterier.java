public class Bakterier
{
    public static void main (String[] args)
    {
        final int MaxAllowedNumber = 1_000_000_000; // one billion
        // Definiera arrayer som innehåller information om varje bakterie
        String[] bacteriaNamn = {"Bacillus cereus", "Staphylococcus aureus", "Escherichia coli", "Salmonella enterica", "Listeria monocytogenes", "Bakus smällningus"};
        double[] growthRates = {0.3, 0.4, 0.5, 0.6, 0.7, 1.1};
        double[] minGrowthRates = {0.25, 0.35, 0.45, 0.55, 0.65, 1.05};
        double[] maxGrowthRates = {0.35, 0.45, 0.55, 0.65, 0.75, 1.15};
        int[] daysTo50Percentages = {10, 8, 6, 5, 4, 2};

        // dominant bakteria
        String dominantBakteriaName = "";
        int antalDominantBakteria = 0;

        for (int i = 0; i < bacteriaNamn.length; i++)
        {
            // Hämta information om nuvarande bakterie

            // Skapa variabler för att spåra bakteriepopulationen och tiden
            int daysTo50Percent = daysTo50Percentages[i];
            int days = 0;
            double bacteriaCount = 1;
            String bacteria = bacteriaNamn[i];
            double growthRate = 1.0 + growthRates[i];
            // Simulera bakterietillväxt tills en av tre villkor uppfylls
            while (true)
            {
                if (bacteriaCount >= MaxAllowedNumber)
                {
                    System.out.println(bacteria + " har tagit över labbet!");
                    return;
                } else if (bacteriaCount >= 0.5)
                { // ask about the variable which should be validated here
                    System.out.println(bacteria + " har nått 50% av labbet!");
                    break;
                } else if (days >= daysTo50Percent)
                {
                    System.out.println(bacteria + " misslyckades med att nå 50% i tid.");
                    return;
                }

                // Beräkna tillväxtfaktorn baserat på bakteriepopulationen
                double growthFactor = (bacteriaCount * growthRate) / bacteriaCount;
                bacteriaCount += bacteriaCount * growthFactor;
                days++;
                // Beräkna ny bakteriepopulation baserat på tillväxtfaktorn
            } // end while-loop

            // Uppdatera informationen om den dominerande bakterien
        } // end for-loop

        System.out.println(dominantBakteriaName);

    }
}
