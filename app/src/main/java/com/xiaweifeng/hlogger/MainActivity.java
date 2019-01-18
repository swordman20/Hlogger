package com.xiaweifeng.hlogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.caimuhao.rxpicker.RxPicker;
import com.caimuhao.rxpicker.bean.ImageItem;
import com.xiaweifeng.hlogger.library.Hlog;

import java.util.List;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RxPicker.init(new GlideImageLoader());
    }

    public void Test(View view) {
        Hlog.d("测试方法");
//        RxPicker.of().start(this).subscribe(new Consumer<List<ImageItem>>() {
//            @Override
//            public void accept(@NonNull List<ImageItem> imageItems) throws Exception {
//                //得到结果
//                if (imageItems.size() == 0) {
//                    Hlog.d("没有选择图片");
//                }else {
//                    Hlog.d("选中的图片："+imageItems.get(0).getPath());
//                }
//
//            }
//        });

        RxPicker.of()
                .single(false)
                .camera(true)
                .limit(3,9)
                .start(this)
                .subscribe(new Consumer<List<ImageItem>>() {
                    @Override public void accept(@NonNull List<ImageItem> imageItems) throws Exception {
                        //Get the result
                    }
                });
    }
}
