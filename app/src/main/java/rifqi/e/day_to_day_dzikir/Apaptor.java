package rifqi.e.day_to_day_dzikir;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Apaptor extends RecyclerView.Adapter<Apaptor.DzikirHolder> {

    private ArrayList<ModelDzikir> listdata;

    public Apaptor(ArrayList<ModelDzikir> listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public DzikirHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rawlist,viewGroup,false);
        return new DzikirHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DzikirHolder dzikirHolder, int i) {
        dzikirHolder.bindView(listdata.get(i));

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DzikirHolder extends RecyclerView.ViewHolder {
        TextView tvArab, tvIndo;
        public DzikirHolder(@NonNull View itemView) {
            super(itemView);
            tvArab = itemView.findViewById(R.id.tvarab);
            tvIndo = itemView.findViewById(R.id.tvindo);
        }
        private void bindView(ModelDzikir modelDzikir){
            tvArab.setText(modelDzikir.getArab());
            tvIndo.setText(modelDzikir.getIndo());

        }
    }
}
