package com.zejian.emotionkeyboard.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zejian.emotionkeyboard.utils.SpanStringUtils;

import java.util.List;

/**
 * Created by fantasee on 2016/9/20.
 */
public class ListViewBarEditAdapter extends BaseAdapter{


    private  List<String> mDatas;
    private  Context mContext;

    public ListViewBarEditAdapter(Context context, List<String> datas) {
        this.mContext=context;
        this.mDatas=datas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){

        TextView listItem= (TextView) LayoutInflater.from(mContext).inflate(android.R.layout.simple_list_item_1,parent,false);
            convertView=listItem;

        }
        ((TextView)convertView).setText(SpanStringUtils.getEmotionContent(
                mContext, (TextView)convertView, mDatas.get(position).toString()));

        return convertView;
    }
}
