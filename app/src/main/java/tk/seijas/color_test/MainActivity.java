package tk.seijas.color_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button mbotoncambaircita;
    private TextView mtextocita;
    private TextView mtextoautor;

    private static final String TAG = MainActivity.class.getName();

    GenerarCita generadorCitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbotoncambaircita = (Button) findViewById(R.id.button);
        mtextocita = (TextView) findViewById(R.id.textocita);
        mtextoautor = (TextView) findViewById(R.id.textoautor);

        generadorCitas = new GenerarCita();
    }

    public void b_nuevaCita(View v){
        Cita newCita = generadorCitas.getRandomCita();
        mtextocita.setText(newCita.getTexto());
        mtextoautor.setText(newCita.getAutor());
    }


}
