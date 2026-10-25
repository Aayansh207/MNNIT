package driver;
import logic.*;

public class P1{
    public static void main(String[] args) {
        Course c1=new Course("CS101","Programming",null);
        Course c2=new Course("CS102","Data Structures",null);
        Course c3=new Course("MA101","Mathematics",null);
        Course c4=new Course("EC101","Digital Electronics",null);
        Student s1=new Student(101,"Amit",new Course[]{c1,c2,c3},new int[]{85,90,80});
        Student s2=new Student(102,"Ravi",new Course[]{c1,c2,c3},new int[]{72,68,75});
        Student s3=new Student(103,"Neha",new Course[]{c1,c2,c3},new int[]{95,88,92});
        Student s4=new Student(104,"Priya",new Course[]{c3,c4},new int[]{65,35});
        Student s5=new Student(105,"Rahul",new Course[]{c3,c4},new int[]{55,42});
        Student s6=new Student(106,"Sneha",new Course[]{c3,c4},new int[]{82,86});
        c1.students=new Student[]{s1,s2,s3};
        c2.students=new Student[]{s1,s2,s3};
        c3.students=new Student[]{s1,s2,s3,s4,s5,s6};
        c4.students=new Student[]{s4,s5,s6};
        Department d1=new Department("Computer Science",new Course[]{c1,c2,c3},new Student[]{s1,s2,s3});
        Department d2=new Department("Electronics",new Course[]{c3,c4},new Student[]{s4,s5,s6});
        Department[] departments={d1,d2};
        Report.generate(departments);
    }
}

