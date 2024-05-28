package ru.netology;

import ru.netology.task1.Employee;
import ru.netology.task3.Park;

public class Main {
    public static void main(String[] args) {

        /*
        Task #1
         */

        Employee eldar = new Employee("Zaripov Eldar Ramilevich", "QA Automation Engineer",
                "eldar.zaripoff@gmail.com", "+79655914048", 40000, 26);
        eldar.info();

        /*
        Task #2
         */

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", "Back-End Developer", "ivanov@mail.ru",
                "+79655914040", 70000, 23);
        employees[1] = new Employee("Petrov Petr Petrovich", "Manual QA Engineer", "petro@mail.ru",
                "+79655805656", 55000, 27);
        employees[2] = new Employee("Yanov Yan Yanovich", "DevOps", "yan@mail.ru",
                "+79655805353", 65000, 25);
        employees[3] = new Employee("Arutov Arut Arutovich", "Front-End Developer", "ara@mail.ru",
                "+79655963232", 45000, 31);
        employees[4] = new Employee("Pavlov Pavel Pavlovich", "Product Owner", "pashgun@mail.ru",
                "+79777777777", 100000, 28);

        /*
        Task #3
         */

        Park park = new Park("Парк развлечений");
        Park.Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00 - 20:00", 15.99);
        Park.Attraction carousel = park.new Attraction("Карусель", "11:00 - 19:00", 5.99);
        Park.Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "12:00 - 21:00", 12.99);

        park.addAttraction(rollerCoaster);
        park.addAttraction(carousel);
        park.addAttraction(ferrisWheel);

        System.out.println("Название парка: " + park.getName());

        for (Park.Attraction attraction : park.getAttractions()) {
            System.out.println("Название аттракциона: " + attraction.getName());
            System.out.println("Время работы: " + attraction.getWorkingHours());
            System.out.println("Стоимость: " + attraction.getPrice());
            System.out.println();
        }
    }
}