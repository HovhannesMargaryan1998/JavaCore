package students;


import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StdentDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();


    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 add student");
            System.out.println("please input 2 for print all students");
            System.out.println("please input 3 for delete student by index");
            System.out.println("please input 4 for print student by lesson");
            System.out.println("please input 5 for student's count");
            System.out.println("please input 6 for change student's lesson");
            int command = parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:

                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    studentStorage.print();
                    System.out.println("please choose student index");
                    int index = parseInt(scanner.nextLine());
                    studentStorage.deleteByIndex(index);
                    break;
                case 4:
                    System.out.println("please input lesson name");
                    String lessonName = scanner.nextLine();
                    studentStorage.printStudentsByLessonName(lessonName);
                    break;
                case 5:
                    System.out.println("student's count");
                    System.out.println(studentStorage.getSize());
                case 6:
                    studentStorage.print();
                    changeLesson();
                    break;
                default:
                    System.out.println("invalid command");
            }
        }

    }

    private static void changeLesson() {
        System.out.println("please input student index");
        String index = scanner.nextLine();
        Student byIndex = studentStorage.getByIndex(Integer.parseInt(index));
        System.out.println("please input new lessonName");
        String newLesson = scanner.nextLine();
        if (byIndex != null) {
            byIndex.setLesson(newLesson);
        }
    }

    private static void addStudent() {
        System.out.println("plase input student,s name");
        String name = scanner.nextLine();
        System.out.println("please input students surname ");
        String surname = scanner.nextLine();
        System.out.println("please input students age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input students phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("please input students city");
        String city = scanner.nextLine();
        System.out.println("please input students lesson");
        String lesson = scanner.nextLine();

        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("Thank you,student was added");


    }
}
