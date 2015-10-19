package org.toxic.demoApp.android;

import com.toxic.android.PlatfromAndroid;
import org.toxic.demoApp.core.AppDemo;

/**
 * <p>Example of executing android application.</p>
 * <br/>
 * @author Strelock
 */
public class AppDemoAndroid extends PlatfromAndroid {

    @Override
    public void setApplication() {
        this.application = new AppDemo();
    }

    @Override
    public void start() {

    }

}
