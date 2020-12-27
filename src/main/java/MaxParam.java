/** Написать функцию которая принимает два целочисленных параметра
 * и возвращает наибольший из них.
 */
public class MaxParam {
    public static void main ( String[] args ) {
        int par1 = 50;
        int par2 = 10;
        int result = getMax (par1, par2);
        System.out.println (result );
    }
    public static int getMax (int firstValue, int secondValue){
        if (firstValue > secondValue){
            return firstValue;
        } else {
            return secondValue;
        }
    }
}

