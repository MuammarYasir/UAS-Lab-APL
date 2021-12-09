package Adapter;

//Merupakan sebuah class interface yang berisikan Method-Method untuk digunakan pada Class lain
public interface AdvancedMediaPlayer {	

   //method yang akan di ovveride pada class class yang diperlukan
   public void playVlc(String fileName);
   public void playMp4(String fileName);
}