import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound{
    private AudioInputStream dogescreaming;
    private Clip mainClip;
     public Sound(){
          try{
              dogescreaming =
              AudioSystem.getAudioInputStream(getClass().getResource("background.wav"));
              mainClip = AudioSystem.getClip();
              mainClip.open(dogescreaming);
            }
           catch(Exception ex){
               
            }
        }
     public void play(){
         mainClip.setFramePosition(0);
         mainClip.loop(Clip.LOOP_CONTINUOUSLY);
         
         
        }
        public void stop(){
         
         mainClip.stop();
         
         
        }
    
}