package com.arisglobal.lsmvConfig;

import com.arisglobal.framework.lib.utils.generic.DateOperations.dateFormat;
import com.arisglobal.framework.lib.main.Constants;
import com.arisglobal.framework.lib.main.Multimaplibraries;
import com.arisglobal.framework.lib.utils.generic.XlsReader;

public abstract class lsmvConstants {

	public static boolean boolScreenShot;
	public static String path;
	public static boolean boolLog = true;
	public static String stepNumber = "1";

	public static String LSMVConfigPropertyFilePath = System.getProperty("user.dir")
			+ "\\Config\\com\\arisglobal\\lsmvConfig\\LSMV_ConfigurationSettings.xlsx";

	static XlsReader excel = new XlsReader(LSMVConfigPropertyFilePath);
//	public static String appVersion = excel.getCellData("Config", 2, "Application Version");
	public static String appVersion = constructpath(excel.getCellData("Config", 2, "Application Version"), excel.getCellData("Config", 2, "TestDataPath"));

	public static String LSMV_OR_Path = System.getProperty("user.dir")
			+ "\\Framework\\com\\arisglobal\\framework\\components\\lsmv\\OR\\LSMV_OR.xlsx";

	public static String LSMV_ValidationDict = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\LSMV_ValidationDict.xlsx";

	public static String LSMV_testData_PerformanceUI = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\LSMV_testData_PerformanceUI.xlsx";

	public static String lsmvXmlPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\";

	public static String lsmvE2EScenarioPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\End_End_Scenarios\\";

	public static String testDataresultPath = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\testData\\Resultsheet.xls";

	public static String LSMV_testDataOutput = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\testDataOutput";

	public static String LSMV_testDataInput = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\testDataInput";

	public static String LSMV_TestDataPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\";

	public static dateFormat LSMV_dateFormat = dateFormat.ddMMMyyyy;

	public static String LSMV_testData = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\LSMV_testData.xlsx";

	public static String LSMV_xslFilePath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion
			+ "\\testDataOutput\\xsl\\e2br3_table.xsl";

	public static String LSMV_R2xslFilePath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion
			+ "\\testDataOutput\\xsl\\e2br2_table.xsl";

	public static String LSMV_sourceFolderPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\EMA_R3_Input_XML";

	public static String LSMV_R2sourceFolderPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\EMA_R2_Input_XML";

	public static String LSMV_WPAsourceFolderPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\FDE_Input_XML";

	public static String LSMV_WPAdestFolderPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\testDataOutput\\FDE_Dest_XML";

	public static String LSMV_destFolderPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\testDataOutput\\destFolder";

	public static String LSMV_compFolderPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\testDataOutput\\compFolder";

	//OQ Mapping Document
	public static String LSMV_OQ_mapping = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\LSMV_OQ_Scenarios_Mapping.xlsx";
	

	// FieldToE2BMapping for E2B R2 and R3 xml comparison
	public static String fieldMappingFilePath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion
			+ "\\testDataInput\\FieldToE2BMapping.xlsx";
	
	
	public static String lsmtConfigPath = System.getProperty("user.dir")
			+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\LSMTForConfigurationSettings.xlsx";	
	
	public static String constructpath(String appVer, String testdatapath) {
		String finalAppVer = "";
		if(testdatapath.equalsIgnoreCase("CustomerName")) {
			Multimaplibraries.getTestData(Constants.SuiteConfigurationSettings, "LSMV_TenantVsScript");
			String TenantName= Multimaplibraries.getTestDataCellValue("TenantName", Constants.suiteName);
			finalAppVer = appVer + "\\" + TenantName;
		}
		else if(testdatapath.equalsIgnoreCase("EPD")) {
			finalAppVer = appVer;
		}
		else {
			finalAppVer = appVer + "\\" + testdatapath;
		}
		System.out.println("Test Data Location: " + finalAppVer);
		return finalAppVer;
	}
	
	public static void updateConstants() {
		appVersion = constructpath(excel.getCellData("Config", 2, "Application Version"), excel.getCellData("Config", 2, "TestDataPath"));
		LSMV_testData = System.getProperty("user.dir")
				+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\LSMV_testData.xlsx";
		LSMV_testDataOutput = System.getProperty("user.dir")
				+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\testDataOutput";
		LSMV_testDataInput = System.getProperty("user.dir")
				+ "\\Scripts\\com\\arisglobal\\scripts\\testdata\\lsmv\\" + appVersion + "\\testDataInput";

	}
}