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
        byte a = 127;
        System.out.println(a);
        short b = 32767;
        System.out.println(b);
        int c = 2147483647;
        System.out.println(c);
        long d = 999999999;
        System.out.println(d);
        float e = 2.72f;
        System.out.println(e);
        double f = 3.14;
        System.out.println(f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float g = 27.12f;
        System.out.println(g);
        long h = 987678965549L;
        System.out.println(h);
        double i = 2.786;
        System.out.println(i);
        short j = 569;
        System.out.println(j);
        int k = -159;
        System.out.println(k);
        int l = 27897;
        System.out.println(l);
        byte m = 67;
        System.out.println(m);
    }
    public static void task3 () {
        System.out.println("Задача3");
        int firstClass = 23;
        int secondClass = 27;
        int thirdClass = 30;
        int books = 480;
        int allChild = firstClass + secondClass + thirdClass;
        allChild = books/allChild;
        System.out.println("каждому ученику достанется - " + allChild + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int bottle = 16;
        int time = 2;
        time = bottle/time;
        int fisrtTime = time * 20;
        System.out.println("за 20 минут - " + fisrtTime);
        int secondTIme = time * 720;
        System.out.println("за сутки - " + secondTIme);
        int thirdTime = secondTIme * 3;
        System.out.println("за трое суток - " + thirdTime);
        int month = secondTIme * 30;
        System.out.println("за месяц - " + month);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int white = 2;
        int brown = 4;
        int all = 120;
        int allClasses = all / (white + brown);
        int allWhite = allClasses * white;
        int allBrown = allClasses * brown;
        System.out.println("всего классов - " + allClasses);
        System.out.println("всего банок белой краски - " + allWhite);
        System.out.println("всего банок красной краски - " + allBrown);
    }
    public static void task6(){
        System.out.println("Задача 6");
        int bananaWeght = 80;
        bananaWeght= bananaWeght*5;
        int milkWeight = 105;
        milkWeight= milkWeight*2;
        int iceCreamWeight = 100;
        iceCreamWeight=iceCreamWeight*2;
        int eggWeight = 70;
        eggWeight=eggWeight*4;
        int mealWeight = bananaWeght + milkWeight + iceCreamWeight + eggWeight;
        mealWeight=mealWeight/1000;
        System.out.println("вес завтрака в килограммах - " + mealWeight);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int weight = 7;
        weight=weight*1000;
        int firstDiet = 250;
        int secondDiet = 500;
        int firstDietTrial = weight/firstDiet;
        int secondDietTrial = weight/secondDiet;
        System.out.println("при похудении по 250 грамм в день, всего уйдет - " + firstDietTrial + " дней");
        System.out.println("при похудении по 500 грамм в день, всего уйдет - " + secondDietTrial + " дней");
        int avarageDays = (firstDietTrial + secondDietTrial)/2;
        System.out.println("в среднем уйдет - " + avarageDays + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        float masha = 67760.0f;
        float denis = 83690.0f;
        float christina = 76230.0f;
        float increase = 1.1f;
        masha=masha*12;
        denis=denis*12;
        christina=christina*12;
        float mashaPromotion= masha*increase;
        float deisPromotion = denis*increase;
        float christinaPromotion = christina*increase;
        float mashaDifference = (masha*increase)-masha;
        float denisDifference = (denis*increase)-denis;
        float christinaDifference= (christina*increase)-christina;
        System.out.println("Маша теперь получает " + mashaPromotion + " рублей в год. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + deisPromotion + " рублей в год. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + christinaPromotion + " рублей в год. Годовой доход вырос на " + christinaDifference + " рублей");
    }
}