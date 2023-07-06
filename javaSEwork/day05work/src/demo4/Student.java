package demo4;

/**
 * @Author: 陈亚琪
 * @CreateTime: 2022-07-14  19:10
 * @Version: 1.0
 */
public class Student {
    public String name;
    public String age;
    public String sex;

    public Student() {
    }

    public Student(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        int age1 = Integer.parseInt(age);
        if (age1 >= 15 && age1 <= 50) {
            this.age = age;
        } else {
           throw new AgeException("年龄异常");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            throw new SexException("年龄异常");
        }

    }
}
