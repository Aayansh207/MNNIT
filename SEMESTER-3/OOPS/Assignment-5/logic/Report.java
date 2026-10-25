package logic;

public class Report {
    public static void generate(Department[] d) {
        System.out.println("===== MNNIT ACADEMIC REPORT =====");
        System.out.println("\nDepartment Toppers:");
        for(Department x:d){
            System.out.println(x.name+" : "+x.getTopper().name);
        }
        Student topper=d[0].students[0];
        for(Department x:d){
            for(Student s:x.students){
                if(s.getAverage()>topper.getAverage()){
                    topper=s;
                }
            }
        }
        System.out.println("\nUniversity Topper: "+topper.name);
        Course best = d[0].courses[0];
        for(Department x:d){
            for(Course c:x.courses){
                if(c.getAverage()>best.getAverage()){
                    best=c;
                }
            }
        }
        System.out.println("Highest Scoring Course: "+best.name);
        System.out.println("\nDepartment Pass Percentage:");
        for(Department x:d){
            System.out.println(x.name+" : "+x.getPassPercentage()+"%");
        }
        System.out.println("\nScholarship Students:");
        for(Department x:d){
            for(Student s:x.students){
                if(s.isScholarshipStudent()){
                    System.out.println(s.name);
                }
            }
        }
        System.out.println("\nStudents with Backlogs:");
        for(Department x:d){
            for(Student s:x.students){
                if(s.getBacklogs()>0){
                    System.out.println(s.name+" : "+s.getBacklogs());
                }
            }
        }
        System.out.println("\nCourse-wise Failures:");
        for(Department x:d){
            for(Course c:x.courses){
                System.out.println(c.name+" : "+c.getFailures());
            }
        }
        double total=0;
        int count=0;
        for(Department x:d){
            for(Student s:x.students){
                total=total+s.getAverage();
                count++;
            }
        }
        System.out.println("\nUniversity Average: "+total/count);
        System.out.println("\nDepartment Ranking:");
        for(int i=0;i<d.length-1;i++){
            for(int j=i+1;j<d.length;j++){
                if(d[i].getAverage()<d[j].getAverage()){
                    Department temp=d[i];
                    d[i]=d[j];
                    d[j]=temp;
                }
            }
        }
        for(int i=0;i<d.length;i++){
            System.out.println((i+1)+". "+d[i].name+" : "+d[i].getAverage());
        }
    }
}

