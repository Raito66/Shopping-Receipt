package ShoppingReceipt.calculator;

import ShoppingReceipt.config.TaxConfig;
import ShoppingReceipt.model.Item;

public class TaxCalculator {

    // 計算稅金的方法
    public static double calculateTax(Item item, String location) {
        // 根據商品名稱從 TaxConfig 中查找對應的商品分類，若未找到則默認為 "general" 類別
        String category = TaxConfig.ITEM_CATEGORY.getOrDefault(item.getName(), "general");

        // 如果該商品所在的分類是免稅分類，則返回 0.0 稅金
        if (TaxConfig.EXEMPT_CATEGORIES.get(location).contains(category)) {
            return 0.0;
        }

        // 根據購物地點取得對應的稅率
        double rate = TaxConfig.TAX_RATES.get(location);
        
        // 計算稅金：商品價格 * 數量 * 稅率
        double rawTax = item.getPrice() * item.getQuantity() * rate;
        
        // 四捨五入到最接近的 0.05 的倍數（使用 roundUpToNearest005 方法）
        return roundUpToNearest005(rawTax);
    }

    // 將金額四捨五入到最接近的 0.05 的倍數
    private static double roundUpToNearest005(double amount) {
        // 首先將金額乘以 20，這樣可以將精度擴大為 0.05 的倍數，
        // 然後使用 Math.ceil 進行向上取整，最後再除以 20 恢復原來的數值
        return Math.ceil(amount * 20) / 20.0;
    }
}
