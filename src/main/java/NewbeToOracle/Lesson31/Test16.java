package NewbeToOracle.Lesson31;

interface Jumpable {
}

class Cats implements Jumpable {
}

class Tiger extends Cats {
}

class House implements Jumpable{
}

public class Test16 {
    public static void main(String[] args) {
        Jumpable j = new Tiger();
        Tiger t = new Tiger();
        House h = new House();
        if(j instanceof Jumpable){
            System.out.println("j is Jumpable");
        }
        if(t instanceof Cats){
            System.out.println("t is Cats");
        }
        if(h instanceof Jumpable){
            System.out.println("h is Jumpable");
        }
    }
}
