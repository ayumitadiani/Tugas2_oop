package tugas2;

/**
 *
 * @author Mita Diani 20103207
 */
public class HitungVolume {
    /*
    Volume balok = Panjang * Lebar * Tinggi
    Volume Float/Double
    Panjang: float/double
    Lebar: float/double
    Tinggi: float/double
    */
    private double panjang;
    private double lebar;
    private double tinggi;
    double Volume;
    
    /*
    Method setPj
    Parameter: double NPJ
    Untuk set nilai ke propery/Atribut panjang
    */
    public void setPj(double NPJ){
        this.panjang = NPJ;
    }
    
    /*
    Method setLb
    Parameter: double NLB
    Untuk set nilai ke propery/Atribut lebar
    */
    public void setLb(double NLB){
        this.lebar = NLB;
    }
   
    /*
    Method setTg
    Parameter: double NTG
    Untuk set nilai ke propery/Atribut tinggi
    */
    public void setTg(double NTG){
        this.tinggi = NTG;
    }
 
    /*
    Method double VolumeBalok
    Parameter: -
    digunakan untuk menghitung volume balok
    */
    private double VolumeBalok(){
        this.Volume = this.panjang * this.lebar * this.tinggi;
        return this.Volume;
    }
    
    /*
    Method: PrintHasil
    Parameter: -
    digunakan untuk menampilkan hasil proses hitung Volume Balok
    */
    public void PrintHasil(){
        this.VolumeBalok();
        System.out.println("Hitung Volume Balok");
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nilai Panjang   : "+this.panjang+" m");
        System.out.println("Nilai Lebar     : "+this.lebar+" m");
        System.out.println("Nilai Tinggi    : "+this.tinggi+" m");
        System.out.println("Jadi Volumenya  : "+this.Volume+" m³");
    }
}