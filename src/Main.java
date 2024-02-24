public class Main {
    public static void main(String[] args) {
        //===================== ?????? ??????? ===================
        System.out.println("Задание 1 вариант 1");
        byte  age=18;
        System.out.print("Если возраст человека ="+ age);
        if (age >= 18) {
            System.out.println(" то он соершеннолетний");
        } else {
            System.out.print(" то он не достиг совершеннолетия");
            System.out.println(", нужно немного подождать");
        }
        System.out.println("Задание 1 вариант 2");
        age=17;
        System.out.print("Если возраст человека ="+ age);
        if (age >= 18) {
            System.out.print(" то он соершеннолетний ");
        } else {
            System.out.print(" то он не достиг совершеннолетия");
            System.out.println(", нужно немного подождать");
        }
        //=====================Второе задание ===================
        System.out.println("Задание 2 вариант 1");
        int tempAir=5;
        System.out.print("На улице  "+  tempAir + " градусов");
        if (tempAir <= 5) {
            System.out.println(" Нужно надеть шапку");
        } else {
            System.out.println("Можно идти без шапки");
        }
        System.out.println("Задание 2 вариант 2");
        tempAir=6;
        System.out.print("На улице "+  tempAir + "градусов");
        if (tempAir <= 5) {
            System.out.print(" Нужно надеть шапку");
        } else {
            System.out.println(" Можно идти без шапки");
        }
        //=====================Третье задание ===================
        System.out.println("Третье задание Вариант 1");
        int speed=60;
        System.out.print("Если скорость "+  speed+ " то");
        if (tempAir <= 60) {
            System.out.println(" можно ездить спокойно");
        } else {
            System.out.println("придется заплатить штраф");
        }
        System.out.println("Третье задание Вариант 2");
        speed=61;
        System.out.print("Если скорость "+  speed + " то");
        if (tempAir <= 60) {
            System.out.print("  можно ездить спокойно");
        } else {
            System.out.println("придется заплатить штраф");
        }
        //=====================Четвёртое задание ===================
        System.out.println("Четвертое задание вариант 1");
        byte ageMan=6;
        System.out.print("Если возраст человека="+ageMan+" то  ");
        if (ageMan > 2 && ageMan <= 6) {
            System.out.println("ему нужно ходить в детский сад.");
        }
        if (ageMan >= 7 && ageMan <= 17) {
            System.out.print("ему нужно ходить в школу.");
        }
        if (ageMan >= 18 && ageMan <= 24) {
            System.out.print("его место в университете.");
        }
        if (ageMan > 24) {
            System.out.print("ему пора ходить на работу.");
        }
        System.out.println("Четвертое задание вариант 2");
         ageMan=17;
        System.out.print("Если возраст человека="+ageMan+" то   ");
        if (ageMan > 2 && ageMan <= 6) {
            System.out.print("ему нужно ходить в детский сад.");
        }
        if (ageMan >= 7 && ageMan <= 17) {
            System.out.println("ему нужно ходить в школу.");
        }
        if (ageMan >= 18 && ageMan <= 24) {
            System.out.print("его место в университете.");
        }
        if (ageMan > 24) {
            System.out.print("ему пора ходить на работу.");
        }
        System.out.println("Четвертое задание вариант 3");
         ageMan=24;
        System.out.print("Если возраст человека="+ageMan+" то   ");
        if (ageMan > 2 && ageMan <= 6) {
            System.out.print("ему нужно ходить в детский сад.");
        }
        if (ageMan >= 7 && ageMan <= 17) {
            System.out.print("ему нужно ходить в школу.");
        }
        if (ageMan >= 18 && ageMan <= 24) {
            System.out.println("его место в университете.");
        }
        if (ageMan > 24) {
            System.out.print("ему пора ходить на работу.");
        }
        System.out.println("Четвертое задание вариант 4");
        ageMan=25;
        System.out.print("Если возраст человека="+ageMan+" то   ");
        if (ageMan > 2 && ageMan <= 6) {
            System.out.print("ему нужно ходить в детский сад.");
        }
        if (ageMan >= 7 && ageMan <= 17) {
            System.out.print("ему нужно ходить в школу.");
        }
        if (ageMan >= 18 && ageMan <= 24) {
            System.out.print("в университет");
        }
        if (ageMan > 24) {
            System.out.println("ему пора ходить на работу.");
        }
        System.out.println("******************************** Задание 5******************************");
        System.out.println("Задание 5 вариант 1");
        byte aceChildren=4;
        boolean  bigYes=true;
        System.out.println("Если возраст ребёнка равен "+aceChildren+" то ему" );
        if (aceChildren < 5) {
            System.out.println(" нельзя кататься на аттракционе");
        }
        if ((aceChildren >= 5 && aceChildren < 14) && (bigYes == true)) {
            System.out.println("можно кататься" + " на аттракционе в сопровождении");
        }
        if (aceChildren >= 14) {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задание 5 вариант 2");
         aceChildren=5;
        bigYes = true;
        System.out.println("Если возраст ребёнка равен "+aceChildren+" то ему" );
        if (aceChildren < 5) {
            System.out.println(" нельзя кататься на аттракционе");
        }
        if ((aceChildren >= 5 && aceChildren < 14) && (bigYes == true)) {
            System.out.println("можно кататься" + " на аттракционе в сопровождении взрослого ");
        }
        if (aceChildren >= 14) {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задание 5 вариант 3");
        aceChildren=14;
        bigYes=true;
        System.out.println("Если возраст ребёнка равен "+aceChildren+" то ему" );
        if (aceChildren < 5) {
            System.out.println(" нельзя кататься на аттракционе");
        }
        if ((aceChildren >= 5 && aceChildren < 14) && (bigYes == true)) {
            System.out.println("можно кататься" + " на аттракционе в сопровождении взрослого ");
        }
        if (aceChildren >= 14) {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("******************************** Задание 6******************************");
        System.out.println("Задание 6 вариант 1");
        byte capManVagon=102;
        byte countSitPlace=60;
        byte countStandPlace=42;
        byte countSitPass=40;
        byte countStandPass=40;
        if (capManVagon == countSitPass + countStandPass) {
            System.out.println("Вагон уже полностью забит");
        } else if ((countSitPlace >= countSitPass) || (countStandPlace >= countStandPass)) {
            System.out.println("В вагоне есть места " + "сидящих=" + (countSitPlace - countSitPass) +
                    ";стоящих=" + (countStandPlace - countStandPass));
        }
        System.out.println("Задание 6 вариант 2");
        countSitPass = 60;
        countStandPass=42;
        if (capManVagon == countSitPass + countStandPass) {
            System.out.println("Вагон уже полностью забит");
        } else if ((countSitPlace >= countSitPass) || (countStandPlace >= countStandPass)) {
            System.out.println("В вагоне есть места " +
                    "сидящих=" + (countSitPlace - countSitPass) + ";стоящих=" + (countStandPlace - countStandPass));
        }
        System.out.println("Задание 6 вариант 3");
        countSitPass=50;
        countStandPass=42;
        if (capManVagon == countSitPass + countStandPass) {
            System.out.println("Вагон уже полностью забит");
        } else if ((countSitPlace >= countSitPass) || (countStandPlace >= countStandPass)) {
            System.out.println("В вагоне есть места " +
                    "сидящих=" + (countSitPlace - countSitPass) + ";стоящих=" + (countStandPlace - countStandPass));
        }
        System.out.println("Задание 6 вариант 4");
        countSitPass=60;
        countStandPass=40;
        if (capManVagon == countSitPass + countStandPass) {
            System.out.println("Вагон уже полностью забит");
        } else if ((countSitPlace >= countSitPass) || (countStandPlace >= countStandPass)) {
            System.out.println("В вагоне есть места " +
                    "сидящих=" + (countSitPlace - countSitPass) + ";стоящих=" + (countStandPlace - countStandPass));
        }
    }
}