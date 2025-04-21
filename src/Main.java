public class Main {
    public static void main(String[] args) {


        int age = 18;
        if (age >= 18) {
            System.out.println("Если " + age + " можно водить");
        }
        if (age < 18) {
            System.out.println(" Если возраст " + age + " не можешь водить ");
        }


        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице" + temperature + " градусов,нужно надеть шапку");
        } else {
            System.out.println("На улице" + temperature + " градусов,можно идти без шапки");
        }


        int speed = 81;
        if (speed > 60) {
            System.out.println(" Если скорость" + speed + "придется платить штраф");
        } else {
            System.out.println("Если скорость" + speed + "штрафа не будет");
        }


        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст равен" + age + " ему нужно ходить в садик");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст равен" + age + "ему нужно ходить в школу");
        } else if (age >= 18 && age < +24) {
            System.out.println("Если возраст равен" + age + "ему нужно ходить в институт");
        } else {
            System.out.println("Если возраст равен" + age + " ему нужно ходить на работу");
        }


        if (age < 5) {
            System.out.println("Если возраст ребенка " + age + " он не может кататься");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка" + age + " только в сопровождении взрослых");
        } else {
            System.out.println("Если возраст ребенка" + age + "можно кататься без сопровождения взрослого");
        }


        int passengers = 75;
        if (passengers <= 60) {
            System.out.println("Если в вагоне " + passengers + " пассажиров, то есть сидячие места");
        } else if (passengers <= 102) {
            System.out.println("Если в вагоне " + passengers + " пассажиров, то есть стоячие места");
        } else {
            System.out.println("Если в вагоне " + passengers + " пассажиров, то вагон полностью забит");
        }


        int one = 5;
        int two = 10;
        int three = 7;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число " + three);
        }

    }

}
























































