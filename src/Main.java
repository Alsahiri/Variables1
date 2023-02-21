public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Пишем код для задачи 1
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Пишем код для задачи 2
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Пишем код для задачи 3

    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Пишем код для задачи 4
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Пишем код для задачи 2
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        var differenceWeight = (boxer2Weight) % boxer1Weight;
        System.out.println("Общий вес 2х бойцов " + totalWeight + " кг");
        System.out.println("Разница в весе 2х бойцов " + differenceWeight + " кг");
        // Пишем код для задачи 6
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var differenceWeight1 = (boxer2Weight) % boxer1Weight;
        var differenceWeight2 = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе составляет " + differenceWeight1 + " кг");
        System.out.println("Разница в весе составляет " + differenceWeight2 + " кг");
        // Пишем код для задачи 7
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var totalWorkTime = 360;
        var singleWorkerTime = 8;
        var amountWorkefs = totalWorkTime / singleWorkerTime;
        System.out.println("Всего работников в компании - " + amountWorkefs);
        amountWorkefs = amountWorkefs + 94;
        singleWorkerTime = totalWorkTime / amountWorkefs;
        System.out.println("Если в компании работает " + amountWorkefs + " человек, то всего " + singleWorkerTime + " часов работы может быть поделено между сотрудниками");
        // Пишем код для задачи 8
    }
}