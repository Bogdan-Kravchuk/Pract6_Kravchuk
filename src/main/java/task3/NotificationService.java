package task3;

public interface NotificationService {
    void sendReceipt(Email email, Money total);
}

class EmailNotificationService implements NotificationService {
    @Override
    public void sendReceipt(Email email, Money total) {
        System.out.println("task3.Email sent to " + email + " for " + total);
    }
}