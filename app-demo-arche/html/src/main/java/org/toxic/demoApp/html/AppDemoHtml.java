package org.toxic.demoApp.html;

import org.toxic.demoApp.core.AppDemo;
import com.toxic.html.ApplicationHtml;


/**
 * <p>
 *  Entry point of 'html' module.
 * </p>
 * <br/>
 * @author Strelock
 *
 */
public class AppDemoHtml extends ApplicationHtml {

  @Override
  public void setApplication() {
    this.application = new AppDemo();
  }


}
