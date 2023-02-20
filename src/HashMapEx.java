import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class HashMapEx
{

    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    public static void main (String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++)
            arr.add(rand.nextInt(1_000_000_000));

        Integer max = arr.get(0);
        for (Integer integer : arr)
        {
            if (integer > max)
                max = integer;
        }

        System.out.println("ArrayList size: " + arr.size());

        System.out.println("Max: " + max);
    }
}
