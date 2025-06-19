package arrayProblems;

public class ReturnDuplicateElementIndexFromArray {
    public static void main(String[] args) {
        /**
         *
         * techM -> master card round 1
         *
         * input : {1,2,3,4,5,2}
         * Answer : Element ->  2
         * Index : 5
         */
        int[] array = {1,2,3,4,5,2};

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate element is : " + array[j] + " at index " + j);
                }
            }
        }
    }
}
