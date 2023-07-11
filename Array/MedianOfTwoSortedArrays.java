import java.util.*;
public class MedianOfTwoSortedArrays {
    static double findMidean(int a[],int b[]){
        ArrayList<Integer> l=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                l.add(a[i]);
                i++;
            }
            else{
                l.add(b[j]);
                j++;
            }
        }

        while(i<a.length){
            l.add(a[i]);
            i++;
        }

        while(j<b.length){
            l.add(b[j]);
            j++;
        }

        int mid=l.size()/2;
        double ans=0;
        if((l.size()&1)==1){
          ans=l.get(mid);
        }
        else{
            ans=(l.get(mid-1)+l.get(mid))/2.0;
        }
        return ans;

    }
    public static void main(String args[]){
        int a[]={1,3};
        int b[]={2};
        double midean=findMidean(a,b);
        System.out.println("Median is:"+midean);
    }


    // T(c)=o(n) and s(c) o(n)
}
