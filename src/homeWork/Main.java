package homeWork;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("* Создать класс \"Сотрудник\" с полями: ФИО, должность, email, телефон, зарплата, возраст;\n" +
                "* Конструктор класса должен заполнять эти поля при создании объекта;\n" +
                "* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;\n" +
                "* Создать массив из 5 сотрудников\n" +
                "Пример:\n" +
                "Person[] persArray = new Person[5]; // Вначале объявляем массив объектов\n" +
                "persArray[0] = new Person(\"Ivanov Ivan\", \"Engineer\", \"ivivan@mailbox.com\", \"892312312\", 30000, 30); // потом для каждой ячейки массива задаем объект\n" +
                "persArray[1] = new Person(...);\n" +
                "...\n" +
                "persArray[4] = new Person(...);\n" +
                "\n" +
                "* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;");
        System.out.println();
        System.out.println();
        Employee employee1 = new Employee();
        employee1.infoOfEmployee();
        System.out.println();


        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Mark Selby","snooker player","sellby@gmail.com","89111114567",999999,37);
        employeeArray[1] = new Employee("Judd Trump","snooker player","judd@gmail.com","89454354567",345345,31);
        employeeArray[2] = new Employee("Neil Robertson","snooker player","neil@gmail.com","89353534567",888888,38);
        employeeArray[3] = new Employee("Mark Williams","snooker player","williams@gmail.com","8345345567",5346353,45);
        employeeArray[4] = new Employee("Alan Chamberlain","Senior Research Fellow","alan@gmail.com","89111114567",999999,77);

        System.out.println("Who is elder then 40 years old.");
        for (int i = 0; i < employeeArray.length; i++)
        {
            if (employeeArray[i].age > 40)
            {
                System.out.println("ФИО: " + employeeArray[i].fullName + ", Должность: " + employeeArray[i].position + ", email:" + employeeArray[i].email + ", Телефон: " + employeeArray[i].phone + ", Зп: " + employeeArray[i].salary + ", Возраст: " + employeeArray[i].age);
            }
        }
    }

}

