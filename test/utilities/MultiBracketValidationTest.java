package utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test  // edge case test string is empty
    public void multiBracketValidationEmptyStringTest() {

       assertFalse("edge case test string is empty", multiBracketValidation(""));
    }

    @Test  //  expected  test should return false open and close not same length
    public void multiBracketValidationBracketsNotEqualTest() {
        assertFalse("expected  test should return false open and close not same length",multiBracketValidation("((){}"));
    }

    @Test   // regular test all equal
    public void multiBracketValidationBracketsEqualTest() {
        assertTrue( " regular test all equal" , multiBracketValidation("{([whatever gos here])}"));
    }

    @Test  // happy case test when one or two types only included
    public void multiBracketValidationEmptyNotAllEqualTest() {
        assertTrue( "happy case test when one or two types only included" , multiBracketValidation("{()}"));
    }
}