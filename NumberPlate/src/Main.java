import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);

        String input = reader.nextLine();

        String[] inputParts = input.split(",");

        String numPlate = inputParts[0];

        String[] parts = numPlate.split(" ");

        String textPart = parts[1];

        int numPart = Integer.parseInt(parts[2]);

        int n = Integer.parseInt(inputParts[1].trim());

        numPart = numPart + n;

        int carryOver = numPart/10000;
        numPart = numPart%10000;

        String numString = Integer.toString(numPart);

        int sizeOfNumber = numString.length();

        for(int i=0; i<4-sizeOfNumber; i++){
            numString = "0"+numString;
        }

        char[] chars = textPart.toCharArray();

        if(carryOver>0){
            char temp = chars[1];
            chars[1]+=carryOver;

            if(chars[1]-'Z'>0){
                int diff = chars[1]-'A';
                chars[0]+=(chars[1]-'A')/26;
                chars[1] = 'A';
                chars[1]+=diff%26;
                if(chars[0]-'Z'>0){
                    System.out.println("Invalid Number");
                    return;
                }

            }

        }

        System.out.println(parts[0]+" "+chars[0]+""+chars[1]+" "+numString);


        return;



    }

}
