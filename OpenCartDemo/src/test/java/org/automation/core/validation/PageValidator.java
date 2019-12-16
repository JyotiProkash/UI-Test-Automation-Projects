package org.automation.core.validation;


import org.automation.core.PageBase;
import org.junit.Assert;

/**
 * Created by Jyoti on 26/04/17.
 */
public class PageValidator {

    public static <T extends PageBase> void validatePageIsLoaded(T aPage, String expectedTitle) throws AssertionError {
        Assert.assertEquals("Title are not same", expectedTitle, aPage.getTitle());
    }
}
