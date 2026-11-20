import java.util.Scanner;

public class Task5 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int [] array = new int[5];
        int sum = 0, passed = 0, failed = 0;
        int score;

        System.out.println("Enter 5 scores. Scores must be between 0 and 100, inclusive: ");

        // A loop for input
        for(int i=0; i<array.length; i++) {
            System.out.print(i+1 + " score: ");

            // A validation for correctly input of data
            do {
                score = input.nextInt();
                if (score < 0 || score > 100)
                    System.out.println("Invalid value.");

            } while (score < 0 || score > 100);

            array[i] = score;
        }

        // A loop for output elements
        System.out.print("Scores:");
        for(int current : array){
            System.out.print(" " + current);

            // An algorithm that determines passed and failed scores
            if(current >= 60){
                passed++;
            }else{
                failed++;
            }

            sum += current;
        }

        double average = (double)sum / array.length;

        System.out.println("\nPassed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average);


    }
}
