package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeGreetingTest {
    private Greeting greeting;

    @BeforeEach
    void setUp() {
        System.out.println("Before each method");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Spring"));
    }
}