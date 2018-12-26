package design;

public abstract class Person {

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    private String ethnicity;
    public static final String species = "HardWorker";

    public Person(double height, String ethnicity){
        this.height= height;
        this.ethnicity = ethnicity;
    }
    public Person(){

    }
    public String job(){
        System.out.println("I work from 10am to 5pm");
        String ans = "I work from 10am to 5pm";
        return ans;
    }
    public abstract double groceryBudget();

    public String function(){
        System.out.println("Take some rest");
        return "Take some rest";
    }




}
