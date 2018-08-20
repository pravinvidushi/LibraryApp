package vidushi.com.testlibrary1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TestLibraryClass1 extends AppCompatActivity implements View.OnClickListener{

    public EditText test_activity_edit1;
    public EditText test_activity_edit2;
    public Button test_activity_submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_library_class1);

        test_activity_edit1 = (EditText)findViewById(R.id.test_activity_edit1);
        test_activity_edit2 = (EditText)findViewById(R.id.test_activity_edit1);
        test_activity_submit = (Button)findViewById(R.id.test_activity_submit);

        test_activity_submit.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.test_activity_submit) {
            Toast.makeText(this, "SimpleLibrary- "+"FirstEdit-"+test_activity_edit1.getText().toString()+"SecEdit-"+test_activity_edit2.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
