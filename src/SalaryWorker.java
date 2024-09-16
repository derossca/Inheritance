public class SalaryWorker extends Worker{
    /*
    Fields
    double annualSalary

    Methods
    1. constructor for SalaryWorker using super() to call
    constructor for Worker

    2. double calculateWeeklyPay(double hoursWorked)

    3. @Override calculateWeekly Pay and displayWeeklyPay
    calculateWeeklyPay returns pay total
    take annual salary and divide by 52 to get weekly pay

    4. overload toCSV(), toXML(), toJSON() to include new data field
     */

    //Fields
    private double annualSalary;

    //Getter and setter of fields
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    /*
    Constructor for SalaryWorker that calls super() of Worker
     * @param IDNum
     * @param firstName
     * @param lastName
     * @param title
     * @param YOB
     * @param hourlyPayRate
     * @param annualSalary
     */
    public SalaryWorker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(IDNum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(Worker worker, double annualSalary) {
        super(worker, annualSalary);
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked){
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay (double hoursWorked){
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        String display = String.format("Weekly Pay: $%.2f 1/52 of annual salary of $%.2f)", weeklyPay, annualSalary);
        return display;
    }

    @Override
    public String toCSVDataRecord() {
        return super.toCSVDataRecord() + " , " + annualSalary;
    }

    @Override
    public String toJSONDataRecord() {
        return super.toJSONDataRecord().replace("}", String.format(",\"annualSalary\":%.2f}", annualSalary));
    }

    @Override
    public String toXMLDataRecord() {
        return super.toXMLDataRecord().replace("</person>", String.format("<annualSalary>%.2f</annualSalary></person>", annualSalary));
    }
}
