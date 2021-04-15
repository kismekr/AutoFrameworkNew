package com.arisglobal.lsrimsConfig;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.openqa.selenium.WebDriver;

import com.arisglobal.framework.lib.main.Constants;
import com.arisglobal.framework.lib.utils.generic.XlsReader;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class lsrimsConstants {

	// New framework constants
	public static int multiRecordCountPersonPage;

	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static String toolType;
	public static String selenium = "Selenium";
	public static ExtentReporter report;
	public static String browser = "Chrome";
	public static String directoryFileName;
	public static String timeStamp;
	public static String ARISG_URL;
	public static String Sceptre_URL;
	public static String AERNo;
	public static String TCID;
	public static int ind;
	public static ExtentReports extentReport;
	public static ExtentHtmlReporter htmlReporter;
	public static String Resultpath;
	public static boolean boolScreenShot = true;
	public static boolean boolLog = true;
	public static boolean boolALMStepIncerement = true;
	public static String stepNumber = "1";
	
	
	public static String KEYWORD_PASS = "PASS";
	public static String KEYWORD_FAIL = "FAIL";
	public static String KEYWORD_NA = "NOT APPLICABLE FOR THIS CASE";
	public static String KEYWORD_FAILNAVIGATION = "NAVIGATION FAIL";
	public static String KEYWORD_NOTSTARTED = "NOT STARTED";
	public static String KEYWORD_SKIPPED = "SKIPPED";
	public static String KEYWORD_COMPLETED = "COMPLETED";
	public static String KEYWORD_OBJECTABSENT = "OBJECT IS ABSENT";
	public static String KEYWORD_OBJECTPRESENT = "OBJECT PRESENT";
	public static String KEYWORD_ACTIONPERFORMED = "ACTION PERFORMED";
	public static String KEYWORD_ACTIONNOTPERFORMED = "ACTION NOT PERFORMED";
	public static String OR_AttributeValue = "AttributeValue";
	public static String KEYWORD_VOIDPASS = "VOIDPASS";
	public static String KEYWORD_MULTIDATA = "MULTIDATA";
	public static String KEYWORD_MANULCHECHK = "MANUAL CHECKBOX NOT CHECKED";
	public static String LSITSTWindow = "agXchange-7 Enterprise Platform";
	
	// Config properties file path
		public static String LSRIMSConfigPropertyFilePath = System.getProperty("user.dir")
				+ "\\Config\\com\\arisglobal\\lsrimsConfig\\LSRIMS_ConfigurationSettings.xlsx";
	
	 static XlsReader excel = new XlsReader(LSRIMSConfigPropertyFilePath);
	public static String appVersion = excel.getCellData("Config", 2, "Application Version");
	
	public static String LSRIMS_FileUploadPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsrims\\"+appVersion+"\\FileUploads\\";

	// Excel sheets
	// Test execution summary
	public static String TestExecutionSummaryReportPath = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\testExecutionSummary\\testExecutionSummary.xls";
	

	public static String LSRIMS_testData = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsrims\\"+appVersion+"\\LSRIMS_testData.xlsx";

	

	public static String testDataresultPath = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\testData\\Resultsheet.xls";

	public static String LSRIMS_testDataOutput = System.getProperty("user.dir")
            + "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsrims\\"+appVersion+"\\Output";
	
	
	
	// Master Codelist file
	public static String masterCodeListFile = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\testData\\MasterCodeList.xls";

	// Patch patchdata
	public static String patchtestDataPath = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\testData\\Patch21Results.xls";

	// Recording path
	public static String recordingPath = System.getProperty("user.dir")
			+ "\\Framework\\com\\arisglobal\\framework\\lib\\utils\\generic";

	// ffmpeg path
	public static String ffmpegPath = System.getProperty("user.dir")
			+ "\\Framework\\com\\arisglobal\\framework\\lib\\utils\\generic\\ffmpeg";

	// Test File Path
	public static String testDataFile = "";

	public static String OR_AGSheetName = "AG_OR";
	public static String OR_SceptreSheetName = "SCEPTRE_OR";
	public static String OR_Identifier = "LocatorName";
	public static String OR_LocatorType = "AttributeType";
	public static String OR_Locator = "Locator";
	public static String OR_TestData = "TestData";

	public static String CurrentWindow;

	// Object repository multimap
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static MultiMap<String, ?> multiMapForObjectRepository = new MultiValueMap();

	// Object repository multimap
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static MultiMap<String, ?> multiMapForSceptreObjectRepository = new MultiValueMap();

	// Multimap for target result
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static MultiMap<String, ?> multiMapForTargetResult = new MultiValueMap();

	// Smoke suite Test data
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static MultiMap<String, ?> objectRepository = new MultiValueMap();

	// Smoke suite Test data
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static MultiMap<String, ?> testdata = new MultiValueMap();

	// column Name
	public static String locatorName = "LocatorName";
	public static String locatorType = "LocatorType";
	public static String locator = "Locator";

	public static String testDataName = "TestDataName";
	public static String testDataValue = "TestDataValue";
	
	
	

}