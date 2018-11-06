package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent =getIntent();
        boolean res =intent.getBooleanExtra("result",true);
        setContentView(R.layout.activity_result);
        TextView a1 =findViewById(R.id.res);
        a1.setText(" Box5");
        TextView b1 =findViewById(R.id.res1);
        b1.setText("Diemention:39.5/27.5/23 cm");
        TextView c1 =findViewById(R.id.res2);
        c1.setText("Price:90");

    }
}
