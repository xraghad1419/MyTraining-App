package com.example.mytraining;


import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

    public class EmptyAdapter2 extends RecyclerView.Adapter<EmptyAdapter2.EmptyHolder> {
        @Override
        public EmptyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(EmptyHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        class EmptyHolder extends RecyclerView.ViewHolder {
            public EmptyHolder(View itemView) {
                super(itemView);
            }
        }
    }


