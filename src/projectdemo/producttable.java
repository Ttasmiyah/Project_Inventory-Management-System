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
class producttable {
     private int ProductId ,ProductQuantity_piece,ProductQuantity_kg;
    private String ProductName,SellingPrice; 
    public producttable(int ProductId,String ProductName,int ProductQuantity_piece,int ProductQuantity_kg,String SellingPrice)
    {
        this.ProductId= ProductId;
        this.ProductName = ProductName;
        this.ProductQuantity_piece= ProductQuantity_piece;
        this.ProductQuantity_kg = ProductQuantity_kg;
         this.SellingPrice = SellingPrice;
    }
    public int getProductId()
    {
        return ProductId;
    }
     
    public String getProductName()
    {
        return ProductName;
    }
    public int getProductQuantity_piece()
    {
        return ProductQuantity_piece;
    }
    public int getProductQuantity_kg()
    {
        return ProductQuantity_kg;
    }
    public String getSellingPrice()
    {
        return SellingPrice;
    }
  
}
