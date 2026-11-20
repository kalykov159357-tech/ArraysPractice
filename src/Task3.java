public class Task3 {
    public static void main (String [] args){

        int[] array = {11, 12, 14, 17, 21, 26};
        int sum = 0, count = 0;

        // An algorithm that calculates the sum of the elements in the array and outputs all the elements
        System.out.print("Array:");
        for(int current : array){
            System.out.print(" " + current);
            sum += current;
        }

        // A formula that calculates an average
        double average = (double) sum / array.length;

        // An algorithm that counts array elements that more than the average value
        for(int current : array){
            if(current > average){
                count++;
            }
        }

        System.out.println("\nAverage: " + average);
        System.out.println("Numbers above average: " + count);


    }
}
