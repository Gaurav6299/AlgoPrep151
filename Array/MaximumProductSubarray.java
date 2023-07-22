public class MaximumProductSubarray {
    public static int maxProductSubarray(int a[]){
        int prod=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            prod=prod*a[i];
            max=Math.max(prod,max);
            if(prod==0)
            prod=1;
        }

        prod=1;
        for(int i=a.length-1;i>=0;i--){
            prod=prod*a[i];
            max=Math.max(max, prod);
            if(prod==0)
            prod=1;
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={3,-1,4};
        int val=maxProductSubarray(a);
        System.out.println("Max product is::"+val);
    }
}
