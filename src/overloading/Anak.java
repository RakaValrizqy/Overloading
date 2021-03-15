package overloading;
public class Anak extends Induk { // menjadikan class Anak sebagai subclass dari class Induk
    //membuat method hitung volume kubus dengan 1 variabel di dalam parameter
    public void hitung (int s){
        System.out.println("Volume kubus adalah : "+(s*s*s));
    }
    //membuat method hitung volume balok dengan 3 variabel di dalam parameter
    public void hitung (int p, int l, int t){
        System.out.println("Volume balok adalah : "+(p*l*t));
    }
}
