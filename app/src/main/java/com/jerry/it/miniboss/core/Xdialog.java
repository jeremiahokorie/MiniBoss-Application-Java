package com.jerry.it.miniboss.core;

import android.content.Context;
import android.graphics.Color;

import com.geniusforapp.fancydialog.FancyAlertDialog;
import com.jerry.it.miniboss.R;

public class Xdialog {

   public static FancyAlertDialog.Builder dialog(Context context, String title, String body,
                                                 FancyAlertDialog.OnPositiveClicked callback,
                                                 FancyAlertDialog.OnNegativeClicked callback2,
                                                 String yesMessage, String noMessage) {

        FancyAlertDialog.Builder alert = new FancyAlertDialog.Builder(context)
                .setPositiveButtonFont("font/futura-medium.ttf")
                .setNegativeButtonFont("font/futura-medium.ttf")
                .setTitleFont("font/futura-medium.ttf")
                .setSubTitleFont("font/futura-medium.ttf")
                .setTextSubTitle(title)
                .setBody(body)
                .setBodyFont("font/futura.ttf")
                .setBodyColor(Color.BLACK)
                .setBodyColor(R.color.dot_dark_screen1)
                .setNegativeColor(R.color.dot_dark)
                .setNegativeButtonText(noMessage)
                .setOnNegativeClicked(callback2)
                .setPositiveButtonText(yesMessage)
                .setPositiveColor(R.color.dot_dark_screen1)
                .setOnPositiveClicked(callback)
                .setButtonsGravity(FancyAlertDialog.PanelGravity.LEFT)
                .setBodyGravity(FancyAlertDialog.TextGravity.CENTER)
                .setTitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setSubtitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setCancelable(false)
                .build();

        return alert;
    }

    public static FancyAlertDialog.Builder confirm(Context context, String title, String body,
                                                   FancyAlertDialog.OnPositiveClicked callback,
                                                   FancyAlertDialog.OnNegativeClicked callback2,
                                                   String yesMessage, String noMessage) {

        FancyAlertDialog.Builder alert = new FancyAlertDialog.Builder(context)
                .setPositiveButtonFont("font/futura-medium.ttf")
                .setNegativeButtonFont("font/futura-medium.ttf")
                .setTitleFont("font/futura-medium.ttf")
                .setSubTitleFont("font/futura-medium.ttf")
                .setTextSubTitle(title)
                .setBody(body)
                .setBodyFont("font/futura.ttf")
                .setBodyColor(Color.BLACK)
                .setBodyColor(R.color.dot_dark)
                .setNegativeColor(R.color.dot_dark)
                .setNegativeButtonText(noMessage)
                .setOnNegativeClicked(callback2)
                .setPositiveButtonText(yesMessage)
                .setPositiveColor(R.color.dot_dark_screen1)
                .setOnPositiveClicked(callback)
                .setButtonsGravity(FancyAlertDialog.PanelGravity.CENTER)
                .setBodyGravity(FancyAlertDialog.TextGravity.CENTER)
                .setTitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setSubtitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setCancelable(false)
                .build();

        return alert;
    }

    public static FancyAlertDialog.Builder confirmCancel(Context context, String title, String body,
                                                         FancyAlertDialog.OnPositiveClicked callback,
                                                         FancyAlertDialog.OnNegativeClicked callback2,
                                                         String yesMessage, String noMessage) {

        FancyAlertDialog.Builder alert = new FancyAlertDialog.Builder(context)
                .setPositiveButtonFont("font/futura-medium.ttf")
                .setNegativeButtonFont("font/futura-medium.ttf")
                .setTitleFont("font/futura-medium.ttf")
                .setSubTitleFont("font/futura-medium.ttf")
                .setTextSubTitle(title)
                .setBody(body)
                .setBodyFont("font/futura.ttf")
                .setBodyColor(Color.BLACK)
                .setBodyColor(R.color.dot_dark)
                .setNegativeColor(R.color.dot_dark)
                .setNegativeButtonText(noMessage)
                .setOnNegativeClicked(callback2)
                .setPositiveButtonText(yesMessage)
                .setPositiveColor(R.color.dot_dark_screen1)
                .setOnPositiveClicked(callback)
                .setButtonsGravity(FancyAlertDialog.PanelGravity.CENTER)
                .setBodyGravity(FancyAlertDialog.TextGravity.CENTER)
                .setTitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setSubtitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setCancelable(true)
                .build();

        return alert;
    }

    public static FancyAlertDialog.Builder dialog(Context context, String title, String body,FancyAlertDialog.OnPositiveClicked callback,
                                                  String yesMessage, String noMessage) {

        FancyAlertDialog.Builder alert = new FancyAlertDialog.Builder(context)
                .setPositiveButtonFont("font/futura-medium.ttf")
                .setTitleFont("font/futura-medium.ttf")
                .setSubTitleFont("font/futura-medium.ttf")
                .setTextSubTitle(title)
                .setBody(body)
                .setBodyFont("font/futura.ttf")
                .setBodyColor(Color.BLACK)
                .setBodyColor(R.color.dot_dark)
                .setNegativeColor(R.color.dot_dark)
                .setPositiveButtonText(yesMessage)
                .setPositiveColor(R.color.dot_dark_screen1)
                .setOnPositiveClicked(callback)
                .setButtonsGravity(FancyAlertDialog.PanelGravity.CENTER)
                .setBodyGravity(FancyAlertDialog.TextGravity.CENTER)
                .setTitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setSubtitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setCancelable(false)
                .build();

        return alert;
    }

    public static FancyAlertDialog.Builder message(Context context, String title, String body,                                                   FancyAlertDialog.OnPositiveClicked callback,
                                                   String yesMessage, String noMessage) {

        FancyAlertDialog.Builder alert = new FancyAlertDialog.Builder(context)
                .setPositiveButtonFont("font/futura-medium.ttf")
                .setTitleFont("font/futura-medium.ttf")
                .setSubTitleFont("font/futura-medium.ttf")
                .setTextSubTitle(title)
                .setBody(body)
                .setBodyFont("font/futura.ttf")
                .setBodyColor(Color.BLACK)
                .setBodyColor(R.color.dot_dark_screen1)
                .setNegativeColor(R.color.dot_dark)
                .setPositiveButtonText(yesMessage)
                .setPositiveColor(R.color.dot_dark_screen1)
                .setOnPositiveClicked(callback)
                .setButtonsGravity(FancyAlertDialog.PanelGravity.CENTER)
                .setBodyGravity(FancyAlertDialog.TextGravity.LEFT)
                .setTitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setSubtitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setCancelable(false)
                .build();

        return alert;
    }
}
