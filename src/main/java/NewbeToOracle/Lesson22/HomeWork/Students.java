package NewbeToOracle.Lesson22.HomeWork;

public class Students {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name); //Important statement
        return name2;
    }

    public void setName(StringBuilder name) {
        if(name.length() > 3){
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if(course >= 1 && course < 5){
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade >= 1 && grade < 11){
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("Имя: " + getName() + " курс: " + getCourse() + " оценка: " + getGrade());
    }
}
class TestStudents {
    public static void main(String[] args) {
        Students st1 = new Students();
        StringBuilder sb1 = new StringBuilder("Ivan");
        st1.setName(sb1);
        st1.setCourse(2);
        st1.setGrade(7);
        st1.showInfo();
    }
}
