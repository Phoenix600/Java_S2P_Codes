/**
 * @author  Pranay Ramteke
 */
package annotationsInJava;

/**
 * @author Pranay Ramteke
 * @brief Class For Modelling the message services
 * @version 1.0
 * @since 12/12/12
 * @see java.security.Provider.Service
 * @link docs.oracle.com/java
 */
class MessageService{

    static  String provider;
    String recipient;
    String sender;
    String message;

    /**
     * @param
     * @return void
     * @throws
     * @exception
     * @deprecated
     */
    MessageService(){
        System.out.println("Running Message Service");
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

public class Example1 {
    public static void main(String[] args) {
        System.out.println(MessageService.provider);
        MessageService m = new MessageService();

    }
}

