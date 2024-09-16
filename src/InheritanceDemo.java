import java.lang.reflect.Array;
import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        /*
        Create 3 workers and 3 salaryWorker instances and add
        to ArrayList<Worker>

        2. Write a loop that simulates 3 weekly pay periods.
        Week 1 40 hours
        Week 2 50 hours
        Week 3 40 hours
        show weekly pay for each worker for each week in tabular format
         */

        ArrayList<Worker> workers = new ArrayList<>();

        Worker John = new Worker("000001", "John", "Smith", "Manager", 1985, 50.25);
        workers.add(John);
        Worker Sally = new Worker("000002", "Sally", "Jones", "Secretary", 1987, 30.75);
        workers.add(Sally);
        Worker Alex = new Worker("000003", "Alex", "Johnson", "Engineer", 1990, 55.25);
        workers.add(Alex);

        //variable for displayWeeklyPay method
        double [] weeklyHours = {0,40,50,40};


        //For loops for 3 weeks pay
        for (int week = 0; week < weeklyHours.length; week++) {
            System.out.println("Week: " + week);
            System.out.println();
            for (Worker workPersons: workers) {
                System.out.println(workPersons.toCSVDataRecord());
                System.out.println(workPersons.displayWeeklyPay(weeklyHours[week]).toString());
                System.out.println();
            }
        }
    }
}
