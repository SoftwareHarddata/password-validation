import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationTest {
    @Test
    @DisplayName("checkLength")
    public void checkLength() {
        //Given
        String password = "nimbus1234";
        String passwordOhne = "nim";
        //When
        boolean result = PasswordValidation.checkLength(password);
        boolean resultOhne = PasswordValidation.checkLength(passwordOhne);
        //Then
        assertEquals(true, result);
        assertEquals(false, resultOhne);
    }

    @Test
    @DisplayName("checkNumbers")
    public void checkNumbers() {
        //Given
        String password = "nimbus123";
        String passwordOhne = "nimbus";
        //When
        boolean result = PasswordValidation.checkNumbers(password);
        boolean resultOhne = PasswordValidation.checkNumbers(passwordOhne);
        //Then
        assertEquals(true, result);
        assertEquals(false, resultOhne);
    }

    @Test
    @DisplayName("checkUpperCase")
    public void checkUpperCase() {
        //Given
        String password = "niMbus123";
        String passwordOhne = "nimbus";
        //When
        boolean result = PasswordValidation.checkUpperCase(password);
        boolean resultOhne = PasswordValidation.checkUpperCase(passwordOhne);
        //Then
        assertEquals(true, result);
        assertEquals(false, resultOhne);
    }

    @Test
    @DisplayName("checkLowerCase")
    public void checkLowerCase() {
        //Given
        String password = "nimbus234";
        String passwordOhne = "NIMBUS";
        //When
        boolean result = PasswordValidation.checkLowerCase(password);
        boolean resultOhne = PasswordValidation.checkLowerCase(passwordOhne);
        //Then
        assertEquals(true, result);
        assertEquals(false, resultOhne);

    }

}
    /*
    @Test
    @DisplayName("checkEverything")
    public void checkEverything() {
        //Given
        String password = "NimbuS123";
        String passwordOhne = "NIMBUS123";
        //When
        boolean result = PasswordValidation.checkEverything(password);
        boolean resultOhne = PasswordValidation.checkEverything(passwordOhne);
        //Then
        assertEquals(true, result);
        assertEquals(false, resultOhne);

    }

     */