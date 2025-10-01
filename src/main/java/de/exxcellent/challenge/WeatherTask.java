package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.List;

public class WeatherTask {
    private static final String pathWeatherFile = "ExxellentSolution-CodingChallenge\\src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv";
    private static  List<Integer> temperatureSpreads = new ArrayList<>();

    /**
     * This function calculates the temperature spreads between the minimum
     * and maximum temperature and writes the results into the list "temperatureSpreads"
     */
    private static void CalculateTemperatureSpreads() {
        List<String> minTemp = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathWeatherFile,"MnT"));
        List<String> maxTemp = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathWeatherFile,"MxT"));

        for (int i = 0; i < minTemp.size() - 1; i++) {
            int temperatureSpread = Integer.parseInt(maxTemp.get(i)) - Integer.parseInt(minTemp.get(i));
            temperatureSpreads.add(temperatureSpread);
        }
    }


    /**
     * @return This function identifies the index of the smallest temperature spread
     * of the list "temperatureSpread" and returns the day
     */
    public static String DayOfSmallestTemperatureSpread() {
        List<String> dayList = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathWeatherFile,"Day"));

        CalculateTemperatureSpreads();

        int smallestTemperatureSpread = temperatureSpreads.get(0);
        int indexDaySmallesTempSpread = -1;

        for (int i = 0; i < temperatureSpreads.size() - 1; i++) {
            if (temperatureSpreads.get(i) < smallestTemperatureSpread) {
                smallestTemperatureSpread = temperatureSpreads.get(i);
                indexDaySmallesTempSpread = i;
            }
        }

        return dayList.get(indexDaySmallesTempSpread);
    }


}
