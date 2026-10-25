package Driver;
import Logic.StudentRecordScanner;
public class p1{
    public static void main(String[] args){
        StudentRecordScanner student1=new StudentRecordScanner();
        student1.setData();
        student1.getAge();
        student1.printData();
    }
}
