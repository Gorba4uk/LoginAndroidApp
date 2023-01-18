package pl.horbachuk.exapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void runFunction(View view) {
        TextView autor;
        EditText password;
        EditText password2;
        EditText email;
        autor = findViewById(R.id.txtAutor);
        password = findViewById(R.id.txtPassword);
        password2 = findViewById(R.id.txtPasswordRepeat);
        email = findViewById(R.id.txtEmail);
        String em = email.getText().toString();
        String pass = password.getText().toString();
        String passRepeat = password2.getText().toString();


        if(checkEmail(em) && checkPassword(pass, passRepeat)){
            autor.setText("Witaj " + em);
        }
        else if(!pass.equals(passRepeat)){
            autor.setText("Hasla sie roznia");
        }
        else if(!checkEmail(em)){
            autor.setText("niepoprawny email");
        }

    }

    public boolean checkEmail(String val){
        if(val.contains("@")){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkPassword(String one, String two){
        if(one.equals(two)){
            return true;
        }
        else
        {
            return false;
        }
    }
}