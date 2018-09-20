package sample.damith.com.mydemocode.customRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import sample.damith.com.mydemocode.R;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder> {
    private Context context;
    private List<Movie> movies;

    public CustomRecyclerAdapter(Context context, List movies) {
        this.context = context;
        this.movies = movies;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_single_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(movies.get(position));

        Movie pu = movies.get(position);

        holder.pName.setText(pu.getName());
        holder.pDate.setText(pu.getDate());

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView pName;
        public TextView pDate;

        public ViewHolder(View itemView) {
            super(itemView);

            pName = (TextView) itemView.findViewById(R.id.pNametxt);
            pDate = (TextView) itemView.findViewById(R.id.pDatetxt);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Movie cpu = (Movie) view.getTag();

                    Toast.makeText(view.getContext(), cpu.getName()+" is "+ cpu.getDate(), Toast.LENGTH_SHORT).show();

                }
            });

        }
    }

}
