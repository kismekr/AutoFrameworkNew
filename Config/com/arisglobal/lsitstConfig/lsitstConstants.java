package com.arisglobal.lsitstConfig;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class lsitstConstants {

	// New framework constants
	public static int multiRecordCountPersonPage;

	public static boolean boolScreenShot = true;
	public static int maxIterateCount = 100;

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

	// public static String testFeed;
	// public static String SPTM;
	// public static String application;

	// Pass and Fail update
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

	public static String LSITSTConfigPropertyFilePath = System.getProperty("user.dir")
			+ "\\Config\\com\\arisglobal\\lsitstConfig\\LSITST_ConfigurationSettings.xlsx";

	public static String LSITST_testDataOutput = System.getProperty("user.dir")
			+ "Scripts\\com\\arisglobal\\scripts\\testdata\\lsitst\\testDataOutput";

	public static String LSRIMSConfigPropertyFilePath = System.getProperty("user.dir")
			+ "\\Config\\LSRIMS\\LSRIMS_ConfigurationSettings.xlsx";

	public static String LSMVConfigPropertyFilePath = System.getProperty("user.dir")
			+ "\\Config\\LSMV\\LSMV_ConfigurationSettings.xlsx";

	public static String SafetyConfigPropertyFilePath = System.getProperty("user.dir")
			+ "\\Config\\SAFETY\\SAFETY_ConfigurationSettings.xlsx";

	// Excel sheets
	// Test execution summary
	public static String TestExecutionSummaryReportPath = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\testExecutionSummary\\testExecutionSummary.xls";
	// public static String TestExecutionSummaryReportPath =
	// System.getProperty("user.dir")

	// Object repository
	public static String LSMV_OR_Path = System.getProperty("user.dir")
			+ "\\Framework\\com\\arisglobal\\framework\\components\\lsmv\\OR\\LSMV_OR.xlsx";

	public static String LSITST_FileUploadPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsitst\\FileUploads\\";

	// Object repository
	public static String LSRIMS_OR_Path = System.getProperty("user.dir")
			+ "\\Framework\\com\\arisglobal\\framework\\components\\lsrims\\OR\\LSRIMS_OR.xlsx";

	// Object repository
	public static String Safety_OR_Path = System.getProperty("user.dir")
			+ "\\Framework\\com\\arisglobal\\framework\\components\\safety\\OR\\Safety_OR.xlsx";

	public static String LSMV_testData = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\LSMV_testData.xlsx";

	public static String LSRIMS_testData = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsrims\\LSRIMS_testData.xlsx";

	public static String LSSMV_testData = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lssmv\\LSSMV_testData.xlsx";

	public static String LSSMVCR_testData = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lssmv\\LSSMVCR_testData.xlsx";

	public static String LSITST_testData = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsitst\\LSITST_testData.xlsx";

	// Test data
	public static String testDataPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\LSMV_testData.xlsx";

	public static String lsmvXmlPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\";

	public static String testDataresultPath = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\testData\\Resultsheet.xls";

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