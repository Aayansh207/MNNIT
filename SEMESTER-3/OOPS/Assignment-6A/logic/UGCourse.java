package logic;

public class UGCourse extends Course {
    @Override
    public void setCode(String code){
        if(code.matches("UG-[0-9]+")){this.code=code;} 
        else{System.out.println("Invalid UG course code.");}
    }
}

