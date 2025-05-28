package AdaptorDesignPattern.ThirdPartyIntegrationAdaptor;

public class YesBankAPIAdaptor implements BankAPIAdaptor {

    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double getBalance(String bankAccountNumber){

        return 0;


    }


    @Override
    public boolean sendMoney(String from, String to, double amount){

        return false;


    }
}
