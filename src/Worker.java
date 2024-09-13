public class Worker extends Person {

    /*
    Fields
    double hourlyPayRate
     */

    /*
    Methods
    1. double calculateWeeklyPay(double hoursWorked)
    2. String displayWeeklyPay(double hoursWorked)
    3. constructor using super() to call constructor for Person
    then set rest of fields

    hours under 40 are at HourlyRate
    hours above 40 are 1.5 time

    displayWeeklyPay should indicate number of hours of reg pay
    and total and number of hours of overtime to get total combined pay

    overload toCSV(), toXML(), toJSON() to include new data field
     */

    private double hourlyPayRate;

    //getter and setter for hourlyPayRate
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    //Constructors for Worker class
    public Worker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(IDNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(Person person, double hourlyPayRate) {
        super(person.getIDNum(),
                person.getFirstName(),
                person.getLastName(),
                person.getTitle(),
                person.getYOB());
        this.hourlyPayRate = hourlyPayRate;
    }

    //Methods

    /*
    Calculates the weekly pay of a worker including regular and overtime pay
    @param double hoursWorked to put in how many hours worked
    @return totalPay of regular hours worked and overtime hours worked
     */
    public double calculateWeeklyPay(double hoursWorked)
    {
        double regPay;
        double overTimePay;
        double totalPay;

        if(hoursWorked <= 40) {
            regPay = hoursWorked * hourlyPayRate;
            overTimePay = 0;
        } else {
            regPay = hourlyPayRate * 40;
            overTimePay = (hoursWorked - 40) *(hourlyPayRate * 1.5);
        }

        totalPay = regPay + overTimePay;
        return totalPay;
    }

    public void displayWeeklyPay (double hoursWorked) {
        double pay = calculateWeeklyPay(hoursWorked);

        if (hoursWorked <= 40) {
            double regHours;
            double overTimeHours;

            if (hoursWorked <= 40) {
                regHours = 40;
                System.out.println();
            }
        }
    }
}
