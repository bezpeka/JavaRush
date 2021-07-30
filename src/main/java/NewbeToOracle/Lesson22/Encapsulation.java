package NewbeToOracle.Lesson22;

public class Encapsulation {
    public static class Human {
        public Human(String sex) {
            this.sex = sex;
        }

        final String sex;

        public StringBuilder getName() {
            return name;
        }

        public void setName(StringBuilder name) {
            this.name = name;
        }

        private StringBuilder name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if(age > 0 && age < 120){
                this.age = age;
            }
        }

        private int age;
        public boolean cleaver;

        public boolean isCleaver() {
            return cleaver;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            if(weight > 0 && weight < 120){
                this.weight = weight;
            }
        }

        public int weight;

        public void info() {
            System.out.println("Создали новый объект класса Human");
            System.out.println("Имя человека " + getName());
            System.out.println("Вес человека " + getWeight() + " кг");
            System.out.println("Возраст человека " + getAge() + " лет");
        }

    }
}

class Test {
    public static void main(String[] args) {
        Encapsulation.Human vasya = new Encapsulation.Human("Male");
        vasya.setName(new StringBuilder("Василий"));
        vasya.setWeight(90);
        vasya.setAge(15);
        vasya.info();
    }
}