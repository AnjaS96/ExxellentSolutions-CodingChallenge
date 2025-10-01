package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.List;

public class FootballTask {

    private static final String PATH_FOOTBALL_FILE = "ExxellentSolution-CodingChallenge\\src\\main\\resources\\de\\exxcellent\\challenge\\football.csv";

    /**
     * @return This function returns the team with the smallest distance
     * (absolute difference) between 'Goals' and 'Goals Allowed'
     */
    public static String TeamSmallestGoalDistance() {
        List<String> goals = new ArrayList<>(CSVParser.ReadCSVFileColumn(PATH_FOOTBALL_FILE, "Goals"));
        List<String> goalsAllowed = new ArrayList<>(CSVParser.ReadCSVFileColumn(PATH_FOOTBALL_FILE, "Goals Allowed"));
        List<String> teams = new ArrayList<>(CSVParser.ReadCSVFileColumn(PATH_FOOTBALL_FILE, "Team"));

        List<Integer> temperatureSpreads = new ArrayList<>(Calculation.CalculateAbsoluteDifferences(goals, goalsAllowed));

        return teams.get(Calculation.GetSmallestValueIndex(temperatureSpreads));
    }
}
