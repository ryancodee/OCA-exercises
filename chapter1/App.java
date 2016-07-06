import java.util.Scanner;

class Seconds {
    public String computeTime(double rawTime) {
        // format to 3 decimal places
        String decimalTime = String.format("%.3f", rawTime);
        // extract milliseconds
        String milliseconds = decimalTime.substring(decimalTime.indexOf(".")).substring(1);

        // compute from whole num
        int time = (int)rawTime;
        double seconds = (double)time % 60;
        double minutes = (double)time / 60;

        // concat results
        String completeTime = (int)minutes + ":" + (int)seconds + "." + milliseconds;

        return completeTime;

    }
}


public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double value;

        Seconds time = new Seconds();

        do {
            System.out.println("Hello, please enter a value greater than 60");
            value = scanner.nextDouble();
        } while (value < 60);

        System.out.println("result: " + time.computeTime(value));

    }
}
