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

public class NowPlayingAdapter extends RecyclerView.Adapter<NowPlayingAdapter.ViewHolder> {

    private List<NowPlayingListItem> nowPlayingListItems;
    private Context context;

    public NowPlayingAdapter(List<NowPlayingListItem> nowPlayingListItems, Context context) {
        this.nowPlayingListItems = nowPlayingListItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_popular, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NowPlayingAdapter.ViewHolder holder, int position) {

        final NowPlayingListItem nowPlayingListItem = nowPlayingListItems.get(position);

        holder.textViewTitle.setText(nowPlayingListItem.getTitle());
        holder.textViewContent.setText(nowPlayingListItem.getContent());

        Glide
                .with(context)
                .load("http://image.tmdb.org/t/p/w500" + nowPlayingListItem.getImageUrl())
                .into(holder.imageViewOtOf);


    }

    @Override
    public int getItemCount() {
        return nowPlayingListItems.size();
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

}
