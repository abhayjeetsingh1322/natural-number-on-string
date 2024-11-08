import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumberSecondary;

/**
 * {@code NaturalNumber} represented as a {@code String} with implementations of
 * primary methods.
 *
 * @convention <pre>
 * [all characters of $this.rep are '0' through '9']  and
 * [$this.rep does not start with '0']
 * </pre>
 * @correspondence <pre>
 * this = [if $this.rep = "" then 0
 *         else the decimal number whose ordinary depiction is $this.rep]
 * </pre>
 *
 * @author A. Singh & W. Khalil
 *
 */
public class NaturalNumber3 extends NaturalNumberSecondary {

    /*
     * Private members --------------------------------------------------------
     */

    /**
     * Representation of {@code this}.
     */
    private String rep;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {

        this.rep = "";
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public NaturalNumber3() {

        this.createNewRep();
    }

    /**
     * Constructor from {@code int}.
     *
     * @param i
     *            {@code int} to initialize from
     */
    public NaturalNumber3(int i) {
        assert i >= 0 : "Violation of: i >= 0";

        this.createNewRep();

        //Checking if integer is greater than 0
        if (i > 0) {
            this.rep = Integer.toString(i);
        }
    }

    /**
     * Constructor from {@code String}.
     *
     * @param s
     *            {@code String} to initialize from
     */
    public NaturalNumber3(String s) {
        assert s != null : "Violation of: s is not null";
        assert s.matches("0|[1-9]\\d*") : ""
                + "Violation of: there exists n: NATURAL (s = TO_STRING(n))";

        this.createNewRep();

        //Getting first digit
        String firstNumber = s.substring(0, 1);
        int firstDigit = Integer.parseInt(firstNumber);

        //Checking if the first digit is greater than 0
        if (firstDigit > 0) {
            this.rep = s;
        }
    }

    /**
     * Constructor from {@code NaturalNumber}.
     *
     * @param n
     *            {@code NaturalNumber} to initialize from
     */
    public NaturalNumber3(NaturalNumber n) {
        assert n != null : "Violation of: n is not null";

        this.createNewRep();

        //Calling kernel method to check if the natural number is 0
        if (!n.isZero()) {
            this.rep = n.toString();
        }
    }

    /*
     * Standard methods -------------------------------------------------------
     */

    @Override
    public final NaturalNumber newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final void transferFrom(NaturalNumber source) {
        assert source != null : "Violation of: source is not null";
        assert source != this : "Violation of: source is not this";
        assert source instanceof NaturalNumber3 : ""
                + "Violation of: source is of dynamic type NaturalNumberExample";
        /*
         * This cast cannot fail since the assert above would have stopped
         * execution in that case.
         */
        NaturalNumber3 localSource = (NaturalNumber3) source;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }

    /*
     * Kernel methods ---------------------------------------------------------
     */

    @Override
    public final void multiplyBy10(int k) {
        assert 0 <= k : "Violation of: 0 <= k";
        assert k < RADIX : "Violation of: k < 10";

        //Checking if integer is equal to 0
        if (k == 0) {

            //Making sure that the natural number string is not empty
            if (!this.rep.isEmpty()) {
                this.rep = this.rep + "0";
            }
            //Else adding the integer as it is
        } else {
            this.rep = this.rep + Integer.toString(k);
        }

    }

    @Override
    public final int divideBy10() {

        //Declaring a integer variable for remainder
        int remainder = 0;

        //Checking if natural number string is empty
        if (!this.rep.isEmpty()) {

            //Extracting the remainder (last digit) and reassign the natural
            //number string

            remainder = Integer
                    .parseInt(this.rep.substring(this.rep.length() - 1));

            this.rep = this.rep.substring(0, this.rep.length() - 1);
        }

        //Returning remainder
        return remainder;
    }

    @Override
    public final boolean isZero() {

        //Calling string method to check if its empty
        return this.rep.isEmpty();
    }

}
