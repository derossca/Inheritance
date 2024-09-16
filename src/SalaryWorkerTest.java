import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SalaryWorkerTest {

    SalaryWorker s1;

    @BeforeEach
    void setUp() {
        s1 = new SalaryWorker("000001", "John", "Jones", "Esq.", 1990, 50,96000);
    }

    @Test
    void setAnnualSalary() {
        s1.setAnnualSalary(50000);
        assertEquals(50000, s1.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        double expectedPay = s1.calculateWeeklyPay(40);
        double actualPay = s1.calculateWeeklyPay(40);
        assertEquals(expectedPay, actualPay);
    }

    @Test
    void displayWeeklyPay() {
        String expectedDisplay = s1.displayWeeklyPay(50);
        String actualDisplay = s1.displayWeeklyPay(50);
        assertEquals(expectedDisplay, actualDisplay);
    }

    @Test
    void toCSVDataRecord() {
    }

    @Test
    void toJSONDataRecord() {
    }

    @Test
    void toXMLDataRecord() {
    }
}