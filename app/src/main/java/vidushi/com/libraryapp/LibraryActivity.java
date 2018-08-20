package vidushi.com.libraryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vidushi.com.testlibrary1.TestLibraryClass1;

public class LibraryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
            Intent libIntent=new Intent(getApplicationContext(), TestLibraryClass1.class);
            startActivity(libIntent);
    }
}
