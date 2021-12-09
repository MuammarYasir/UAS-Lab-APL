package Adapter;

public class Mp4Player implements AdvancedMediaPlayer{

   //Method yang akan mengoverride method yang ada pada class AdvancedMediaPlayer
   @Override
   public void playVlc(String fileName) {
   }

   //Method yang akan mengoverride method yang ada pada class AdvancedMediaPlayer
   @Override
   public void playMp4(String fileName) {
      System.out.println("Memutar Lagu Dengan Mp4. Nama Lagu: "+ fileName);		
   }
}