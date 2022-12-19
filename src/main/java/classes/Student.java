package classes;

public class Student {
    private String name;
    private int varsta;
    private double medie;

    public Student(String name, int varsta, double medie) {
        this.name = name;
        this.varsta = varsta;
        this.medie = medie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    public boolean areRestanta(){
        if(medie < 5){
            return true;
        }
        return false;
    }

    public boolean esteMajor()
    {
        if(varsta >= 18)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
