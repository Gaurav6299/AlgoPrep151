package Stack;
import java.util.*;

public class LagestRectangleArea {
    public static int largestRectangleArea(int[] heights) {
        int prev[]=new int[heights.length];
   
        prev=findPrev(heights);   
        int next[]=new int[heights.length];
         
         next=findNext(heights);
         int max=Integer.MIN_VALUE;
         for(int i=0;i<heights.length;i++){
             if(next[i]==-1)
             next[i]=heights.length;
             int width=next[i]-prev[i]-1;
             int area=heights[i]*width;
             max=Math.max(max,area);
         }
   
      return max;
       }

       static int[] findNext(int heights[]){
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!st.empty() && st.peek()!=-1 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.empty()){
                st.push(-1);
            }
            ans[i]=st.peek();
            st.push(i);
    
        }
            return ans;
    }
    
        static int[] findPrev(int heights[]){
            Stack<Integer> st=new Stack<>();
            st.push(-1);
            int ans[]=new int[heights.length];
            for(int i=0;i<heights.length;i++){
            while(st.peek()!=-1 && heights[st.peek()]>=heights[i]){
                st.pop();
            }
             ans[i]=st.peek();
             st.push(i);
            }
    
            return ans;
        }
    public static void main(String args[]){
      int  heights[] = {2,1,5,6,2,3};
        int k=largestRectangleArea(heights);
        System.out.println("Area is::"+k);
    }
    
}
