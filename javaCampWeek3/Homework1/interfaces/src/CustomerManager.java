public class CustomerManager {

    ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add() {
        // is kodlari
        customerDal.add();
    }
}
