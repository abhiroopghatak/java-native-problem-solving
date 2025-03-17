package test;

public class TrapRainWater {

     public static int trap(int[] arr) {        
        int res=0;
        int trappedWaterBetweenLeftMaxRightMax=0;
        for(int i =1;i <arr.length-1;i++){
            trappedWaterBetweenLeftMaxRightMax=0;
            int leftMax=arr[i];
            for(int j=0;j<i; j++){
                leftMax = Math.max(leftMax,arr[j]);
            }
            int rightMax=arr[i];
            for(int k=i+1;k<arr.length; k++){
                rightMax = Math.max(rightMax,arr[k]);
            }

            trappedWaterBetweenLeftMaxRightMax = Math.min(leftMax,rightMax)-arr[i];
            res=res+trappedWaterBetweenLeftMaxRightMax;
        }
        return res;
    }
    public static void main(String ...a){
        int[] height ={0,2,0,0,2};
        System.out.print("total trapped water is = "+ trap(height));

    }
}
