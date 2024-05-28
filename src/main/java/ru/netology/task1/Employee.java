package ru.netology.task1;

public class Employee {
    String fio;
    String function;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fio, String function, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.function = function;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.print("Employee: \n" +
                "fio: " + fio + "\n" +
                "function: " + function + "\n" +
                "email: " + email + "\n" +
                "phoneNumber: " + phoneNumber + "\n" +
                "salary: " + salary + " rub\n" +
                "age: " + age + " years\n" +
                "\n");
    }
}
