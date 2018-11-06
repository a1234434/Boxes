package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Result2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        Intent intent=getIntent();
        boolean res =intent.getBooleanExtra("result",false);
        setContentView(R.layout.activity_result);
        TextView a =findViewById(R.id.res);
        a.setText(" Box3");
        TextView b =findViewById(R.id.res1);
        b.setText("Diemention:23/14/13 cm");
        TextView c =findViewById(R.id.res2);
        c.setText("Price:65");

    }
}
