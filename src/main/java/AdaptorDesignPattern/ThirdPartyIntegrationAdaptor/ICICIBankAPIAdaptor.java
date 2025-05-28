package AdaptorDesignPattern.ThirdPartyIntegrationAdaptor;

public class ICICIBankAPIAdaptor implements BankAPIAdaptor {

    private ICICIBankAPI icicibankapi = new ICICIBankAPI();

    @Override
    public double getBalance(String bankAccountNumber){

        return 0;
    }

    @Override
    public boolean sendMoney(String to, String from, double amount){

        return false;
    }
}
