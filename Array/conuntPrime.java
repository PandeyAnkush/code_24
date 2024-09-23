// count all 1 to n prime numbers 
//import java.util.*;
class conuntPrime {
    public static void main(String args[]){
        int n=30;
        print pr =new print();
        System.out.println(pr.countAll(n));

    }
}
class print{
    int  countAll(int num){
        int count =0,i,j;
        boolean list[]=new boolean[num+1];
        for(i=0;i<list.length;i++){
            list[i]=true;
        }
        list[2]=true;
        for(i=2;i<list.length;i++){
            if(list[i]==false){
                continue;
            }
            j=i*i;                                                //to start with number greater than square of i
            while(j<list.length){
                if(j%i==0){
                    list[j]=false;
                   
                }
                j=j+i;                                             //only multiple of I will be checked rest are already checked
            }
        }
        for(i=1;i<list.length;i++){
            if(list[i]==true){
                System.err.print(i+" ,  ");
                count++;
            }
        }
        return count;
    }
}