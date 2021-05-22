//Add comments...Format code....Verify values

/*
-----------------Readme--------------------
Student Name- Aakash Sadnani

Student ID - A00235504

Program Description - This program is written to convert between various types of measurements.
1) It will accept an integer value which is to be converted
2) Next we have to enter the unit we want to convert
3) Arithmatic calculations will determine the output
4) After calculations the output will be displayed to the user on the terminal console.
-----------------x------------------------
*/

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) throws Exception {

       

        // Running the program continously
        // To quit enter 'q' to stop the program
        // initializing the variables
        String outputUnit = "";
        double finalValue = 0.0;
        String inputUnit;
        double inputvalue;
        do {
 // Taking user input of int value
 Scanner inputScannerValue = new Scanner(System.in);
 
            System.out.println("Enter an Integer value to convert: ");

            // assigning the input from the user to the double variable
            inputvalue = inputScannerValue.nextInt();
            inputScannerValue.nextLine();
            System.out.println("Enter the current unit of measure: ");

            inputUnit = inputScannerValue.next();

            if (inputUnit.equals("km")) {
                finalValue = inputvalue * 0.62;
                outputUnit = "mi";
            } else if (inputUnit.equals("mi")) {
                finalValue = inputvalue * 1.61;
                outputUnit = "km";
            } else if (inputUnit.equals("cm")) {
                finalValue = inputvalue * 0.39;
                outputUnit = "in";
            } else if (inputUnit.equals("in")) {
                finalValue = inputvalue * 2.54;
                outputUnit = "cm";
            } else if (inputUnit.equals("kg")) {
                finalValue = inputvalue * 2.2;
                outputUnit = "lb";
            } else if (inputUnit.equals("lb")) {
                finalValue = inputvalue * 0.45;
                outputUnit = "kg";
            } else if (inputUnit.equals("g")) {
                finalValue = inputvalue * 0.4;
                outputUnit = "oz";
            } else if (inputUnit.equals("oz")) {
                finalValue = inputvalue * 28.35;
                outputUnit = "g";
            } else if (inputUnit.equals("C")) {
                finalValue = ((inputvalue * 9) / 5) + 32;
                outputUnit = "F";
            } else if (inputUnit.equals("F")) {
                finalValue = (inputvalue - 32) * 5 / 9;
                outputUnit = "C";
            } else if (inputUnit.equals("L")) {
                finalValue = inputvalue * 4.17;
                outputUnit = "cups";
            } else if (inputUnit.equals("cup")) {
                finalValue = inputvalue * 0.24;
                outputUnit = "L";
            } else {

            }
            System.out.println(inputvalue + inputUnit + " is equal to " + finalValue + outputUnit);
            // if (finalValue == 0) {
            //     System.out.println("The unit is not available!");
            // } else {
            //     System.out.println(inputvalue + inputUnit + " is equal to " + finalValue + outputUnit);

            // }

        }

        while (
            inputvalue != 0 && 
            !inputUnit.contains("cup") && !inputUnit.contains("L") && finalValue != 0);
    }
}
