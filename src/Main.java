public class Main {
    public static void main(String[] args) {


        int age = 18;
        if (age <= 18) {
            System.out.println("Если 18 + age + можно водить");
            if (age < 18) {
                System.out.println(" Если нет 18 + age + не можешь водить ");
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

            int age1 = 2;
            if( age1 >= 2 && age1 <= 6) {
                System.out.println("Если возраст равен" + age1 + " ему нужно ходить в садик");
            } else if (age1 >=7 && age1 <=17) {
                System.out.println("Если возраст равен" + age1 + "ему нужно ходить в школу");
            } else if (age1 >=18 && age1 <+24) {
                System.out.println("Если возраст равен" + age1 + "ему нужно ходить в институт");
            } else {
                System.out.println("Если возраст равен" + age1 + " ему нужно ходить на работу");
            }

            }

        }
        }
































