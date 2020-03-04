package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PracticeGreetingTest {

    private Greeting greeting;
    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before all !");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());

    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Nerkec"));
    }

    @Test
    void helloWorld2() {
        System.out.println(greeting.helloWorld("Perkec"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each ...");
    }

    @AfterAll
    public static void afterClass (){
        System.out.println("After all !");
    }
}