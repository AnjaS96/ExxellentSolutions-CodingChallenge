package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.List;

public class WeatherTask {
    private static final String pathWeatherFile = "ExxellentSolution-CodingChallenge\\src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv";

    /**
     * @return This function returns the day where the smallest temperature spread is calculated
     */
    public static String DayOfSmallestTemperatureSpread() {
        List<String> minTemp = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathWeatherFile,"MnT"));
        List<String> maxTemp = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathWeatherFile,"MxT"));
        List<String> dayList = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathWeatherFile,"Day"));

        List<Integer> temperatureSpreads = new ArrayList<>(Calculation.CalculateAbsoluteDifferences(minTemp, maxTemp));

        return dayList.get(Calculation.GetSmallestValueIndex(temperatureSpreads));
    }
}
