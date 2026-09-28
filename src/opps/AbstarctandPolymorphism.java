package opps;

	abstract class Payment {
	    abstract void pay(double amount);
	    void paymentDetails() {
	        System.out.println("Payment processing...");
	    }
	}

	class UPIPayment extends Payment {
	    @Override
	    void pay(double amount) {
	        System.out.println("Paid ₹" + amount + " using UPI");
	    }
	}

	class CreditCardPayment extends Payment {
	    @Override
	    void pay(double amount) {
	        System.out.println("Paid ₹" + amount + " using Credit Card");
	    }
	}

	class CashPayment extends Payment {
	    @Override
	    void pay(double amount) {
	        System.out.println("Paid ₹" + amount + " using Cash");
	        
	    }
	}

	public class AbstarctandPolymorphism { 
	    public static void main(String[] args) {
	        Payment p;
	        p = new UPIPayment();
	        p.pay(5000);
	        p = new CreditCardPayment();
	        p.pay(3000);
            p = new CashPayment();
	        p.pay(1000);
	    }
	}

	