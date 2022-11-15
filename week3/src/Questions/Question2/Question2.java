package Questions.Question2;

import Domain.Tester.Simulate;

public class Question2 implements Simulate {
    @Override
    public void run() {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";
        String concat = article.concat(animal1.concat(action.concat(article.concat(animal2))));
        String plus = article+animal1+action+article+animal2;
        System.out.println(concat+"\n"+concat.length() );
        System.out.println(plus+"\n"+plus.length() );
    }
}
