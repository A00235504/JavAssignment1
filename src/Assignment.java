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

This is a new branch for checking inputs with int and string
*/

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) throws Exception {

        // Running the program continously
        // To quit enter 'q' to stop the program
        // initializing the variables
        String outputUnit = "";
        double finalValue = 0.0;
        String inputUnit = "";
        short inputValue = 0;
        do {
            // Defining a scanner for taking inputs from user
            Scanner inputScannerValue = new Scanner(System.in);

            System.out.println("Enter an Integer value to convert: ");

            // assigning the input from the user to the double variable
            inputValue = inputScannerValue.nextShort();

            // skipping the next line due to nextDouble
            inputScannerValue.nextLine();

            // printing the message for users input measurement unit type
            System.out.println("Enter the current unit of measure: ");

            // assigning the input value to a string variable
            inputUnit = inputScannerValue.next();

            // using if else we check the inputunit of user and compare with standard units
            // the
            // code can accept
            
            if (inputUnit.equals("km")) {
                finalValue = inputValue * 0.62;
                outputUnit = "mi";
            } else if (inputUnit.equals("mi")) {
                finalValue = inputValue * 1.61;
                outputUnit = "km";
            } else if (inputUnit.equals("cm")) {
                finalValue = inputValue * 0.39;
                outputUnit = "in";
            } else if (inputUnit.equals("in")) {
                finalValue = inputValue * 2.54;
                outputUnit = "cm";
            } else if (inputUnit.equals("kg")) {
                finalValue = inputValue * 2.2;
                outputUnit = "lb";
            } else if (inputUnit.equals("lb")) {
                finalValue = inputValue * 0.45;
                outputUnit = "kg";
            } else if (inputUnit.equals("g")) {
                finalValue = inputValue * 0.4;
                outputUnit = "oz";
            } else if (inputUnit.equals("oz")) {
                finalValue = inputValue * 28.35;
                outputUnit = "g";
            } else if (inputUnit.equals("C") || inputUnit.equals("c")) {
                finalValue = ((inputValue * 9) / 5) + 32;
                outputUnit = "F";
            } else if (inputUnit.equals("F") || inputUnit.equals("f")) {
                finalValue = (inputValue - 32) * 5 / 9;
                outputUnit = "C";
            } else if (inputUnit.equals("L") || inputUnit.equals("l")) {
                finalValue = inputValue * 4.17;
                outputUnit = "cups";
            } else if (inputUnit.equals("cup")) {
                finalValue = inputValue * 0.24;
                outputUnit = "L";
            } else {
                // If input unit is not availabe then printing error message
                System.out.println("InputUnit error!");
                break;
            }

            // Printing the output of the calculation
            System.out.println(inputValue + inputUnit + " is equal to " + finalValue + outputUnit);
            // printing a new line to give space between lines
            System.out.println("\n");

        }
        // checking for condition
        // finalValue must not be 0 and inputValue must not be 0
        // otherwise the looping will break and program will stop
        while (inputValue != 0 && outputUnit != "");
        // printing the error if user enters 0 in input or finalValue is 0
        System.out.println("The unit is not available or input value 0 is not acceptable!");
    }
}
