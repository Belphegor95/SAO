package com.abc.sao;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ZhuActivity extends AppCompatActivity {

    RecyclerView recycleView;
    Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhu);
        mcontext = this;
        recycleView = (RecyclerView)findViewById(R.id.recycleView);
        recycleView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recycleView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View itemView = LayoutInflater.from(mcontext).inflate(R.layout.main_list_item,parent,false);
                ItemView i = new ItemView(itemView);
                return i;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if(position == 0){
                    ((ItemView)holder).titleView.setText("111111111111111111");

                }
            }

            @Override
            public int getItemCount() {
                return 10;
            }
        });
    }

    class ItemView extends RecyclerView.ViewHolder{
        TextView titleView;
        public ItemView(View itemView) {
            super(itemView);
            titleView = (TextView)itemView.findViewById(R.id.mtextView);
        }

    }
}
