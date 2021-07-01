package logs;

import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class GlobalLogger {
    public static void main(String[] args) {
        Map<String, Object> logMap = new HashMap<String, Object>();
        logMap.put("request_id", "user_log_1");
        logMap.put("start_time",1609475244L);
        UserLog userLog = new UserLog(1609475244L, new JSONObject(logMap));

        logMap.replace("request_id","user_log_2");
        logMap.put("start_time",1609561923L);
        userLog.next = new UserLog(1609561923L, new JSONObject(logMap));

        logMap.replace("request_id","user_log_3");
        logMap.put("start_time",1609648131L);
        userLog.next.next = new UserLog(1609648131L, new JSONObject(logMap));


        logMap.replace("request_id","author_log1");
        logMap.put("start_time",1609475523L);
        AuthorLog authorLog = new AuthorLog(1609475523L, new JSONObject(logMap));

        logMap.replace("request_id","author_log2");
        logMap.put("start_time",1609475525L);
        authorLog.next = new AuthorLog(1609475525L, new JSONObject(logMap));

        logMap.replace("request_id","author_log3");
        logMap.put("start_time",1609475529L);
        authorLog.next.next = new AuthorLog(1609475529L, new JSONObject(logMap));



        logMap.replace("request_id","payment_log1");
        logMap.put("start_time",1609475524L);
        PaymentLog paymentLog = new PaymentLog(1609475523L, new JSONObject(logMap));

        logMap.replace("request_id","payment_log2");
        logMap.put("start_time",1609475525L);
        paymentLog.next = new PaymentLog(1609475525L, new JSONObject(logMap));

        logMap.replace("request_id","payment_log3");
        logMap.put("start_time",1609475527L);
        paymentLog.next.next = new PaymentLog(1609475529L, new JSONObject(logMap));

        Log[] logs = new Log[3];
        logs[0] = userLog;
        logs[1] = authorLog;
        logs[2] = paymentLog;

        Sorting.sort(logs);
    }
}
