import java.util.HashMap;

/**
 * @created by Mukhammad
 * data: 20/06/2022 Time: 10:00
 * @company: 13.uz
 **/
public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<>();

    IDandPasswords(){
        loginInfo.put("Bro", "pizza");
        loginInfo.put("Brometheus", "sandvish");
        loginInfo.put("BroCode", "abc123");
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
