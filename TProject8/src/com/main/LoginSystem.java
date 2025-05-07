import com.user.*;

public class LoginSystem {
    public static void main(String[] args) {

        User dosen = new Dosen("dosen123", "password123");

        dosen.loginMenu();
    }
}
