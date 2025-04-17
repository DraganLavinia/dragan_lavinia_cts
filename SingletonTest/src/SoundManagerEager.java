public class SoundManagerEager implements ISoundManager{

// incarcare la startup, costisitor de memorie
    private static final SoundManagerEager instance = new SoundManagerEager();
    private int volume;

    private SoundManagerEager() {
        this.volume = 0; //default
    }

    public static SoundManagerEager getInstance(){
        return  instance;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Set volume to: " + volume);
    }

    @Override
    public void playSound(boolean play) {
        if(play == true){
            System.out.println("Sound is playing at volume " + volume);
        }
        else {
            System.out.println("Tap to play");
        }
    }
}
