package rifqi.e.day_to_day_dzikir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView cvPagi, cvPetang, cvSetelahSholat, cvHarian, cvAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cvPagi = findViewById(R.id.crpagi);
        cvPetang = findViewById(R.id.crpetang);
        cvSetelahSholat = findViewById(R.id.crharian);
        cvHarian = findViewById(R.id.crdoaharian);
        cvAbout = findViewById(R.id.crabout);

        //memberikan event klik

        cvPagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DzPagi =new Intent(MainActivity.this,Dzikir_Pagi.class);
                startActivity(DzPagi);
            }
        });
        cvPetang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DzPetang =new Intent(MainActivity.this,Dzikir_Petang.class);
                startActivity(DzPetang);
            }
        });
        cvSetelahSholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DzSholat =new Intent(MainActivity.this,Dzikir_Setelah_Sholat.class);
                startActivity(DzSholat);
            }
        });
        cvHarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent DzHarian =new Intent(MainActivity.this,Dzikir_Harian.class);
               startActivity(DzHarian);

            }
        });
        cvAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DzAbout =new Intent(MainActivity.this,About.class);
                startActivity(DzAbout);
            }
        });

    }
}
