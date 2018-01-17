package com.enlern.pen.wmedical.fragment.medical;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.enlern.pen.wmedical.R;
import com.enlern.pen.wmedical.fragment.BaseFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by pen on 2018/1/17.
 * 人体温度传感器
 */

public class TemperatureFragment extends BaseFragment {
   private Unbinder unbinder;
    private View view;
    private Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_temperature, container, false);
        context = getActivity();
        initViews();
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    private void initViews() {
    }

    @Override
    protected void lazyLoad() {

    }
}
