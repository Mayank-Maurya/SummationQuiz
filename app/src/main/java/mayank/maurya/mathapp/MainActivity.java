package mayank.maurya.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView counter,question,questioncount;
    Button op1,op2,op3,op4;
    ImageButton exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=findViewById(R.id.textView);
        question=findViewById(R.id.textView2);
        questioncount=findViewById(R.id.textView3);
        op1=findViewById(R.id.optionbtn1);
        op2=findViewById(R.id.optionbtn2);
        op3=findViewById(R.id.optionbtn3);
        op4=findViewById(R.id.optionbtn4);
        exit=findViewById(R.id.exitbtn);
        final int score=0,outof=0;
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"your score is "+score+" out of "+outof,Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Startactivity.class);
                startActivity(intent);
                finish();

            }
        });




    }
}
