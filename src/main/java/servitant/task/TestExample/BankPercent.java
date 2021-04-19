/**
 * В 1626 году индейцы продали Манхэттен за 24$.
 * Написать программу, которая высчитывает сумму,
 * получившуюся бы в текущем году, если бы индейцы положили эти
 * деньги в банк под 5% годовых.
 * <p>
 * Как и ранее, одна и та же задача решена двумя способами и циклом FOR и циклом WHILE
 */
package servitant.task.TestExample;

public class BankPercent {

    public static void main ( String[] args ) {
        double sourceSum = 24;
        double result = sum ( sourceSum );
        System.out.println ( result );
    }

    public static double sum ( double sourceSum ) {
        double result = sourceSum;
        for (int year = 1626 + 1; year <= 2020; year++) {
            double percent = result * 0.05;
            result += percent;
            System.out.println ( year + " : " + result );
        }

        return result;
    }
//    public static double sum (double sourceSum) {
//        double result = sourceSum;
//        int year = 1626 + 1;
//        while (year <= 2020) {
//            year++;
//            double percent = result * 0.05;
//            result += percent;
//            System.out.println ( year + " : " + result );
//        }
//
//        return result;
//    }

}
