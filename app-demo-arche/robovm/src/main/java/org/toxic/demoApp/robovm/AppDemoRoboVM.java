package org.toxic.demoApp.robovm;

import com.toxic.robovm.PlatformRoboVM;
import org.toxic.demoApp.core.AppDemo;


/**
 * <p>
 *  Launcher of roboVM platform's.
 * </p>
 * <br/>
 * @author Strelock
 *
 */
public class AppDemoRoboVM extends PlatformRoboVM {
    
    /**
     * <p>
     *  Default constructor of java platform.
     * </p> 
     * <br/>
     * @param app instance of application
     */
    public AppDemoRoboVM() {
      
    }

    /**
     * <p>
     *  Entry point for roboVM project.
     * </p>
     * <br/>
     *  Strelock : add link here!
     * <br/>
     * @param args
     */
    public static void main(String[] args) {
      PlatformRoboVM.setArgs(args);
      PlatformRoboVM.setApp(new AppDemo());
      (new AppDemoRoboVM()).start();;
    }

}
