/**
 * starRemoval
 */
import java.util.Stack;
public class starRemoval {

    public static void main(String[] args) {
        // removeStars rm =new removeStars();
        System.out.print(removeStars("leet**cod*e"));

    }
    public static String removeStars(String s) {
        char arr[]=s.toCharArray();
        Stack <Character> st = new Stack <>();
        int len=arr.length;

        for(int i=0;i<len;i++){
            if(arr[i]!='*'){
                st.push(arr[i]);
            }
            else{
                st.pop();
            }
        }
        s =st.toString();
        return s;
    }
}