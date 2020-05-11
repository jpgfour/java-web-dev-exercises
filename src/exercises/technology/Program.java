package exercises.technology;

public class Program {

    public static void main(String[] args){

        Smartphone sweet6S = new Smartphone("Sweet 6s","Apple","6s","iOS",9,24,"Verizon",1200,99.99);
        sweet6S.changePhonePlan("Verizon",2000,129.99);
        System.out.println(sweet6S.getMonthlyCharge());
        System.out.println(sweet6S.generateUUID());

        Laptop jeremysLaptop = new Laptop("Jeremy's Laptop","MSI","Dragon Something","Windows 8", 17,4);
        jeremysLaptop.chargeUp();
        System.out.println(jeremysLaptop.getPercentCharged());
        System.out.println(jeremysLaptop.generateUUID());

        Computer jeremysDesktop = new Computer("Jeremy's Desktop","HP","Omen Something","Windows 10");
        jeremysDesktop.bootUp();
        System.out.println(jeremysDesktop.isOnline());
        System.out.println(jeremysDesktop.generateUUID());

    }
}
