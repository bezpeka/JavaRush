package NewbeToOracle.Lesson27;

public class Homework {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("meat");
        try {
            t.drink("water");
            try {
                t.drink("beer");
            } catch (NoWaterException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("This is inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Tiger {
    public void eat(String food) {
        if(!food.equals("meat")){
            throw new NoMeatException("Tiger don`t eat " + food);
        }
        System.out.println("Tiger eat meat");
    }

    public void drink(String liquid) throws NoWaterException {
        if(!liquid.equals("water")){
            throw new NoWaterException("Tiger don`t drink " + liquid);
        }
        System.out.println("Tiger drink water");
    }
}

class NoMeatException extends RuntimeException {
    NoMeatException(String s) {
        super(s);
    }
}

class NoWaterException extends Exception {
    NoWaterException(String s) {
        super(s);
    }
}

