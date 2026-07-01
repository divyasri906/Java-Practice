class Notification {
    void send() {
        System.out.println("Sending notification...");
    }
}

class Email extends Notification {
    void send() {
        System.out.println("Email notification sent.");
    }
}

class SMS extends Notification {
    void send() {
        System.out.println("SMS notification sent.");
    }
}

class WhatsApp extends Notification {
    void send() {
        System.out.println("WhatsApp notification sent.");
    }
}

public class NotificationSystem {
    public static void main(String[] args) {

        Email email = new Email();
        SMS sms = new SMS();
        WhatsApp whatsapp = new WhatsApp();

        email.send();
        sms.send();
        whatsapp.send();
    }
}