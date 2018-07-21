package com.example.rainer.myapp.screengrab;

import com.example.rainer.myapp.MainActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Environment;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import tools.fastlane.screengrab.Screengrab;
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy;
import tools.fastlane.screengrab.locale.LocaleTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;


/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ScreengrabTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @ClassRule
    public static final LocaleTestRule localeTestRule = new LocaleTestRule();

//    @Rule
//    public IntentsTestRule<MainActivity> activityTestRule = new IntentsTestRule<>(MainActivity.class, false, false);

    private File imageFile;

//    @Before
//    public void setUp() throws NoSuchFieldException, IllegalAccessException {
//        Screengrab.setDefaultScreenshotStrategy(new UiAutomatorScreenshotStrategy());
//    }

    @Before
    public void setUp() {
        Screengrab.setDefaultScreenshotStrategy(new UiAutomatorScreenshotStrategy());
    }

    @Test
    public void screenshot1() throws Exception {
//        onView(ViewMatchers.withId(R.id.fab)).perform(click());
        Thread.sleep(500);
        Screengrab.screenshot("screenshot_1");
        Thread.sleep(500);
    }
}

