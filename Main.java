import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = "";
        int firstNumber = 0;
        int secoundnumber = 0;
        int result = 0;

        while (inputString != "quit" && inputString != "Quit") {

            System.out.print("Eingabe: ");
            inputString = scanner.nextLine();

            String[] inputarray = inputString.split(" ");

            firstNumber = Integer.parseInt(inputarray[0]);
            secoundnumber = Integer.parseInt(inputarray[2]);


             if (inputarray[1].equals("+")) {
                result = firstNumber + secoundnumber;
                System.out.print("Berechnung: " + firstNumber + " + " + secoundnumber + " = " + result);
                 System.out.println("");
            }

            else if(inputarray[1].equals("-")){
                 result = firstNumber - secoundnumber;
                 System.out.print("Berechnung: " + firstNumber + " - " + secoundnumber + " = " + result);
                 System.out.println("");
             }

             else if(inputarray[1].equals("*")){
                 result = firstNumber * secoundnumber;
                 System.out.print("Berechnung: " + firstNumber + " * " + secoundnumber + " = " + result);
                 System.out.println("");
             }

             else{
                     result = firstNumber / secoundnumber;
                     System.out.print("Berechnung: " + firstNumber + " / " + secoundnumber + " = " + result);
                     System.out.println("");
                 }
             }
        }
    }

