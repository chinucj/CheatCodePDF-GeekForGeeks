// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.makeProductOne(arr,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int makeProductOne(int[] arr, int N) {
        // code here
        int no_of_zero = 0;
        int negetive_no = 0;
        int steps = 0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]==0)
            {
            no_of_zero += 1;
            }
            else if(arr[i]>0){
            steps = steps + (arr[i] - 1);
            }
            else{
                negetive_no +=1;
                steps = steps + (-1 - arr[i]);
            }
        }
         steps += no_of_zero;
            if(negetive_no % 2 != 0 && no_of_zero == 0)
            {
                steps += 2;
            }
        return steps;
    }    
}
