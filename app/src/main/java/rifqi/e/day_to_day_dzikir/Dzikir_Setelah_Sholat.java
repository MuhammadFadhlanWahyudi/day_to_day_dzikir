package rifqi.e.day_to_day_dzikir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Dzikir_Setelah_Sholat extends AppCompatActivity {
    String[] idDzikir = {
            "d1",
            "d2",
            "d3",
            "d4",
            "d5",
            "d6"
    };
    String[] sArab = {
            "أَسْتَغْفِرُ اللهَ (3x) اَللَّهُمَّ أَنْتَ السَّلاَمُ، وَمِنْكَ السَّلاَمُ، تَبَارَكْتَ يَا ذَا الْجَلاَلِ وَاْلإِكْرَامِ",
            "اَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ، اَللَّهُمَّ لاَ مَانِعَ لِمَا أَعْطَيْتَ، وَلاَ مُعْطِيَ لِمَا مَنَعْتَ، وَلاَ يَنْفَعُ ذَا الْجَدِّ مِنْكَ الْجَدُّ",
            " إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. لاَ حَوْلَ وَلاَ قُوَّةَ إِلاَّ بِاللهِ، لاَ إِلَـهَ إِلاَّ اللهُ، وَلاَ نَعْبُدُ إِلاَّ إِيَّاهُ، لَهُ النِّعْمَةُ وَلَهُ الْفَضْلُ وَلَهُ الثَّنَاءُ الْحَسَنُ، لاَ إِلَـهَ إِلاَّ اللهُ مُخْلِصِيْنَ لَهُ الدِّيْنَ وَلَوْ كَرِهَ الْكَافِرُوْنَ",
            "سُبْحَانَ اللهِ وَالْحَمْدُ لِلَّهِ وَاللهُ أَكْبَرُ (33 ×) لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
            "اَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ يُحْيِيْ وَيُمِيْتُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. 10× بعد صلاة المغرب والصبح",
            "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً"
    };
    String[] sIndo = {
            "“Aku minta ampun kepada Allah,” (3x). Lantas membaca: “Ya Allah, Engkau pemberi keselamatan, dan dariMu keselamatan, Maha Suci Engkau, wahai Tuhan Yang Pemilik Keagungan dan Kemuliaan.”[1]",
            "“Tiada Rabb yang berhak disembah selain Allah Yang Maha Esa, tidak ada sekutu bagiNya. BagiNya puji dan bagi-Nya kerajaan. Dia Maha Kuasa atas segala sesuatu. Ya Allah, tidak ada yang mencegah apa yang Engkau berikan dan tidak ada yang memberi apa yang Engkau cegah. Tidak berguna kekayaan dan kemuliaan itu bagi pemiliknya (selain iman dan amal shalihnya yang menyelamatkan dari siksaan). Hanya dari-Mu kekayaan dan kemuliaan.” [2]",
            "“Tiada Rabb (yang berhak disembah) kecuali Allah, Yang Maha Esa, tidak ada sekutu bagiNya. BagiNya kerajaan dan pujaan. Dia Mahakuasa atas segala sesuatu. Tidak ada daya dan kekuatan kecuali (dengan pertolongan) Allah. Tiada Rabb (yang hak disembah) kecuali Allah. Kami tidak menyembah kecuali kepadaNya. Bagi-Nya nikmat, anugerah dan pujaan yang baik. Tiada Rabb (yang hak disembah) kecuali Allah, dengan memurnikan ibadah kepadaNya, sekalipun orang-orang kafir sama benci.”[3]",
            "“Maha Suci Allah, segala puji bagi Allah, dan Allah Maha Besar (33 x). Tidak ada Rabb (yang berhak disembah) kecuali Allah Yang Maha Esa, tidak ada sekutu bagiNya. BagiNya kerajaan. BagiNya pujaan. Dia-lah Yang Mahakuasa atas segala sesuatu.”[4]",
            "“Tiada Rabb yang berhak disembah kecuali Allah Yang Maha Esa, tiada sekutu bagiNya, bagiNya kerajaan, bagi-Nya segala puja. Dia-lah yang menghidupkan (orang yang sudah mati atau memberi roh janin yang akan dilahirkan) dan yang mematikan. Dia-lah Yang Mahakuasa atas segala sesuatu.” (Dibaca 10 x setiap sesudah shalat Maghrib dan Subuh)[7]",
            "“Ya Allah, sesungguhnya aku mohon kepadaMu ilmu yang bermanfaat, rezeki yang halal dan amal yang diterima.” (Dibaca setelah salam shalat Shubuh).[8]"
    };
    RecyclerView rvSholat;
    Apaptor adaptor;
    ArrayList<ModelDzikir> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir__setelah__sholat);
        rvSholat = findViewById(R.id.rvSholat);
        list = new ArrayList<>();
        adaptor = new Apaptor(list);
        setData();
        rvSholat.setLayoutManager(new LinearLayoutManager(this));
        rvSholat.setAdapter(adaptor);
    }

    private void setData() {
        int count = 0;
        for (String id : idDzikir) {
            list.add(new ModelDzikir(id, sArab[count], sIndo[count]));
            count++;
        }
    }
}
