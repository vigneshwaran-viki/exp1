package com.example.exp1;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int font=20;
    TextView v;
    Button b,b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v=findViewById(R.id.textView);
        b=findViewById(R.id.button1);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                font = font + 5;
                v.setTextSize(font);
                if(font == 40){
                    font = 20;
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            int count=1;
            @Override
            public void onClick(View view)
            {
                switch(count){
                    case 1:
                        v.setTypeface(Typeface.MONOSPACE,Typeface.BOLD);
                        break;
                    case 2:
                        v.setTypeface(Typeface.DEFAULT,Typeface.BOLD);
                        break;
                    case 3:
                        v.setTypeface(Typeface.SANS_SERIF,Typeface.ITALIC);
                        break;
                    case 4:
                        v.setTypeface(Typeface.MONOSPACE,Typeface.ITALIC);
                        break;
                    case 5:
                        v.setTypeface(Typeface.DEFAULT,Typeface.BOLD_ITALIC);
                        break;
                }
                count++;
                if(count==6){
                    count=1;
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            int count = 1;
            @Override
            public void onClick(View view) {
                switch(count){
                    case 1:
                        v.setTextColor(Color.RED);
                        break;
                    case 2:
                        v.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        v.setTextColor(Color.YELLOW);
                        break;
                    case 4:
                        v.setTextColor(Color.MAGENTA);
                        break;
                    case 5:
                        v.setTextColor(Color.BLACK);
                        break;
                    case 6:
                        v.setTextColor(Color.BLUE);
                        break;
                    case 7:
                        v.setTextColor(Color.GRAY);
                        break;
                }
                count++;
                if(count == 8){
                    count = 1;
                }
            }
        });
    }
}