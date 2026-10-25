package logic;

import java.util.List;

public class RegistryUtil {

    public static int countByDegree(
            List<? extends GenericStudentRecord<?, ?>> students,
            String degree) {
        int count = 0;

        for (GenericStudentRecord<?, ?> student : students) {
            if (student.getDegreeName().equalsIgnoreCase(degree)) {
                count++;
            }
        }

        return count;
    }

    public static int countBySemester(
            List<? extends GenericStudentRecord<?, ?>> students,
            String selectedSemester) {
        int count = 0;
        Integer target = parseSemester(selectedSemester);

        if (target == null) {
            return 0;
        }

        for (GenericStudentRecord<?, ?> student : students) {
            Integer current = parseSemester(String.valueOf(student.getSemester()));

            if (current != null && current.equals(target)) {
                count++;
            }
        }

        return count;
    }

    public static int countCpiBelow6(
            List<? extends GenericStudentRecord<?, ?>> students) {
        int count = 0;

        for (GenericStudentRecord<?, ?> student : students) {
            if (student.getCpi() < 6.0) {
                count++;
            }
        }

        return count;
    }

    public static int countStringIds(
            List<? extends GenericStudentRecord<?, ?>> students) {
        int count = 0;

        for (GenericStudentRecord<?, ?> student : students) {
            if (student.getRegistrationId() instanceof String) {
                count++;
            }
        }

        return count;
    }

    public static int countNumericSemesters(
            List<? extends GenericStudentRecord<?, ?>> students) {
        int count = 0;

        for (GenericStudentRecord<?, ?> student : students) {
            if (student.getSemester() instanceof Number) {
                count++;
            }
        }

        return count;
    }

    private static Integer parseSemester(String semester) {
        try {
            return Integer.parseInt(semester.trim());
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
