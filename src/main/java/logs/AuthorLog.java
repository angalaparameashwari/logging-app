package logs;

import org.json.simple.JSONObject;

public class AuthorLog extends Log {
    public AuthorLog(Long timeStamp, JSONObject logInfo) {
        super(timeStamp,logInfo);
    }
}