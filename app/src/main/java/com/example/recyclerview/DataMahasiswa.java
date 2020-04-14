package com.example.recyclerview;

public class DataMahasiswa {
    public static class Mahasiswa {

        private String nama;
        private String nim;
        private String nohp;

        public Mahasiswa(String nama, String nim, String nohp) {
            this.nama = nama;
            this.nim = nim;
            this.nohp = nohp;

        }

        public String getNama() {
            return nama;
        }


        public String getNim() {
            return nim;
        }


        public String getNohp() {
            return nohp;
        }
    }
}
