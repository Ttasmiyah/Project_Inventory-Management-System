/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdemo;

import java.sql.Date;

/**
 *
 * @author Sadia
 */
class ordertable {
     private int OrderId ,ProductId,Quantity;
    private String OrderDate; 
    public ordertable(int OrderId,int ProductId,int Quantity,String OrderDate)
    {
        this.OrderId = OrderId;
        this.ProductId = ProductId;
        this.Quantity= Quantity;
        this.OrderDate = OrderDate;
    }
    public int getOrderId()
    {
        return OrderId;
    }
     public int getProductId()
    {
        return ProductId;
    }
      public int getQuantity()
    {
        return Quantity;
    }
     
    public String getOrderDate()
    {
        return OrderDate;
    }
    
}
