import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSendingApplication {

    public static final String ACCOUNT_SID = System.getenv().getOrDefault("SID", "123");
    public static final String AUTH_TOKEN = System.getenv().getOrDefault("TOKEN", "123");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+380633660341"), new PhoneNumber("+16106325923"),
                "Hello, Oleksandr!").create();
        System.out.println(message.getSid());
    }
}
