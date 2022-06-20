/**
 * @created by Mukhammad
 * data: 20/06/2022 Time: 10:01
 * @company: 13.uz
 **/
public class Main {
    public static void main(String[] args) {
        IDandPasswords iDandPasswords = new IDandPasswords();
        LoginPage loginPage = new LoginPage(iDandPasswords.getLoginInfo());

    }
}
