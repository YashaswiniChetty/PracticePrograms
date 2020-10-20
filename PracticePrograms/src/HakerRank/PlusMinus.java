package HakerRank;

public class PlusMinus {

    public static void plusMinus(int [] a){
        int len = a.length;
        int posCount = 0;
        int negaCount = 0;
        int zeroCount = 0;
        for(int i =0; i<len; i++){
            if(a[i]>0){
                posCount++;
            }
            if(a[i]<0){
                negaCount++;
            }
            if(a[i]==0){
                zeroCount++;
            }
            System.out.printf("%1.6f\n",posCount/len);
            System.out.printf("%1.6f\n",negaCount/len);
            System.out.printf("%1.6f\n",zeroCount/len);
        }
    }

    public static void main (String []args){
        int a[] = {-4, 3, -9, 0, 4, 1};
        plusMinus(a);
    }
}
