public class moonCoding
{
    public static void main(String[] args)
    {
        double moonDist = 380000;
        double kmSec = 10;
        double kmHour = kmSec * 3600;
        double time = moonDist / kmHour;
        System.out.println("Travel Without Gravity In Hours: " + time);
        
        double hSpeed = 2000;
        double vSpeed = 3000;
        double total = hSpeed*hSpeed + vSpeed*vSpeed;
        double totalSpeed = Math.sqrt(total);
        System.out.println("Total Speed In Meter/Sec: " + totalSpeed);

        double radius = 1731 * 1000;
        double sArea = 4*3.14*radius*radius;
        double sVolume = sArea * 0.001;
        double density = 3000;
        double regolith = sVolume * density / 1000;
        double water = 0.25 * regolith;
        System.out.println("A: " + sVolume);
        System.out.println("B: " + regolith);
        System.out.println("C: " + water);
    }
}