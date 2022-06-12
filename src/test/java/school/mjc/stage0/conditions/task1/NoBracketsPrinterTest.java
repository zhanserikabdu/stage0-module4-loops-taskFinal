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

class NoBracketsPrinterTest extends BaseIOTest {

    @Test
    void mainPrintsNothing() {
        NoBracketsPrinter.main(null);

        assertEquals("", updateLineSpliterators(outContent.toString()));
    }

    @Test
    void containsRequiredPrintStatements() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task1/NoBracketsPrinter.java");
        List<String> strings = Files.readAllLines(path);
        List<String> declarationResult = strings.stream()
                .filter(line -> line.contains("if"))
                .collect(Collectors.toList());

        List<String> trueList = strings.stream()
                .filter(line -> line.contains("System.out.println(\"The statement is true\");")
                        || line.contains("System.out.println(\"I'm out of checking\");"))
                .collect(Collectors.toList());


        assertEquals(1, declarationResult.size());
        assertEquals(2, trueList.size());
    }

}