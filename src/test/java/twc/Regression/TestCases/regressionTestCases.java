package twc.Regression.TestCases;

import java.io.File;

import org.openqa.selenium.internal.Killable;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import twc.Regression.HandleWithCharles.CharlesProxy;

//import twc.Automation.HandleMapLocal.MapLocalFunctions;
import twc.Regression.CustomParamValidation.CustomParamFunctions;
import twc.Regression.CustomParamValidation.validate_CustomParameter;
import twc.Regression.Driver.Drivers;
import twc.Regression.General.Functions;
import twc.Regression.General.TwcAndroidBaseTest;
import twc.Regression.HandleWithAppium.AppiumFunctions;
import twc.Regression.HandleWithCharles.CharlesFunctions;
import twc.Regression.ReadDataFromFile.read_excel_data;
import twc.Regression.utils.DeleteFiles;

public class regressionTestCases extends TwcAndroidBaseTest {
	
	public static String CurrentWifiName=null;
	
	private static final String CONFIG_FILE_PATH = "charles_common.config";

	private static final String BN_SEVERE1_CONFIG_FILE_PATH = "BNSevere1charles_common.config";
	private static final String BN_SEVERE2_CONFIG_FILE_PATH = "BNSevere2charles_common.config";
	private static final String CRITEO_CONFIG_FILE_PATH = "Criteocharles_common.config";
	private static final String CRITEO_NONUS_CONFIG_FILE_PATH = "CriteoNonUScharles_common.config";
	// public static CharlesProxy proxy;
	public File configFile;
	private CharlesProxy proxy;


	@Test(priority = 0, enabled = true)
	@Description("Verify homescreen hourly ad call amazon bid id")
	public void Verify_homescreen_hourly_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== homescreen hourly ad call amazon bid id ====================");

		System.out.println("****** homescreen hourly ad call amazon bid id validation Started");
		logStep("****** homescreen hourly ad call amazon bid id validation Started");
		CharlesFunctions.createXMLFileForCharlesSessionFile();
		Functions.validate_aax_bid_value_with_gampad_bid_value("Pulltorefresh", true);
		//Functions.verifyAAX_SlotId("Pulltorefresh");
	}
	
	
	@Test(priority = 1, enabled = true)
	@Description("Verify Feed1 ad call amazon bid id")
	public void Verify_Feed1_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed1 ad call amazon bid id ====================");

		System.out.println("****** Feed1 ad call amazon bid id validation Started");
		logStep("****** Feed1 ad call amazon bid id validation Started");
	  Functions.validate_aax_bid_value_with_gampad_bid_value("Feed1", true);
		//Functions.verifyAAX_SlotId("Feed1");
	}
	
	
	
	@Test(priority = 2, enabled = true)
	@Description("Verify Feed2 ad call amazon bid id")
	public void Verify_Feed2_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed2 ad call amazon bid id ====================");
		System.out.println("****** Feed2 ad call amazon bid id validation Started");
		logStep("****** Feed2 ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Feed2", true);
	}
	
	@Test(priority = 3, enabled = true)
	@Description("Verify Feed3 ad call amazon bid id")
	public void Verify_Feed3_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed3 ad call amazon bid id ====================");

		System.out.println("****** Feed3 ad call amazon bid id validation Started");
		logStep("****** Feed3 ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Feed3", true);
	}
	
	
	@Test(priority = 4, enabled = true)
	@Description("Verify Feed4 ad call amazon bid id")
	public void Verify_Feed4_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Feed4 ad call amazon bid id ====================");

		System.out.println("****** Feed4 ad call amazon bid id validation Started");
		logStep("****** Feed4 ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Feed4", true);
	}
	
	
	
	
	@Test(priority = 5, enabled = true)
	@Description("Verify Hourly Details ad call amazon bid id")
	public void Verify_Hourly_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly Details ad call amazon bid id ====================");

		System.out.println("****** Hourly Details ad call amazon bid id validation Started");
		logStep("****** Hourly Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly", true);
	}
	
	
	
	
	@Test(priority = 7, enabled = true)
	@Description("Verify Hourly1 Details ad call amazon bid id")
	public void Verify_Hourly1_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly1 Details ad call amazon bid id ====================");

		System.out.println("****** Hourly1 Details ad call amazon bid id validation Started");
		logStep("****** Hourly1 Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly1", true);
	}
	
	
	@Test(priority = 8, enabled = true)
	@Description("Verify Hourly2 Details ad call amazon bid id")
	public void Verify_Hourly2_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly2 Details ad call amazon bid id ====================");

		System.out.println("****** Hourly2 Details ad call amazon bid id validation Started");
		logStep("****** Hourly2 Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly2", true);
	}
	
	@Test(priority = 9, enabled = true)
	@Description("Verify Hourly3 Details ad call amazon bid id")
	public void Verify_Hourly3_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Hourly3 Details ad call amazon bid id ====================");

		System.out.println("****** Hourly1 Details ad call amazon bid id validation Started");
		logStep("****** Hourly3 Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value( "Hourly3", true);
	}
	
	
	
	
	@Test(priority = 10, enabled = true)
	@Description("Verify Daily Details ad call amazon bid id")
	public void Verify_Daily_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Daily Details ad call amazon bid id ====================");

		System.out.println("****** Daily Details ad call amazon bid id validation Started");
		logStep("****** Daily Details ad call amazon bid id validation Started");
Functions.validate_aax_bid_value_with_gampad_bid_value("Daily(10day)", true);
	}
	
	
	

	@Test(priority = 12, enabled = true)
	@Description("Verify Map Details ad call amazon bid id")
	public void Verify_Map_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Map Details ad call amazon bid id ====================");

		System.out.println("****** Map Details ad call amazon bid id validation Started");
		logStep("****** Map Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Map", true);
	}
	
	
	
	
	
	@Test(priority = 14, enabled = true)
	@Description("Verify Today Details ad call amazon bid id")
	public void Verify_Today_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Today Details ad call amazon bid id ====================");

		System.out.println("****** Today Details ad call amazon bid id validation Started");
		logStep("****** Today Details ad call amazon bid id validation Started");
	Functions.validate_aax_bid_value_with_gampad_bid_value("Today", true);
	}
	
	
	
	@Test(priority = 15, enabled = true)
	@Description("Verify AQ Details ad call amazon bid id")
	public void Verify_AQ_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== AQ Details ad call amazon bid id ====================");

		System.out.println("****** AQ Details ad call amazon bid id validation Started");
		logStep("****** AQ Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Air Quality(Content)", true);
	}
	
	
	
	
	

	@Test(priority = 17, enabled = true)
	@Description("Verify AlertCenter ad call amazon bid id")
	public void Verify_AlertCenter_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== AlertCenter ad call amazon bid id ====================");

		System.out.println("****** AlertCenter ad call amazon bid id validation Started");
		logStep("****** AlertCenter ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("MyAlerts", true);

	}
	
	
	
	


	@Test(priority = 19, enabled = true)
	@Description("Verify Health Boat & Beach Details ad call amazon bid id")
	public void Verify_Health_BoatAndBeach_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Health Boat & Beach Details ad call amazon bid id ====================");

		System.out.println("****** Health Boat & Beach Details ad call amazon bid id validation Started");
		logStep("****** Health Boat & Beach Details ad call amazon bid id validation Started");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Health(boatAndBeach)", true);
	}

		@Test(priority = 20, enabled = true)
	@Description("Verify amazon aax Seasonal Hub Details ad call")
	public void Verify_amazon_aax_SeasonalHub_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon aax Seasonal Hub Details ad call ====================");

		System.out.println("****** amazon aax Seasonal Hub Details ad call validation Started");
		logStep("****** amazon aax Seasonal Hub Details ad call validation Started");

		// Functions.verifyAAX_SlotId("Smoke", "Daily(10day)");
		Functions.validate_aax_bid_value_with_gampad_bid_value("SeasonalHub(Details)", true);

	}
	


	@Test(priority = 21, enabled = true)
	@Description("Verify Health Running Details ad call amazon bid id")
	public void Verify_Health_Running_Details_ad_call_amazon_bid_id() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Health Running Details ad call amazon bid id ====================");

		System.out.println("****** Health Running Details ad call amazon bid id validation Started");
		logStep("****** Health Running Details ad call amazon bid id validation Started");
		CharlesFunctions.archive_folder("Charles");
		Functions.validate_aax_bid_value_with_gampad_bid_value("Health(goRun)", true);
	}
	
	
	
	
	

}
