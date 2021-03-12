package com.sadadnan.customtoastlib;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CustomToast {
    public static void ShowSuccessToast(Context mContext, boolean isLong, String successMessage) {
        Toast toast = new Toast(mContext);
        if (isLong) {
            toast.setDuration(Toast.LENGTH_LONG);
        } else {
            toast.setDuration(Toast.LENGTH_SHORT);
        }

        //inflate view
        View custom_view = ((AppCompatActivity) mContext).getLayoutInflater().inflate(R.layout.toast_icon_text, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(successMessage);

        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_done);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(((AppCompatActivity) mContext).getResources().getColor(R.color.green500));

        toast.setView(custom_view);
        toast.show();
    }

    public static void ShowErrorToast(Context mContext, boolean isLong, String errorMessage) {
        Toast toast = new Toast(mContext);
        if (isLong) {
            toast.setDuration(Toast.LENGTH_LONG);
        } else {
            toast.setDuration(Toast.LENGTH_SHORT);
        }

        //inflate view
        View custom_view = ((AppCompatActivity) mContext).getLayoutInflater().inflate(R.layout.toast_icon_text, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(errorMessage);

        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_close);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(((AppCompatActivity) mContext).getResources().getColor(R.color.red500));

        toast.setView(custom_view);
        toast.show();
    }

    public static void ShowInfoToast(Context mContext, boolean isLong, String infoMessage) {
        Toast toast = new Toast(mContext);
        if (isLong) {
            toast.setDuration(Toast.LENGTH_LONG);
        } else {
            toast.setDuration(Toast.LENGTH_SHORT);
        }

        //inflate view
        View custom_view = ((AppCompatActivity) mContext).getLayoutInflater().inflate(R.layout.toast_icon_text, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(infoMessage);

        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_error_outline);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(((AppCompatActivity) mContext).getResources().getColor(R.color.blue500));

        toast.setView(custom_view);
        toast.show();
    }

    public static void showToastWithCustomDrawableAndBG(Context mContext, boolean isLong, String message, int drawableRes, int colorRes) {
        Toast toast = new Toast(mContext);
        if (isLong) {
            toast.setDuration(Toast.LENGTH_LONG);
        } else {
            toast.setDuration(Toast.LENGTH_SHORT);
        }

        //inflate view
        View custom_view = ((AppCompatActivity) mContext).getLayoutInflater().inflate(R.layout.toast_icon_text, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(message);

        try {
            ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(drawableRes);
        } catch (Exception e) {
            e.printStackTrace();
            ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_error_outline);
        }
        try {
            ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(((AppCompatActivity) mContext).getResources().getColor(colorRes));
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
            ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(((AppCompatActivity) mContext).getResources().getColor(R.color.blue500));
        }

        toast.setView(custom_view);
        toast.show();
    }
}
