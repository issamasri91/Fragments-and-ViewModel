package bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.activities;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public MutableLiveData<Integer> count = new MutableLiveData<>();

    public void getCount(String a){
        count.postValue(a.length());
    }
}
