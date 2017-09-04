package com.example.iaralopes.androidstudyjam;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;


public class ResultadoFinalActivity extends AppCompatActivity {

    private TextView text_1;
    private TextView textVencedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_final);

        text_1 = (TextView) findViewById(R.id.text_1);
        textVencedor = (TextView) findViewById(R.id.vencedor);

        Bundle bundle = getIntent().getExtras();
        String vencedor = bundle.getString("VENCEDOR");

        mostrarVencedor(vencedor);
    }

    public void mostrarVencedor (String vencedor) {
        if (vencedor.equals(getString(R.string.empatou))) {
            text_1.setText(R.string.houve_empate);
        }
        textVencedor.setText(vencedor);
    }
}

