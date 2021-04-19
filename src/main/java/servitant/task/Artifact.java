package servitant.task;
/*
Музей древностей. 2-й уровень, 10 лекция JR
Твоя задача — спроектировать класс Artifact.

Артефакты, которые хранятся в музее, бывают трех видов.

Первый — о которых неизвестно ничего, кроме порядкового номера,
присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура,
которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура,
которой он был создан, и точный век его создания (например: 212121, "Ацтеки", 12).

Создай класс Artifact, описывающий хранящиеся в музее древности,
и напиши необходимое количество конструкторов для него.
В методе main() создай по одному артефакту каждого вида.
 */
public class Artifact{
    int number;
    String name;
    int age;

    public Artifact(int number){
        this.number = number;
    }

    public Artifact(int number, String name){
        this.number = number;
        this.name = name;
    }

    public Artifact(int number, String name, int age){
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        Artifact artefact1 = new Artifact(1488);
        Artifact artefact2 = new Artifact(506, "Ассасины");
        Artifact artefact3 = new Artifact(228, "Тамлиеры", 11);

        System.out.println(artefact1.number);
        System.out.println(artefact2.number + " " + artefact2.name);
        System.out.println(artefact3.number + " " + artefact3.name + " " + artefact3.age);
    }
}