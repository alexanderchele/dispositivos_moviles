package com.example.alexandercaballero.calculadora;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    Boolean punto =false;
    Boolean s=false;
    Boolean r=false;
    Boolean d=false;
    Boolean m=false;
    Boolean limpiar=false;
    Double n1,n2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b0= (Button)findViewById(R.id.boton0);
        b0.setOnClickListener(this);
        Button b1= (Button)findViewById(R.id.boton1);
        b1.setOnClickListener(this);
        Button b2= (Button)findViewById(R.id.boton2);
        b2.setOnClickListener(this);
        Button b3= (Button)findViewById(R.id.boton3);
        b3.setOnClickListener(this);
        Button b4= (Button)findViewById(R.id.boton4);
        b4.setOnClickListener(this);
        Button b5= (Button)findViewById(R.id.boton5);
        b5.setOnClickListener(this);
        Button b6= (Button)findViewById(R.id.boton6);
        b6.setOnClickListener(this);
        Button b7= (Button)findViewById(R.id.boton7);
        b7.setOnClickListener(this);
        Button b8= (Button)findViewById(R.id.boton8);
        b8.setOnClickListener(this);
        Button b9= (Button)findViewById(R.id.boton9);
        b9.setOnClickListener(this);

        Button bsuma= (Button)findViewById(R.id.botonSuma);
        bsuma.setOnClickListener(this);
        Button bresta= (Button)findViewById(R.id.botonResta);
        bresta.setOnClickListener(this);
        Button bdivision= (Button)findViewById(R.id.botonDivision);
        bdivision.setOnClickListener(this);
        Button bproducto= (Button)findViewById(R.id.botonProducto);
        bproducto.setOnClickListener(this);
        Button bigual= (Button)findViewById(R.id.botonI);
        bigual.setOnClickListener(this);

        Button bpunto= (Button)findViewById(R.id.botonP);
        bpunto.setOnClickListener(this);
        Button bdel= (Button)findViewById(R.id.botonDel);
        bdel.setOnClickListener(this);
        Button bclear= (Button)findViewById(R.id.botonClear);
        bclear.setOnClickListener(this);


    }
    public void clear(){
        TextView screen = (TextView)findViewById(R.id.texto);
        if (limpiar==true){
            screen.setText("");
            limpiar=false;
        }
    }
    @Override
    public void onClick(View v) {
        TextView screen = (TextView)findViewById(R.id.texto);
        int opcion=v.getId();
        clear();
        String cadena=screen.getText().toString();
        try {
        switch (opcion){

                case R.id.boton0:
                    screen.setText(cadena+"0");
                    break;
            case R.id.boton1:
                    screen.setText(cadena+"1");
                    break;
                case R.id.boton2:
                    screen.setText(cadena+"2");
                    break;
                case R.id.boton3:
                    screen.setText(cadena+"3");
                    break;
                case R.id.boton4:
                    screen.setText(cadena+"4");
                    break;
                case R.id.boton5:
                    screen.setText(cadena+"5");
                    break;
                case R.id.boton6:
                    screen.setText(cadena+"6");
                    break;
                case R.id.boton7:
                    screen.setText(cadena+"7");
                    break;
                case R.id.boton8:
                    screen.setText(cadena+"8");
                    break;
                case R.id.boton9:

                    screen.setText(cadena+"9");
                    break;
                case R.id.botonP:
                    if(punto == false) {
                        screen.setText(cadena + ".");
                        punto=true;
                        break;
                    }else return;
            case R.id.botonSuma:
                s=true;
                n1=Double.parseDouble(cadena);
                limpiar=true;

                punto=false;
                break;
            case R.id.botonResta:
                r=true;
                n1=Double.parseDouble(cadena);
                limpiar=true;
                punto=false;
                break;
            case R.id.botonDivision:
                d=true;
                n1=Double.parseDouble(cadena);
                limpiar=true;
                punto=false;
                break;
            case R.id.botonProducto:
                m=true;
                n1=Double.parseDouble(cadena);
                limpiar=true;

                punto=false;
                break;
            case R.id.botonDel:
                screen.setText(cadena.substring(0,cadena.length()-1));
                break;
            case R.id.botonClear:
                screen.setText("");
                punto=false;
                break;
            case R.id.botonI:
                n2=Double.parseDouble(cadena);
                if(s==true){
                    result=n1+n2;
                    screen.setText(String.valueOf(result));

                }else if(r==true){
                    result=n1-n2;
                    screen.setText(String.valueOf(result));
                }else if(m==true){
                    result=n1*n2;
                    screen.setText(String.valueOf(result));
                }else if(d==true){
                    result=n1/n2;
                    screen.setText(String.valueOf(result));
                }
                s=false;
                r=false;
                m=false;
                d=false;
                break;
            }

        }catch (Exception e){
            screen.setText("Error");
        };
    }
}
