package org.automation.pages.common;

/**
 * Created by shantonu on 26/01/17.
 */
public class ProductCatagoryLinkCreator {

    public static String getCatagoryLink(int path){
        return "https://demo.opencart.com/index.php?route=product/category&path=34_"+path;
    }
}
