public class FirstMissingPositive {
    static int findMissing(int a[]){
        int i=0;
        while(i<a.length){
            int index=a[i]-1;
            if(a[i]>0 && a[i]<=a.length && a[i]!=a[index]){
                   int temp=a[index];
                   a[i]=a[index];
                   a[index]=temp;
            }
            else{
                i++;
            }
        }

        int j=0;
        for(j=0;j<a.length;j++){
            if(a[j]!=j+1)
            return j+1;
        }
        return j+1;
    }
    public static void main(String args[]){
        int a[]={3,4,1,-1};
        int missing=findMissing(a);
        System.out.println("Missin::"+missing);
    }
}
