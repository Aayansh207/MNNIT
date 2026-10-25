package logic;

public class Course {
    String code;
    String name;
    public Student[] students;
    public Course(String code,String name,Student[] students){
        this.code=code;
        this.name=name;
        this.students=students;
    }

    public double getAverage(){
        int total=0;
        int count=0;
        for(int i=0;i<students.length;i++){
            for(int j=0;j<students[i].courses.length;j++){
                if(students[i].courses[j]==this){
                    total=total+students[i].marks[j];
                    count++;
                }
            }
        }
        if(count==0){return 0;}
        return (double)total/count;
    }
    
    public int getFailures(){
        int count=0;
        for(int i=0;i<students.length;i++){
            for(int j=0;j<students[i].courses.length;j++){
                if(students[i].courses[j]==this &&students[i].marks[j]<40){count++;}
            }
        }
        return count;
    }

    public double getPassPercentage() {
        if(students.length==0){return 0;}
        int passed=0;
        for(int i=0;i<students.length;i++){
            for(int j=0;j<students[i].courses.length;j++){
                if(students[i].courses[j]==this){
                    if(students[i].marks[j]>=40){passed++;}
                    break;
                }
            }
        }
        return (double)passed/students.length*100;
    }
}

