import java.util.Scanner;

public class variables
{
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args)
    {

        int pastriesPrice = 25; // Priset på bullar
        int kalleMoney = 10; // Kalles pengar
        int pelleMoney = 10; // Pelles pengar
        int tjalleMoney = 10; // Tjalles pengar
        int redCrossDonation = 0; // Donation till Röda Korset

// Skriver ut informationen till Console
        System.out.println("Bullarna kostar " + pastriesPrice);
        System.out.println("Kalle har " + kalleMoney);
        System.out.println("Pelle har " + pelleMoney);
        System.out.println("Tjalle har " + tjalleMoney);
        System.out.println();

// Beräkning av summan för köpet
        System.out.println("De betalar " + (kalleMoney + pelleMoney + tjalleMoney));
        int moneyLeftAfterPurchase = (kalleMoney + pelleMoney + tjalleMoney) - pastriesPrice;
        kalleMoney -= 10;
        pelleMoney -= 10;
        tjalleMoney -= 10;
        System.out.println("Kalle har nu " + kalleMoney);
        System.out.println("Pelle har nu " + pelleMoney);
        System.out.println("Tjalle har nu " + tjalleMoney);
        System.out.println("Och får tillbaka " + moneyLeftAfterPurchase);
        System.out.println();

// Delar pengarna så att alla får en krona
        System.out.println("De delar så att de får en krona var");
        kalleMoney++;
        pelleMoney++;
        tjalleMoney++;
        moneyLeftAfterPurchase -= 3;
        redCrossDonation += moneyLeftAfterPurchase;
        System.out.println("Kalle har nu " + kalleMoney);
        System.out.println("Pelle har nu " + pelleMoney);
        System.out.println("Tjalle har nu " + tjalleMoney);
        System.out.println("Och donerar " + moneyLeftAfterPurchase + " till Röda korset");
        moneyLeftAfterPurchase = 0;
        System.out.println();

// Summerar utläggen
        System.out.println("Summa summarum:");
        int expenses = (10 - 1) * 3;
        System.out.println("De betalade 10 - 1 kronor var, alltså 9*3 = " + expenses + " kronor");
        System.out.println("och donerade 2 kronor");
        expenses += 2;
        System.out.println("Summan blir då: " + expenses);

// Kontrollerar att utläggen stämmer
        if (expenses != 30)
            System.out.println("Error 404: Krona not found");


    }
}

//**
//  Primitiva typer: int, double, char, short, long, float, byte, boolean
//  Reference typer: String, Array, Object, Klasser, Interface
// **/
// static metoder kan endast påverka ststik variabler.