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

class ConditionalTruePrinterTest extends BaseIOTest {

    @Test
    void mainPrintsTrue() {
        ConditionalTruePrinter.main(null);

        assertEquals("true\n", updateLineSpliterators(outContent.toString()));
    }


    @Test
    void containsIfConditionCheck() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task1/ConditionalTruePrinter.java");
        List<String> strings = Files.readAllLines(path);
        List<String> declarationResult = strings.stream()
                .filter(line -> line.contains("if"))
                .collect(Collectors.toList());

        List<String> trueList = strings.stream()
                .filter(line -> line.contains("true"))
                .collect(Collectors.toList());


        assertEquals(1, declarationResult.size());
        assertEquals(2, trueList.size());
    }

}