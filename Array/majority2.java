// find majority element which is more than n/3 times

import java.util.*;

public class majority2 {

    static List<Integer> findMajority(int a[]){
        List<Integer> l=new ArrayList<>();
        Arrays.sort(a);
        int count=1;
        for(int i=0;i<a.length;i++){
            if(i<a.length-1 && a[i]==a[i+1]){
                count++;
            }else{
                if(count>a.length/3){
                    l.add(a[i]);
                }
                count=1;
            }
        }
        return l;
    }
    public static void main(String args[]){
        int a[]={3,2,3};
        List<Integer> l=findMajority(a);
        System.out.println(l);

    }
}
