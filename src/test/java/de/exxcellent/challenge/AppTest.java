package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    @Test
    void calculateGoalDifferenceWithMixedUpValues(){
        //ExpectedInput
        String pathTestWeatherFile = "src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv";
        List<String> goals = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathTestWeatherFile,"Goals"));
        List<String> goalsAllowed = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathTestWeatherFile,"Goals Allowed"));

        //Test Input - min and max temperature changed
        List<String> goalsTest = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathTestWeatherFile,"Goals Allowed"));
        List<String> goalsAllowedTest = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathTestWeatherFile,"Goals"));

        assertEquals(Calculation.CalculateAbsoluteDifferences(goals, goalsAllowed), 
            Calculation.CalculateAbsoluteDifferences(goalsTest, goalsAllowedTest)
            , "Even with mixed up values the result is the same");
    }

    @Test
    void ProveGetSmallestValueIndex(){
        List<Integer> testingList = new ArrayList<>(Arrays.asList(4,2,1,53,2,0,11));
        assertEquals(5,Calculation.GetSmallestValueIndex(testingList), "The Index of the value '0'");
    }
}