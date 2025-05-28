package AdaptorDesignPattern.ThirdPartyIntegrationAdaptor;

public interface BankAPIAdaptor {

    double getBalance(String bankAccountNumber);

    boolean sendMoney(String from, String to, double amount);
}
