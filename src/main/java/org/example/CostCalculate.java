import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Q20. A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price]
public class CostCalculate {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        int laptopPrice = extractPrice(paragraph, "laptop");
        int mousePrice = extractPrice(paragraph, "mouse");

        int totalCost = calculateTotalCost(laptopPrice, mousePrice, 15);

        System.out.println("Total cost after discount: " + totalCost + " tk");
    }

    public static int extractPrice(String paragraph, String item) {
        String pricePattern = "\\d+";
        String itemPattern = "\\b" + item + "\\b";
        String regex = itemPattern + "\\D*" + pricePattern;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(paragraph);

        if (matcher.find()) {
            String priceStr = matcher.group().replaceAll("\\D", "");
            return Integer.parseInt(priceStr);
        }

        return 0;
    }

    public static int calculateTotalCost(int laptopPrice, int mousePrice, int discountPercentage) {
        int totalPrice = laptopPrice + mousePrice;
        double discountAmount = (totalPrice * discountPercentage) / 100.0;
        double discountedPrice = totalPrice - discountAmount;

        return (int) discountedPrice;
    }
}
