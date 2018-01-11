// Jacob Paullus JDP160430
// CS2336 Khan
// Description: convert from decimal to hexadecimal

public class dectohex {


    public static String convert(int number)
    {
        int q = number / 16;
        int r = number % 16;

        if (q == 0) // base case
        {
            return Integer.toString(r);
        }
        else
        {
            return convert(q) + Integer.toString(r);
        }
    }
}
