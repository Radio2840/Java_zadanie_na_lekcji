public class Woda extends Napoje {


    private String Marka;
    private double Ilosc_w_litrach;
    private Boolean Czy_gazowana;

    public Woda(String nazwa) {
        super(nazwa);
    }


    public void zdarta_skora(){
        System.out.println("Zdarta skora przez korek od wody");
    }
    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public double getIlosc_w_litrach() {
        return Ilosc_w_litrach;
    }

    public void setIlosc_w_litrach(double ilosc_w_litrach) {
        Ilosc_w_litrach = ilosc_w_litrach;
    }

    public Boolean getCzy_gazowana() {
        return Czy_gazowana;
    }

    public void setCzy_gazowana(Boolean czy_gazowana) {
        Czy_gazowana = czy_gazowana;
    }
}
