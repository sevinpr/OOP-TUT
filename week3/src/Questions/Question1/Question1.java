package Questions.Question1;

import Domain.Tester.Simulate;

public class Question1 implements Simulate{
    @Override
    public void run() {
        String greeting = "Hello, World!";
        int n = greeting.length();

        String output = "Number of Characters in " + greeting + "\sis\s" + n;
        System.out.println(output);

        String river = "Mississippi";

        String bigRiver = river.toUpperCase();
        System.out.println(river + " in UpperCase is " + bigRiver);

        String smallRiver = bigRiver.toLowerCase();
        System.out.println(river + " in LowerCase is " + smallRiver);

    }
}
