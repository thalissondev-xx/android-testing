package testing.example.com;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Team Fretebras Android on 19/10/16.
 */

public class PrintName extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shown_name);
    }

    public void printName(View view) {
        ((TextView) findViewById(R.id.tvName)).setText(
                ((EditText) findViewById(R.id.etName)).getText().toString() + "-" +
                ((EditText) findViewById(R.id.etName2)).getText().toString()
        );
    }
}