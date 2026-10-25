package logic;

public class Student {
    int rollNo;
    String name;
    Course[] courses;
    int[] marks;
    public Student(int rollNo,String name,Course[] courses,int[] marks){
        this.rollNo=rollNo;
        this.name=name;
        this.courses=courses;
        this.marks=marks;
    }
    
    public int getTotalMarks(){
        int total=0;
        for(int i=0;i<marks.length;i++){
            total=total+marks[i];
        }
        return total;
    }

    public double getAverage(){return (double) getTotalMarks()/marks.length;}

    public int getBacklogs(){
        int count=0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]<40){count++;}
        }
        return count;
    }
    public boolean isPass(){return getBacklogs()==0;}
    public boolean isScholarshipStudent(){return getAverage()>=75 && isPass();}
}

