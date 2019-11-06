package com.example.retrofityoutube.recycler;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import com.example.retrofityoutube.R;
import com.example.retrofityoutube.WebviewActivity;
import com.example.retrofityoutube.model.RandomModel;
import com.example.retrofityoutube.model.VideoModel;
import com.example.retrofityoutube.retrofit.NetworkHelper;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecyclerMainActivity extends AppCompatActivity {





    RecyclerView mRecyclerView = null ;
    RecyclerImageTextAdapter mAdapter = null ;
    ArrayList<RecyclerItem> mList = new ArrayList<RecyclerItem>();

  //  ArrayList<VideoModel> datas = new ArrayList<>();
    ArrayList<RandomModel> datas = new ArrayList<>();

    String idurl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);






        mRecyclerView = findViewById(R.id.recycler1) ;
        mAdapter = new RecyclerImageTextAdapter(mList,this) ;
        mRecyclerView.setAdapter(mAdapter) ;


        mRecyclerView.setLayoutManager(new LinearLayoutManager(this)) ;

        RandomVideo();

        mAdapter.notifyDataSetChanged() ;
    }



    public void addItem(String thumnailimage, String title, String channalname,String count,String youtubeid) {
        RecyclerItem item = new RecyclerItem();


        item.setThumnail(thumnailimage);
        item.setTitle(title);
        item.setDesc(channalname);
        item.setCount(count);
        item.setYoutubeid(youtubeid);
         mList.add(item);

    }






    void RandomVideo(){
      NetworkHelper.getInstance().RandomVideo().enqueue(new Callback<ArrayList<RandomModel>>() {
            @Override
            public void onResponse(Call<ArrayList<RandomModel>> call, Response<ArrayList<RandomModel>> response) {
                Log.e("response",response.toString()+"");
                if(response.isSuccessful()){
                    if(response.code() == 200) {
                       ArrayList<RandomModel> responseBody = response.body();
                        datas = responseBody;
                        for(int i=0;i<datas.size(); i++){
                            addItem(datas.get(i).getThumbnail(),datas.get(i).getTitle(),datas.get(i).getPublisher(),"조회수"+datas.get(i).getViewCount(),datas.get(i).getYoutubeId());

                        }

                        mAdapter.notifyDataSetChanged();
                    }
                }
                    }


            @Override
            public void onFailure(Call<ArrayList<RandomModel>> call, Throwable t) {
                Log.e("error", t.toString());
            }

        });
    }
}
