package logic;

public class Department{
    String name;
    Course[] courses;
    Student[] students;
    public Department(String name,Course[] courses,Student[] students){
        this.name=name;
        this.courses=courses;
        this.students=students;
    }

    public Student getTopper(){
        if(students.length==0){return null;}
        Student topper=students[0];
        for(int i=1;i<students.length;i++){
            if(students[i].getAverage()>topper.getAverage()){topper=students[i];}
        }
        return topper;
    }

    public double getAverage(){
        if(students.length==0){return 0;}
        double total=0;
        for(int i=0;i<students.length;i++){
          total=total+students[i].getAverage();
        }
        return total/students.length;
    }

    public double getPassPercentage(){
        if(students.length==0){return 0;}
        int passed=0;
        for(int i=0;i<students.length;i++){
            if(students[i].isPass()){passed++;}
        }
        return (double) passed/students.length*100;
    }
}

