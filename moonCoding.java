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
        System.out.println("Totla Speed In Meter/Sec: " + totalSpeed);


    }
}