import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentDriver {
    public static void main(String[] args) {
        
        Student studObject[] = new Student[5];
        int countNum;

        for (countNum = 0; countNum < studObject.length; countNum++) {
            studObject[countNum] = new Student();
        }
        for (countNum = 0; countNum < studObject.length; countNum++) {
            System.out.println("\nEnter Student " + (countNum + 1) + " Details.");
            studObject[countNum].promptStudentData();
        }
        System.out.println("\nStudent Details Displayed: \n");
        // Use For loop to Dispaly Student Data
        for (countNum = 0; countNum < studObject.length; countNum++) {
             System.out.println(studObject[countNum].toString());
             try{
                FileOutputStream fileStream = new FileOutputStream("RoyeStudent.dat");
                
                ObjectOutputStream oosStream = new ObjectOutputStream(fileStream);
        
                //Write Student Object to file
        
                oosStream.writeObject(studObject[countNum].toString());
                oosStream.close();
                
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }     
        }
        


}
