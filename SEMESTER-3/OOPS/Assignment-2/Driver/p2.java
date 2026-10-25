package Driver;

import Logic.StudentRecordBufferedReader;
import java.io.IOException;

public class p2{

    public static void main(String[] args) throws IOException{

        StudentRecordBufferedReader student1=new StudentRecordBufferedReader();

        student1.setData();
        student1.getAge();
        student1.printData();
    }
}

