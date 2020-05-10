package mayank.maurya.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView counter,question,questioncount;
    TextView op1,op2,op3,op4;
    ImageButton exit;
    int ans;
    int score=0,outof=0;
    public void generate()
    {
        Random random=new Random();
        int num=random.nextInt(80-20)+20;
        int num2=random.nextInt(80-20)+20;
        question.setText(num+" + "+num2+" = ?");
        ans=random.nextInt(4-1)+1;
        for(int i=1;i<=4;i++)
        {
            if(i==ans)
            {
                if(i==1)
                {
                    op1.setText(String.valueOf(num+num2));

                    break;
                }
                if(i==2)
                {
                    op2.setText(String.valueOf(num+num2));


                    break;
                }
                if(i==3)
                {
                    op3.setText(String.valueOf(num+num2));


                    break;
                }
                if(i==4)
                {
                    op4.setText(String.valueOf(num+num2));


                    break;
                }

            }
        }
        if(ans==1)
        {
            int n1,n2,n3;
            n1=random.nextInt(90-10)+10;
            n2=random.nextInt(90-10)+10;
            n3=random.nextInt(90-10)+10;
            setit(n1,2);
            setit(n2,3);
            setit(n3,4);
        }else if(ans==2)
        {
            int n1,n2,n3;
            n1=random.nextInt(90-10)+10;
            n2=random.nextInt(90-10)+10;
            n3=random.nextInt(90-10)+10;
            setit(n1,1);
            setit(n2,3);
            setit(n3,4); //1 3 4


        }else if(ans==3)
        {
            int n1,n2,n3;
            n1=random.nextInt(90-10)+10;
            n2=random.nextInt(90-10)+10;
            n3=random.nextInt(90-10)+10;
            setit(n1,1);
            setit(n2,2);
            setit(n3,4);
        }else if(ans==4)
        {
            int n1,n2,n3;
            n1=random.nextInt(90-10)+10;
            n2=random.nextInt(90-10)+10;
            n3=random.nextInt(90-10)+10;
            setit(n1,1);
            setit(n2,2);
            setit(n3,3);
        }

    }
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
            op1.setText(String.valueOf(n));
        }else
        if(choice==2) {
            op2.setText(String.valueOf(n));
        }else if(choice==3) {
            op3.setText(String.valueOf(n));
        }else if(choice==4) {
            op4.setText(String.valueOf(n));
        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        generate();



        op1.setOnClickListener(this);
        op2.setOnClickListener(this);
        op3.setOnClickListener(this);
        op4.setOnClickListener(this);

        exit.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.optionbtn1:
            {
                if(ans==1)
                {
                    score++;
                    outof++;


                }else{
                    outof++;
                }questioncount.setText(String.valueOf(score+"/"+outof));
                generate();
                break;
            }
            case R.id.optionbtn2:
            {
                if(ans==2)
                {
                    score++;
                    outof++;
                }else{
                    outof++;
                }questioncount.setText(String.valueOf(score+"/"+outof));
                generate();
                break;
            }
            case R.id.optionbtn3:
            {
                if(ans==3)
                {
                    score++;
                    outof++;
                }else{
                    outof++;
                }questioncount.setText(String.valueOf(score+"/"+outof));
                generate();
                break;
            }
            case R.id.optionbtn4:
            {
                if(ans==4)
                {
                    score++;
                    outof++;
                }else{
                    outof++;
                }questioncount.setText(String.valueOf(score+"/"+outof));
                generate();
                break;
            }
            case R.id.exitbtn:
            {
                Toast.makeText(MainActivity.this,"your score is "+score+" out of "+outof,Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Startactivity.class);
                startActivity(intent);
                finish();
            }

        }

    }
}
