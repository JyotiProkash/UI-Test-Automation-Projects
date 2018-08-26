package com.trivago.core;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandler
{
    WebDriver driver=null;

    public WindowHandler(WebDriver driver)
    {
        this.driver=driver;

    }

    /**
     * Creation parent window method
     * @return
     */
    public WebDriver switchParentWindow()
    {
        //this.driver=driver;
        String parentWindowHandler=driver.getWindowHandle();
        return driver.switchTo().window(parentWindowHandler);

    }

    /**
     * Creation child window method
     * @param
     * @return
     */
    public WebDriver switchPopupWindow()
    {
        //this.driver=driver;
        String subWindowHandler=null;
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> iterator=handles.iterator();

        while(iterator.hasNext())
        {
            subWindowHandler=iterator.next();
        }

        return driver.switchTo().window(subWindowHandler);

    }
}
