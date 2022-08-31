public class Main {
    public static void main(String[] args) {
        //Задача 1.
        System.out.println("    Задача 1.");
        int age = 29;
        if (age >= 18) {
            System.out.println("Поздравляем, Вы совершеннолетний!");
        }
        if (age < 18) {
            System.out.println("Вы ещё не достигли совершеннолетия, нужно немного подождать!");
        }

        //Задача 2.
        System.out.println("    Задача 2.");
        if (age >= 7 && age < 18) {
            System.out.println("Вы ещё ходите в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Вы уже закончили школу и учитесь в университете");
        }
        if (age >= 24) {
            System.out.println("Вы закончили университет и Вам пора искать первую работу");
        }

        //Задача 3.
        System.out.println("    Задача 3.");
        int places = 102;
        int seating = 60;
        int standingPlaces = places - seating;
        int occupiedSeating = 37; //Занято сидячих мест
        int occupiedStandingPlaces = 28; //Занято стоячих мест
        int freeSeating = seating - occupiedSeating; //Свободные сидячие места
        int freeStandingPlaces = standingPlaces - occupiedStandingPlaces; //Свободные стоячие места
        if (freeSeating > 0 && freeStandingPlaces > 0) {
            System.out.println("Есть свободные места, сидячих - " + freeSeating + ", стоячих - " + freeStandingPlaces);
        }
        if (freeSeating > 0 && freeStandingPlaces <= 0){
            System.out.println("Есть свободные места, сидячих - " + freeSeating + ", стоячих - 0");
        }
        if (freeSeating <= 0 && freeStandingPlaces > 0){
            System.out.println("Есть свободные места, сидячих - 0, стоячих - " + freeStandingPlaces);
        }
        if (freeSeating <= 0 && freeStandingPlaces <= 0) {
            System.out.println("Свободных мест нет");
        }

        //Задача 4.
        System.out.println("    Задача 4.");
        int age2 = 9;
        if (age2 >= 18) {
            System.out.println("Поздравляем, Вы совершеннолетний!");
        }
        else  {
            System.out.println("Вы ещё не достигли совершеннолетия, нужно немного подождать!");
        }

        //Задача 5.
        System.out.println("    Задача 5.");
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Вы ещё ходите в школу");
        }
        else if (age2 >= 18 && age2 < 24) {
            System.out.println("Вы уже закончили школу и учитесь в университете");
        }
        else {
            System.out.println("Вы закончили университет и Вам пора искать первую работу");
        }

        //Задача 6.
        System.out.println("    Задача 6.");
        int places1 = 102;
        int seating1 = 60;
        int standingPlaces1 = places1 - seating1;
        int occupiedSeating1 = 60; //Занято сидячих мест
        int occupiedStandingPlaces1 = 42; //Занято стоячих мест
        int freeSeating1 = seating1 - occupiedSeating1; //Свободные сидячие места
        int freeStandingPlaces1 = standingPlaces1 - occupiedStandingPlaces1; //Свободные стоячие места
        if (freeSeating1 > 0 && freeStandingPlaces1 > 0) {
            System.out.println("Есть свободные места, сидячих - " + freeSeating1 + ", стоячих - " + freeStandingPlaces1);
        }
        else if (freeSeating1 > 0 && freeStandingPlaces1 <= 0){
            System.out.println("Есть свободные места, сидячих - " + freeSeating1 + ", стоячих - 0");
        }
        else if (freeSeating1 <= 0 && freeStandingPlaces1 > 0){
            System.out.println("Есть свободные места, сидячих - 0, стоячих - " + freeStandingPlaces1);
        }
        else {
            System.out.println("Свободных мест нет");
        }

        //Задача 7.
        System.out.println("    Задача 7.");
        int age3 = 14;
        if (age3 >= 2 && age3 <= 6) {
            System.out.println("Вам нужно ходить в детский сад");
        }
        else if (age3 >= 7 && age3 <= 18) {
            System.out.println("Вам нужно ходить в школу");
        }
        else  if (age3 > 18 && age3 < 24) {
            System.out.println("Ваше место в университете");
        }
        else if (age3 >= 24) {
            System.out.println("Вам пора ходить на работу");
        }

        //Задача 8.
        System.out.println("    Задача 8.");
        int age4 = 13;
        if (age4 < 5) {
            System.out.println("Вам запрещено кататься на атракционе");
        }
        else if (age4 >= 5 && age4 < 14) {
            System.out.println("Вы можете кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Вы можете кататься без сопровождения");
        }

        //Задача 9.
        System.out.println("    Задача 9.");
        int one = 1;
        int two = 2;
        int free = 3;
        if (one >= two && one >= free) {
            System.out.println(one);
        }
        else if (two >= one && two >= free) {
            System.out.println(two);
        }
        else {
            System.out.println(free);
        }
    }
}