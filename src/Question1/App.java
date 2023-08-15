package Question1;

public class App {
    public static void main(String[] args) {
        int[] stocksOne = {7,1,5,3,6,4};
        int[] stocksTwo = {7,6,4,3,1};

        System.out.println(Solution.maxProfit(stocksOne));
        System.out.println(Solution.maxProfit(stocksTwo));
    }
}
