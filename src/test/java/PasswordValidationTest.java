import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationTest {

    //Tests for the  1st. Method --------------------------
    @Test
    public void testWhenPasswordLengthIs9ThenReturnTrue() {
        //GIVEN
        String password = "123456789";

        //WHEN
        boolean actual = PasswordValidation.isPassword8CharactersLongEnough(password);

        //THEN
        boolean expect = true;
        assertEquals(expect, actual, "test failed for testWhenPasswordLengthIs9");
    }

    @Test
    public void testWhenPasswordLengthIs8ThenReturnTrue() {
        //GIVEN
        String password = "12345678";

        //WHEN
        boolean actual = PasswordValidation.isPassword8CharactersLongEnough(password);

        //THEN
        boolean expect = true;
        assertEquals(expect, actual, "test failed for testWhenPasswordLengthIs8");
    }

    @Test
    public void testWhenPasswordLengthIs7ThenReturnFalse() {
        //GIVEN
        String password = "1234567";

        //WHEN
        boolean actual = PasswordValidation.isPassword8CharactersLongEnough(password);

        //THEN
        boolean expect = false;
        assertEquals(expect, actual, "test failed for testWhenPasswordLengthIs7");
    }

    @Test
    public void testWhenPasswordLengthIsNullThenReturnFalse() {   // "" is ?Null or Empty?
        //GIVEN
        String password = "";

        //WHEN
        boolean actual = PasswordValidation.isPassword8CharactersLongEnough(password);

        //THEN
        boolean expect = false;
        assertEquals(expect, actual, "test failed for testWhenPasswordLengthIsNull");
    }


    //Tests for the  2nd. Method --------------------------
    @Test
    public void testWhenPasswordContains1DigitsAtBeginThenReturnTrue() {
        //GIVEN
        String password = "1AbcDefG";     //also passt for other test?!

        //WHEN
        boolean actual = PasswordValidation.isPasswordContainsDigits(password);

        //THEN
        boolean expect = true;
        assertEquals(expect, actual, "test failed for testWhenPasswordContains1DigitsAtBegin");
    }

    @Test
    public void testWhenPasswordContains1DigitsAtTheEndThenReturnTrue() {
        //GIVEN
        String password = "AbcDefG1";     //also passt for other test?!

        //WHEN
        boolean actual = PasswordValidation.isPasswordContainsDigits(password);

        //THEN
        boolean expect = true;
        assertEquals(expect, actual, "test failed for testWhenPasswordContains1DigitsAtTheEnd");
    }

    @Test
    public void testWhenPasswordContainsNoDigitThenReturnFalse() {
        //GIVEN
        String password = "AbcDefG";

        //WHEN
        boolean actual = PasswordValidation.isPasswordContainsDigits(password);

        //THEN
        boolean expect = false;
        assertEquals(expect, actual, "test failed for testWhenPasswordContainsNoDigit");
    }


    //Tests for the  3rd. Method --------------------------
    @Test
    public void testWhenPasswordContainsBothCases_2a4684Z5_ThenReturnTrue() {
        //GIVEN
        String password = "2a4684Z5";

        //WHEN
        boolean actual = PasswordValidation.isPasswordContainsBothCases(password);

        //THEN
        boolean expect = true;
        assertEquals(expect, actual, "test failed for testWhenPasswordContainsBothCase_2a4684Z5");
    }

    @Test
    public void testWhenPasswordContainsOnlyLowerCases_2a46845_ThenReturnTrue() {
        //GIVEN
        String password = "2a46845";

        //WHEN
        boolean actual = PasswordValidation.isPasswordContainsBothCases(password);

        //THEN
        boolean expect = false;
        assertEquals(expect, actual, "test failed for testWhenPasswordContainsOnlyUpperCases_2a46845");
    }

    @Test
    public void testWhenPasswordContainsOnlyUpperCases_2a46845_ThenReturnTrue() {
        //GIVEN
        String password = "246T845";

        //WHEN
        boolean actual = PasswordValidation.isPasswordContainsBothCases(password);

        //THEN
        boolean expect = false;
        assertEquals(expect, actual, "test failed for testWhenPasswordContainsOnlyUpperCases_246T845");
    }


    //Tests for the  4th. Method --------------------------
    @Test
    public void testWhenPassword_Mary123J_ThenReturnFalse() {
        //GIVEN
        String password = "Mary123J";

        //WHEN
        boolean actual = PasswordValidation.isPasswordCommon(password);

        //THEN
        boolean expect = false;
        assertEquals(expect, actual, "test failed for testWhenPassword_Mary123J_ThenReturnFalse");
    }

    @Test
    public void testWhenPassword_Password1_ThenReturnTrue() {
        //GIVEN
        String password = "Password1";

        //WHEN
        boolean actual = PasswordValidation.isPasswordCommon(password);

        //THEN
        boolean expect = true;
        assertEquals(expect, actual, "test failed for testWhenPassword_Password1_ThenReturnTrue");
    }

    @Test
    public void testWhenPassword_Aa345678_ThenReturnFalse() {
        //GIVEN
        String password = "Aa345678";

        //WHEN
        boolean actual = PasswordValidation.isPasswordCommon(password);

        //THEN
        boolean expect = false;
        assertEquals(expect, actual, "test failed for testWhenPassword_Aa345678_ThenReturnFalse");
    }

}
