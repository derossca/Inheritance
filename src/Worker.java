public class Worker extends Person{

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


    //Fields
    private double hourlyPayRate;


    /**
     * constructor for instance variables
     *
     * @param IDNum
     * @param firstName
     * @param lastName
     * @param title
     * @param YOB
     * @param hourlyPayRate
     */
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

    //Getter and setter for hourlyPayRate

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }


    //Methods

    /*
    creates a double that calculates the pay for hours worked
    @param double hoursWorked
    @return returns result of calculation providing for overtime
     */
    public double calculateWeeklyPay(double hoursWorked){
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        }
        else
        {
            return (hourlyPayRate * 40) + ((hoursWorked - 40) * hourlyPayRate);
        }
    }

    /*
    creates a string that displays regular hours, regular pay, overtime hours, and total combined pay
    @param double hoursWorked
    @return display displays the result for how many hours worked
     */
    public String displayWeeklyPay(double hoursWorked){
        String display;
        if (hoursWorked <= 40) {
            display = "Regular Hours: " + hoursWorked + " - Regular Pay: " + calculateWeeklyPay(hoursWorked) + " - Overtime Hours: "
                    + "0" + " - Total Pay: " + calculateWeeklyPay(hoursWorked);
            return display;
        } else {
            display = "Regular Hours: " + "40" + " - Regular Pay: " + calculateWeeklyPay(40) + " - Overtime Hours: "
                    + (hoursWorked - 40) + " - Total Pay: " + calculateWeeklyPay(hoursWorked);
            return display;
        }
    }

    @Override
    public String toCSVDataRecord() {
        return super.toCSVDataRecord() + "," + hourlyPayRate;
    }

    @Override
    public String toJSONDataRecord() {
        return super.toJSONDataRecord().replace("}", String.format(",\"hourlyPayRate\":%.2f}", hourlyPayRate));
    }

    @Override
    public String toXMLDataRecord() {
        return super.toXMLDataRecord().replace("</person>", String.format("<hourlyPayRate>%.2f</hourlyPayRate></person>", hourlyPayRate));
    }
}
