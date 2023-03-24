public class Cola extends Napoje{
    private double Ilosc_litrow;

    public Cola(String nazwa) {
        super(nazwa);
    }

    public void zlamany_paznokiec(){
        System.out.println("zlamany paznokiec przez cole");
    }





    public double getIlosc_litrow() {
        return Ilosc_litrow;
    }

    public void setIlosc_litrow(double ilosc_litrow) {
        Ilosc_litrow = ilosc_litrow;
    }
}
