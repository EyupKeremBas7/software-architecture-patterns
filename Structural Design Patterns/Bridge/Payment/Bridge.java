interface PaymentInfrastructure {
    void processPayment(double amount);
}

abstract class PaymentMethod {
    protected PaymentInfrastructure paymentInfrastructure;
    
    public PaymentMethod(PaymentInfrastructure infrastructure) { 
        this.paymentInfrastructure = infrastructure; 
    }
    
    public abstract void pay(double amount);
}

// How will the payment be made? (Abstraction Refined)

class InstallmentPayment extends PaymentMethod {

    public InstallmentPayment(PaymentInfrastructure infrastructure) { 
        super(infrastructure); 
    }
    
    @Override
    public void pay(double amount) {
        System.out.print("Pay via installments ");
        paymentInfrastructure.processPayment(amount);
    }
}

class UpfrontPayment extends PaymentMethod {
    
    public UpfrontPayment(PaymentInfrastructure infrastructure) { 
        super(infrastructure); 
    }
    
    @Override
    public void pay(double amount) {
        System.out.print("Pay upfront ");
        paymentInfrastructure.processPayment(amount);
    }
}

// What will be used for payment? (Concrete Implementations)

class Iyzico implements PaymentInfrastructure {
    @Override
    public void processPayment(double amount) {
        System.out.println("Iyzico: " + amount);
    }
}

class Paypal implements PaymentInfrastructure {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal: " + amount);
    }
}