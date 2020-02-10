package bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import bondarenko.samsungit.classwork.fragmentsandviewmodel.R;
import bondarenko.samsungit.classwork.fragmentsandviewmodel.models.Reciepe;

public class ReciepeViewHolder extends RecyclerView.ViewHolder {

    private TextView txtTitle;
    private TextView txtMsg;

    public ReciepeViewHolder(@NonNull View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtTitle);
        txtMsg = itemView.findViewById(R.id.txtMsg);
    }

    public void onBind(Reciepe reciepe){
        txtTitle.setText(reciepe.getTitle());
        txtMsg.setText(reciepe.getMsg());
    }
}
