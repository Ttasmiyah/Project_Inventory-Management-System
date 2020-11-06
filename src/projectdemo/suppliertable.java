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
class suppliertable {
     private int SupplierId ,ProductId,Quantity;
    private String SupplierName,BuyingPrice,SupplierContact,PaymentOfOrder; 
    public suppliertable(int SupplierId,String SupplierName,int ProductId,int Quantity,String BuyingPrice,String SupplierContact,String PaymentOfOrder)
    {
        this.SupplierId = SupplierId;
        this.SupplierName = SupplierName;
        this.ProductId = ProductId;
        this.Quantity= Quantity;
        this.BuyingPrice = BuyingPrice;
         this.SupplierContact = SupplierContact;
         this.PaymentOfOrder = PaymentOfOrder;
    }
    public int getSupplierId()
    {
        return SupplierId;
    }     
     public String getSupplierName()
    {
        return SupplierName;
    }
    public int getProductId()
    {
        return ProductId;
    }
   
    public int getQuantity()
    {
        return Quantity ;
    }
    public String getBuyingPrice()
    {
        return BuyingPrice;
    }
    public String getSupplierContact()
    {
        return SupplierContact;
    }
    public String getPaymentOfOrder()
    {
        return PaymentOfOrder;
    }
}
