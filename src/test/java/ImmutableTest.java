import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ImmutableTest {

    Immutable<String> Test =        new Immutable<>("Banana",
                                    new Immutable<>("Apple",
                                    new Immutable<> ("Coconout", null)));

    @Test
    void returnsCorrectValue() {

        Assertions.assertEquals("Banana", Test.data());
        Assertions.assertNotSame("Apple", Test.data());

    }

    @Test
    void moveToNextValue() {

        Assertions.assertEquals("Coconout", Test.next().next().data());
        Assertions.assertNotSame("Coconout", Test.next().data());

    }

    @Test
    void hasCycle() {

        Assertions.assertFalse(Test.hasCycle(Test));

    }

    @Test
    void nextValueIsEmpty() {

        Assertions.assertNotSame(true,Test.next().isEmpty());
        Assertions.assertSame(true,Test.next().next().isEmpty());
        Assertions.assertSame(false,Test.isEmpty());

    }
}