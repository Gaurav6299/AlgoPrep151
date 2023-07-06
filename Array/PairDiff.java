import java.util.*;
public class PairDiff {

    // t(c)=o(n^2) and space is o(1)
    static boolean findPairDiff(int arr[],int n){
        int size=arr.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(Math.abs(arr[i]-arr[j])==n)
                return true;
            }
        }
        return false;
    }

    static boolean findPairDiff1(int arr[],int n){
        int size=arr.length;
       Arrays.sort(arr);
       int i=0;
       int j=i+1;
       while(i<size && j<size){
        if(i!=j && arr[j]-arr[i]==n)
        return true;

        else if(arr[j]-arr[i]<n){
            j++;
        }
        else i++;
       }

       return false;
    }
    public static void main(String args[]){
        int a[]={5, 20, 3, 2, 5, 80};
        int n=78;
        // boolean k=findPairDiff(a,n);
        // System.out.println("is Present:::"+k);

        boolean k=findPairDiff1(a,n);
        System.out.println("is Present 1:::"+k);
    }
}
