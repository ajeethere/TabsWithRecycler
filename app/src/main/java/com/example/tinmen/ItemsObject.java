package com.example.tinmen;

public class ItemsObject {
    String itemName,itemPrice;
    int itemImg;

    public ItemsObject(String itemName, String itemPrice, int itemImg) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }
}
