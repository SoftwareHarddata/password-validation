import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationTestParam {
    @ParameterizedTest
    @MethodSource

    public void passwordValidationParams (String password, boolean expectedResult){
        boolean actual = PasswordValidation.checkAll(password);
        assertEquals(expectedResult, actual);
    }

    private  static Stream<Arguments> passwordValidationParams(){
        return Stream.of(
            Arguments.of("Nimbus1234", true),
            Arguments.of("nim", false),
            Arguments.of("nimbus1234", false),
            Arguments.of("nimbusgggggg", false),
            Arguments.of("DDDDDDDDDDDD", false),
            Arguments.of("565656565656", false)

        );
    }

}
