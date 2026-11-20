public class Task2 {
    public static void main(String [] arcs){

        int [] array = {4, -8, 0, 12, 25, -5, -8, 1};
        int min = array[0], max = array[0];

        System.out.print("Array:");
        for(int i=0; i<array.length; i++){ // An algorithm that finds largest and smallest elements of the array
            System.out.print(" " + array[i]);

            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }

        System.out.print("\nLargest: " + max + " at index ");
        for(int j=0; j<array.length; j++){ // An algorithm that finds all index for largest element
            if(array[j] == max){
                System.out.print(" " + j);
            }
        }

        System.out.print("\nSmallest: " + min + " at index ");
        for(int j=0; j<array.length; j++){ // An algorithm that finds all index for largest element
            if(array[j] == min){
                System.out.print(" " + j);
            }
        }


    }
}
