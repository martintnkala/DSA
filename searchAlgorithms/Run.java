package searchAlgorithms;

public class Run {
    public static void main(String[] args) {
        SearchAlgorithms.Linear linear = new SearchAlgorithms.Linear();

        String message = "Value not found";
        int[] nums = {5, 8, 9, 11, 14, 1};
        int target = 8;

        int result = linear.linearSearch(nums, target);

        if (result != -1) {
            System.out.println(" The value has been found on index:" + result);
        } else {
            System.out.println(message);
        }


    }
}
