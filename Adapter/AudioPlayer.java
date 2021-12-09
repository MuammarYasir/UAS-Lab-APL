package Adapter;

public class AudioPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter; 

   //Method yang akan mengoverride method yang ada pada class MediaPlayer
   @Override
   public void play(String audioType, String fileName) {		
      
      //mediaAdapter menyediakan dukungan untuk memutar mp4 atau vlc
      if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }
      
      else{
         System.out.println("Media Tidak Sesuai yang Tersedia" + audioType);
      }
   }   
}