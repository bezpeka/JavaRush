package NewbeToOracle.Lesson31;
//Сколько объектов будут пригодны для удаления их сборщиком мусора на строке с комментарием?
public class Test37 {
    Byte b = 10;
    Test37 abc(Test37 t){
        t= null;
        return t;
    }

    public static void main(String[] args) {
        Test37 t1 = new Test37();
        Test37 t2 = new Test37();
        Test37 t3 = t1.abc(t2);
        t1 = null;
        //Comment
    }
}
