package ShoppingReceipt;

import java.util.ArrayList;
import java.util.List;

import ShoppingReceipt.model.Item;
import ShoppingReceipt.receipt.ReceiptGenerator;

public class Main {
    public static void main(String[] args) {
        // 建立購物清單 1（Use Case 1: CA）
        List<Item> items1 = new ArrayList<>();
        Item item1 = new Item("book", 17.99, 1);
        Item item2 = new Item("potato chips", 3.99, 1);
        items1.add(item1);
        items1.add(item2);

        System.out.println("Use Case 1: CA");
        // 呼叫 ReceiptGenerator 生成並輸出收據
        ReceiptGenerator.generate(items1, "CA");

        // 建立購物清單 2（Use Case 2: NY）
        List<Item> items2 = new ArrayList<>();
        Item item3 = new Item("book", 17.99, 1);
        Item item4 = new Item("pencil", 2.99, 3);
        items2.add(item3);
        items2.add(item4);

        System.out.println("\nUse Case 2: NY");
        // 呼叫 ReceiptGenerator 生成並輸出收據
        ReceiptGenerator.generate(items2, "NY");

        // 建立購物清單 3（Use Case 3: NY）
        List<Item> items3 = new ArrayList<>();
        Item item5 = new Item("pencil", 2.99, 2);
        Item item6 = new Item("shirt", 29.99, 1);
        items3.add(item5);
        items3.add(item6);

        System.out.println("\nUse Case 3: NY");
        // 呼叫 ReceiptGenerator 生成並輸出收據
        ReceiptGenerator.generate(items3, "NY");
    }
}

