import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        // Given


        // When

        // Look up data according to hamlet file

        //Then

    }

    @Test
    public void testChangeHoratioToTariq() {
    }

    @Test
    public void FindHoratio() {

    }

    @Test
    public void FindHamlet() {
    }
}