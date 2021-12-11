package br.digitalhouse.mediasnotasfinais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mostrarMedia(View view) {
        EditText eTPrimeiroB = (EditText) findViewById(R.id.eTPrimeiroB);
        EditText eTSegundoB = (EditText) findViewById(R.id.eTSegundoB);
        EditText eTTerceiroB = (EditText) findViewById(R.id.eTTerceiroB);
        EditText eTQuartoB = (EditText) findViewById(R.id.eTQuartoB);
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        TextView tvResultado = (TextView) findViewById(R.id.tVResultado);
        Utils utils = new Utils();
        float mediaFinal = utils.calcularMedia(eTPrimeiroB, eTSegundoB, eTTerceiroB, eTQuartoB);
        tvResultado.setText("A média final é " + mediaFinal);
    }

}