package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText length;
    private EditText width;
    private EditText height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();


    }

    private void findViews() {
        length = findViewById(R.id.ed_length);
        width = findViewById(R.id.ed_width);
        height = findViewById(R.id.ed_height);
    }

    public void check(View view) {
        String l = length.getText().toString();
        String w = width.getText().toString();
        String h = height.getText().toString();
        float edlength = Float.parseFloat(l);
        float edwidth = Float.parseFloat(w);
        float edheight = Float.parseFloat(h);

        if (edlength <= 23 && edwidth <= 14 && edheight <= 13) {
            boolean r1 = true;
            Intent intent = new Intent(this, Result2Activity.class);
            intent.putExtra("result", r1);
            startActivity(intent);

        } else {
            if (edlength <= 39.5 && edwidth <= 27.5 && edheight <= 23) {
                boolean r = false;
                Intent intent1 = new Intent(this, ResultActivity.class);
                intent1.putExtra("result", r);
                startActivity(intent1);
                finish();
            }
        }
    }
}
