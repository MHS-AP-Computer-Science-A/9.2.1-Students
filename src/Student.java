public class Student
{
    private String name;
    private int classYear;
   
   // Constructor goes here

   
    public String getName(){
       return name;
    }
   
    public int getClassYear(){
       return classYear;
    }
   
    public String toString(){
        return name + ", class of " + classYear;
    }
}
