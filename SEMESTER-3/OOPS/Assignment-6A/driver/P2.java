package driver;

import logic.UGCourse;
import logic.PGCourse;

public class P2 {
    public static void main(String[] args){
        UGCourse ug=new UGCourse();
        ug.setCode("UG-1001");
        ug.setName("Data Structures");
        ug.setCredit(4);
        System.out.println("UG Course Details");
        System.out.println("Code   : " + ug.getCode());
        System.out.println("Name   : " + ug.getName());
        System.out.println("Credit : " + ug.getCredit());
        System.out.println();
        PGCourse pg=new PGCourse();
        pg.setCode("PG-2001");
        pg.setName("Advanced Java");
        pg.setCredit(4);
        System.out.println("PG Course Details");
        System.out.println("Code   : " + pg.getCode());
        System.out.println("Name   : " + pg.getName());
        System.out.println("Credit : " + pg.getCredit());
    }
}

