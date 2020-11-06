package com.example.quadratic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a,b,c;
    TextView v;
    Button bb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         a=(EditText)findViewById(R.id.e1);
         b=(EditText)findViewById(R.id.e2);
         c=(EditText)findViewById(R.id.e3);
         v=(TextView)findViewById(R.id.t1);
          bb=(Button)findViewById(R.id.b1);
    }
    public void calculateroot(View view)
    { int ab=Integer.parseInt(a.getText().toString());
        int cd=Integer.parseInt(b.getText().toString());
        int ef=Integer.parseInt(c.getText().toString());

        long q =(cd*cd)-(4*ab*ef);
        double j=0;
        double h1=0;
        double h2=0;

        if(q<0)
        {
          v.setText("imaginary roots");
        }
        else
              j= Math.sqrt(q);
              h1 =-cd +(j)/2*ab;
             h2 =-cd +(j)/2*ab;

            v.setText(h1+","+h2);
    }
}
