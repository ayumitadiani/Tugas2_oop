package tugas2;

/**
 *
 * @author Mita Diani 20103207
 */
public class Tugas2 {
    public static void main(String[] args) {
        
        // membuat objek vbalok dari class HitungVolume
        HitungVolume vbalok = new HitungVolume();
        
        // set nilai ke propery
        vbalok.setPj(10);
        vbalok.setLb(8);
        vbalok.setTg(6);
        
        // mmethod tampilkan hasil
        vbalok.PrintHasil();
    } 
}