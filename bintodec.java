// Jacob Paullus JDP160430
// CS2336 Khan
// Description: convert from binary to decimal

public class bintodec {
    public static int convert(String string){
        double k=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)== '1'){
                k=k+ Math.pow(2,string.length()-1-i);
            }

        }
        return (int) k;
    }
}
