package Questions.Question4;
import Domain.Tester.Simulate;

public class Question4 implements Simulate {
    private int cans;
    private int tokens;

    public void fillUp(int cans){ // for owner to fill up the machine
        this.cans += cans;
    }

    public void insertTokens(int tokens){ //for user to insert a token
        if (this.cans==0){
            System.out.println("Vending Machine Empty\nPlease Collect Token");
        }
        else {
            this.tokens += tokens;
            this.cans-=tokens;
            System.out.println(tokens+" cans dispensed successfully");
        }
    }

    public Question4() {  //initiate the machine with 0 cans and tokens
        this.cans = 0;
        this.tokens = 0;
    }

    public Question4(int cans) { //initiate the machine with a specific amount of cans
        this.cans = cans;
        this.tokens = 0;
    }

    public int getCans() {
        return cans;
    }

    public int getTokens() {
        return tokens;
    }

    @Override
    public void run() {


    }
}
