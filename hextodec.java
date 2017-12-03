public class hextodec {


    public static String convert(int number)
    {
        int quotient = number / 10;
        int remainder = number % 10;

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
