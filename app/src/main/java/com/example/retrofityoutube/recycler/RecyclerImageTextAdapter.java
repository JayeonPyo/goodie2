package com.example.retrofityoutube.recycler;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.retrofityoutube.R;
import com.example.retrofityoutube.WebviewActivity;

import java.util.ArrayList;

public class RecyclerImageTextAdapter extends RecyclerView.Adapter<RecyclerImageTextAdapter.ViewHolder>{
    private ArrayList<RecyclerItem> mData = null ;
    Context context;
    String idurl;
    RecyclerImageTextAdapter(ArrayList<RecyclerItem> list, Context context) {
        mData = list ;
        this.context = context;
    }


    @Override
    public RecyclerImageTextAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.recycler_item, parent, false) ;
        RecyclerImageTextAdapter.ViewHolder vh = new RecyclerImageTextAdapter.ViewHolder(view) ;

        return vh ;
    }

    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(RecyclerImageTextAdapter.ViewHolder holder, int position) {

        RecyclerItem item = mData.get(position) ;
        Glide.with(context).load(item.getThumnail()).into(holder.thumnailimage);
        holder.title.setText(item.getTitle()) ;
        holder.channalname.setText(item.getDesc()) ;
        holder.count.setText(item.getCount()) ;
    }



    @Override
    public int getItemCount() {
        return mData.size() ;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView thumnailimage ;
        TextView title ;
        TextView channalname ;
        TextView count;



        ViewHolder(View itemView) {
            super(itemView) ;

            thumnailimage = itemView.findViewById(R.id.thumnailimage) ;
            title = itemView.findViewById(R.id.title) ;
            channalname = itemView.findViewById(R.id.channalname) ;
            count = itemView.findViewById(R.id.count) ;



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context2 = v.getContext();

                    Intent intent = new Intent(v.getContext(),WebviewActivity.class);

                    intent.putExtra("youtubeid", mData.get(getAdapterPosition()).getYoutubeid());

                 context.startActivity(intent);
                }
            });


        }
    }
}
