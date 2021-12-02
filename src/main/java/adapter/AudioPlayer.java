package adapter;

public class AudioPlayer implements MediaPlayer{
    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName){
        //inbuilt support to play mp3
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("mp3: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        }
        else {
            System.out.println("invalid");
        }

    }
}
