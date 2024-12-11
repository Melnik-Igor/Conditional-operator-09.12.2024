public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();

        System.out.println("Задача 1");
        // Ввод возраста человека
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        System.out.println("Задача 2");
        // Ввод температуры
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println();

        System.out.println("Задача 3");
        // Ввод скорости
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        System.out.println();

        System.out.println("Задача 4");
        // Ввод возраста человека
        int humanAge = 25;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то ему нужно ходить в детский сад");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то ему нужно ходить в школу");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то его место в университете");
        } else if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, ему пора ходить на работу");
        }
        System.out.println();

        System.out.println("Задача 5");
        // Ввод возраста ребенка
        int ageСhild = 6;
        if (ageСhild < 5) {
            System.out.println("Если возраст ребенка равен " + ageСhild + " , то он не может кататься на аттракционе");
        } else if (ageСhild >= 5 && ageСhild < 14) {
            System.out.println("Если возраст ребенка равен " + ageСhild + " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (ageСhild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageСhild + " , тто он может кататься без сопровождения взрослого");
        }
        System.out.println();

        System.out.println("Задача 6");
        // Ввод колличества пассажиров
        int passengers = 103;
        int totalCapacityPeopCarriage = 102;
        int seatsCarriage = 60;
        int standingCarriage = totalCapacityPeopCarriage - seatsCarriage;
        if (passengers > seatsCarriage && passengers <= totalCapacityPeopCarriage) {
            System.out.println("Есть стоячие места");
        } else if (passengers <= seatsCarriage && passengers <= totalCapacityPeopCarriage) {
            System.out.println("Есть сидячие места");
        } else if (passengers > totalCapacityPeopCarriage) {
            System.out.println("Нет свободных мест");
        }
        System.out.println();

        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println(one);
        }
        if (two >= one && two >= three) {
            System.out.println(two);
        }
        if (three >= one && three >= two) {
            System.out.println(three);
        }


    }
}



