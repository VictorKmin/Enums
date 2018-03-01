public class Main {
    public static void main(String[] args) {
//        Створити класс Компьютер з полями
//                - модель
//                - рік випуску
//                - об'єм пам'яті
//                - ціна
//           - Жорсткий диск (Класс з полями)
//                - Модель жорсткого диску
//                - Тип (ссд або хдд)
//                - об'єм жорсткого диску
//           - Країна виробник (Енуми. Китай, Корея, Індія, США)
//           - Процессор(Класс)
//                -кількість ядер
//                -частота
//                -виробник (Енуми ті самі країни)
//
//        Створити список з 20 об'єктів.
//
//        Далі
//        1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник Китай
//        3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник не Китай
//        4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
//        5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
//        6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7 посортувати за ціною

        CProcessor IntelCore3 = new CProcessor(3,2.7, CountryProducer.USA);
        CProcessor SomeAMD = new CProcessor(5,3.3,CountryProducer.CHINA);
        CProcessor IntelCore7 = new CProcessor(7,4.5,CountryProducer.JAPAN);
        CProcessor BetterAMD = new CProcessor(7, 3.5,CountryProducer.CHINA);
        CProcessor BadCorei5 = new CProcessor(4,1.3,CountryProducer.CHINA);

        Hard BadHrad = new Hard("SunHuy", 250,HardType.HDD);
        Hard BetterHard = new Hard("Givi", 600, HardType.HDD);
        Hard JustOneHard = new Hard("Intel", 1024,HardType.HDD);
        Hard GoodHard = new Hard("Megatron", 2048,HardType.SSD);
        Hard IntelHard = new Hard("Intel", 900,HardType.SSD);

        Computer IntelSlim = new Computer
        ("Intel SuperSlim", 2015,16,700,IntelHard,CountryProducer.EUROPE,IntelCore3);
        Computer DellInspiron = new Computer
        ("Dell Inspiron",2016,4,500,JustOneHard,CountryProducer.USA, IntelCore3);
        Computer ZXSpectrum = new Computer
        ("ZX", 1980, 1,1000,BadHrad, CountryProducer.EUROPE, SomeAMD);
        Computer HP2350 = new Computer
        ("HP 2350",2000,8,400,BadHrad, CountryProducer.CHINA,IntelCore7 );
        Computer LenovoIsBad = new Computer
        ("LonovoisBad",2018,1,100,JustOneHard, CountryProducer.CHINA, BadCorei5);
        Computer DellSlim = new Computer
        ("Dell Slim",2015,16,700,GoodHard,CountryProducer.JAPAN, IntelCore7);
        Computer LonovoAlwaysBad = new Computer
        ("OtherLenovo",2000,2,200,BetterHard, CountryProducer.JAPAN, BadCorei5);
        Computer SomeHP = new Computer
        ("LenovoMegaPro5000",2020,96,200,GoodHard, CountryProducer.CHINA, BetterAMD);
        Computer MacBook = new Computer
        ("AppleBook",2006,1,5000,IntelHard, CountryProducer.EUROPE, IntelCore3);
        Computer MacBookPro = new Computer
        ("Apple",2018,4,5000,JustOneHard, CountryProducer.USA, IntelCore3);
        Computer SamsungAndromeda = new Computer
        ("SamsungAndromeda",2019,48,1000,GoodHard, CountryProducer.EUROPE, IntelCore7);
        Computer Hiomi = new Computer
        ("Hiomi",2015,6,300,BetterHard,CountryProducer.CHINA,SomeAMD);
        Computer Huaway = new Computer
        ("Huaway",2017,12,600,IntelHard,CountryProducer.USA,BetterAMD);
    }
}