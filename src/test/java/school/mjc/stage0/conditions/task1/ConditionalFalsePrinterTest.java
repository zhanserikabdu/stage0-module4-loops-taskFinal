package school.mjc.stage0.conditions.task1;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionalFalsePrinterTest extends BaseIOTest {

    @Test
    void mainPrintsFalse() {
        ConditionalFalsePrinter.main(null);

        assertEquals("false\n", updateLineSpliterators(outContent.toString()));
    }


    @Test
    void containsIfConditionCheck() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task1/ConditionalFalsePrinter.java");
        List<String> strings = Files.readAllLines(path);
        List<String> declarationResult = strings.stream()
                .filter(line -> line.contains("else"))
                .collect(Collectors.toList());

        List<String> falseList = strings.stream()
                .filter(line -> line.contains("false"))
                .collect(Collectors.toList());


        assertEquals(1, declarationResult.size());
        assertEquals(2, falseList.size());
    }

}