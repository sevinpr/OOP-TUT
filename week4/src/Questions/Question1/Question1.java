package Questions.Question1;
import Domain.Tester.Simulate;
public class Question1 implements Simulate {
        private int cans;
        private int tokens;


    public Question1() {
            this.cans = 10;
            this.tokens = 0;
        }

    public Question1(int cans) {
            this.cans = cans;
            this.tokens = 0;
        }

        public void fillCans ( int cans){
            this.cans += cans;
        }

        public void insertToken ()throws Exception {
            this.tokens += 1;

            if (this.cans > 0){
                --this.cans;
                return;
            }

            throw new Exception("Not enough cans");
        }
        public void returnToken(){
            if (tokens > 0){
                this.tokens -=1;
            }
        }
        public int getTokens(){
            return tokens;
        }

        public int getCans() {
            return cans;
        }

    @Override
    public void run() {

    }
}

