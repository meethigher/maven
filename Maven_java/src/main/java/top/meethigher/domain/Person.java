package top.meethigher.domain;

/**
 * Person
 *
 * @autho kit chen
 * @github https://github.com/meethigher
 * @blog https://meethigher.top
 * @time 2021/1/17
 */
public class Person {
    private int id;
    private String name;
    private String gender;
    private int age;
    private int grade;
    private String school;
    private String position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", school='" + school + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
