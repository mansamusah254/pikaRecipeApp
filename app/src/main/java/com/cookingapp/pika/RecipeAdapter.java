package com.cookingapp.pika;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class RecipeAdapter extends ArrayAdapter {
private Context mContext;
private String[] mFoodName;
private String[] mChef;
    public RecipeAdapter(@NonNull Context context,int resource, String[]mFoodName, String[]mChef) {
        super(context, resource );
        this.mContext = mContext;
        this.mFoodName = mFoodName;
        this.mChef = mChef;
    }
    @Override
    public Object getItem(int position) {
        String books = mFoodName[position];
        String title = mChef[position];
        return String.format("%s \nYou should read this perhaps and leave a comment behind: %s", books, title);
    }
    @Override
    public int getCount() {
        return mFoodName.length;
    }
}
