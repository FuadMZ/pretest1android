package com.example.a10116054_muhammadzakiyyulfuad_if2;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class halaman4 extends AppCompatActivity{

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman4);

        TextView textView6 = (TextView) findViewById(R.id.textView6);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        textView6.setText("Beres! Sekarang "+nama+" udah bisa ngecek pengguna HP mu tiap hari buat bantu kamu ngatur waktu");

        Button button5 = (Button)findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exit = new Intent(Intent.ACTION_MAIN);
                exit.addCategory(Intent.CATEGORY_HOME);
                exit.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(exit);
            }
        });
    }
}
