package softwareengtaskb.app;
import org.example.Lecturer;
import org.example.Programme;
import org.example.Student;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Student sean = new Student("Sean", 22, DateTime.parse("2000-06-01T00:00:00.000Z"), 1);
        Student sophia = new Student("Sophia", 21, DateTime.parse("2001-03-02T00:00:00.000Z"), 2);
        Student cormac = new Student("Cormac", 22, DateTime.parse("2001-03-02T00:00:00.000Z"),3);
        Student beans = new Student("Beans", 24, DateTime.parse("2001-03-02T00:00:00.000Z"),4);
        Student andrew = new Student("Andrew", 18, DateTime.parse("2001-03-02T00:00:00.000Z"), 5);

        Programme ece = new Programme("Electronic and Computer Engineering", DateTime.parse("2000-06-01T00:00:00.000Z"), DateTime.parse("2000-06-01T00:00:00.000Z"));
        Programme law = new Programme("Law", DateTime.parse("2000-06-01T00:00:00.000Z"), DateTime.parse("2000-06-01T00:00:00.000Z"));
        Programme bio = new Programme("Biomedical Engineering", DateTime.parse("2000-06-01T00:00:00.000Z"), DateTime.parse("2000-06-01T00:00:00.000Z"));

        Lecturer l1 = new Lecturer("John", 55, DateTime.parse("2001-01-01T00:00:00.000Z"),1);
        Lecturer l2 = new Lecturer("Alan", 57, DateTime.parse("2001-01-01T00:00:00.000Z"),2);
        Lecturer l3 = new Lecturer("Maeve", 45, DateTime.parse("2001-01-01T00:00:00.000Z"),3);

        Modules m1= new Modules("Software Engineering", "CT417");
        Modules m2= new Modules("Embedded Systems", "EE347");
        Modules m3= new Modules("Equity Law", "EL101");
        Modules m4= new Modules("Commercial Law" , "CL421");
        Modules m5= new Modules("Materials", "BM288");

        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.add(sean);
        allStudents.add(sophia);
        allStudents.add(cormac);
        allStudents.add(beans);
        allStudents.add(andrew);

        ArrayList<Programme> courses= new ArrayList<Programme>();
        courses.add(ece);
        courses.add(law);
        courses.add(bio);

        ArrayList<Modules> computerModules= new ArrayList<Modules>();
        computerModules.add(m1);
        computerModules.add(m2);

        ArrayList<Modules> lawModules = new ArrayList<Modules>();
        lawModules.add(m3);
        lawModules.add(m4);

        ArrayList<Modules> medModules = new ArrayList<Modules>();
        medModules.add(m5);

        sean.setModuleList(computerModules);
        sophia.setModuleList(medModules);
        cormac.setModuleList(lawModules);
        beans.setModuleList(computerModules);
        andrew.setModuleList(medModules);

        ArrayList<Student> sListA= new ArrayList<Student>();
        sListA.add(sean);
        sListA.add(beans);

        ArrayList<Student> sListB= new ArrayList<Student>();
        sListB.add(sophia);
        sListB.add(andrew);

        ArrayList<Student> sListC= new ArrayList<Student>();
        sListB.add(cormac);

        ece.setModuleList(computerModules);
        law.setModuleList(lawModules);
        bio.setModuleList(medModules);

        ece.setStudentList(sListA);
        law.setStudentList(sListB);
        bio.setStudentList(sListC);

        sean.setCourses(ece);
        sophia.setCourses(law);
        cormac.setCourses(bio);
        beans.setCourses(ece);
        andrew.setCourses(law);


        m1.setStudentList(sListA);
        m2.setStudentList(sListB);
        m3.setStudentList(sListC);
        m4.setStudentList(sListA);
        m5.setStudentList(sListB);


        // Print list of course 1, respective modules, all students registered usernames and assigned modules
        for(Programme p: courses) {
            System.out.println("\nCourse Name: " + p.getCourseName());
            System.out.println("-------------------------------------------------");
            System.out.println("Modules: ");
            for (Modules m : p.getModuleList()) {
                System.out.println( "  - "+m.getModName());
            }

        }
        System.out.println("\n\n-----------------------------------------");
        System.out.println("Students");
        System.out.println("-----------------------------------------");

        for(Student s: allStudents){

            System.out.println("\nStudent Name: " +s.getsName());
            System.out.println("Username: "+s.getsUsername());
            System.out.println("Modules: ");

            for(Module mod: s.getModuleList()){
                System.out.println("  - "+mod.getModName());
            }
            System.out.println("Courses: "+ s.getCourses().getCourseName());

        }
    }

}
