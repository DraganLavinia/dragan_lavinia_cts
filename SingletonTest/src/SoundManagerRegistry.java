import java.util.HashMap;

public class SoundManagerRegistry implements ISoundManager{

    //pentru fiecare string avem o instanta unica
   private static HashMap<String, SoundManagerRegistry> instances = new HashMap<>();
   protected String type;

    private SoundManagerRegistry(String type) {
        this.type = type;
    }

    public static SoundManagerRegistry getInstance(String type){
        SoundManagerRegistry instance = instances.get(type);
        if(instance == null){
            instance = new SoundManagerRegistry(type);
            instances.put(type,instance);
        }
        return instance;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SoundManagerRegistry clone(){
        SoundManagerRegistry clone = new SoundManagerRegistry("");
        return clone;
    }

    @Override
    public String toString() {
        return "SoundManagerRegistry{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void playSound(boolean play) {

    }
}
