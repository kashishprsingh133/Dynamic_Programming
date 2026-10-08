import java.util.*;

public class fibb {
    public static void main(String[] args) {
        int n = 5;
        int [] dp = new int [n+1];
        System.out.println(fibboTD(n,dp));
        System.out.println(FibBU(5));
        
       

    }

    // top down

    public static int fibboTD(int k,int[] dp){
        if(k<=1){
            return k;
        }

        // check krr rha ,aage cal nhi jaane dega
        if(dp[k]!=0){    
            return dp[k];
        }

        return dp[k] = fibboTD(k-1,dp)+fibboTD(k-2,dp); 
        // yaad bhi krr rha hu

    }

    // Bottom up

    public static int FibBU(int n){
        int [] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
         return dp[n];
    }
   
    
}

