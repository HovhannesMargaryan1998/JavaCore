package students;

public class Student {
    private String name;
    private String surbane;
    private int age;
    private String phoneNumber;
    private String lesson;


    public Student(String name, String surbane, int age, String phoneNumber, String city, String lesson) {
        this.name = name;
        this.surbane = surbane;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.lesson = lesson;
    }


    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }


    private String city;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurbane() {
        return surbane;
    }

    public void setSurbane(String surbane) {
        this.surbane = surbane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surbane='" + surbane + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lesson='" + lesson + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
