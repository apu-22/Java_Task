package Abstract_in_java;

abstract class Payment{
    String transactionID;
    Payment(String tranID){
        this.transactionID=tranID;
    }
    abstract void validatepayment();

    void displayTransaction(){
        System.out.println("Transaction ID: "+transactionID);
    }
}
class BankTransfer extends Payment{
    BankTransfer(String tranId){
        super(tranId);
    }
    @Override
    void validatepayment(){
        System.out.println("Valiadating bank account details ....");
    }
}
public class AbstractEx {
    public static void main(String[] args){
        Payment p= new BankTransfer("TXY234ZX");
        p.validatepayment();
        p.displayTransaction();
    }
}
