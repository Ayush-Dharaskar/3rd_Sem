package Lab5;
import java.util.*;
class Result{
    int[][] marks;
    int [] total = new int[3];


    void input(){
        Scanner sc = new Scanner(System.in);
        marks =new int[3][4];

        for(int i=0;i<3;i++){
            System.out.println("Enter role and marks in 3 subject");
            for(int j=0;j<4;j++){
                marks[i][j] = sc.nextInt();
            }
        }
    }
    void total(){
        for(int i=0;i<3;i++){
            total[i]=0;
            for (int j=1;j<4;j++){
                total[i] += marks[i][j];
            }
        }
    }
    void display(){
        for(int i=0;i<3;i++)
        {
            System.out.print(total[i]+" ");
        }
        System.out.println();
    }
    void maxTotal(){
        int max=total[0];
        int i,pos=0;
        for(i=1;i<3;i++){
            if(max<total[i]){
                max=total[i];
                 pos =i;
            }
        }
        System.out.println("Max total of roll no.:"+marks[pos][0]);
    }
    void maxSub(){
        int max;
        int x=0;
        for(int i=1;i<4;i++){
            max=0;
            for(int j=0;j<3;j++){
                if(max<marks[j][i])
                {
                    max = marks[j][i];
                    x=j;

                }
            }
            System.out.println("Max of sub"+i+" by roll"+marks[x][0]);
        }
    }
}


public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        r.input();
        r.total();
        r.display();
        r.maxTotal();
        r.maxSub();

    }
}
