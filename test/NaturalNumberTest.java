import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;

/**
 * JUnit test fixture for {@code NaturalNumber}'s constructors and kernel
 * methods.
 *
 * @author A. Singh & W. Khalil
 *
 */
public abstract class NaturalNumberTest {

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @return the new number
     * @ensures constructorTest = 0
     */
    protected abstract NaturalNumber constructorTest();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorTest = i
     */
    protected abstract NaturalNumber constructorTest(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorTest)
     */
    protected abstract NaturalNumber constructorTest(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * implementation under test and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorTest = n
     */
    protected abstract NaturalNumber constructorTest(NaturalNumber n);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @return the new number
     * @ensures constructorRef = 0
     */
    protected abstract NaturalNumber constructorRef();

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param i
     *            {@code int} to initialize from
     * @return the new number
     * @requires i >= 0
     * @ensures constructorRef = i
     */
    protected abstract NaturalNumber constructorRef(int i);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param s
     *            {@code String} to initialize from
     * @return the new number
     * @requires there exists n: NATURAL (s = TO_STRING(n))
     * @ensures s = TO_STRING(constructorRef)
     */
    protected abstract NaturalNumber constructorRef(String s);

    /**
     * Invokes the appropriate {@code NaturalNumber} constructor for the
     * reference implementation and returns the result.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     * @return the new number
     * @ensures constructorRef = n
     */
    protected abstract NaturalNumber constructorRef(NaturalNumber n);

    /**
     * Simple test case, only one needed.
     */
    @Test
    public void noArgumentConstructorTest() {

        //Variables
        NaturalNumber nn = this.constructorTest();
        NaturalNumber nnExpected = this.constructorRef();

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Boundary test case, where the input is 0 integer.
     */
    @Test
    public void intConstructorTestZero() {

        //Variables
        NaturalNumber nn = this.constructorTest(0);
        NaturalNumber nnExpected = this.constructorRef(0);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine test case, where the input is single digit integer.
     */
    @Test
    public void intConstructorTestSingleDigit() {

        //Variables
        NaturalNumber nn = this.constructorTest(2);
        NaturalNumber nnExpected = this.constructorRef(2);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine test case, where the input is many digits integer.
     */
    @Test
    public void intConstructorTestManyDigits() {

        //Used to prevent check style error
        final int integer = 46678;

        //Variables
        NaturalNumber nn = this.constructorTest(integer);
        NaturalNumber nnExpected = this.constructorRef(integer);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Challenging test case, where the input is Integer.MAX_VALUE.
     */
    @Test
    public void intConstructorTestIntegerMaxValue() {

        //Variables
        NaturalNumber nn = this.constructorTest(Integer.MAX_VALUE);
        NaturalNumber nnExpected = this.constructorRef(Integer.MAX_VALUE);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Boundary test case, where the string is 0.
     */
    @Test
    public void stringConstructorTestZero() {

        //Variables
        String str = "0";
        NaturalNumber nn = this.constructorTest(str);
        NaturalNumber nnExpected = this.constructorRef(str);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine test case, where the string is 7.
     */
    @Test
    public void stringConstructorTestSingleDigit() {

        //Variables
        String str = "7";
        NaturalNumber nn = this.constructorTest(str);
        NaturalNumber nnExpected = this.constructorRef(str);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine test case, where the string is 10547.
     */
    @Test
    public void stringConstructorTestManyDigits() {

        //Variables
        String str = "10547";
        NaturalNumber nn = this.constructorTest(str);
        NaturalNumber nnExpected = this.constructorRef(str);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Challenge test case, where the string is over Integer.MAX_VALUE, to break
     * any Integer method calls if any used.
     */
    @Test
    public void stringConstructorTestOverIntegerMaxValue() {

        //Variables
        String str = "2756987563631564126";
        NaturalNumber nn = this.constructorTest(str);
        NaturalNumber nnExpected = this.constructorRef(str);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Boundary test case, where the natural number input is 0.
     */
    @Test
    public void nnConstructorTestZeroNN() {

        //Input variables
        NaturalNumber inputNN3 = this.constructorTest();
        NaturalNumber inputNN2 = this.constructorRef();

        //Variables
        NaturalNumber nn = this.constructorTest(inputNN3);
        NaturalNumber nnExpected = this.constructorRef(inputNN2);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine test case, where the natural number input is 3.
     */
    @Test
    public void nnConstructorTestSingleDigitNN() {

        //To prevent check style error
        final int integer = 3;

        //Input variables
        NaturalNumber inputNN3 = this.constructorTest(integer);
        NaturalNumber inputNN2 = this.constructorRef(integer);

        //Variables
        NaturalNumber nn = this.constructorTest(inputNN3);
        NaturalNumber nnExpected = this.constructorRef(inputNN2);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine test case, where the natural number input is 1964547.
     */
    @Test
    public void nnConstructorTestManyDigitsNN() {

        //Input variables
        String str = "1964547976436347721354";
        NaturalNumber inputNN3 = this.constructorTest(str);
        NaturalNumber inputNN2 = this.constructorRef(str);

        //Variables
        NaturalNumber nn = this.constructorTest(inputNN3);
        NaturalNumber nnExpected = this.constructorRef(inputNN2);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Challenge test case, where the natural number input is over
     * Integer.MAX_VALUE, to break any Integer method calls if any used.
     */
    @Test
    public void nnConstructorTestOverIntegerMaxValueNN() {

        //Input variables
        String str = "96458463248564866548512";
        NaturalNumber inputNN3 = this.constructorTest(str);
        NaturalNumber inputNN2 = this.constructorRef(str);

        //Variables
        NaturalNumber nn = this.constructorTest(inputNN3);
        NaturalNumber nnExpected = this.constructorRef(inputNN2);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Boundary case, where appending 0 to natural number whose value is 0.
     */
    @Test
    public void multiplyBy10TestZeroDigits() {

        //Variables
        NaturalNumber nn = this.constructorTest();
        NaturalNumber nnExpected = this.constructorRef();

        //Call
        nn.multiplyBy10(0);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * CORRECTION: ADDTIONAL TEST CASE (0.25 POINTS).
     */
    @Test
    public void multiplyBy10TestNonZeroDigits() {

        //Variables
        NaturalNumber nn = this.constructorTest(1);
        final int answer = 10; // To avoid check style warning
        NaturalNumber nnExpected = this.constructorRef(answer);

        //Call
        nn.multiplyBy10(0);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine case, where appending 2 to natural number whose value is 0.
     */
    @Test
    public void multiplyBy10TestSingleDigits() {

        //Variables (test)
        NaturalNumber nn = this.constructorTest();

        //Call
        nn.multiplyBy10(2);

        //Variables (expected)
        final int integer = 2;
        NaturalNumber nnExpected = this.constructorRef(integer);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine case, where appending 7 to natural number whose value is 123456.
     */
    @Test
    public void multiplyBy10TestManyDigits() {

        //Variables (test)
        final int startingNN = 123456;
        final int endingNN = 7;
        NaturalNumber nn = this.constructorTest(startingNN);

        //Call
        nn.multiplyBy10(endingNN);

        //Variables (expected)
        final int integer = 1234567;
        NaturalNumber nnExpected = this.constructorRef(integer);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Challenge test case, where the natural number input is over
     * Integer.MAX_VALUE, to break any Integer method calls if any used.
     */
    @Test
    public void multiplyBy10TestOverIntegerMaxValueDigits() {

        //Variables (test)
        String startingNN = "930482912998965452";
        final int endingNN = 7;
        NaturalNumber nn = this.constructorTest(startingNN);

        //Call
        nn.multiplyBy10(endingNN);

        //Variables (expected)
        String integer = "9304829129989654527";
        NaturalNumber nnExpected = this.constructorRef(integer);

        //Assertion
        assertEquals(nnExpected, nn);
    }

    /**
     * Boundary case, where the natural number is 0.
     */
    @Test
    public void divideBy10TestZeroNN() {

        //Variables (test)
        NaturalNumber nn = this.constructorTest();

        //Call
        final int remainder = nn.divideBy10();

        //Variables (expected)
        final int remainderExpected = 0;
        NaturalNumber nnExpected = this.constructorRef();

        //Assertion
        assertEquals(remainderExpected, remainder);
        assertEquals(nnExpected, nn);
    }

    /**
     * CORRECTION: ADDTIONAL TEST CASE (0.25 POINTS).
     */
    @Test
    public void divideBy10TestNonZeroNN() {

        //Variables (test)
        final int integer = 10;
        NaturalNumber nn = this.constructorTest(integer);

        //Call
        final int remainder = nn.divideBy10();

        //Variables (expected)
        final int remainderExpected = 0;
        NaturalNumber nnExpected = this.constructorRef(1);

        //Assertion
        assertEquals(remainderExpected, remainder);
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine case, where the natural number is single digit.
     */
    @Test
    public void divideBy10TestSingleDigitNN() {

        //Variables (test)
        final int integer = 3;
        NaturalNumber nn = this.constructorTest(integer);

        //Call
        final int remainder = nn.divideBy10();

        //Variables (expected)
        final int remainderExpected = 3;
        NaturalNumber nnExpected = this.constructorRef();

        //Assertion
        assertEquals(remainderExpected, remainder);
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine case, where the natural number is single digit.
     */
    @Test
    public void divideBy10TestManyDigitsNN() {

        //Variables (test)
        final int integer = 369465;
        NaturalNumber nn = this.constructorTest(integer);

        //Call
        final int remainder = nn.divideBy10();

        //Variables (expected)
        final int remainderExpected = 5;
        final int integerExpected = 36946;
        NaturalNumber nnExpected = this.constructorRef(integerExpected);

        //Assertions
        assertEquals(remainderExpected, remainder);
        assertEquals(nnExpected, nn);
    }

    /**
     * Challenge test case, where the natural number is over Integer.MAX_VALUE,
     * to break any Integer method calls if any used.
     */
    @Test
    public void divideBy10TestOverIntegerMaxValueNN() {

        //Variables (test)
        String integer = "39483910391484534899949";
        NaturalNumber nn = this.constructorTest(integer);

        //Call
        final int remainder = nn.divideBy10();

        //Variables (expected)
        final int remainderExpected = 9;
        String integerExpected = "3948391039148453489994";
        NaturalNumber nnExpected = this.constructorRef(integerExpected);

        //Assertions
        assertEquals(remainderExpected, remainder);
        assertEquals(nnExpected, nn);
    }

    /**
     * Boundary case, where the natural number is zero.
     */
    @Test
    public void nnIsZeroTestZeroNN() {

        //Variables
        NaturalNumber nn = this.constructorTest();
        NaturalNumber nnExpected = this.constructorRef();

        //Call
        boolean isZero = nn.isZero();

        //Assertions
        assertEquals(true, isZero);
        //To make sure the call didn't alter the NN
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine case, where natural number is 1 in string form.
     */
    @Test
    public void nnIsZeroTestSingleDigitNN() {

        //Variables
        NaturalNumber nn = this.constructorTest("1");
        NaturalNumber nnExpected = this.constructorRef("1");

        //Call
        boolean isZero = nn.isZero();

        //Assertions
        assertEquals(false, isZero);
        //To make sure the call didn't alter the NN
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine case, where the natural number has many digits.
     */
    @Test
    public void nnIsZeroTestManyDigitsNN() {

        //Variables
        final int integer = 11938;
        NaturalNumber nn = this.constructorTest(integer);
        NaturalNumber nnExpected = this.constructorRef(integer);

        //Call
        boolean isZero = nn.isZero();

        //Assertions
        assertEquals(false, isZero);
        //To make sure the call didn't alter the NN
        assertEquals(nnExpected, nn);
    }

    /**
     * Routine case, where the natural number is over Integer.MAX_VALUE.
     */
    @Test
    public void nnIsZeroTestStringOverIntegerMaxValueNN() {

        //Variables
        NaturalNumber nn = this.constructorTest("466463241486121333594");
        NaturalNumber nnExpected = this.constructorRef("466463241486121333594");

        //Call
        boolean isZero = nn.isZero();

        //Assertions
        assertEquals(false, isZero);
        //To make sure the call didn't alter the NN
        assertEquals(nnExpected, nn);
    }
}
