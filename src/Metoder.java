import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Metoder
{

    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    public static void greeting ()
    {
        System.out.println("Hello, world!");
    }

    public static void greetingWithName ()
    {
        System.out.print("What is your name: ");
        String name = scanner.next();
        System.out.println("Hello mr/mrs" + name);
    }

    public static boolean checkAge ()
    {
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        return age >= 18;
    }

    public int sumNums (int numA, int numB)
    {
        return numA + numB;
    }

    public static boolean isEven (int num)
    {
        return num % 2 == 0;
    }

    public static boolean isEqual (int numA, int numB)
    {
        return numA == numB;
    }

    public static double convertToFahrenheit (double celcius)
    {
        return (celcius / 5.0) * 9 + 32;
    }

    public static double calaculateSquareArea (double width, double height)
    {
        return width * height;
    }

    public static double calculateRightAngledTriangleArea (double base, double height)
    {
        return base * height / 2;
    }

    public static double[] calculateAreaPerimitterCircle (int radius)
    {
        double area = Math.PI * (radius * radius);
        double perimiter = 2 * radius * Math.PI;
        double[] result = new double[]{area, perimiter};
        return result;
    }

    public static int sumDice (int numOfThrow)
    {
        int sum = 0;
        int[] diceSides = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numOfThrow; i++)
        {
            sum += diceSides[rand.nextInt(6)];
        }
        return sum;
    }

    public static int findLargest (int[] numbers)
    {
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > largest)
                largest = numbers[i];
        }
        return largest;
    }

    public static int findSmallest (int[] numbers)
    {
        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        return smallest;
    }


    public static void isPrime ()
    {
        System.out.println("Write a number: ");
        int number = scanner.nextInt();
        boolean result = true;
        for (int i = 0; i < number; i++)
        {
            if (number % i != 0)
            {
                result = false;
                break;
            }
        }
        if (result)
            System.out.println("It is prime!");
        else
            System.out.println("It is not prime!");
    }

    public static int calculateExponent (int num, int exponent)
    {
        int sum = 1;
        for (int i = 1; i <= exponent; i++)
            sum *= num;
        return sum;
    }

    public static boolean isCharInt (char a)
    {
        int result = a;
        if (result >= 48 && result <= 57)
            return true;
        return false;
    }

    public static boolean isVowel (char a)
    {
        ArrayList<Character> vowels = new ArrayList<Character>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        return vowels.contains(a);

    }

    public static double calculateTax (int price, int tax)
    {
        double taxInDouble = (tax / 100.0) + 1;
        return price * taxInDouble;
    }

    public static boolean isWholeNumber (double number)
    {
        return number % 1 == 0;
    }

    public static double findLargerDivisibleNumber (int num1, int num2)
    {
        int start = num1 + num2 + 1;
        while (true)
        {
            if (start % num2 == 0)
                return start;
            start++;
        }
    }

    public static int findNumberOfNumbers (String text)
    {
        if (text.length() == 0)
            return 0;
        int a = text.charAt(0);
        if (a >= 48 && a <= 57)
            return 1 + findNumberOfNumbers(text.substring(1));
        return findNumberOfNumbers(text.substring(1));
    }

    public static boolean isCharInteger (char a)
    {
        return (int) a >= 48 && (int) a <= 57;
    }

    public static int calculateSumNumbers (String text)
    {
        int sum = 0, i = 0, j = 0;

        String temp = "";

        while (i != text.length())
        {
            // if char is not integer skip rest of statement
            if (!isCharInteger(text.charAt(i)))
                continue;
            temp += text.charAt(i);
            j = i + 1;
            // check if next chars are also integers (a number with more than one digit).
            while (j != text.length())
            {
                if (isCharInteger(text.charAt(j)))
                {
                    temp += text.charAt(j);
                } else
                {
                    // if next char is not integer, convert temp to int then add up to sum.
                    sum += Integer.parseInt(temp);
                    temp = "";
                    // run the outer while loop from j position.
                    i = j;
                    break;
                }
                j++;
            } // end while(j)
            i++;
        } // end while (i)

        return sum;
    }


    public static void main (String[] args)
    {
        int sum = calculateSumNumbers("fry32g5gs");
        System.out.println(sum);
    }
}