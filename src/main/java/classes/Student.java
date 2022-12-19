package classes;

public class Student {
    private String name;
    private int age;
    private double averageScore;

    public Student(String name, int varsta, double medie) {
        this.name = name;
        this.age = varsta;
        this.averageScore = medie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public boolean hasPassedTheYear(){
        if(averageScore < 5){
            return true;
        }
        return false;
    }

    public boolean hasLegalAge()
    {
        if(age >= 18)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
