package logs;

import org.json.simple.JSONObject;

public abstract class Log {
    Long timeStamp;
    JSONObject logInfo;
    Log next;

    public Log(Long timeStamp, JSONObject logInfo) {
        this.timeStamp = timeStamp;
        this.logInfo = logInfo;
    }
}
