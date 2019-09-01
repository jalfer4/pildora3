package com.programacionparadispositivosmoviles.pildora3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView imagen;
private int orden = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        imagen = findViewById(R.id.foto);
    }

public void retroceder(View v){

        switch(orden){
            case 1 :{
                imagen.setImageResource(R.drawable.img5);
                orden = 5;
                break;
            }

            case 2 :{
                imagen.setImageResource(R.drawable.img1);
                orden--;
                break;
            }

            case 3 :{
                imagen.setImageResource(R.drawable.img2);
                orden--;
                break;
            }

            case 4 :{
                imagen.setImageResource(R.drawable.img3);
                orden--;
                break;
            }

            case 5 :{
                imagen.setImageResource(R.drawable.img4);
                orden--;
                break;
            }
        }
    }

    public void adelantar(View v){

        switch (orden) {
            case 1: {
                imagen.setImageResource(R.drawable.img2);
                orden++;
                break;
            }

            case 2: {
                imagen.setImageResource(R.drawable.img3);
                orden++;
                break;
            }

            case 3: {
                imagen.setImageResource(R.drawable.img4);
                orden++;
                break;
            }

            case 4: {
                imagen.setImageResource(R.drawable.img5);
                orden++;
                break;
            }

            case 5: {
                imagen.setImageResource(R.drawable.img1);
                orden= 1;
                break;
            }
        }
    }
}


