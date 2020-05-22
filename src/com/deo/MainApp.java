package com.deo;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hibernate.Student;
public class MainApp {
    public static void main(String args[]){
        //加载配置文件hibernate.cfg.xml
        Configuration configuration=new Configuration().configure();
        //创建会话工厂
        SessionFactory factory=configuration.buildSessionFactory();
        //创建会话对象
        Session session=factory.openSession();
        //创建一个事务对象
        Transaction tx=session.beginTransaction();
        Student student= new Student();
        student.setSno("1706300020");
        student.setSname("黄晓帅");
        student.setSage(20);
        student.setMajor("计算机科学");
        session.save(student);
        System.out.println("插入成功");
        //从数据库中读取一个对象
        Student student2=(Student)session.get(Student.class,new Integer(27));
        System.out.println(student2.getId()+"\n"+student2.getSno()+"\n"+student2.getSname()+"\n"+student2.getSage()+"\n"+student2.getMajor());
        tx.commit();
        session.close();
        factory.close();


    }
}
