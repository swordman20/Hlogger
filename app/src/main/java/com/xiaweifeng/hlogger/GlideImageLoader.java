package com.xiaweifeng.hlogger;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.caimuhao.rxpicker.utils.RxPickerImageLoader;

/**
 * @author Hades
 * @create 2019/1/17
 */
public class GlideImageLoader implements RxPickerImageLoader {

    @Override public void display(ImageView imageView, String path, int width, int height) {
        Glide.with(imageView.getContext())
                .load(path)
                .error(R.drawable.ic_preview_image)
                .centerCrop()
                .override(width, height)
                .into(imageView);
    }
}
