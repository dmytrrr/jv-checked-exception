package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) {
        //write your code here
        int repeatPasswordLength = repeatPassword.length();
        if (password.equals(repeatPassword) && repeatPasswordLength >= 10) {
            throw new PasswordValidationException("Wrong password");
        }
    }
}
