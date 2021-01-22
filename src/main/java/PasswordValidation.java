public class PasswordValidation {
    public static void main(String[] args) {

        String password = "Nimbus1234";
        if (checkLength(password)
                && checkNumbers(password)
                && checkUpperCase(password)
                && checkLowerCase(password)) {
            System.out.println("Das Passwort wurde aktzeptiert! ");
        } else {
            System.out.println("Das Passwort wurde nicht aktzeptiert! ");
        }
    }
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

    /*
    public static boolean checkEverything(String password) {
        if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$")) {
            return true;
        } else {
            return false;
        }
     */
    }


