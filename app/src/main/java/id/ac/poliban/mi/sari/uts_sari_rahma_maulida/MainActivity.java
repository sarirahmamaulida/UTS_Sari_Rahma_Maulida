package id.ac.poliban.mi.sari.uts_sari_rahma_maulida;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btClear, btSubmit;
    EditText etNP, etNama, etAlamat, etTelp;
    RadioGroup rb;
    Spinner spAgama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup rb = findViewById(R.id.rb);
        final EditText etNama = findViewById(R.id.etNama);
        final EditText etNP = findViewById(R.id.etNP);
        final EditText etAlamat = findViewById(R.id.etAlmt);
        final EditText etTelp = findViewById(R.id.etTelp);
        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNP.setText("");
                etNama.setText("");
                etTelp.setText("");
                etAlamat.setText("");
                etNP.requestFocus();



            }


        });
        btSubmit.setOnClickListener(v -> {
            new  AlertDialog.Builder(this)
                    .setTitle("Info Registrasi").setMessage(etNP.getText())
                    .setPositiveButton("OK", null).show();
        });

            }

}
