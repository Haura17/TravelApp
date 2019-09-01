package com.haurasalsabila.travelapp;

import java.util.ArrayList;

public class TravelData {

    public static String[][] data = new String[][] {
            {"Pulau Komodo",
                    "Pulau Komodo masuk dalam kawasan Taman Nasional Komodo bersama pulau-pulau lain di sekitar Kepulauan Nusa Tenggara. Pada tahun 1986, UNESCO menetapkan tempat wisata di Indonesia ini sebagai salah satu situs warisan dunia. Pulau ini dianggap sebagai habitat binatang komodo yang wajib dilindungi","http://anekatempatwisata.com/wp-content/uploads/2014/10/Pantai-Pink-Pulau-Komodo.jpg"},
            {"Trio Gili","Trio Gili merupakan tiga pulau cantik yang ada di Lombok. Ketiga pulau tersebut antara lain Gili Trawangan, Gili Meno dan Gili Air. Ketiganya tak hanya dikenal oleh wisatawan domestik, tapi juga telah berhasil mengundang banyak wisatawan mancanegara untuk datang","http://anekatempatwisata.com/wp-content/uploads/2014/10/Gili-Lombok.jpg"},
            {"Raja Ampat","Raja Ampat menjadi primadona baru di dunia pariwisata Indonesia. Pesona tempat wisata di Indonesia ini mulai banyak dikenal baik oleh wisatawan domestik maupun mancanegara","http://anekatempatwisata.com/wp-content/uploads/2014/10/Raja-Ampat.jpg"},
            {"Danau Sentani","Danau Sentani disebut sebagai danau terbesar dengan di Papua. Tak mengherankan memang, karena danau ini memiliki luas sekitar 9.360 hektar dan berada di ketinggian 75 meter di atas permukaan laut","http://anekatempatwisata.com/wp-content/uploads/2014/10/Danau-Sentani.jpg"},
            {"Bali","Siapa tak mengenal Bali? Sulit untuk memilih tempat wisata apa yang paling menarik di Bali, karena hampir seluruh penjuru Bali adalah tempat wisata yang luar biasa","http://anekatempatwisata.com/wp-content/uploads/2014/10/Bali.jpg"},
            {"Taman Laut Bunaken","Taman Laut Bunaken menjadi salah satu tempat wisata di Indonesia yang lagi-lagi ditetapkan UNESCO sebagai situs warisan dunia, tepatnya pada tahun 2005","http://anekatempatwisata.com/wp-content/uploads/2014/10/Taman-Laut-Bunaken.jpg"},
            {"Puncak Jayawijaya","Puncak Jayawijaya atau yang biasa disebut dengan Puncak Carstensz adalah satu-satunya puncak gunung di Indonesia yang memiliki salju abadi","http://anekatempatwisata.com/wp-content/uploads/2014/10/Puncak-Jayawijaya.jpg"},
            {"Tana Toraja","Tana Toraja memiliki keindahan alam yang luar biasa mulai dari deretan pegunungan dan hijau perbukitannya. Selain kaya akan alamnya, tempat wisata d Indonesia ini juga kaya akan budaya leluhur yang masih dijaga sampai saat ini","http://anekatempatwisata.com/wp-content/uploads/2014/10/Tana-Toraja.jpg"},
            {"Candi Borobudur","Candi Borobudur merupakan kompleks candi Buddha terbesar di dunia. Tempat wisata di Indonesia ini ditetapkan UNESCO sebagai salah satu situs warisan dunia pada tahun 1991","http://anekatempatwisata.com/wp-content/uploads/2014/10/Candi-Borobudur.jpg"},
            {"Taman Mini Indonesia Indah","Jika biasanya Anda bisa mengunjungi sebuah museum untuk lebih mengenal kebudayaan suatu daerah, kali ini Anda bisa mengunjungi Taman Mini Indonesia Indah sebagai sebuah museum raksasa untuk mengenal kebudayaan Indonesia","http://anekatempatwisata.com/wp-content/uploads/2014/10/Taman-Mini-Indonesia-Indah.jpg"}

    };

    public static ArrayList<Travel>getListData(){
        ArrayList<Travel> list = new ArrayList<>();
        for (String[] aData : data) {
            Travel travel = new Travel();
            travel.setName(aData[0]);
            travel.setDescription(aData[1]);
            travel.setPhoto(aData[2]);
            list.add(travel);
        }
        return list;
    }
}
