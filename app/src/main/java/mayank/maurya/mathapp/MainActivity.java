package mayank.maurya.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RemoteViews;
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
    public void setit(int n,int choice)
    {
        if(choice==1) {
            RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.activity_main);
            remoteViews.setTextViewText(R.id.optionbtn1, n + "");
        }else
        if(choice==2) {
            RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.activity_main);
            remoteViews.setTextViewText(R.id.optionbtn2, n + "");
        }else if(choice==3) {
            RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.activity_main);
            remoteViews.setTextViewText(R.id.optionbtn3, n + "");
        }else if(choice==4) {
            RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.activity_main);
            remoteViews.setTextViewText(R.id.optionbtn4, n + "");
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        Random random=new Random();
        int num=random.nextInt(80-20)+20;
        int num2=random.nextInt(80-20)+20;
        question.setText(num+" + "+num2+" = ?");
        int ans=random.nextInt(2)+3;
        for(int i=1;i<=4;i++)
        {
            if(i==ans)
            {
               if(i==1)
               {
                   RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.activity_main);
                   remoteViews.setTextViewText(R.id.optionbtn1, num+num2+"");
                   break;
               }
                if(i==2)
                {
                    RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.activity_main);
                    remoteViews.setTextViewText(R.id.optionbtn2, num+num2+"");


                    break;
                }
                if(i==3)
                {
                    RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.activity_main);
                    remoteViews.setTextViewText(R.id.optionbtn3, num+num2+"");


                    break;
                }
                if(i==4)
                {
                    RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.activity_main);
                    remoteViews.setTextViewText(R.id.optionbtn4, num+num2+"");


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
            setit(n1,2);
            setit(n2,3);
           setit(n3,4);
        }else if(ans==2)
        {
            int n1,n2,n3;
            n1=random.nextInt(1)+20;
            n2=random.nextInt(1)+20;
            n3=random.nextInt(1)+20;
            setit(n1,1);
            setit(n2,3);
            setit(n3,4); //1 3 4


        }else if(ans==3)
        {
            int n1,n2,n3;
            n1=random.nextInt(1)+20;
            n2=random.nextInt(1)+20;
            n3=random.nextInt(1)+20;
            setit(n1,1);
            setit(n2,2);
            setit(n3,4);
        }else if(ans==4)
        {
            int n1,n2,n3;
            n1=random.nextInt(1)+20;
            n2=random.nextInt(1)+20;
            n3=random.nextInt(1)+20;
            setit(n1,1);
            setit(n2,2);
            setit(n3,3);
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
