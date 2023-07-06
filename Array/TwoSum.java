import java.util.*;

class TwoSum{

    // Solution 1 t(c)=o(n^2) and space is(1)
    static boolean twoSum(int a[],int x){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==x)
                return true;
            }
        }
        return false;
    }

    // Soultion 2 t(c)=o(n) and space is o(n);
    static boolean twoSum2(int a[],int x){
        int n=a.length;
       Set<Integer> set=new HashSet<>();
       for(int i=0;i<n;i++){
        if(set.contains(x-a[i])){
            return true;
        }
        else set.add(a[i]);
       }
       return false;
    }
    public static void main(String args[]){
        int a[]={1, 4, 45, 6, 10, 8};
        int x=16;
        // boolean k=twoSum(a,x);
        // System.out.println("Is Present::"+k);

        boolean k=twoSum2(a,x);
        System.out.println("Is Present 2::"+k);
    }
}