package com.example.ankit.insticable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ankit on 14/10/17.
 */

public class page2 extends AppCompatActivity {
    instistudent mystudent=new instistudent();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        Intent intent = getIntent();
        mystudent = (instistudent) intent.getExtras().getSerializable("mystudent");
        Button button1 = (Button) findViewById(R.id.second);
        Button button2 = (Button) findViewById(R.id.third);
        button2.setText(mystudent.getDepartment());
        button1.setOnClickListener(new View.OnClickListener()
        {  @Override
        public void onClick(View v) {
            Intent intent =new Intent(page2.this, chat_interface.class);
            intent.putExtra("mystudent",mystudent);
            intent.putExtra("id1",1);
            startActivity(intent);
        }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {  @Override
        public void onClick(View v) {
            Intent intent =new Intent(page2.this, page3.class);
            intent.putExtra("mystudent",mystudent);
            startActivity(intent);
        }
        });
    }
}