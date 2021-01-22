public class PasswordValidationArray {

    public static void passwordValidationArray (String password){
        String[] passwordArray = {"Nimbus1234", "nim", "nimbus1234", "nimbusgggggg", "DDDDDDDDDDDD", "565656565656"};
        for (int i = 0; i < passwordArray.length; i++) {
                checkAll(passwordArray[i]);
        }
    }

    /////////////////////////////////////////
    public static boolean checkAll (String password){
        return checkLength(password)
                && checkNumbers(password)
                && checkUpperCase(password)
                && checkLowerCase(password);
            /*if (checkLength(password)
                    && checkNumbers(password)
                    && checkUpperCase(password)
                    && checkLowerCase(password)) {
                System.out.println("Das Passwort wurde aktzeptiert! ");
                return true;
            } else {
                System.out.println("Das Passwort wurde nicht aktzeptiert! ");
                return false;
            }*/
    }
    ////////////////////////////////////////

    public static boolean checkLength (String password){
        if (password.length() > 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkNumbers (String password){
        if (password.matches(".*\\d.*")) {
            // https://stackoverflow.com/questions/18590901/check-if-a-string-contains-numbers-java/18590949
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkUpperCase (String password){
        if (password.matches(".*[A-Z].*")) {
            // https://stackoverflow.com/questions/18590901/check-if-a-string-contains-numbers-java/18590949
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkLowerCase (String password){
        if (password.matches(".*[a-z].*")) {
            //https://stackoverflow.com/questions/40336374/how-do-i-check-if-a-java-string-contains-at-least-one-capital-letter-lowercase
            return true;
        } else {
            return false;
        }
    }

}
