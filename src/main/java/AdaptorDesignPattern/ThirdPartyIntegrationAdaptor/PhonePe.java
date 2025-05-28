package AdaptorDesignPattern.ThirdPartyIntegrationAdaptor;

public class PhonePe {

    private BankAPIAdaptor bankAPI;

    public PhonePe(BankAPIAdaptor bankAPI){

        this.bankAPI = bankAPI;

    }

    double doSomething() throws InterruptedException{

        double currentBalance =  bankAPI.getBalance("Bank Account Number");

        Thread.sleep(24 * 24 * 60 * 60 * 1000);

        return currentBalance * 2;
    }
}
