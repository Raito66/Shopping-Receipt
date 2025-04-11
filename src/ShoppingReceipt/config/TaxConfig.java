package ShoppingReceipt.config;

import java.util.*;

public class TaxConfig {
    // 稅率設定：儲存每個州的稅率
    public static final Map<String, Double> TAX_RATES = new HashMap<>();

    // 免稅類別設定：儲存每個州的免稅商品類別
    public static final Map<String, List<String>> EXEMPT_CATEGORIES = new HashMap<>();

    // 商品分類設定：儲存每個商品的分類
    public static final Map<String, String> ITEM_CATEGORY = new HashMap<>();

    // 靜態區塊，當類別被加載時初始化資料
    static {
        // 設定各州的銷售稅率
        TAX_RATES.put("CA", 0.0975);   // 加州（CA）的稅率為 9.75%
        TAX_RATES.put("NY", 0.08875);  // 紐約州（NY）的稅率為 8.875%

        // 設定加州（CA）免稅商品類別
        List<String> caExempt = new ArrayList<>();
        caExempt.add("food");  // 食品類別免稅
        EXEMPT_CATEGORIES.put("CA", caExempt); // 加入加州免稅類別設定

        // 設定紐約州（NY）免稅商品類別
        List<String> nyExempt = new ArrayList<>();
        nyExempt.add("food");    // 食品類別免稅
        nyExempt.add("clothing"); // 服裝類別免稅
        EXEMPT_CATEGORIES.put("NY", nyExempt); // 加入紐約州免稅類別設定

        // 設定商品的分類
        ITEM_CATEGORY.put("book", "general");        // 書籍屬於一般商品
        ITEM_CATEGORY.put("potato chips", "food");  // 洋芋片屬於食品類
        ITEM_CATEGORY.put("pencil", "general");     // 鉛筆屬於一般商品
        ITEM_CATEGORY.put("shirt", "clothing");     // 襯衫屬於服裝類
    }
}
