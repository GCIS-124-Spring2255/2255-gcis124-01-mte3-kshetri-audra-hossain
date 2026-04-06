// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 1
// Filename: Converter.java (inside tempconvert package)

package mte3.tempconvert;
import java.util.Scanner;

public class Converter {
    
    private static class CelsiusToFahrenheit implements TempConvert {

        @Override
        public double convert(double temp) {    return temp * 9.0 / 5.0 + 32;    }
        
    } // CelciusToFahrenheit closed

    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter temperature (for conversion): ");
            // int currenttemp = scanner.nextInt();
            double original = scanner.nextDouble();

            // (part 1) conversion from C to F
            CelsiusToFahrenheit cf = new CelsiusToFahrenheit();
            // System.out.println("Celsius to Fahrenheit: " + cf.convert(currenttemp));
            System.out.println("Celsius to Fahrenheit: " + cf.convert(original));
            
            // (part 2) conversion from F to C
            TempConvert fc = new TempConvert() {
                @Override
                public double convert(double temp) { return ((temp - 32) * (5.0 / 9.0)); }
            };
            // System.out.println("Fahrenheit to Celsius: "+fc.convert(currenttemp));
            System.out.println("Fahrenheit to Celsius: "+ fc.convert(original));

            // (part 3) conversion from F to K
            TempConvert fk = (temp) -> ((temp - 32)*(5.0 / 9.0) + 273.15);
            // System.out.println("Fahrenheit to Kelvin: "+ fk.convert(currenttemp));
            System.out.println("Fahrenheit to Kelvin: "+ fk.convert(original));


        }  // try { } block closed

    } // main () method closed

} // Converter { } class closed