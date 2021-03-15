//Saya akan menerapkan Overloading dengan membuat program penghitung volume kubus dan balok
package overloading;
public class Main {
    public static void main(String[] args) {
        //membuat objek dari class Anak
        Anak volume = new Anak();
        
        //memanggil method penghitung volume kubus
        volume.hitung(10);
        
        //memanggil method penghitung volume balok
        volume.hitung(5, 4, 10);
    }
    
}
