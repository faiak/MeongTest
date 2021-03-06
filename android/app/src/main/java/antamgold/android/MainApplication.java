package antamgold.android;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.moengage.react.MoEReactPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import com.moengage.react.MoEReactPackage;
import com.moengage.core.MoEngage;


import com.moengage.core.Logger;
import com.moengage.react.MoEInitializer;
import com.moengage.react.MoEReactPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new MoEReactPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();

    MoEngage moEngage =  new MoEngage.Builder(this, "G9761HFAN9DSOKHHCXE00OKA").build();
    MoEInitializer.initialize(moEngage);


    SoLoader.init(this, /* native exopackage */ false);
  }
}
