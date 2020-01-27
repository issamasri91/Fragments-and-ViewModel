package bondarenko.samsungit.classwork.fragmentsandviewmodel;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtText;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize MainViewModel
        mainViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainViewModel.class);

        txtText = findViewById(R.id.txtText);

        mainViewModel.getCount("SomeText");
        mainViewModel.count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer count) {
                setText(count);
            }
        });

        Log.d("Lifecycle", "onCreate");
    }

    private void setText(int count){
        txtText.setText("Some Text: count " + count);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy");
    }
}
