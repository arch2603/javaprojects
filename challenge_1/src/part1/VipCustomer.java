package part1;

public class VipCustomer {

    //Fields
    private String name;
    private  double credit_limit;
    private String email_address;

    public VipCustomer(){
        this("Vip Customer", 100.00, "dummy@gamil.com");
    }

    public VipCustomer(String customername, double creditlimit){
        this(customername, creditlimit, "dummy2@gmail.com");
    }

    public VipCustomer(String customer_name, double credit_limit, String email_address){
        this.name = customer_name;
        this.credit_limit = credit_limit;
        this.email_address = email_address;

        System.out.println("Your name is " + this.name + ", Credit Limit " + this.credit_limit);
    }
    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail_address() {
        return email_address;
    }


}
