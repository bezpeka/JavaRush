package NewbeToOracle.Lesson31;

public class Test13 {
}

class BookT13 {
}

interface ReadableT13 {
}

class ElectronicBook extends BookT13 {
}

class TestBookT13 {
    public static void main(String[] args) {
        ReadableT13 r = null;
        ElectronicBook eBook = new ElectronicBook();
        r = ( ReadableT13 ) eBook;
    }
}