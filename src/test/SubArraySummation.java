package test;
public class SubArraySummation{
    public static void main(String ...args){
        int[] initialArray = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(initialArray) ;
        System.out.println(numArray.sumRange(2,5));
    }
}
class NumArray {
    int[] myArray;
    int[] nums;
    public NumArray(int[] nums) {
       this.nums=nums;
       preprocessing();
    }
    void preprocessing(){
       this.myArray=  new int[nums.length];
        for (int i=0 ; i<nums.length ; i++) {
            int sum =0;
            for(int j=0; j <= i ; j++){
                sum = sum+nums[j];
            }
            myArray[i]=sum;
        }
    }
    public int sumRange(int left, int right) {
        return myArray[right]-myArray[left-1];
    }
}
