public class ValentinePresent
{
    public static void main (String[] args)
    {
        String[] flowerNames = {"Rosa orkidéer", "Röda rosor", "Vita liljor", "Gula Narcisser", "Svarta rosor", "Gr" +
                "öna" +
                " salladshuvuden", "Kompost"};
        int[] flowerPrices = {70, 50, 40, 30, 80, 20, 10};
        double budget = 500.0;
        boolean stillAffordToPay = true;
        String flowers = "";
        System.out.println(budget);
        while (stillAffordToPay)
        {
            for (int i = 0; i < flowerNames.length; i++)
            {
                if (flowerPrices[i] > budget)
                {
                    stillAffordToPay = false;
                    break;
                }
                if (budget >= 20.0 && flowerNames[i] == "Kompost")
                    continue;
                budget -= flowerPrices[i];
                flowers += flowerNames[i] + ", ";
                System.out.println("Added: " + flowerNames[i] + " which cost: " + flowerPrices[i] + " with budget: " + Double.toString(budget));
            }
        }
        String[] flowersInArray = flowers.split(",");
        for (int i= 0; i < flowersInArray.length; i++)
            System.out.println(flowersInArray[i]);

    }
}
