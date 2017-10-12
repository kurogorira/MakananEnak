package com.example.lenovo.infomakan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {

    //deklarasi variable context

    private final Context context;
    String[] rep={"200 gram kacang tanah digoreng\n" +
                  "4 siung bawang putih, potong dan goreng\n" +
                  "3 lembar daun jeruk\n" +
                  "1 bungkus santan kara lalu ditambah air 250 ml\n" +
                  "200 gram gula merah\n" +
                  "Kentang kukus\n" +
                  "Tauge rebus\n" +
                  "Kubis kukus\n" +
                  "Tahu goreng\n" +
                  "Tempe goreng",

                    "250 gram lidah sapi, direbus, potong-potong 2x2 cm\n" +
                    "100 gram hati sapi, direbus, potong-potong 2x2 cm\n" +
                    "300 gram daging sandung lumur\n" +
                    "1 liter air\n" +
                    "2 lembar daun kunyit\n" +
                    "1 batang serai, ambil putihnya, memarkan\n" +
                    "1 buah asam kandis\n" +
                    "40 gram tepung beras dan 50 ml air, dilarutkan untuk pengental\n" +
                    "2 sdm bawang goreng untuk taburan\n" +
                    "18 buah tusuk sate\n" +
                            "\n" +
                            "\n" +
                            "Bumbu halus:\n" +
                            "8 butir bawang merah\n" +
                            "1 buah cabai merah keriting\n" +
                            "1/2 sdt ketumbar\n" +
                            "1 sdt merica\n" +
                            "1/4 sdt jintan\n" +
                            "4 cm kunyit, dibakar\n" +
                            "1 cm lengkuas\n" +
                            "1 1/4 sdt gula pasir\n" +
                            "1 sdt garam",

                    "100 gram beras ketan putih\n" +
                    "250 ml air\n" +
                    "100 gram kelapa parut, sangrai untuk penabur\n" +
                    "15 gram ebi udang, seduh, sangrai, dan haluskan\n" +
                    "5 butir telur bebek\n" +
                    "30 gram bawang merah, goreng kering\n" +
                    "1 sendok makan minyak goreng untuk menumis bumbu halus\n" +
                    "Bawang merah goreng khusus untuk taburan" +
                            "\n" +
                            "\n" +
                            "Bumbu yang dihaluskan :\n" +
                            "\n" +
                            "4 buah cabai merah keriting\n" +
                            "1/2 sdt merica butiran\n" +
                            "3 cm kencur\n" +
                            "1 cm jahe",

                    "1 ekor ayam, potong-potong cuci bersih\n" +
                    "100 cc air kelapa\n" +
                    "1/4 sdt soda kue\n" +
                    "5 siung bawang putih, haluskan\n" +
                    "1 cm lengkuas\n" +
                    "2 lembar daun salam\n" +
                    "Gula merah secukupnya\n" +
                    "Garam secukupnya\n" +
                    "Gula pasir secukupnya",

                            "350 gram daging ayam, giling halus\n" +
                            "150 gram udang, giling\n" +
                            "1,5 sdm kelapa muda parut\n" +
                            "1 sdm santan kental\n" +
                            "15-20 batang serai untuk tusukan\n" +
                            "1 sdt gula\n" +
                            "1 sdt garam\n" +
                                    "\n" +
                                    "Bumbu halus:\n" +
                                    "8 siung bawang merah\n" +
                                    "3 siung bawang putih\n" +
                                    "5 buah cabai keriting\n" +
                                    "3 cm kunyit, bakar\n" +
                                    "1 cm jahe\n" +
                                    "3 butir kemiri, sangrai\n" +
                                    "1/4 sdt ketumbar, sangrai\n" +
                                    "1/2 sdt terasi, bakar\n" +
                                    "1 buah serai ambil putihnya\n" +
                                    "3 lembar daun jeruk"
    };


    String[] prod={"1. Cara membuat bumbu: Blender kacang, daun jeruk, bersama santan sampai halus.\n" +
                   "2. Didihkan santan sampai terus diaduk agar tidak gosong, masukkan gula merah, garam,  dan cicipi.\n" +
                   "3. Tata sayur di atas piring, dan siram dengan bumbu.\n",

                    "1. Rebus daging sandung lumur dengan air sampai matang dan empuk, potong-potong ukuran 2 x 2 cm. Ukur kaldunya 750 ml.\n" +
                    "2. Rebus lagi lidah sapi hati sapi, bumbu halus, daun kunyit, serai, dan asam kandis. Masak sampai kaldunya menjadi 500 ml  dengan api kecil.\n" +
                    "3. Tusuk-tusuk daging sapi, lidah sapi, dan hati sapi secara bergantian di tusuan sate. Bakar sampai harum.\n" +
                    "4. Rebus lagi kaldunya, kentalkan dengan larutan tepung beras, masak sampai meletup-letup.\n" +
                    "5. Sajikan sate dengan kuahnya dan bawang goreng.",

                    "1. Rendam beras ketan putih di dalam air selama satu malam, tiriskan.\n" +
                    "2. Panaskan minyak, tumis bumbu halus hingga harum.\n" +
                    "3. Bubuhkan 1 1/2 sendok makan beras ketan putih pada wajan cekung yang sudah panas. Siram dengan 3 sendok makan air redaman beras, biarkan hingga agak kering.\n" +
                    "4.Pada satu tempat, kocok 1 butir telur bebek, 1/2 sendok teh bumbu halus yang sudah ditumis, 1/2 sendok teh ebi, 1/2 sendok makan bawang merah goreng, 1/8 sendok teh gula pasir, dan 1/8 sendok teh garam bubuk.\n" +
                    "5. Siram campuran tersebut ke atas ketan pada wajan, aduk sambil ratakan dan atur ketebalannya dengan mengira-ngira. Tutup wajan hingga matang. Balik wajan cekung di atas bara api, biarkan sampai benar-benar matang.\n" +
                    "6. Terakhir, taburi kelapa sangrai dan bawang goreng sebelum disajikan.",

                            "1. Tuang air kelapa berserta semua bumbu, masukkan daging ayam, rebus sampai air menyusut, angkat, tiriskan.\n" +
                            "2. Setelah ayam agak dingin, goreng sampai kecoklatan, angkat, tiriskan\n",

                    "1.  Haluskan bumbu, kemudian tumis hingga harum.\n" +
                            "2.  Tambahkan gula garam, aduk hingga matang, angkat.\n" +
                            "3.  Pada wadah masukkan ayam, udang giling, santan, kelapa parut lalu tambahkan bumbu halus yang telah ditumis. Aduk hingga tercampur rata.\n" +
                            "4. Ambil 1 sdm adonan, tempelkan/ lilitkan pada ujung serai atau bambu (menyerupai pentul) hingga rapi.\n" +
                            "5.  Panggang diatas pan, bolak balik hingga matang dan harum.\n" +
                            "6.  Sajikan dengan sambal matah selagi hangat.\n"
    };
    String [] name={"Gado Gado","Sate Padang","Kerak Telor","Ayam Goreng Kalasan","Sate Lilit Bali"
    };
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name

    String [] deskripsi={" Biasanya di Indonesia makanan yang satu ini adalah makanan kombinasi antara sayur rebus yang di campur dengan saus kacang.\n",
                    "Sate Padang adalah sebutan untuk tiga jenis varian sate di Sumatera Barat, yaitu Sate Padang, Sate Padang Panjang dan Sate Pariaman.\n",
                    "Kerak telor kerap hadir pada acara bertemakan Betawi, didampingi dengan asinan betawi membuat kehadirannya seakan melengkapi jajaran makanan khas suku Betawi.",
                    "Mengapa saat ini dikenal sebagai ayam kalasan karena memang berasal dari daerah Kalasan.",
                    "Sate Lilit adalah sebuah varian sate asal Bali. Daging cincang yang telah berbumbu dilekatkan pada sebuah bambu atau tebu. Tidak seperti sate lainnya yang dibuat dengan tusuk sate yang sempit dan tajam, tusuk sate lilit berbentuk datar dan lebar."
    };
    Integer [] gambar={R.drawable.gadogado,R.drawable.satepadang,R.drawable.keraktelor,R.drawable.ayamkalasan,R.drawable.satelilit};

    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.tampilanrecycler, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {


        int gamb=gambar[position];
        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.tv2.setText(deskripsi[position]);
        holder.tv2.setOnClickListener(clickListener);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.tv2.setTag(holder);
        holder.imageView.setTag(holder);
        holder.imageView.setImageResource(gamb);



    }





    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();
            Bundle b = new Bundle();

            /// mengeset gambar ke bundle
            b.putInt("gambar",gambar[position]);
            b.putString("label","Resep "+name[position]);
            b.putString("res",rep[position]);
            b.putString("procedur",prod[position]);
            Intent intent=new Intent(context,TampilanDetil.class);
            intent.putExtras(b);
            context.startActivity(intent);
        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
