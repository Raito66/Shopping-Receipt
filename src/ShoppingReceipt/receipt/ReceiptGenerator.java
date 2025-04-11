package ShoppingReceipt.receipt;

import java.util.List;

import ShoppingReceipt.calculator.TaxCalculator;
import ShoppingReceipt.model.Item;

public class ReceiptGenerator {

    // 生成收據的方法
    public static void generate(List<Item> items, String location) {
        // 用來儲存小計和總稅額
        double subtotal = 0;
        double totalTax = 0;

        // 表頭：設置表格的列名，這裡 'item' 占 18 格，'price' 占 10 格，'qty' 占 6 格
        System.out.printf("%-18s %-10s        %s\n", "item", "price", "qty");

        // 遍歷每一個商品項目
        for (Item item : items) {
            // 計算該商品的總金額（價格 * 數量）
            double itemTotal = item.getPrice() * item.getQuantity();
            // 根據當前地點計算稅額
            double tax = TaxCalculator.calculateTax(item, location);

            // 累加小計和總稅額
            subtotal += itemTotal;
            totalTax += tax;

            // 輸出每一個商品項目的名稱、價格和數量
            // 這裡對齊格式：'item' 16 格，'price' 格式為 $6.2f，然後空 8 格，再顯示 'qty'，總數為 6 格
            System.out.printf("%-16s $%6.2f        %8d\n",
                    item.getName(), item.getPrice(), item.getQuantity());
        }

        // 計算總金額（小計 + 稅額）
        double total = subtotal + totalTax;

        // 顯示總金額（小計、稅額、總額）
        // 每行固定顯示，左邊名稱佔 32 格，金額對齊右邊，總金額顯示至小數點後 2 位
        System.out.printf("%-32s $%6.2f\n", "subtotal:", subtotal);
        System.out.printf("%-32s $%6.2f\n", "tax:", totalTax);
        System.out.printf("%-32s $%6.2f\n", "total:", total);
    }
}
