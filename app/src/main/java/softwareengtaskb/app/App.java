package softwareengtaskb.app;
import org.joda.time.DateTime;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Student sean = new Student("Sean", 22, 1, DateTime.parse("2000-06-01T00:00:00.000Z"));
        Student sophia = new Student("Sophia", 21, 2, DateTime.parse("2001-03-02T00:00:00.000Z"));
        Student cormac = new Student("Cormac", 22, 3, DateTime.parse("2001-03-02T00:00:00.000Z"));
        Student beans = new Student("Beans", 24, 4, DateTime.parse("2001-03-02T00:00:00.000Z"));
        Student andrew = new Student("Andrew", 18, 5, DateTime.parse("2001-03-02T00:00:00.000Z"));

        Programme ece = new Programme("Electronic and Computer Engineering", DateTime.parse("2000-06-01T00:00:00.000Z"), DateTime.parse("2000-06-01T00:00:00.000Z"));
        Programme law = new Programme("Law", DateTime.parse("2000-06-01T00:00:00.000Z"), DateTime.parse("2000-06-01T00:00:00.000Z"));
        Programme bio = new Programme("Biomedical Engineering", DateTime.parse("2000-06-01T00:00:00.000Z"), DateTime.parse("2000-06-01T00:00:00.000Z"));

        Lecturer l1 = new Lecturer("John", 55, 1,DateTime.parse("2001-01-01T00:00:00.000Z"));
        Lecturer l2 = new Lecturer("Alan", 57, 2,DateTime.parse("2001-01-01T00:00:00.000Z"));
        Lecturer l3 = new Lecturer("Maeve", 45, 3,DateTime.parse("2001-01-01T00:00:00.000Z"));

        Module m1= new Module("Software Engineering", "CT417");
        Module m2= new Module("Embedded Systems", "EE347");
        Module m3= new Module("Equity Law", "EL101");
        Module m4= new Module("Commercial Law" , "CL421");
        Module m5= new Module("Materials", "BM288");

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

        ArrayList<Module> computerModules= new ArrayList<Module>();
        computerModules.add(m1);
        computerModules.add(m2);

        ArrayList<Module> lawModules = new ArrayList<Module>();
        lawModules.add(m3);
        lawModules.add(m4);

        ArrayList<Module> medModules = new ArrayList<Module>();
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
            for (Module m : p.getModuleList()) {
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
