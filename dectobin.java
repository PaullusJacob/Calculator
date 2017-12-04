public class dectobin {

    public String printBinaryFormat(int number){
        String returnString = "";
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            returnString = returnString + binary[i];
        }
        return returnString;
    }

}
