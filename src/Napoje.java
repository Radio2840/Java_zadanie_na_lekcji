public abstract class Napoje {
    private String Nazwa;

    public Napoje(String nazwa) {
        Nazwa = nazwa;
    }

    public void pij(){
        System.out.println("Pije wypijam i wypilam");
    }

    public String getNazwa() {
        return Nazwa;
    }


}
