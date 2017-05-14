package id.sch.smktelkom_mlg.privateassignment.xirpl432.nontontv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by user on 5/14/2017.
 */

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {

    private List<PopularListItem> popularListItems;
    private Context context;

    public PopularAdapter(List<PopularListItem> popularListItems, Context context) {
        this.popularListItems = popularListItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_popular, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PopularAdapter.ViewHolder holder, int position) {

        final PopularListItem popularListItem = popularListItems.get(position);

        holder.textViewTitle.setText(popularListItem.getTitle());
        holder.textViewContent.setText(popularListItem.getContent());

        Glide
                .with(context)
                .load("http://image.tmdb.org/t/p/w500" + popularListItem.getImageUrl())
                .into(holder.imageViewOtOf);

    }

    @Override
    public int getItemCount() {
        return popularListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewTitle;
        public TextView textViewContent;
        public ImageView imageViewOtOf;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
            textViewContent = (TextView) itemView.findViewById(R.id.textViewContent);
            imageViewOtOf = (ImageView) itemView.findViewById(R.id.imageViewOtof);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.LinearLayout);
        }
    }


//    public PopularAdapter(List<PopularAdapter> popularAdapters, Context context){
//        this.popularAdapters= popularAdapters;
//        this.context = context;
//    }
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.,parent, false);
//        return new ViewHolder(v);
//    }
//    @Override
//    public void onBindViewHolder
}
