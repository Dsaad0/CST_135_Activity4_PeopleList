package com.example.peoplelist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonAdapter extends BaseAdapter {
    Activity mActivity;
    MyFriends myFriends;

    public PersonAdapter(Activity mActivity, MyFriends myFriends) {
        this.mActivity = mActivity;
        this.myFriends = myFriends;
    }

    @Override
    public int getCount() {
        return myFriends.getMyFriendsList().size();
    }

    @Override
    public Person getItem(int position) {
        return myFriends.getMyFriendsList().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View onePersonLine;

        LayoutInflater inflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        onePersonLine = inflater.inflate(R.layout.person_one_line, parent, false);

        TextView tv_name = onePersonLine.findViewById(R.id.tv_name);
        TextView tv_age = onePersonLine.findViewById(R.id.tv_agevalue);
        ImageView iv_icon = onePersonLine.findViewById(R.id.iv_icon);

        Person p = this.getItem(position);

        tv_name.setText(p.getName());
        tv_age.setText(Integer.toString(p.getAge()));

        int icon_resource_numbers [] = {
                R.drawable.icon01_01,
                R.drawable.icon01_02,
                R.drawable.icon01_03,
                R.drawable.icon01_04,
                R.drawable.icon01_05,
                R.drawable.icon01_06,
                R.drawable.icon01_07,
                R.drawable.icon01_08,
                R.drawable.icon01_09,
                R.drawable.icon01_10,
                R.drawable.icon01_11,
                R.drawable.icon01_12,
                R.drawable.icon01_13,
                R.drawable.icon01_14,
                R.drawable.icon01_15,
                R.drawable.icon01_16,
                R.drawable.icon01_17,
                R.drawable.icon01_18,
                R.drawable.icon01_19,
                R.drawable.icon01_20,
                R.drawable.icon01_21,
                R.drawable.icon01_22,
                R.drawable.icon01_23,
                R.drawable.icon01_24,
                R.drawable.icon01_25,
                R.drawable.icon01_26,
                R.drawable.icon01_27,
                R.drawable.icon01_28,
                R.drawable.icon01_29,
                R.drawable.icon01_30,
                R.drawable.icon01_15,
                R.drawable.icon01_16,
                R.drawable.icon01_17,
                R.drawable.icon01_18,
                R.drawable.icon01_19,
                R.drawable.icon01_20,
                R.drawable.icon01_21,
                R.drawable.icon01_30,
        };


        iv_icon.setImageResource(icon_resource_numbers[position]);

        return onePersonLine;
    }
}
