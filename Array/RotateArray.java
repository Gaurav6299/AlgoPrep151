import java.util.Arrays;

public class RotateArray {

    // Solution 1 t(c)=o(n^2) and space is o(1)
    public static void rotate(int[] nums, int k) {
        int l=0;
        while(l<k){
            int temp=nums[nums.length-1];
            for(int i=0;i<nums.length-1;i++){
                nums[nums.length-i-1]=nums[nums.length-i-2];
            }
            nums[0]=temp;
            l++;
        }
    }


    public static void rotate1(int[] nums, int k) {
        // SOlution 2 t(c) o(n) and space is o(n)
       int temp[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        temp[(i+k)%nums.length]=nums[i];
       }

       for(int i=0;i<nums.length;i++){
        nums[i]=temp[i];
       }
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7};
        int k=3;
        // rotate(a,k);
        rotate1(a,k);

    }
}
