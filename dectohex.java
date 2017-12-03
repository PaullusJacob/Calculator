public class dectohex {


    public static String convert(int number)
    {
        int quotient = number / 16;
        int remainder = number % 16;

        if (quotient == 0) // base case
        {
            return Integer.toString(remainder);
        }
        else
        {
            return convert(quotient) + Integer.toString(remainder);
        }
    }
}
