import java.util.Scanner;
import Adapter.*;
import Strategy.*;

public class Main {
   public static void main(String[] args) {

      System.out.println("Selamat Datang di Radio Play Music 079");

      System.out.println("=====================");
      System.out.println("Pilih Media");
      System.out.println("- Mp4");
      System.out.println("- VLC");
      System.out.println("=====================");
      Scanner in = new Scanner(System.in);
      System.out.print("Input Media : ");
      String media = in.next();
      System.out.println("=====================");
      System.out.println("Media Yang dipilih : " + media);

      AudioPlayer audioPlayer = new AudioPlayer();
      Player p = null;
      p = new Player();

      if( "Mp4".equalsIgnoreCase(media)){
         p.setPlayMethod(new PlayerMp4());
         p.playMusic();
         audioPlayer.play("mp4", "river flow in you.mp4");

      }else if("VLC".equalsIgnoreCase(media)){
         p.setPlayMethod(new PlayerVLC());
         p.playMusic();
         audioPlayer.play("vlc", "the river.vlc");
      }
   }
}