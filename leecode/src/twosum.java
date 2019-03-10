import java.util.HashMap;
import java.util.Map;

/**给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

        你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。*/
public class twosum {
    //暴力解  时间复杂度 n  空间复杂度 1
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("没有俩个数的和");
    }
    /*
     * 空间换速度，使用哈希表保存元素及对应的索引
     * */
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if (map.containsKey(comp)&&map.get(comp)!=i){
                return new int[]{i,map.get(comp)};
            }
        }
        throw new IllegalArgumentException("没有俩个数的和");
    }
    /*
    * 一遍哈希表*/
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("没有俩个数的和");
    }

   public static  void main(String []args){
       int []a={1,1,1,1,1,1,1};
       twosum twosum=new twosum();
       twosum.twoSum1(a,10);
   }
}