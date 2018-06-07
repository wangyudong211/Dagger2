package wyd.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @BookQualifierC2 @Inject Book mBook;
    @BookQualifierC2 @Inject Book mBook2;
    @BookQualifierC1 @Inject Book mBook3;
    @BookQualifierC1 @Inject Book mBook4;
    @Inject
    Phone mPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerBookComponent.builder()
                .dateModule(new DateModule(0, "哈利波特"))
                .build()
                .inject(this);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("wangyudong", "mBook: " + mBook.toString());
                Log.e("wangyudong", "mBook2: " + mBook2.toString());
                Log.e("wangyudong", "mBook3: " + mBook3.toString());
                Log.e("wangyudong", "mBook4: " + mBook4.toString());
                Log.e("wangyudong", "mPhone: " + mPhone.toString());
            }
        });
    }
}
