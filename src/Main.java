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
    // Data member
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;

    //Counstuctor tanpa parameter
    // Mahasiswi(){
    //     System.out.println("Ini adalah constructor");
    // }

    //Constructor dengan parameter
    Mahasiswi(String nama, String NIM, String jurusan, double IPK, int umur){
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.IPK = IPK;
        this.umur = umur;
    }
    
    //Method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
        System.out.println("Jurusan : " + this.jurusan);
        System.out.println("IPK : " + this.IPK);
        System.out.println("Umur : " + this.umur);
    }

    //Method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    //method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
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

        //Constructor
        Mahasiswi mahasiswi1 = new Mahasiswi("juju", "123456789", "Teknik Informatika", 3.5, 20);
        Mahasiswi mahasiswi2 = new Mahasiswi("jeje", "987654321", "Teknik Teknikan", 3.5, 32);
        System.out.println(mahasiswi1.nama);
        System.out.println(mahasiswi2.nama);

        //Method
        mahasiswi1.show();
        mahasiswi1.setNama("Cici");
        mahasiswi1.show();

        System.out.println(mahasiswi1.getNama());
        System.out.println(mahasiswi1.getNIM());

        String data = mahasiswi1.sayHi("Hai");
        System.out.println(data);
    }
}
