package school.mjc.stage0.conditions.task1;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class PositiveNumberDetermainerTest extends BaseIOTest {

    @Test
    void isPositivePrintsTrueWhenPositive() {
        PositiveNumberDetermainer numberDetermainer = new PositiveNumberDetermainer();

        numberDetermainer.isPositive(1);

        assertEquals("true\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void isPositivePrintsFalseWhenZero() {
        PositiveNumberDetermainer numberDetermainer = new PositiveNumberDetermainer();

        numberDetermainer.isPositive(0);

        assertEquals("false\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void isPositivePrintsFalseWhenNegative() {
        PositiveNumberDetermainer numberDetermainer = new PositiveNumberDetermainer();

        numberDetermainer.isPositive(-1);

        assertEquals("false\n", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void containsIfElseChecks() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task1/PositiveNumberDetermainer.java");
        List<String> strings = Files.readAllLines(path);
        List<String> declarationResult = strings.stream()
                .filter(line -> line.contains("if") || line.contains("false"))
                .collect(Collectors.toList());


        assertEquals(2, declarationResult.size());
    }

}