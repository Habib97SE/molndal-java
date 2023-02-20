import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ArrayAndArrayList
{
    static Scanner scanner = new Scanner(System.in);

    public static boolean isStr1BiggerThanStr2 (String str1, String str2)
    {
        if (str1.charAt(0) == str2.charAt(0))
            return false;

        if (str1.charAt(0) < str2.charAt(0))
            return true;
        else
        {
            str1 = str1.substring(1);
            str2 = str2.substring(1);
            return isStr1BiggerThanStr2(str1, str2);
        }
    }


    public static String[] changePosition (String[] arr, int index1, int index2)
    {
        String temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }

    public static String[] sortArray(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (isStr1BiggerThanStr2(arr[i], arr[j])) {
                    arr = changePosition(arr, j, i);
                }
            }
        }

        return arr;
    }


    public static void main (String[] args)
    {
        System.out.print("Length of your array: ");
        int arrayLength = scanner.nextInt();
        String[] arr = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++)
        {
            System.out.print("Write your input: ");
            arr[i] = scanner.next();
        }

        System.out.println("============================");

        for (String str : arr)
            System.out.println(str);

        arr = sortArray(arr);

        System.out.println("============================");

        for (int i= arrayLength; i > 0; i--)
            System.out.println(arr[i]);
    }
}
