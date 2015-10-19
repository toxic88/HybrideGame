package org.toxic.demoApp.java;

import com.toxic.core.engine.base.IApplication;
import org.toxic.demoApp.core.AppDemo;
import com.toxic.java.PlatfromJava;

/**
 * <p>
 *  Test Java application.
 * </p>
 * <br/>
 * @author Strelock
 *
 */
public class AppDemoJava extends PlatfromJava {

  /**
   * <p>
   *  Default constructor of java platform.
   * </p> 
   * <br/>
   * @param app instance of application
   */
  public AppDemoJava(IApplication app) {
    super(app);
  }

  public static void main(String[] args) {
    (new AppDemoJava(new AppDemo())).start();
  }

}
