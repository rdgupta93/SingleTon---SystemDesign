package Observer;

public class Main {
    public static void main(String[] args) {


        NotificationService notificationService = new NotificationService();
        InvoiceGeneratorService invoiceGeneratorService = new InvoiceGeneratorService();
        Amazon amazon = new Amazon();
        // added the subscribers to the publishers List

        amazon.addOrderPlaceSubscriber(notificationService);
        amazon.addOrderPlaceSubscriber(invoiceGeneratorService);

        amazon.orderPlaced();
    }
}
