package Javaprogrammering60yhp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.iths.Javaprogrammering60yhp.Exercise_1_1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise_1_1_Test {
    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainOutput() {
        Exercise_1_1.main(new String[] {});
        String expectedOutput = "Bye!";
        assertEquals(expectedOutput, outContent.toString().trim(), "Main-metoden skriver inte ut den förväntade raden.");
    }
}
