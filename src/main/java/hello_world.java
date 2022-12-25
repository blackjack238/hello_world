package main.java;


import java.util.Arrays;
import java.util.Collections;
import java.util.*;

import java.util.*;
import java.util.*;

import java.util.*;




class NumberTranslator{

    public int translate(String romanNumber){
        String a1=romanNumber.toUpperCase();
        String f=a1.trim();
        String j=f.replace(" ","");
        int a;
        switch(j){
            case "I":
                a=1;
                break;
            case "II":
                a=2;
                break;
            case "III":
                a=3;
                break;
            case "IV":
                a=4;
                break;
            case "V":
                a=5;
                break;
            case "VI":
                a=6;
                break;
            case "VII":
                a=7;
                break;
            case "VIII":
                a=8;
                break;
            case "IX":
                a=9;
                break;
            case "X":
                a=10;
                break;
            case "XI":
                a=11;
                break;
            case "XII":
                a=12;
                break;
            default:
                a=-1;
        }
        return a;
    }
    public static void main(String[] args) {
        NumberTranslator a = new NumberTranslator();

        System.out.println(a.translate(" X I"));
    }}


/*class QuadraticEquationSolver{

    public double[] solve(int a, int b, int c){
        double D=(b*b)-4*a*c;
        double[] x=new double[3];
        double x2= (-1*b+Math.sqrt(D))/(2*a);
        double x1=(-1*b-Math.sqrt(D))/(2*a);
        if(D>0){
            x=new double[2];
            x[0]=x2;
            x[1]=x1;
        }else if(D==0){
            x=new double[1];
            x[0]=x2;
        }else if(D<0){
            x=new double[0];
        }
        return x;
    }

    public static void main(String[] args) {
        QuadraticEquationSolver ship = new QuadraticEquationSolver();
        System.out.println(Arrays.toString(ship.solve(9,-54,81)));
    }


}*/






/*
 class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[] {"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[] {"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[] {"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;

        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }

        return count * price;
    }

    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }

        return firstDigit * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        }

        int extraDistance = distance - 1000;
        return 1000 + extraDistance * 5;
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int speed1 = scanner.nextInt();
        int speed2 = scanner.nextInt();
        int speed3 = scanner.nextInt();

        int max = speed1;
        if (speed2 > max) {
            max = speed2;
        }
        if (speed3 > max) {
            max = speed3;
        }

        float coeff = 0.7f;
        if (max < 10) {
            coeff = 0.7f;
        } else if (max > 10 && max < 100) {
            coeff = 1.2f;
        } else {
            coeff = 2.1f;
        }

        float maxPower = (float) max * coeff;
        System.out.println(maxPower);
        scanner.close();
    }

    public String getMyPrizes(int ticket) {
        String result = "";
        if (ticket % 10 == 0) {
            result += "crystall";
        }

        if (ticket % 10 == 7) {
            result += " chip";
        }

        if (ticket > 200) {
            result += " coin";
        }

        return result.strip();
    }public boolean isHangarOk(int side1, int side2, int price){
        int S=side1*side2;
        int D=price/S;
        int max = side1;

        int a=2;
        boolean res=true;
        if (side2 > max) {
            max = side2;
            a=side1;
        }else{a=side2;}
         int es = max/2;
        if(S<1500||es>a||D>1000){
            res=false;
        }
        return res;
    }

    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(1001));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        ship.calculateMaxPower();

        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(250));

        //Should be true
        System.out.println(ship.isHangarOk(62, 180, 2243160 ));
    }
}*/
/*public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[] {"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[] {"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[] {"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;

        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }

        return count * price;
    }public int roundSpeed(int speed){
        if(speed>=10){
             speed=10;
        } else if(speed>=15){
             speed=20;

        } else if(speed>=25){
             speed=30;
        }
else if(speed>=35){
             speed=40;
        } else if(speed>=45){
             speed=50;
        } else if(speed>=55){
             speed=60;
        } else if(speed>=65){
             speed=70;
        } else if(speed>=75){
             speed=80;
        } else if(speed>=85&&speed<=90){
            speed=90;
        }
return speed;
    }








    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));
    }
}*/

/* метод підставки другог числа з двух значних чисел
 public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }

        return firstDigit * 10;
    }


*/

/*
 class HarekDataMaker {
    public String aggregateSingle(String name, String age, String planet){

        String res="name - "+name+", age - "+age+", planet - "+planet;
        return res;

    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets){
        String [] a=new String [3];
        a[0]=aggregateSingle(names[0],Integer.toString(ages[0]),planets[0]);
        a[1]=aggregateSingle(names[1],Integer.toString(ages[1]),planets[1]);
        a[2]=aggregateSingle(names[2],Integer.toString(ages[2]),planets[2]);
        return a;
    }
    public static void main(String[] args) {
        String[] names = new String[] {"hter", "pou", "diz"};
        int[] ages = new int[] {30, 35, 70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};

        HarekDataMaker harekDataMaker = new HarekDataMaker();

        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
        System.out.println("###");
        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));
    }
}*/

 /*class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }
    public void changeElectResult(String[] results){
        String a=results[0];
        results[0]=results[results.length - 1];
        results[results.length - 1]=a;
        String[] results1=Arrays.copyOf(results,3);
    }//метод виведення певних індексів масива;
    public String[] changeElectResultAgain(String[] results) {
        return new String[] {
                results[2],
                results[3],
                results[4]
        };
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public static void main(String[] args) {
        String[] results = new String[]{"miho", "hut"};
        new HarekCity().changeElectResult(results);
        System.out.println(Arrays.toString(results));
    }
}*/








 /*class PassportFormCreator {
    public void createForms(){
        Scanner scanner = new Scanner(System.in);
            String name =scanner.nextLine();
            String lastname =scanner.nextLine();
            int age =scanner.nextInt();
            int age1=age*10;
            System.out.println(name+" "+lastname+" "+age1);
            System.out.println(name.toUpperCase());
            System.out.println(lastname.toUpperCase());
            System.out.println(age1);
            scanner.close();

        }



        public static void main(String[] args) {
            new PassportFormCreator().createForms();
        }
    }*/







/*
public class hello_world {public static void main(String[] args) {
 /*int a = 1;
 int f = 3;
 System.out.println("a="+ a);
 System.out.println("f=" +f);
  int c = 1-10;
  int d= 3+10;
  System.out.println("c="+c);
  System.out.println("d="+d);
double ad = 15.0/10.0;
int ag = (int) ad;

  System.out.println(ad);
  System.out.println(ag);
  int k = 10 % 5;
  System.out.println(k);*/
 /* int x =0;
  x= x+1;
  x=x+4;
  System.out.println(x);
  double y=0;
  y+=1.32/2;
  y*=2.3452+0.234;
  System.out.println(y);
double ya=1;

ya+=1*1934;
  ya%=42.0;
  System.out.println(ya);
*/
  /*int a = 2111532;
int b=21114143;

  System.out.println(a);
  System.out.println(a<b);
  System.out.println(a!=b);*/
 /* boolean a= true;
  boolean b=false;
  System.out.println(!a);
  System.out.println(!b);
  System.out.println(a&&b);
  System.out.println(a||b);
  b= true;
  System.out.println(a^b);*/
//boolean result = getTrue()|getFalse();
 /* long  longerThanLife = 2147483647;
  char codeName70 ='70';
  System.out.println(codeName70);
}
}*/
/**/
/*
public class MarsEarthHelper {
  public int convertAppleCount(float count) {
    return (int) count;
  }

  public byte countAppleCount(int garden1Count, int garden2Count) {
    return (byte)(garden1Count+garden2Count);
  }

  public static void main(String[] args) {
    MarsEarthHelper helper = new MarsEarthHelper();

    //Should be 10
    System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));

    //Should be 17
    System.out.println("countAppleCount(10, 7) = " + helper.countAppleCount(10, 7));
  }
}*//*
 class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        String lowerCaseName = name.toLowerCase();
        return lowerCaseName.contains("a") || lowerCaseName.contains("o");
    }
    public String getNameCode(String name){
       String code = name.charAt(0) + String.valueOf( name.charAt(name.length() - 1));
    }
    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        //Should be BA
        String nameCode = names.getNameCode("x");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);
    }
}*//*
 public String makeNamePositive(String name) {
        return name
                .replace("no", "yes")
                .replace("No", "yes")
                .replace("nO", "yes")
                .replace("NO", "yes");
    }*//*неправильно
class NameEncoderDecoder{
    public String encode(String name){
        String a="NOTFORYOU";
        String f="YESNOTFORYOU";
        String h=name
                .replace("e","1")
                .replace("u","2")
                .replace("i","3")
                .replace("o","4")
                .replace("a","5");
        return a+h+f;
    }
    public String decode(String name){
        int a=name.length()-16;
        int f=name.length()-1;
        String j=name
                .replace(name.substring(0,9),"")
                .replace ( "YES","");

        String k= j
                .replace("1","e")
                .replace("2","u")
                .replace("3","i")
                .replace("4","o")
                .replace("5","a");

        return k;

    }

    public static void main(String[] args) {
        NameEncoderDecoder names = new NameEncoderDecoder();
        String ecoden=names.encode("Crab");
        System.out.println(ecoden);
        String decoden=names.decode("NOTFORYOUCr5bYESNOTFORYOU");
        System.out.println(decoden);

    }}*/
/*class Firstoperation{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int x =1;
        int y = 2;
        int u= x+y;
        System.out.println("hi.chose option 1/2");
        int answer =scanner.nextInt();

        if(answer==1)
        {
            System.out.println("please enter information");
            System.out.println("input you email");
            String ed = scanner.nextLine();//заглушка
            String email =scanner.nextLine();
            System.out.println("put your name");
            String name=scanner.nextLine();
            System.out.println("put your age");
            int age =scanner.nextInt();
            System.out.println("your email is "+email);
            System.out.println("your name is "+name);
            System.out.println("your age is "+age);
            scanner.close();

        }else if(answer==2){
            System.out.println("thank you for your atention");
        }else {System.out.println("wrong answer");}



*/

        //matrix example
/*        int[][] matrix= new int[4][2];

matrix[0][0]=1;
        matrix[1][0]=1;
        matrix[0][1]=1;
        matrix[1][1]=1;
        matrix[2][0]=1;
        matrix[0][2]=1;
        matrix[2][2]=1;
        matrix[3][0]=1;
        matrix[0][3]=1;
        matrix[3][3]=1;
        char [][] a=new char[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
}

*/




        // arrays example
        /*char[ ] arraymat=new char[]{'1','2','3','4'};


        System.out.println(Arrays.toString(arraymat));

        int[] array= new int[]{1,2,3,4,5,6};



        System.out.println(Arrays.toString(array));
*/

        //boolean rb= getRandomBoolean();


//int ri =getRandomInt();
/*if(ri>=18){
    System.out.println("adult content");

} else if(ri >=14) {
    System.out.println("no adult content");
    }else{
    System.out.println("no access");
}*/
      /*  switch (ri){
            case 1:
                System.out.println("option number 1");
                break;
            case 2:
                System.out.println("option number 2");
                break;
            case 3:
                System.out.println("option number 3");
                break;
            default:
                System.out.println(":(");
        }*/

    //}

/*public static boolean getRandomBoolean(){
    Random random = new Random();
    return  random.nextBoolean();


}
public static int getRandomInt(){
        Random randomint= new Random();
        return randomint.nextInt(0,4);
}*/
//}