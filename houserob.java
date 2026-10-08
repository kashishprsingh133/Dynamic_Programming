
import java.util.*;

public class houserob {

    public static void main(String[] args) 
    {

        int nums []= {2,7,9,3,1};
        int dp [] = new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(house(nums,0,dp));

        int[]dp2 = new int[nums.length];
        Arrays.fill(dp2,-1);
        System.out.println(house2(nums,nums.length-1,dp2));

        System.out.println(RobberBU(nums));


        
        
    }
    public static int house(int[]nums,int i,int[]dp){

        if(i>=nums.length){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }


        int rob = nums[i]+house(nums,i+2,dp);
        int dont_rob = house(nums,i+1,dp);

        return dp[i]=Math.max(rob,dont_rob);


    }

    public  static int house2(int[]nums,int i,int[]dp2){

        if(i<0){
            return 0;
        }

        if(dp2[i]!=-1){
            return dp2[i];
        }


        int rob = nums[i]+house2(nums,i-2,dp2);
        int dont_rob = house2(nums,i-1,dp2);

        return dp2[i]=Math.max(rob,dont_rob);


    }

    public static int RobberBU(int [] arr){

        int [] dp = new int[arr.length+1];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);

        for(int i=2;i<arr.length;i++){
           
            int rob = arr[i]+dp[i-2];
            int dont_rob = dp[i-1];

           dp[i]=Math.max(rob,dont_rob);


        }
        return dp[arr.length-1];
    }



    
}
