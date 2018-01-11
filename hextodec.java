// Jacob Paullus JDP160430
// CS2336 Khan
// Description: convert from hex to decimal

public class hextodec {


    public static int convert(String string) {
        String dig = "0123456789ABCDEF";
        string = string.toUpperCase();
        int val = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            int d = dig.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}
