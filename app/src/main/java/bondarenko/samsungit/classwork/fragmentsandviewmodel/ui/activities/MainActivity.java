package bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.activities.MainViewModel;
import bondarenko.samsungit.classwork.fragmentsandviewmodel.R;
import bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.adapters.ViewPagerAdapter;
import bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

//    private TextView txtText;
//    private MainViewModel mainViewModel;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize MainViewModel
        //mainViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainViewModel.class);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        //mainViewModel.getCount("SomeText");

        //Log.d("Lifecycle", "onCreate");
        //addFragment();
    }

//    private void addFragment(){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        MainFragment mainFragment = new MainFragment();
//        fragmentTransaction.add(R.id.mainContainer, mainFragment, "MAIN_FRAGMENT");
//        fragmentTransaction.commit();
//    }


//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d("Lifecycle", "onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d("Lifecycle", "onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d("Lifecycle", "onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d("Lifecycle", "onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d("Lifecycle", "onDestroy");
//    }
}
