public class OrderTest {
    public static void main(String[] args) {
        Order orderService = new OrderService();
        Invoice invoiceService = new InvoiceService();
        Notification notificationService = new EmailNotificationService();

        orderService.calculateTotal(10.0, 2);
        orderService.placeOrder("John Doe", "123 Main St");

        invoiceService.generateInvoice("order_123.pdf");
        notificationService.sendEmailNotification("johndoe@example.com");
    }
}