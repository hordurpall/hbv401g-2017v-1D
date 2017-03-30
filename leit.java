import java.io.*;
import java.util.*;

public class leit{

    ArrayList<Student> students = new ArrayList<Student>();

    class Student {

        private String name;
        private String dob;
        private String gender;
        private String address;

        public Student(String name, String dob, String gender, String address) {
            this.name = name;
            this.dob = dob;
            this.gender = gender;
            this.address = address;
        }

        public void fillStudentArray() {
            // properties

            int size; // total number of Students in collection

            File file = new File("StudentDetails.txt");

            try {
                Scanner in = new Scanner(file);

                while (in.hasNextLine()) {
                    String SName = in.next();
                    String DoB = in.next();
                    String Gender = in.next();
                    String Address = in.next();

                    students.add(new Student(SName, DoB, Gender, Address));
                }

            }

            catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

        public String getName(Student student) {
            return student.name;
        }

        public void printname() {
            System.out.println("hello");
        }

        public Student search(String name) {
            System.out.print("Enter the name you wish to search: ");

            for (Student student : students) {
                if (student.name.equalsIgnoreCase(name))
                    ;
                return student;
            }

            return null;
        }
    }
}
