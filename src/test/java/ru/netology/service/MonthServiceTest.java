package ru.netology.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MonthServiceTest {

    @Test

    void TestCalculateMonth1(){
        MonthService Service = new MonthService();

        int actual = Service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    void TestCalculateMonth2(){
        MonthService Service = new MonthService();

        int actual = Service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }


}
