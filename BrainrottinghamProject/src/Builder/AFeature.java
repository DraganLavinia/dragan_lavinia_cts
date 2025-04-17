package Builder;

public abstract class AFeature {
    public abstract AFeature addBattery();
    public abstract AFeature addAntena();
    public abstract AFeature addCompass();
    public abstract AFeature addSpeaker();

    public abstract Phone build();
}
