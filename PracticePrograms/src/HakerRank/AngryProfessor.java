package HakerRank;

public class AngryProfessor {

    public static String angryProcessor(int k, int [] a) {
        int count = 0;
        for(int i = 0; i< a.length ;i++){
            if(a[i]<=0) {
                count++;
            }
        }
        return count>=k? "NO":"YES";
    }

    public static void main(String [] args){
        int a[] = {-1, 0, 1, 0, 1, 1};
        System.out.println(angryProcessor(4, a));
    }
}
