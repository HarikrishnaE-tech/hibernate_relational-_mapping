package maven.Onetomany_Manytoone_bidir;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import data.Course;
import data.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Course c=new Course();
       c.setCname("btech");
       
       Student s=new Student();
       s.setStdname("hari");
       
       Student s1=new Student();
       s1.setStdname("junaid");
       
       s.setCourse(c);
       s1.setCourse(c);
       
       List<Student>lstudent=new ArrayList<Student>();
       lstudent.add(s1);
       lstudent.add(s);
       
       c.setLstudent(lstudent);
       
       
       Configuration cfg=new Configuration()
       .configure()
       .addAnnotatedClass(Course.class)
       .addAnnotatedClass(Student.class);
       
       SessionFactory sfg = cfg.buildSessionFactory();
       Session sess = sfg.openSession();
       Transaction bt = sess.beginTransaction();
       
       sess.save(c);
       sess.save(s1);
       sess.save(s);
       
       bt.commit();
       sess.close();
       sfg.close();
       
    }
}
