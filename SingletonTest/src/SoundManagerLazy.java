public class SoundManagerLazy implements ISoundManager{

    //cel mai folosit, se creaza la cerere, costistor de creat, dar nu fol multe resurse

    private static SoundManagerLazy instance = null;

    private SoundManagerLazy() {}

    public SoundManagerLazy getInstance(){
        if(instance == null){
            instance = new SoundManagerLazy();
        }
        return instance;
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void playSound(boolean play) {

    }
}
