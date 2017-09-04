package com.example.iaralopes.androidstudyjam;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    protected Team timeA;
    protected Team timeB;

    private TextView textNomeTimeA;
    private TextView textNomeTimeB;
    private TextView textTotalTimeA;
    private TextView textTotalTimeB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNomeTimeA = (TextView) findViewById(R.id.textA);
        textNomeTimeB = (TextView) findViewById(R.id.textB);
        textTotalTimeA = (TextView) findViewById(R.id.text_A);
        textTotalTimeB = (TextView) findViewById(R.id.text_B);

        iniciar();
    }

    private void iniciar () {
        timeA = new Team("Orlando Magic");
        timeB = new Team("Chicago Bulls");

        textNomeTimeA.setText(timeA.getName());
        textNomeTimeB.setText(timeB.getName());
    }

    //view eh o botao que clicamos, tudo no android eh uma view
    public void add3Pontos (View view) {
        if (view.getId() == R.id.A3)
            timeA.addScore(3);

        if (view.getId() == R.id.B3)
            timeB.addScore(3);

        atualizarPontuacao();
    }

    public void add2Pontos (View view) {
        if (view.getId() == R.id.A2)
            timeA.addScore(2);

        if (view.getId() == R.id.B2)
            timeB.addScore(2);

        atualizarPontuacao();
    }

    public void add1Ponto (View view) {
        if (view.getId() == R.id.A1)
            timeA.addScore(1);

        if (view.getId() == R.id.B1)
            timeB.addScore(1);

        atualizarPontuacao();
    }


    public void reset (View view) {
        timeA.setScore(0);
        timeB.setScore(0);

        atualizarPontuacao();
    }


    public void atualizarPontuacao () {
        textTotalTimeA.setText(String.valueOf(timeA.getScore()));
        textTotalTimeB.setText(String.valueOf(timeB.getScore()));
    }

    public void verResultadoFinal (View view) {
        String vencedor;
        if (timeA.getScore() > timeB.getScore())
            vencedor = timeA.getName();
        else if (timeB.getScore() > timeA.getScore())
            vencedor = timeB.getName();
        else
            vencedor = getString(R.string.empatou);

        Intent intent = new Intent(this, ResultadoFinalActivity.class);
        intent.putExtra("VENCEDOR", vencedor);
        startActivity(intent);
    }

}
