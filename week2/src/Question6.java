import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        ArrayList <Integer> luckyLotto = new ArrayList<>();
        boolean[] check = new boolean[49]; // creating array to make sure an integer is only chosen once
        int num=1;
        while (num<50){
            check[num-1]=false;
            num++;
        }
        Random ran = new Random();
        while (luckyLotto.size()<6){
            int luckyNum = ran.nextInt(49);
            if (!check[luckyNum]) {
                luckyLotto.add(luckyNum+1);
                check[luckyNum]=true;
            }

        }
        System.out.println(luckyLotto);

    }
}
