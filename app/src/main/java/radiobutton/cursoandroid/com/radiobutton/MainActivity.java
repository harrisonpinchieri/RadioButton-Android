package radiobutton.cursoandroid.com.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonEscolhido;
    private Button botaoEscolher;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupId);
        botaoEscolher = findViewById(R.id.botaoEscolherId);
        textoExibicao = findViewById(R.id.textoExibicaoId);


        botaoEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//               os RadioButtons estando dentro da radiogroup, o método pega o id dos radiobuttons selecionados e atribui à variável idRadioButtonEscolhido.
                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();

           //     textoExibicao.setText("id: "+ R.id.radioGroupId);

                if(idRadioButtonEscolhido >0){

//                    atribui  o id
                    radioButtonEscolhido = findViewById(idRadioButtonEscolhido);
                    
//                    mostra na tela o texto que está vinculado a esse id
                    textoExibicao.setText(  radioButtonEscolhido.getText());
                }


            }
        });

    }
}
