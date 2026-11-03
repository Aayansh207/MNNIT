import java.io.*;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String DIARY_FILE = "diary.txt";

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1 -> writeNewEntry();
                case 2 -> appendToDiary();
                case 3 -> readEntireDiary();
                case 4 -> readDiaryLineByLine();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while(choice!=0);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n========== DIARY MANAGEMENT SYSTEM ==========");
        System.out.println("1. Write a new diary entry");
        System.out.println("2. Append to the diary");
        System.out.println("3. Read entire diary");
        System.out.println("4. Read diary line by line");
        System.out.println("0. Exit");
        System.out.println();
    }

    private static void writeNewEntry() {
        String entry=readEntry("Enter your new diary entry: ");

        try (FileWriter writer = new FileWriter(DIARY_FILE)) {
            writer.write(entry);
            writer.write(System.lineSeparator());
            System.out.println("New diary entry saved successfully.");
        } catch (IOException exception) {
            System.out.println("Could not write to the diary: " + exception.getMessage());
        }
    }

    private static void appendToDiary() {
        String entry = readEntry("Enter text to append: ");

        try (FileWriter writer = new FileWriter(DIARY_FILE, true)) {
            writer.write(entry);
            writer.write(System.lineSeparator());
            System.out.println("Text appended successfully.");
        } catch (IOException exception) {
            System.out.println("Could not append to the diary: " + exception.getMessage());
        }
    }

    private static void readEntireDiary() {
        try (BufferedReader reader = new BufferedReader(new FileReader(DIARY_FILE))) {
            StringBuilder diary = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                diary.append(line).append(System.lineSeparator());
            }

            if (diary.isEmpty()) {
                System.out.println("The diary is empty.");
            } else {
                System.out.println("\n========== DIARY ==========");
                System.out.print(diary);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("No diary found. Write an entry first.");
        } catch (IOException exception) {
            System.out.println("Could not read the diary: " + exception.getMessage());
        }
    }

    private static void readDiaryLineByLine() {
        try (BufferedReader reader = new BufferedReader(new FileReader(DIARY_FILE))) {
            String line;
            int lineNumber = 1;
            boolean hasContent = false;

            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber++ + ": " + line);
                hasContent = true;
            }

            if (!hasContent) {
                System.out.println("The diary is empty.");
            }
        } catch (FileNotFoundException exception) {
            System.out.println("No diary found. Write an entry first.");
        } catch (IOException exception) {
            System.out.println("Could not read the diary: " + exception.getMessage());
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static String readEntry(String prompt){
        String entry;
        do {
            System.out.print(prompt);
            entry=scanner.nextLine().trim();
            if(entry.isEmpty()){
                System.out.println("Diary entry cannot be empty.");
            }
        }while(entry.isEmpty());
        return entry;
    }
}
