package JavaTasks;
import java.util.*;
import java.util.Arrays;
import java.util.Random;

class JavaTask1{
    public static void main(String args[]){
        int [] nums={1,2,3,4,5,6,7};
        System.out.println("Given array is "+Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            Random r = new Random();
            int var = r.nextInt(i+1);
            int temp = nums[i];
            nums[i]=nums[var];
            nums[var]=temp;
        }
        System.out.println("Shuffled Array is "+ Arrays.toString(nums));
    }
}
