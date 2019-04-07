package com.example.a10116054_muhammadzakiyyulfuad_if2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class halaman3 extends AppCompatActivity{

    private String KEY_NAME = "NAMA";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman3);

        final EditText name = (EditText) findViewById(R.id.editText);
        Button button3 = (Button) findViewById(R.id.button4);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = name.getText().toString();
                Intent i3 = new Intent(getApplicationContext(), halaman4.class);
                i3.putExtra(KEY_NAME, nama);
                startActivity(i3);
            }
        });
    }

}
