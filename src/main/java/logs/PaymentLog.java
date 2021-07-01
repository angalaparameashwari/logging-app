package logs;

import org.json.simple.JSONObject;

public class PaymentLog extends Log {
    public PaymentLog(Long timeStamp, JSONObject logInfo) {
        super(timeStamp,logInfo);
    }
}
