import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] twoSum(int[] nums, int target) {
        //System.out.println("inside funtion!\n"+ "nums: "+Arrays.toString(nums)+"\ntarget: "+Integer.toString(target));
        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());
        ArrayList<Integer> newNums = new ArrayList<>(list);
        for(int i=0;i< nums.length;i++) {
            if(newNums.contains(target-nums[i])  && newNums.indexOf(target-nums[i])!=i){
                return new int[]{i, newNums.indexOf(target-nums[i])};
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int[] nums = {2,7,11,15};
        int target=9;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

}
