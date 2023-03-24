public class Monster extends Napoje{

    private String Smak;

    public Monster(String nazwa) {
        super(nazwa);
    }

    public void zlamany_paznokiec(){
        System.out.println("zlamany paznokiec przez Monsterka");
    }


    public String getSmak() {
        return Smak;
    }

    public void setSmak(String smak) {
        Smak = smak;
    }
}
