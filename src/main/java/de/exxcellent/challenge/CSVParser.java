package de.exxcellent.challenge;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVParser {

    /**
     * @param pathToFile specifies the path to the CSV-File
     * @param columnName the name of the column being examined
     * @return The function returns a list with the values of the column with the given name
     */
    public static List<String> ReadCSVFileColumn(String pathToFile, String columnName) {
        String[] currentLine;
        int columnIndex = -1;
        boolean isHeader = true;

        List<String> columnList = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(pathToFile))) {
            while ((currentLine = reader.readNext()) != null) {

                // get index of column with looking inside the header for name
                if (isHeader) {
                    columnIndex = Arrays.asList(currentLine).indexOf(columnName);
                    isHeader = false;
                    continue;
                }

                // get value of column
                columnList.add(currentLine[columnIndex]);
            }

        } catch (Exception exception) {
            System.out.println("OOPS. Something went wrong here: " + exception);
        }
        
        return columnList;
    }


}
