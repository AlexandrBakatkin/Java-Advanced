public class ArrayMod <A>{
    private A[] nums;
    private A temp;

    public ArrayMod(A[] arr, int first, int second) {
        this.nums = arr;
        this.temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

        for (A num : nums) {
            System.out.print(num + " ");
        }
    }
}