public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 45;
        boolean isAdult = age >= 18;
        if(isAdult) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age
                    + " лет, то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        int temperature = 30;
        if(temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        int speed = 80;
        if(speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
    }
    public static void task4() {
        int age = 80;
        if(age < 2) {
            System.out.println("Если еловеку меньше " + age + " лет, то ему пора спать");
        } else if(age >= 2 && age <= 6){
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в детский сад");
        } else if(age >= 7 && age <= 18){
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в школу");
        } else if(age > 18 && age < 24){
            System.out.println("Если человеку " + age + " лет, то его место в университете");
        } else if (age >= 24 && age < 60) {
            System.out.println("Если человеку " + age + " лет, то ему пора ходить на работу");
        } else {
            System.out.println("Если человеку " + age + " лет, то он может отдохнуть");
        }
    }
    public static void task5() {
        int age = 7;
        if(age < 5) {
            System.out.println("Если возраст ребенка равен " + age + "лет, то он не может кататься на аттракционе");
        } else if (age >= 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + " лет, то он может кататься только в сопровождении взрослого." +
                    " Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " лет, то он может кататься без сопровождения взрослого.");
        }
    }
    public static void task6() {
        int passengerNumber = 55;
        int railcarCapacity = 102;
        int seats = 60;
        if(passengerNumber > railcarCapacity) {
            System.out.println("Мест нет");
        } else if (passengerNumber <= seats){
            System.out.println("Для пассажира доступно сидячее мето в вагоне");
        } else {
            System.out.println("Для пассажира остались только стоячие места");
        }
    }
    public static void task7() {
        int one = 1;
        int two = 2;
        int three = 3;
        if(one > two && one > three) {
            System.out.println("Первое число больше всех");
        } else if (one == two) {
            System.out.println("Первое и второе число равны");
        } else if (one == three) {
            System.out.println("Первое и третье число равны");
        } else if (two < one && two < three) {
            System.out.println("Второе число больше всех");
        } else if(two == three) {
            System.out.println("Второе и третье число равны");
        } else {
            System.out.println("Третье число больше всех");
        }
    }
}