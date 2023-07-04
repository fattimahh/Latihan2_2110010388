package kampus;

public class DosenBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Dosen fatimah = new Dosen(8,8);
        
        System.out.println("Nidn: "+fatimah.setNidn());
        System.out.println("Nama: "+fatimah.setNama());
        System.out.println("MataKuliah: "+fatimah.setMataKuliah());
}
}
