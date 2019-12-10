import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MyMain {

    public static void main(String[] args) {
        Student student= new Student();
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        tx.commit();
        student=(Student) session.get(Student.class,600L);
        System.out.println(student.getName());

    }





}


