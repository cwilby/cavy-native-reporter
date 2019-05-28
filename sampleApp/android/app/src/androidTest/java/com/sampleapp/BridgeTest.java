package com.sampleapp.bridgetest;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;
import com.cavynativereporter.RNCavyNativeReporterModule;
import com.sampleapp.MainActivity;

public class BridgeTest {

  @Rule
  public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule(MainActivity.class);

  @Test
  public void testBridge() throws Exception {

    RNCavyNativeReporterModule.onFinish(new Runnable() {
      @Override
      public void run() {
        assertEquals(true, false);
      }
    });

  }
}
