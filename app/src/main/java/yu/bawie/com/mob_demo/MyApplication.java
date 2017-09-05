package yu.bawie.com.mob_demo;

import android.app.Application;
import android.content.Context;


/**
 * Created by YU on 2017/8/11.
 */

public class MyApplication extends Application {
    private  Context context;
    @Override
    public void onCreate() {
        super.onCreate();
//        MobSDK.init(context,"1cfcac49e9320", "1b24644ec0ef00d9ea6a9a7414e9c0d3");
//        SMSSDK.initSDK(this, "1cfcac49e9320", "1b24644ec0ef00d9ea6a9a7414e9c0d3");
    }
}
