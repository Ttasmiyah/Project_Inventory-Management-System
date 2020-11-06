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
class inventorytable {
    private int InventoryId ,SupplierId,ProductId,Quantity;
    private String InventoryName; 
    public inventorytable(int InventoryId,int SupplierId,String InventoryName,int ProductId,int Quantity)
    {
        this.InventoryId = InventoryId;
        this.SupplierId = SupplierId;
        this.InventoryName = InventoryName;
        this.ProductId = ProductId;
        this.Quantity = Quantity;
    }
    public int getInventoryId()
    {
        return InventoryId;
    }
     public int getSupplierId()
    {
        return SupplierId;
    }
    public String getInventoryName()
    {
        return InventoryName;
    }
    public int getProductId()
    {
        return ProductId ;
    }
    public int getQuantity()
    {
        return Quantity ;
    }
}
