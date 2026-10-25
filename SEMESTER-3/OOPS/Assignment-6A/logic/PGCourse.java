package logic;

public class PGCourse extends Course {
    @Override
    public void setCode(String code) {
        if(code.matches("PG-[0-9]+")){this.code = code;}
        else{System.out.println("Invalid PG course code.");}
    }
}

