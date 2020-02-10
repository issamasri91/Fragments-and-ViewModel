package bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import bondarenko.samsungit.classwork.fragmentsandviewmodel.R;
import bondarenko.samsungit.classwork.fragmentsandviewmodel.models.Reciepe;

public class ReciepeAdapter extends RecyclerView.Adapter<ReciepeViewHolder> {

    private List<Reciepe> reciepes;

    public ReciepeAdapter(List reciepes) {
        this.reciepes = (List<Reciepe>) reciepes;
    }

    @NonNull
    @Override
    public ReciepeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_layout, parent, false);
        return new ReciepeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReciepeViewHolder holder, int i) {
        holder.onBind(reciepes.get(i));
    }

    @Override
    public int getItemCount() {
        return reciepes.size();
    }
}
