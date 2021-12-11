import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

    public String changeHamletToLeon() {
        // Set String to replace
        String replaceWithLeon = "Leon";
        // Find value to replace with
        Pattern newPattern = Pattern.compile("Horatio", Pattern.CASE_INSENSITIVE);
        // Look up data according to hamlet file
        Matcher matcher = newPattern.matcher(hamletData);

        return matcher.replaceAll(replaceWithLeon);
    }

    public String changeHoratioToTariq() {
        // Set String to replace
        String replaceWithTariq = "Tariq";
        // Find value to replace with
        Pattern newPattern = Pattern.compile("Tariq", Pattern.CASE_INSENSITIVE);
        // Look up data according to hamlet file
        Matcher newMatcher = newPattern.matcher(hamletData);
        return newMatcher.replaceAll(replaceWithTariq);
    }

    public int findHoratio() {
        // Create a counter
        int countOfHoratio = 0;
        // Set value to find
        Pattern newPattern = Pattern.compile("Horatio",Pattern.CASE_INSENSITIVE);
        // Search for value in hamlet text
        Matcher newMatcher = newPattern.matcher(hamletData);
        // Set up while loop to count all instances of Horatio
        while(newMatcher.find()) {
            countOfHoratio++;
        }
          return countOfHoratio;
    }

    public int findHamlet() {
        // Create a counter
        int countOfHamlet = 0;
        // Set value to find
        Pattern newPattern = Pattern.compile("Hamlet", Pattern.CASE_INSENSITIVE);
        // Search for value in hamlet text
        Matcher newMatcher = newPattern.matcher(hamletData);
        // Set up while loop to count all instances of Horatio
        while(newMatcher.find()) {
            countOfHamlet++;
        }
        return countOfHamlet;
    }
}
