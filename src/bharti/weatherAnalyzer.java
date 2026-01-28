package bharti;

import java.util.Scanner;

/*Use Case 1: Weather Data Analyser
📝 Problem Statement
Build a simple Java console program named WeatherAnalyzer.java that:
Accepts 2 command-line arguments:
City Name (String)
Temperature (float)
Example command:
java WeatherAnalyzer Hyderabad 32.5
    2. Inside the program:
Create variables of different datatypes:
float temp, boolean isHot, int threshold, String city
Use operators to determine weather condition:
If temperature > 30 → "Hot Day"
Else → "Normal Day"
Use keywords like if, else, class, public, static, final, new
 3. Create a temporary WeatherRecord object, then set it to null and explain how Garbage Collection     will eventually remove it.
Print the output:
City: Hyderabad
Temperature: 32.5°C
Condition: Hot Day*/


public class weatherAnalyzer {

    public static void main(String[] args) {

        String city = args[0];
        float temp = Float.parseFloat(args[1]);

        boolean isHot;
        final int threshold = 30;
        String condition;

        if (temp > threshold) {
            isHot = true;
            condition = "Hot Day";
        } else {
            isHot = false;
            condition = "Normal Day";
        }
        weatherRecord record = new weatherRecord(city, temp);
        record = null;

        System.out.println("City: " + city);
        System.out.println("Temperature: " + temp + "°C");
        System.out.println("Condition: " + condition);
    }
}
