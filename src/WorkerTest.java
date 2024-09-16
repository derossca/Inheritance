import static org.junit.jupiter.api.Assertions.*;
class WorkerTest {

    Worker w1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        w1 = new Worker("000001", "John", "Jones", "Esq.", 1990, 50);
    }

    @org.junit.jupiter.api.Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(100);
        assertEquals(100, w1.getHourlyPayRate());
    }

    //***NEED HELP WITH NEXT TWO***//
    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {
        double expectedPay = w1.calculateWeeklyPay(50);
        double actualPay = w1.calculateWeeklyPay(50);
        assertEquals(expectedPay, actualPay);
    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
        String expectedDisplay = w1.displayWeeklyPay(50);
        String actualDisplay = w1.displayWeeklyPay(50);
        assertEquals(expectedDisplay, actualDisplay);
    }

    @org.junit.jupiter.api.Test
    void toCSVDataRecord() {
        assertEquals("000001,John,Jones,Esq.,1990,50.0", w1.toCSVDataRecord());
    }

    @org.junit.jupiter.api.Test
    void toJSONDataRecord() {
        String expectedJSON = "{\"IDNum\":\"000001\",\"firstName\":\"John\",\"lastName\":\"Jones\",\"title\":\"Esq.\",\"YOB\":\"1990\",\"hourlyPayRate\":50.00}";
        assertEquals(expectedJSON, w1.toJSONDataRecord());
    }

    @org.junit.jupiter.api.Test
    void toXMLDataRecord() {
        String expectedXML = "<person><IDNum>000001</IDNum><firstName>John</firstName><lastName>Jones</lastName><title>Esq.</title><YOB>1990</YOB><hourlyPayRate>50.00</hourlyPayRate></person>";
        assertEquals(expectedXML, w1.toXMLDataRecord());
    }
}