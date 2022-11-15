package Questions.Question6;
import java.util.ArrayList;
import java.util.Random;

import Domain.Tester.Simulate;


public class Question6 implements Simulate {
    @Override
    public void run() {
        ArrayList<Integer> birthday = new ArrayList<>();

        int twinDay;
        while (true) {
            Random r = new Random();
            int low = 1;
            int high = 366;
            int day = r.nextInt(high - low) + low;  //gives random value between low inclusive and high exclusive
            if (birthday.contains(day)) {
                twinDay = day;
                break;
            } else {
                birthday.add(day);
            }
        }
        System.out.println(twinDay);
        System.out.println(birthday.size());
    }
}
