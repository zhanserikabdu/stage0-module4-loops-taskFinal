package school.mjc.stage0.loops.finalTask;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class PyramidTest extends BaseIOTest {

    @Test
    void printHalfPyramidPrintNineFloor() {
        String expected = "        1        \n" +
                "       212       \n" +
                "      32123      \n" +
                "     4321234     \n" +
                "    543212345    \n" +
                "   65432123456   \n" +
                "  7654321234567  \n" +
                " 876543212345678 \n" +
                "98765432123456789\n";

        Pyramid pyramid = new Pyramid();

        pyramid.printPyramid(9);

        assertOutEquals(expected);
    }

    @Test
    void printHalfPyramidPrintSixFloor() {
        String expected =
                "     1     \n" +
                "    212    \n" +
                "   32123   \n" +
                "  4321234  \n" +
                " 543212345 \n" +
                "65432123456\n" ;

        Pyramid pyramid = new Pyramid();

        pyramid.printPyramid(6);

        assertOutEquals(expected);
    }
    @Test
    void printHalfPyramidPrintZeroFloor() {
        String expected = "" ;

        Pyramid pyramid = new Pyramid();

        pyramid.printPyramid(0);

        assertOutEquals(expected);
    }
}