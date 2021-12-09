package Adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

   //Method yang akan mengoverride method yang ada pada class AdvancedMediaPlayer
   @Override
   public void playVlc(String fileName) {
      System.out.println("Memutar Lagu Dengan VLC. Nama Lagu: "+ fileName);		
   }

   //Method yang akan mengoverride method yang ada pada class AdvancedMediaPlayer
   @Override
   public void playMp4(String fileName) {
   }
}