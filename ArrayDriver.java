import java.util.*;
public class ArrayDriver {
    void printArray(int []num){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" , ");
        }
    }

    int [] scanArray(int num[]){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<num.length;i++){
                num[i]=sc.nextInt();
            }
        }
        return num;
    }
    
}
