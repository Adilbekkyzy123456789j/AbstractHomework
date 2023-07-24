public class Main {
    public static void main(String[] args) {

        Sheep sheep = new Sheep(43,5,"M","Sheep");
        Sheep sheep1 = new Sheep(43,5,"M","Sheep");
        Sheep sheep2 = new Sheep(43,5,"M","Sheep");
        Sheep []sheeps= new Sheep[]{sheep,sheep1,sheep2};
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);

       Cow cow = new Cow (67,8,"M","Cow");
       Cow cow1 = new Cow (67,8,"M","Cow");
       Cow cow2 = new Cow (67,8,"M","Cow");
       Cow cow3 = new Cow (67,8,"M","Cow");
       Cow cow4 = new Cow (67,8,"M","Cow");
       Cow [] cows = new Cow[]{cow,cow1,cow2,cow3,cow4};
        System.out.println(cow);
        System.out.println(cow1);
        System.out.println(cow2);
        System.out.println(cow3);
        System.out.println(cow4);


       Horse horse = new Horse(178,9,"M","Horse");
       Horse horse1 = new Horse(178,9,"M","Horse");
       Horse horse2 = new Horse(178,9,"M","Horse");
       Horse [] horses = new Horse[]{horse,horse1,horse2};
        System.out.println(horse);
        System.out.println(horse1);
        System.out.println(horse2);

       Fam fam = new Fam("Moscow",cows,horses,sheeps,"Iskender");
       Fam fam1 = new Fam("Kyrgyzstan",new Cow[]{cow},new Horse[]{horse},
               new Sheep[]{sheep},"Myrza");

        System.out.println(fam);
        System.out.println(fam1);
    }


    }







