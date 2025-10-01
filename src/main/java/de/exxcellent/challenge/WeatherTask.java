package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.List;

public class WeatherTask {
    private final String pathWeatherFile = "src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv";
    private List<Integer> temperatureSpreads = new ArrayList<>();

    /**
     * This function calculates the temperature spreads between the minimum
     * and maximum temperature and writes the results into the list "temperatureSpreads"
     */
    private void CalculateTemperatureSpreads() {
        List<String> minTemp = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathWeatherFile,"MnT"));
        List<String> maxTemp = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathWeatherFile,"MxT"));

        for (int i = 0; i < minTemp.size() - 1; i++) {
            int temperatureSpread = Integer.parseInt(maxTemp.get(i)) - Integer.parseInt(minTemp.get(i));
            temperatureSpreads.add(temperatureSpread);
        }
    }


    public String DayOfSmallestTemperatureSpread() {
        return "";
    }


}
