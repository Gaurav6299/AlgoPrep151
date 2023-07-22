package Queue;
import java.util.*;

public class FirstNonRepeatingCharacterInStream {
    public static void main(String args[]){
        String A="aab";
        Queue<Character> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        int ar[]=new int[26];
        A=A.toLowerCase();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            ar[ch-'a']++;
            q.add(ch);
            
            while(!q.isEmpty())
            {
                char top=q.peek();
                if(ar[top-'a']>1){
                    q.remove();

                }else{
                    sb.append(q.peek());
                    break;
                }
            }
            
            if(q.isEmpty()){
                sb.append('#');
            }
            
            
            
        }
        System.out.println("First Non repeating charaterL:::"+sb.toString());
    }
}
