package com.local.farmatodo.drivers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class AndroidAppiumDriver {
	public AppiumDriver<WebElement> driver;
	public static List<AndroidAppiumDriver> lista = new ArrayList<>();

	public static AppiumDriver<WebElement> android() {
		lista.add(new AndroidAppiumDriver());
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("deviceName", "RQ3002R6RJ");
		capabilities.setCapability("udid", "RQ3002R6RJ");
		capabilities.setCapability("appPackage", "com.farmatodo.app");
		capabilities.setCapability("appActivity", "com.imaginamos.farmatodo.main.activity.SplashActivity");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("automationName", "UiAutomator2");
		try {
			lista.get(lista.size() - 1).driver = new AppiumDriver<WebElement>(new URL("http://localhost:4723/wd/hub"),
					capabilities);
		} catch (MalformedURLException e) {

		}
		lista.get(lista.size() - 1).driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return lista.get(lista.size() - 1).driver;
	}

	public static AppiumDriver<WebElement> getAndroid() {
		return lista.get(lista.size() - 1).driver;
	}

}
