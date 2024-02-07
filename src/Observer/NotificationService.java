package Observer;
// this class holds to logic to send SMS and email to users when the order is placed.
public class NotificationService implements OrderPlacedSubscriber{

    @Override
    public void orderPlaceEvent() {
        System.out.println("Send SMS to Customer");
        System.out.println("Send Email to Customer");
    }
}
