import java.util.Scanner;

class StudentUtil{
    static int semesterCount(Student<?,?>[] students,String semester){
        int count=0;
        for(Student<?,?> s:students){
            if(s.semester.toString().equals(semester)){count++;}
        }
        return count;
    }

    static int cpiBelow6(Student<?,?>[] students){
        int count=0;
        for(Student<?,?> s:students){
            if(s.cpi<6){count++;}
        }
        return count;
    }

    static int degreeCount(Student<?,?>[] students,String degree){
        int count=0;
        for(Student<?,?> s:students){
            if(s.degree.equalsIgnoreCase(degree)){count++;}
        }
        return count;
    }

    static int stringRegCount(Student<?,?>[] students){
        int count=0;
        for(Student<?,?> s:students){
            if(s.regId instanceof String){count++;}
        }
        return count;
    }

    static int numericSemesterCount(Student<?,?>[] students){
        int count=0;
        for(Student<?,?> s:students){
            if(s.semester instanceof Integer){count++;}
        }
        return count;
    }
}

class Student<R,S>{
    String name;
    R regId;
    String fatherName;
    String degree;
    S semester;
    double cpi;

    Student(String n,R r,String fn,String d,S s,double c){
      name=n;
      regId=r;
      fatherName=fn;
      degree=d;
      semester=s;
      cpi=c;
    }

    static void showSemesterCount(Student<?,?>[] students,String semester){
        System.out.println("Students in semester "+semester+" = "+StudentUtil.semesterCount(students,semester));
    }
    static void showCpiBelow6(Student<?,?>[] students){
        System.out.println("Students having CPI below 6 = "+StudentUtil.cpiBelow6(students));
    }
    static void showDegreeCount(Student<?,?>[] students,String degree){
        System.out.println("Students enrolled in "+degree+" = "+StudentUtil.degreeCount(students,degree));
    }
    static void showStringRegCount(Student<?,?>[] students){
        System.out.println("Students having string Registration ID = "+StudentUtil.stringRegCount(students));
    }
    static void showNumericSemesterCount(Student<?,?>[] students){
        System.out.println("Students having numeric Current Semester = "+StudentUtil.numericSemesterCount(students));
    }
}

public class p4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student<?,?>[] students=new Student[100];

        for(int i=0;i<10;i++){
            System.out.println("\nStudent "+(i+1));
            System.out.print("Name: ");
            String name=sc.nextLine();
            System.out.print("Registration ID type (1-Numeric, 2-String): ");
            int rtype=Integer.parseInt(sc.nextLine());
            Object regId;
            if(rtype==1){
                System.out.print("Registration ID: ");
                regId=Integer.parseInt(sc.nextLine());
            }
            else{
                System.out.print("Registration ID: ");
                regId=sc.nextLine();
            }

            System.out.print("Father's Name: ");
            String fatherName=sc.nextLine();
            System.out.print("Degree Name: ");
            String degree=sc.nextLine();
            System.out.print("Semester type (1-Numeric, 2-String): ");
            int stype=Integer.parseInt(sc.nextLine());
            Object semester;
            if(stype==1){
                System.out.print("Current Semester: ");
                semester=Integer.parseInt(sc.nextLine());
            }
            else{
                System.out.print("Current Semester: ");
                semester=sc.nextLine();
            }
            System.out.print("CPI: ");
            double cpi=Double.parseDouble(sc.nextLine());
            if(regId instanceof Integer && semester instanceof Integer){
                students[i]=new Student<Integer,Integer>(
                    name,(Integer)regId,fatherName,degree,(Integer)semester,cpi);
            }
            else if(regId instanceof Integer && semester instanceof String){
                students[i]=new Student<Integer,String>(
                    name,(Integer)regId,fatherName,degree,(String)semester,cpi);
            }
            else if(regId instanceof String && semester instanceof Integer){
                students[i]=new Student<String,Integer>(
                    name,(String)regId,fatherName,degree,(Integer)semester,cpi);
            }
            else{
                students[i]=new Student<String,String>(
                    name,(String)regId,fatherName,degree,(String)semester,cpi);
            }
        }

        System.out.print("\nEnter semester to count: ");
        String semester=sc.nextLine();
        System.out.print("Enter degree to count: ");
        String degree=sc.nextLine();
        Student.showSemesterCount(students,semester);
        Student.showCpiBelow6(students);
        Student.showDegreeCount(students,degree);
        Student.showStringRegCount(students);
        Student.showNumericSemesterCount(students);
    }
}
