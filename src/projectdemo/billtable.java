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
class billtable {
    
    private int BillId ,CustomerId,ProductId,Quantity,Amount;
    private String OrderDate; 
    public billtable(int BillId,int CustomerId,int ProductId,int Quantity,int Amount ,String OrderDate)
    {
        this.BillId = BillId;
        this.CustomerId = CustomerId;
        this.ProductId= ProductId;
        this.Quantity = Quantity;
        this.Amount = Amount;
        this.OrderDate = OrderDate;
    }
    public int getBillId()
    {
        return BillId;
    }
     public int getCustomerId()
    {
        return CustomerId;
    }
      public int getProductId()
    {
        return ProductId;
    }
       public int getQuantity()
    {
        return Quantity;
    }
        public int getAmount()
    {
        return Amount;
    }
     
    public String getOrderDate()
    {
        return OrderDate;
    }
   
}
