package mayank.maurya.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView counter,question,questioncount;
    Button op1,op2,op3,op4;
    ImageButton exit;
    public void initialize()
    {
        counter=findViewById(R.id.textView);
        question=findViewById(R.id.textView2);
        questioncount=findViewById(R.id.textView3);
        op1=findViewById(R.id.optionbtn1);
        op2=findViewById(R.id.optionbtn2);
        op3=findViewById(R.id.optionbtn3);
        op4=findViewById(R.id.optionbtn4);
        exit=findViewById(R.id.exitbtn);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        Random random=new Random();
        int num=random.nextInt(1)+20;
        int num2=random.nextInt(1)+20;
        question.setText(num+" + "+num2+" = ?");
        int ans=random.nextInt(1)+4;
        for(int i=1;i<=4;i++)
        {
            if(i==ans)
            {
               if(i==1)
               {
                   op1.setText(num+num2);
                   break;
               }
                if(i==2)
                {
                    op2.setText(num+num2);
                    break;
                }
                if(i==3)
                {
                    op3.setText(num+num2);
                    break;
                }
                if(i==4)
                {
                    op4.setText(num+num2);
                    break;
                }

            }
        }
        if(ans==1)
        {
            int n1,n2,n3;
            n1=random.nextInt(1)+20;
            n2=random.nextInt(1)+20;
            n3=random.nextInt(1)+20;
            op2.setText(n1);
            op3.setText(n2);
            op4.setText(n3);
        }else if(ans==2)
        {
            int n1,n2,n3;
            n1=random.nextInt(1)+20;
            n2=random.nextInt(1)+20;
            n3=random.nextInt(1)+20;
            op1.setText(n1);
            op3.setText(n2);
            op4.setText(n3);

        }else if(ans==3)
        {
            int n1,n2,n3;
            n1=random.nextInt(1)+20;
            n2=random.nextInt(1)+20;
            n3=random.nextInt(1)+20;
            op1.setText(n1);
            op2.setText(n2);
            op4.setText(n3);
        }else if(ans==3)
        {
            int n1,n2,n3;
            n1=random.nextInt(1)+20;
            n2=random.nextInt(1)+20;
            n3=random.nextInt(1)+20;
            op1.setText(n1);
            op2.setText(n2);
            op3.setText(n3);
        }


























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
