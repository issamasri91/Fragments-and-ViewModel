package bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import bondarenko.samsungit.classwork.fragmentsandviewmodel.R;
import bondarenko.samsungit.classwork.fragmentsandviewmodel.models.Reciepe;
import bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.adapters.ReciepeAdapter;

public class MainFragment extends BaseFragment {

    private RecyclerView rvReceipe;
    private MainViewModel viewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        rvReceipe = view.findViewById(R.id.rvReceipe);
        List receipes = Arrays.asList(
                new Reciepe("asfdds", "sdaf"),
                new Reciepe("hfgd", "sdaf"),
                new Reciepe("sagwd", "sdgas"),
                new Reciepe("adfds", "sdfa"),
                new Reciepe("dsfdf", "sdfsdsdf")
        );
        ReciepeAdapter adapter = new ReciepeAdapter(receipes);
        rvReceipe.setAdapter(adapter);
        rvReceipe.getAdapter().notifyDataSetChanged();

        setTitle("BLUE");
    }

    @Override
    public String setTitle(String title) {
        return "BLUE";
    }
}
