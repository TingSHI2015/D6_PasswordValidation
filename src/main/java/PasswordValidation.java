import java.util.Arrays;
import java.util.List;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println("Hello World from Ting 2024.4.22");
    }

    public static boolean isPassword8CharactersLongEnough(String password) {
        return password.length() >= 8;
    }

    public static boolean isPasswordContainsDigits(String password){
    //    return  password.matches(".*[0-9].*");
        return password.matches(".*\\d.*");       //----- not '//d'
        }

    public static boolean isPasswordContainsBothCases(String password){
        return password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }

    public static boolean isPasswordCommon(String password){
        List<String> commonPasswords = Arrays.asList("password", "Password1", "123456", "12345", "Mary1989");
        return commonPasswords.contains(password);
    }



}
