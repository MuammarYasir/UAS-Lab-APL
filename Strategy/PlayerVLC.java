package Strategy;

//Class yang akan mengimplementasi class PlayerMethod
public class PlayerVLC implements PlayerMethod{

    //Implementasi method yang ada pada PlayerMethod
    public void playMusic(){
        System.out.println("Memutarkan Music Menggunakan VLC Player");
    }
}