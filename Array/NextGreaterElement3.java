public class NextGreaterElement3 {

    static int findNextGreater(int n){
        char c[]=(""+n).toCharArray();
       int i=c.length-2;
       while(i>=0 && c[i]>=c[i+1]){
           i--;
       }
        
        if(i==-1)
        return -1;

       int j=c.length-1;
       while(j>=0 && c[j]<=c[i])
       {
           j--;
       }

       swap(c,i,j);
       reverse(c,i+1);
       try{
       int k=Integer.parseInt(new String(c));
       if(k>n)
       return k;
       }
       catch(Exception e){
           
       return -1;
       }
       return -1;
    }


   static void swap(char c[],int i,int j){
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
    }

   static  void reverse(char c[],int st){
        int r=c.length-1;
        while(st<r){
            swap(c,st,r);
            st++;
            r--;
        }
    }

    public static void main (String args[]){

        int n=101;
        int k=findNextGreater(n);
        System.out.println(k);
    }
}
