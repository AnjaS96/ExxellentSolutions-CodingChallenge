package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.List;

public class FootballTask {
private static final String pathFootballFile = "ExxellentSolution-CodingChallenge\\src\\main\\resources\\de\\exxcellent\\challenge\\football.csv";

    /**
     * @return This function returns the team with the smallest distance (absolute difference) between 'Goals' and 'Goals Allowed'
     */
    public static String TeamSmallestGoalDistance() {
        List<String> goals = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathFootballFile,"Goals"));
        List<String> goalsAllowed = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathFootballFile,"Goals Allowed"));
        List<String> team = new ArrayList<>(CSVParser.ReadCSVFileColumn(pathFootballFile,"Team"));

        List<Integer> temperatureSpreads = new ArrayList<>(Calculation.CalculateAbsoluteDifferences(goals, goalsAllowed));

        return team.get(Calculation.GetSmallestValueIndex(temperatureSpreads));
    }
}
