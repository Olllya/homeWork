package homeWork;

public class Employee
{
    String  fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employee()
    {
        fullName = "Ronnie O'Sullivan";
        position = "snooker player";
        email = "ronnie@gmail.com";
        phone = "89111234567";
        salary = 100000;
        age = 44;
    }
    Employee(String fullName, String position, String email, String phone, int salary, int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void infoOfEmployee()
    {
        System.out.println("ФИО: " + fullName + ", Должность: " + position + ", email:" + email + ", Телефон: " + phone + ", Зп: " + salary + ", Возраст: " + age);
    }


}
