// Jacob Paullus JDP160430
// CS2336 Khan
// Description: convert from decimal to binary

public class dectobin {

    public String convert(int number){
        String returnString = "";
        int binary[] = new int[25];
        int ix = 0;
        while(number > 0){
            binary[ix++] = number%2;
            number = number/2;
        }
        for(int i = ix-1;i >= 0;i--){
            returnString = returnString + binary[i];
        }
        return returnString;
    }

}
