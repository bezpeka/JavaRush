package NewbeToOracle.Lesson31;

public class Test6 {
    int x = 10;
    int a = 5;
    int b = 10;
    int c = 4;

    public double sredArifm() {
        if(x > 0){
            double avg = 0;
            avg = (a + b + c) / 3;
            return avg;
        } else {
            x = 0;
            return x;
        }
    }
}
