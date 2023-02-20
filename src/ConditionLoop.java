public class ConditionLoop
{
    public static void main (String[] args)
    {
        String[] namn = {"Harry Potter", "Hermione Granger", "Ron Weasley", "Luna Lovegood", "Draco Malfoy", "Neville Longbottom", "Ginny Weasley", "Fred Weasley", "George Weasley", "Cho Chang"};
        String[] svar = {"OK", "OK", "OK", "OK", "", "OK", "", "OK", "", "OK"};
        for (int i = 0; i < namn.length; i++)
        {
            // if svar is empty then continue
            if (svar[i].isEmpty())
                continue;

            System.out.println(namn[i]);
        }
    }
}
