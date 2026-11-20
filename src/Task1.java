public class Task1 {
    public static void main(String[] args){

        int[] array = {5, 12, 0, -4, 68, -9, 0, -34, 3, 0};
        int count_pos = 0, count_neg = 0, count_zero = 0;

        System.out.print("Array:");
        for (int current : array) {
            System.out.print(" " + current);

            if(current == 0){
                count_zero++;
            }else if(current < 0){
                count_neg++;
            }else{
                count_pos++;
            }
        }

        System.out.println("\nPositive: " + count_pos);
        System.out.println("Negative: " + count_neg);
        System.out.println("Zero: " + count_zero);

    }
}
