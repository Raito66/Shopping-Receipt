package ShoppingReceipt.model;

public class Item {
    
    // 商品名稱
    private String name;

    // 商品價格
    private double price;

    // 商品數量
    private int quantity;

    // 建構子：初始化商品的名稱、價格和數量
    public Item(String name, double price, int quantity) {
        this.name = name;        // 設置商品名稱
        this.price = price;      // 設置商品價格
        this.quantity = quantity; // 設置商品數量
    }

    // 取得商品名稱
    public String getName() { 
        return name; 
    }

    // 取得商品價格
    public double getPrice() { 
        return price; 
    }

    // 取得商品數量
    public int getQuantity() { 
        return quantity; 
    }
}
