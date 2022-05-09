import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MutableTest {

    Mutable<String> Test =         new Mutable<>("Banana",
                                    new Mutable<>("Apple",
                                    new Mutable<> ("Coconout",
                                    new Mutable<>("Orange", null))));

    @Test
    void returnsCorrectValue() {

        Assertions.assertSame("Banana" ,  Test.data());
        Assertions.assertNotSame("Pumpkin" ,  Test.data());

    }

    @Test
    void moveToNextValue() {

        Assertions.assertSame("Apple", Test.next().data());
        Assertions.assertSame("Coconout", Test.next().next().data());

    }

    @Test
    void setsTheLastValue() {
        var testObject = new Mutable<>("PineApple",null);
        Test.next().next().next().setNext(testObject);
        Assertions.assertSame("PineApple", Test.next().next().next().data());


    }

    @Test
    void isEmpty() {

        Assertions.assertSame(true, Test.next().next().next().isEmpty() );

    }

    @Test
    void hasCycle() {

        Assertions.assertSame(false, Test.hasCycle(Test));

    }
}