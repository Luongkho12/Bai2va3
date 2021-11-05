package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterFile extends RecyclerView.Adapter {
    private ArrayList<file> fileArrayList;
    private Context context;

    public adapterFile(ArrayList<file> fileArrayList, Context context) {
        this.fileArrayList = fileArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1){
            View view = LayoutInflater.from(context).inflate(R.layout.item_docfile,parent,false);
            DocViewHolder myViewHolder = new DocViewHolder(view);
            return myViewHolder;
        } else {
            View view = LayoutInflater.from(context).inflate(R.layout.item_textfile,parent,false);
            TextViewHolder myViewHolder = new TextViewHolder(view);
            return myViewHolder;
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        file file = fileArrayList.get(position);

        if (holder instanceof DocViewHolder){
            DocViewHolder DocHolder = (DocViewHolder) holder;
            DocHolder.doc_name.setText(file.getTenf());
        } else {
            TextViewHolder TextHolder = (TextViewHolder) holder;
            TextHolder.text_name.setText(file.getTenf());
        }
        Log.d("octieu", "onBindViewHolder");
    }

    @Override
    public int getItemViewType(int position) {
        file file = fileArrayList.get(position);
        if (file.isDoc()){
            return 1;
        }else {
            return 2;
        }
    }

    @Override
    public int getItemCount() {
        Log.d("octieu", "getFileCount: ");
        return fileArrayList.size();
    }
    class DocViewHolder extends RecyclerView.ViewHolder{
        private TextView doc_name;
        public DocViewHolder(@NonNull View itemView){
            super(itemView);
            doc_name = itemView.findViewById(R.id.doc_name);
        }
    }
    class TextViewHolder extends RecyclerView.ViewHolder{
        private TextView text_name;
        public TextViewHolder(@NonNull View itemView){
            super(itemView);
            text_name = itemView.findViewById(R.id.text_name);
        }
    }
}
