import java.util.*;

class MergreSortedArray{
    public static void main (String args[]){
        //int nums1[]={1,3,15,17,0,0,0,0,0,0};
        int nums1[]={2,0};
        int nums2[]={1};
        int m=1;
        int n=nums2.length;
        Solution sol= new Solution();
        sol.merge(nums1,m,nums2,n);
        int i=nums1.length-1;
        while(i>-1){
            System.out.print(nums1[i]+"  ,   ");
            i--;
        }
    }
}

class Solution {
    void merge(int nums1[],int m, int nums2[],int n) {
        // if(n==0 || m==0){
        //     System.err.println("in if");
        //     for(int i=0;i<nums1.length;i++){
        //         nums1[i]=nums2[i];
        //     }
        //     return;
        //  }
        int i=m+n-1;
        m--;
        n--;
        while (n>-1 && m>-1){
            if(nums1[m] > nums2[n]){
                nums1[i]=nums1[m];
                i--;
                m--;
            }
            else{
                nums1[i]=nums2[n];
                i--;
                n--;
            }
        }
        
        while (n>-1){
            nums1[i]=nums2[n];
            i--;
            n--;
        }
        while (m>-1){
            nums1[i]=nums1[m];
            i--;
            m--;
        }
    
        return;

    }
}