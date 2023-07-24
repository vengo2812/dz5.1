package ru.netology.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data")

    void TestCalculateMonth(int income, int expenses, int threshold, int expected){
        MonthService Service = new MonthService();

        int actual = Service.calculate(income,expenses,threshold);


        Assertions.assertEquals(actual, expected);
    }



}
