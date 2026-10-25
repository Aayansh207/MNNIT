package driver;

import logic.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 100;

        List<GenericStudentRecord<?, ?>> students = new ArrayList<>();
        Set<String> ids = new HashSet<>();

        System.out.println("Enter details of exactly " + N + " students.");

        for (int i = 0; i < N; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Category (UG/PG): ");
            String cat = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Registration ID: ");
            String id = sc.nextLine();

            System.out.print("Father's name: ");
            String father = sc.nextLine();

            System.out.print("Degree: ");
            String degree = sc.nextLine();

            System.out.print("Semester: ");
            String sem = sc.nextLine();

            System.out.print("CPI: ");
            double cpi = sc.nextDouble();
            sc.nextLine();

            Object rid = id.matches("[1-9][0-9]*")
                    ? Integer.parseInt(id)
                    : id;

            Object semester = sem.matches("[1-9][0-9]*")
                    ? Integer.parseInt(sem)
                    : sem;

            String key = rid.getClass().getName() + ":" + rid;

            if (!ids.add(key)) {
                System.out.println("Duplicate registration ID. Record rejected.");
                i--;
                continue;
            }

            if (!cat.equalsIgnoreCase("UG")
                    && !cat.equalsIgnoreCase("PG")) {
                System.out.println("Invalid category.");
                ids.remove(key);
                i--;
                continue;
            }

            if (cat.equalsIgnoreCase("UG")) {
                if (rid instanceof Integer && semester instanceof Integer) {
                    students.add(new UGStudent<Integer, Integer>(
                            name, (Integer) rid, father, degree,
                            (Integer) semester, cpi));

                } else if (rid instanceof Integer) {
                    students.add(new UGStudent<Integer, String>(
                            name, (Integer) rid, father, degree,
                            (String) semester, cpi));

                } else if (semester instanceof Integer) {
                    students.add(new UGStudent<String, Integer>(
                            name, (String) rid, father, degree,
                            (Integer) semester, cpi));

                } else {
                    students.add(new UGStudent<String, String>(
                            name, (String) rid, father, degree,
                            (String) semester, cpi));
                }

            } else {
                if (rid instanceof Integer && semester instanceof Integer) {
                    students.add(new PGStudent<Integer, Integer>(
                            name, (Integer) rid, father, degree,
                            (Integer) semester, cpi));

                } else if (rid instanceof Integer) {
                    students.add(new PGStudent<Integer, String>(
                            name, (Integer) rid, father, degree,
                            (String) semester, cpi));

                } else if (semester instanceof Integer) {
                    students.add(new PGStudent<String, Integer>(
                            name, (String) rid, father, degree,
                            (Integer) semester, cpi));

                } else {
                    students.add(new PGStudent<String, String>(
                            name, (String) rid, father, degree,
                            (String) semester, cpi));
                }
            }
        }

        System.out.println("\n========== STUDENT REGISTRY ==========");

        for (GenericStudentRecord<?, ?> s : students) {
            ((PrintableSummary) s).printSummary();
        }

        System.out.println("\n========== REGISTRY STATISTICS ==========");

        System.out.print("Enter semester to count: ");
        String sem = sc.nextLine();

        System.out.print("Enter degree to count: ");
        String degree = sc.nextLine();

        System.out.println("Students in semester " + sem + ": "
                + RegistryUtil.countBySemester(students, sem));

        System.out.println("Students in degree " + degree + ": "
                + RegistryUtil.countByDegree(students, degree));

        System.out.println("Students with CPI below 6: "
                + RegistryUtil.countCpiBelow6(students));

        System.out.println("Students with String IDs: "
                + RegistryUtil.countStringIds(students));

        System.out.println("Students with numeric semesters: "
                + RegistryUtil.countNumericSemesters(students));

        sc.close();
    }
}
