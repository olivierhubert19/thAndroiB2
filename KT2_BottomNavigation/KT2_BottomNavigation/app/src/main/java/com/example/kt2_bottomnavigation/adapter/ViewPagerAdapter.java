package com.example.kt2_bottomnavigation.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.kt2_bottomnavigation.fragment.FragmentDanhSach;
import com.example.kt2_bottomnavigation.fragment.FragmentThongTin;
import com.example.kt2_bottomnavigation.fragment.FragmentTimKiemThongKe;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentDanhSach();
            case 1:
                return new FragmentThongTin();
            case 2:
                return new FragmentTimKiemThongKe();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
