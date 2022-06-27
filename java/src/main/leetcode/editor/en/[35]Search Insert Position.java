/**
Given a sorted array of distinct integers and a target value, return the index 
if the target is found. If not, return the index where it would be if it were 
inserted in order. 

 You must write an algorithm with O(log n) runtime complexity. 

 
 Example 1: 

 
Input: nums = [1,3,5,6], target = 5
Output: 2
 

 Example 2: 

 
Input: nums = [1,3,5,6], target = 2
Output: 1
 

 Example 3: 

 
Input: nums = [1,3,5,6], target = 7
Output: 4
 

 
 Constraints: 

 
 1 <= nums.length <= 10⁴ 
 -10⁴ <= nums[i] <= 10⁴ 
 nums contains distinct values sorted in ascending order. 
 -10⁴ <= target <= 10⁴ 
 
 Related Topics Array Binary Search 👍 8337 👎 425

*/
package main.leetcode.editor.en;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution35 {
    public static  int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int middleIndex = (left + right)/2;
            int middleValue = nums[middleIndex];
            if(middleValue<target){
                if(nums[right]<target){
                    return right + 1;
                }else {
                    left = middleIndex + 1;
                }
            }else if(middleValue>target){
                if(nums[left]>target){
                    return left ;
                }else{
                    right = middleIndex -1;
                }
            }else {
                return middleIndex;
            }

        }

        return 0;
    }

    public static void main(String[] args) {
        int i = searchInsert(new int[]{1, 3, 5, 6}, 2);
        System.out.println(i);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
