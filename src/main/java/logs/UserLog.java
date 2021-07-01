package logs;

import org.json.simple.JSONObject;

public class UserLog extends Log {
    public UserLog(Long timeStamp, JSONObject logInfo) {
        super(timeStamp,logInfo);
    }
}
