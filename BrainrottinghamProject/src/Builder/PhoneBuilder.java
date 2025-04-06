package Builder;

public class PhoneBuilder extends AFeature{
    Phone phone;

    public PhoneBuilder(String identifier, String version) {
        this.phone = new Phone(identifier,version);
    }

    @Override
    public AFeature addBattery() {
        this.phone.addBattery = true;
        return this;
    }

    @Override
    public AFeature addAntena() {
        this.phone.addAntena = true;
        return this;
    }

    @Override
    public AFeature addCompass() {
        this.phone.addCompass = true;
        return this;
    }

    @Override
    public AFeature addSpeaker() {
        this.phone.addSpeaker = true;
        return this;
    }

    @Override
    public Phone build() {
        return this.phone;
    }
}
