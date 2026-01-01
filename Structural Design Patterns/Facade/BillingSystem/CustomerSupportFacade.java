package BillingSystem;

public class CustomerSupportFacade{

    private final BillingSystem billingSystem = new BillingSystem();
    private final CrmSystem crm = new CrmSystem();
    private final PaymentSystem paymentSystem = new PaymentSystem();
    private final SupportTicketSystem ticketSystem = new SupportTicketSystem();


    public Boolean handleBillingDispute(String customerId , String invoiceNumber,String disputeDescription){
        try{ 
            crm.validateCustomer(customerId);
            billingSystem.findInvoice(invoiceNumber);
            paymentSystem.checkPaymentStatus(invoiceNumber);
            billingSystem.logAdjustment(invoiceNumber, disputeDescription);
            ticketSystem.createTicket(customerId, customerId, disputeDescription);
            return true;
        }
        catch (Exception e) {
            System.out.println("Something went wrong: " + e);
            return false;
        }
    }

    public void processSubscriptionCancellation(String customerId ,String reason){

    }
}