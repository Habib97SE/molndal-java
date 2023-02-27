import java.util.ArrayList;
import java.util.Arrays;

public class CodeWars
{
    public static int[] arrayDiff(int[] a, int[] b)
    {
        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();
        for (int i : a)
            aList.add(i);
        for (int i : b)
            bList.add(i);
        aList.removeAll(bList);
        int[] result = new int[aList.size()];
        for (int i = 0; i < aList.size(); i++)
            result[i] = aList.get(i);
        return result;
    }

    public static void main (String[] args)
    {
        int[] a = arrayDiff(new int[]{1, 2, 2}, new int[]{2});
        for (int i : a)
            System.out.println(i);
    }
}
