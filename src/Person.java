public class Person {

    //PROPERTIES

    private String name;
    private String town;
    private boolean completedCourse;

    //CONSTRUCTOR

    public Person(String inputName, String inputTown){ // <----- this is the constructor that is called when an object of a class is created
        this.name = inputName;
        this.town = inputTown;
        this.completedCourse = false; //sets every new person's to false
    }

    //BEHAVIOURS

    public String greet(String timeOfDay){
        return("Good "+ timeOfDay + " " + this.name + "! What is the weather today like in " + this.town + "?");
    }

    public void finishCourse(){
        this.completedCourse = true;
    }

    public boolean getCourse(){
        return this.completedCourse;
    }

    public String getTown(){
        return this.town;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String updatedName){
        this.name = updatedName;
    }

}
