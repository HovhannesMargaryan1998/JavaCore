package students;

public class StudentStorage {
    Student[] array = new Student[10];
    private int size = 0;

    void add(Student Student) {
        if (size == array.length - 1) {
            extend();
        }
        array[size++] = Student;
    }

    private void extend() {
        Student[] array2 = new Student[(array.length * 3) / 2 + 1];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + ". " + array[i] + " ");
        }
        System.out.println();
    }


    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void printStudentsByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }

        }

    }

    public int getSize() {
        return size;
    }


    public Student getByIndex(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        return array[index];
    }
}
