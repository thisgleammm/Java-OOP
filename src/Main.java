// Membuat Class Sebagai Template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

// Class dengan constructor
class Mahasiswi {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;

    //Counstuctor dipanggil saat object pertama kali dibuat
    // Mahasiswi(){
    //     System.out.println("Ini adalah constructor");
    // }

    //Constructor dengan parameter
    Mahasiswi(String inputNama, String inputNIM, String inputjurusan, double inputIPK, int inputumur){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputjurusan;
        IPK = inputIPK;
        umur = inputumur;
    }

}

public class Main {
    public static void main(String[] args) throws Exception {
        // Membuat Object dari Class
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Gleam";
        mahasiswa1.NIM = "123456789";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 3.5;
        mahasiswa1.umur = 20;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Aan";
        mahasiswa2.NIM = "987654321";
        mahasiswa2.jurusan = "Teknik Teknikan";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 32;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);

        //Constructor
        Mahasiswi mahasiswi1 = new Mahasiswi("juju", "123456789", "Teknik Informatika", 3.5, 20);
        Mahasiswi mahasiswi2 = new Mahasiswi("jeje", "987654321", "Teknik Teknikan", 3.5, 32);
        System.out.println(mahasiswi1.nama);
        System.out.println(mahasiswi2.nama);
    }
}
