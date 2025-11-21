public class StudentInfo{

        String studentNameIns="Instance Name";
        int ageIns= 25;
        double gpaIns=2.853;
        //Declaration Using Instance Variable.
        
    public static void main(String[] args){
        
        StudentInfo instanceStudent= new StudentInfo();
        
        System.out.println("Student Name: " + instanceStudent.studentNameIns);
        System.out.println("Age : " + instanceStudent.ageIns);
        System.out.println("GPA : " + instanceStudent.gpaIns);
        
        //The above lines is the output through instance variable
        
        
        String studentName = "AB CD";  
        int age=20;
        double gpa=3.592;
        
        /*
         * Declared 3 variables only using local variables.
         * 3 Variables created for different types String, 
         * integer and decimal. Stores the name, age and 
         * GPA of the student.
         */
        
        System.out.println("The student named " + studentName + " who has the age of " + age + " secured " + gpa + " GPA.");
        
        //Outputs the data stored from the variables mentioned above.
        
    }
}
