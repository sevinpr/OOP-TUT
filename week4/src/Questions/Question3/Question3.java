package Questions.Question3;
import Domain.Tester.Simulate;

public class Question3 implements Simulate {
    private int labourVotes;
    private int conservativeVotes;


    public Question3(){
        this.labourVotes = 0;
        this.conservativeVotes = (int)Math.floor(Math.random()*(50-2+1)+2);
    }
    public void voteLabour(){
        this.labourVotes += 1;
    }

    public void voteLabour(int vote){
        this.labourVotes += vote;
    }

    public void voteConservative(){
        this.conservativeVotes +=1;
    }

    public void voteConservative(int vote){
        this.conservativeVotes += vote;
    }



    public int getLabourVotes() {
        return labourVotes;
    }

    public int getConservativeVotes() {
        return conservativeVotes;
    }

    public void clearMachineState(){
        this.labourVotes = 0;
        this.conservativeVotes = 0;
    }
    @Override
    public void run() {

    }
}
