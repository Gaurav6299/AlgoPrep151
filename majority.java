import java.util.*;

class majority{

    // Solution 1 t(c)=o(n) and space o(1)
    static int findMajority(int a[]){
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            m.put(a[i],m.getOrDefault(a[i],0)+1);
        }

        for(Integer i:m.keySet()){
          int value=m.get(i);
          if(value>a.length/2)
          return i;
        }

        return -1;
    }

    // Second Solution  t(c)=o(n) and s(c)=o(1)
    static int findMajority2(int a[]){
        int c=0;
        int maj=0;
        for(int i=0;i<a.length;i++){
            if(c==0)
            maj=a[i];
            if(a[i]==maj)
            c++;
            else c--;

        }
        return maj;
    }
    public static void main(String args[]){
        int a[]={3,2,3};
        // int k=findMajority(a);
        int k=findMajority2(a);
        System.out.println(k);
    }
}


// Map Method:
// 1)entrySet():- You can get the both key and value
// 2)keySet():-You can get the  key only;
// 3) values():- You can get the values only.