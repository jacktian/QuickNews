package com.lb.quicknews.view;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EViewGroup;

import com.lb.quicknews.R;
import com.lb.quicknews.activity.BaseActivity;
import com.lb.quicknews.activity.MainActivity_;
import com.lb.quicknews.activity.MoreActivity_;
import com.lb.quicknews.activity.NewsActivity_;
import com.lb.quicknews.activity.PictureSinaActivity_;
import com.lb.quicknews.activity.VideoActivity_;
import com.lb.quicknews.activity.WeatherActivity_;
import com.lb.quicknews.initview.SlidingMenuView;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

@EViewGroup(R.layout.activity_left)
public class LeftView extends LinearLayout {
	private final BaseActivity context;

	public LeftView(Context context) {
		super(context);
		this.context = (BaseActivity) context;
	}

	@Click(R.id.pics)
	public void enterPics(View view) {
		context.openActivity(PictureSinaActivity_.class);
		isShow();
	}

	@Click(R.id.video)
	public void enterVideo(View view) {
		context.openActivity(VideoActivity_.class);
		isShow();
	}

	@Click(R.id.news)
	public void enterNews(View view) {
		isShow();
	}

	@Click(R.id.tianqi)
	public void enterWeather(View view) {
		context.openActivity(WeatherActivity_.class);
		isShow();
	}

	@Click(R.id.more)
	public void enterMore(View view) {
		context.openActivity(MoreActivity_.class);
		isShow();
	}

	public void isShow() {
		if (SlidingMenuView.instance().slidingMenu.isMenuShowing()) {
			SlidingMenuView.instance().slidingMenu.showContent();
		}
	}
}
