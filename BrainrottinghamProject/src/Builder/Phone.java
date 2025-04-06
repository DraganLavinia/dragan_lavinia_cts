package Builder;

public class Phone {
    String identifier;
    String version;

    boolean addBattery;
    boolean addAntena;
    boolean addCompass;
    boolean addSpeaker;


    public Phone(String identifier, String version) {
        this.identifier = identifier;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "identifier='" + identifier + '\'' +
                ", version='" + version + '\'' +
                ", addBattery=" + addBattery +
                ", addAntena=" + addAntena +
                ", addCompass=" + addCompass +
                ", addSpeaker=" + addSpeaker +
                '}';
    }
}
