/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

/**
 *
 * @author Sadia
 */
class customertable {
    
    private int CustomerId ,PurchasedAmount;
    private String CustomerName,CustomerContact,CustomerAddress; 
    public customertable(int CustomerId,String CustomerName, String CustomerContact,String CustomerAddress,int PurchasedAmount)
    {
        this.CustomerId = CustomerId;
        this.CustomerName = CustomerName;
        this.CustomerContact = CustomerContact;
        this.CustomerAddress= CustomerAddress;
        this.PurchasedAmount = PurchasedAmount;
    }

    /*customertable(int aInt, String string, String string0, String string1, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    public int getCustomerId()
    {
        return CustomerId;
    }
     
    public String getCustomerName()
    {
        return CustomerName;
    }
    public String getCustomerContact()
    {
        return CustomerContact;
    }
    public String getCustomerAddress()
    {
        return CustomerAddress;
    }
    public int getPurchasedAmount()
    {
        return PurchasedAmount ;
    }
}
