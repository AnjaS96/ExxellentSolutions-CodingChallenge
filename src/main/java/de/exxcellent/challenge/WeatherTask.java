package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.List;

public class WeatherTask {

    private static final String PATH_WEATHER_FILE = "ExxellentSolution-CodingChallenge\\src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv";

    /**
     * @return This function returns the day where the smallest temperature
     * spread is calculated
     */
    public static String DayOfSmallestTemperatureSpread() {
        List<String> minimumTemperatures = new ArrayList<>(CSVParser.ReadCSVFileColumn(PATH_WEATHER_FILE, "MnT"));
        List<String> maximumTemperatures = new ArrayList<>(CSVParser.ReadCSVFileColumn(PATH_WEATHER_FILE, "MxT"));
        List<String> days = new ArrayList<>(CSVParser.ReadCSVFileColumn(PATH_WEATHER_FILE, "Day"));

        List<Integer> temperatureSpreads = new ArrayList<>(Calculation.CalculateAbsoluteDifferences(minimumTemperatures, maximumTemperatures));

        return days.get(Calculation.GetSmallestValueIndex(temperatureSpreads));
    }
}
