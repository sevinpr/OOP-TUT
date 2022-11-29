package Questions.Question2;
import Domain.Tester.Simulate;
public class Question2 implements Simulate{

    private String name;
    private int salary;
    public Question2() {
        this.name = "John Doe";
        this.salary = 35000;
    }

    public Question2(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public int getSalary() {
        return salary;
    }
    @Override
    public void run() {

    }
}
