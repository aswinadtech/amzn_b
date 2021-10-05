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


	@Test(priority = 162, enabled = true)
	@Description("Verify Criteo SDK config app call")
	public void Verify_Criteo_SDK_config_app_Call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK config/app call ====================");

		System.out.println("****** Criteo SDK config/app call validation Started");
		logStep("****** Criteo SDK config/app call validation Started");

		CharlesFunctions.createXMLFileForCharlesSessionFile();
	Functions.verifyCriteo_config_app_Call("Criteo");

	//Functions.verifyCriteo_config_app_Call("Criteo", false);
	}
	
	
		
	@Test(priority = 163, enabled = true)
	@Description("Verify Criteo SDK inapp v2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK inapp/v2 call ====================");

		System.out.println("****** Criteo SDK inapp/v2 call validation Started");
		logStep("****** Criteo SDK inapp/v2 call validation Started");

	Functions.verifyCriteo_inapp_v2_Call("Criteo");
	//Functions.verifyCriteo_inapp_v2_Call("Criteo", false);

	}
	
	

	
		@Test(priority = 164, enabled = true)
	@Description("Validating 'cpId' parameter of Criteo SDK config app call")
	public void Validate_Criteo_SDK_config_app_Call_cpId_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'cpId' parameter of Criteo SDK config app call");
		logStep("****** Validating 'cpId' parameter of Criteo SDK config app call");
		Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "cpId", "B-051673");

	}
	@Test(priority = 166, enabled = true)
	@Description("Validating 'bundleId' parameter of Criteo SDK config app call ")
	public void Validate_Criteo_SDK_config_app_Call_bundleId_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'bundleId' parameter of Criteo SDK config app call");
		logStep("****** Validating 'bundleId' parameter of Criteo SDK config app call");
		Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "bundleId", "com.weather.Weather");

	}
	
	@Test(priority = 168, enabled = true)
	@Description("Validating 'sdkVersion' parameter of Criteo SDK config app call ")
	public void Validate_Criteo_SDK_config_app_Call_sdkVersion_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
		logStep("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
		Functions.validate_Criteo_SDK_config_app_call_parameter("Criteo", "sdkVersion", "4.4.0");

	}
	
		@Test(priority = 169, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with homescreen hourly call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_homescreen_hourly_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with homescreen hourly call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call cpm parameter with homescreen hourly call validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with homescreen hourly call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Pulltorefresh", "cpm",true);
	}

	@Test(priority = 170, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with homescreen hourly call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_homescreen_hourly_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with homescreen hourly call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call size parameter with homescreen hourly call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with homescreen hourly call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Pulltorefresh", "size",true);
	}

	@Test(priority = 172, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with homescreen hourly call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_homescreen_hourly_gampad_call()
			throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with homescreen hourly call====================");

		System.out.println(
				"****** Criteo SDK invapp v2 call displayUrl parameter with homescreen hourly call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with homescreen hourly call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Pulltorefresh","displayUrl", true);
	}

	
	
	
	

	

	
	@Test(priority = 174, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed1 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed1_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed1 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed1 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed1 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "cpm", true);
	}

	@Test(priority = 176, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed1 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed1_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed1 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed1 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed1 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "size", true);
	}

	@Test(priority = 178, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed1 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed1_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed1 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed1 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed1 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed1", "displayUrl",true);
	}
	
	
	
	
	
	@Test(priority = 180, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed2_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed2 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed2 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed2 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed2", "cpm", true);
	}

	@Test(priority = 182, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed2_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed2 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed2 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed2 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed2", "size", true);
	}

	@Test(priority = 184, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed2_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed2 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed2 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed2 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed2", "displayUrl",true);
	}
	
	
	@Test(priority = 186, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed3 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed3_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed3 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed3 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed3 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed3", "cpm", true);
	}

	@Test(priority = 188, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed3 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed3_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed3 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed3 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed3 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed3", "size", true);
	}

	@Test(priority = 190, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed3 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed3_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed3 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed3 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed3 call validation Started");
		
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed3", "displayUrl",true);
	}

	
	
	
	@Test(priority = 192, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed4 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed4_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed4 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed4 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed4 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Feed4", "cpm", true);
	}

	@Test(priority = 194, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed4 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed4_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed4 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed4 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed4 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed4", "size", true);
	}

	@Test(priority = 196, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed4 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed4_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed4 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed4 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed4 call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed4", "displayUrl",true);
	}
	
	
	
	@Test(priority = 198, enabled = true)
	@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Feed5 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Feed5_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call cpm parameter with  Feed5 call====================");

		System.out.println("****** Criteo SDK invapp v2 call cpm parameter with  Feed5 validation Started");
		logStep("****** Criteo SDK invapp v2 call cpm parameter with Feed5 call validation Started");

		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Feed5", "cpm", true);
	}

	@Test(priority = 200, enabled = true)
	@Description("Verify size parameter of Criteo SDK inapp v2 call with Feed5 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Feed5_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call size parameter with Feed5 call====================");

		System.out.println("****** Criteo SDK invapp v2 call size parameter with Feed5 call validation Started");
		logStep("****** Criteo SDK invapp v2 call size parameter with Feed5 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Feed5", "size", true);
	}

	@Test(priority = 202, enabled = true)
	@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Feed5 call")
	public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Feed5_gampad_call() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== Criteo SDK invapp v2 call displayUrl parameter with Feed5 call====================");

		System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter with Feed5 call validation Started");
		logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Feed5 call validation Started");
		Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Feed5", "displayUrl",true);
	}
	
	
	

	@Test(priority = 208, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly_details_gampad_call() throws Exception {

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly Details validation Started");
    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "cpm", true);
}

@Test(priority = 210, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly Details validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter of Hourly Details validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "size", true);
}
@Test(priority = 212, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
	System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly Details validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly", "displayUrl",true);
}


		@Test(priority = 214, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly1 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly1_details_gampad_call() throws Exception {

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly1 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly1 Details validation Started");
    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly1", "cpm", true);
}

@Test(priority = 216, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly1 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly1_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly1 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter of Hourly1 Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly1", "size", true);
}
@Test(priority = 218, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly1 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly1_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
	System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly1 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly1 Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly1", "displayUrl",true);
}

										
										
		@Test(priority = 220, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly2 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly2_details_gampad_call() throws Exception {

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly2 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly2 Details validation Started");
    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly2", "cpm", true);
}

@Test(priority = 222, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly2 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly2_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly2 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter of Hourly2 Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly2", "size", true);
}
@Test(priority = 224, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly2 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly2_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
	System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly2 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly2 Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly2", "displayUrl",true);
}
										
										
																				
		@Test(priority = 226, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Hourly3 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_hourly3_details_gampad_call() throws Exception {

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Hourly3 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Hourly3 Details validation Started");
    Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly3", "cpm", true);
}

@Test(priority = 228, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Hourly3 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_hourly3_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter of Hourly3 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter of Hourly3 Details validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly3", "size", true);
}
@Test(priority = 230, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Hourly3 Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_hourly3_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");
	System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly3 Details validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Hourly3 Details validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Hourly3", "displayUrl",true);
}


	
@Test(priority = 232, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Map Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_map_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call cpm parameter ====================");
	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Map Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Map Details validation Started");

	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Map", "cpm", true);
}


@Test(priority = 234, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Map Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_map_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println("=========================== Criteo SDK invapp v2 call size parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter of Map Details validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter of Map Details validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Map", "size", true);
}


@Test(priority = 236, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Map Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_map_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter ====================");

	System.out.println("****** Criteo SDK invapp v2 call displayUrl parameter of Map Details validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter of Map Details validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Map", "displayUrl", true);
}


	@Test(priority = 238, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Daily Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_daily_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with Daily details call====================");

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter with Daily Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter with Today Details call validation Started");
//	Functions.verifyingdailydetailiuu();
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Daily(10day)", "cpm",true);
}

@Test(priority = 240, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with daily Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_daily_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with Daily details call====================");

	System.out
			.println("****** Criteo SDK invapp v2 call size parameter with Daily details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with Daily details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Daily(10day)", "size",true);
}

@Test(priority = 242, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Daily Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_daily_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with Daily details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with Daily details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Daily details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Daily(10day)","displayUrl", true);
}




@Test(priority = 246, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Today Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_today_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with Today details call====================");

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter with Today Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter with Today Details call validation Started");

	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Today", "cpm", true);
}

@Test(priority = 248, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Today Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_today_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with Today details call====================");

	System.out
			.println("****** Criteo SDK invapp v2 call size parameter with Today details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with Today details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Today", "size", true);
}

@Test(priority = 250, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Today Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_today_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with Today details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with Today details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Today details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Today", "displayUrl",true);
}



@Test(priority = 252, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with AQ Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_aq_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with aq details call====================");

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter with aq details call validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter with aq details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Air Quality(Content)","cpm", true);
}

@Test(priority = 254, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with AQ Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_aq_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with aq details call====================");

	System.out.println("****** Criteo SDK invapp v2 call size parameter with aq details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with aq details call validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Air Quality(Content)", "size", true);
}

@Test(priority = 256, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with AQ Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_aq_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with aq details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with aq details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with aq details call validation Started");
		CharlesFunctions.archive_folder("Charles");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Air Quality(Content)","displayUrl", true);
}


	@Test(priority = 258, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Seasonal Hub Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_SeasonalHub_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with Seasonal Hub details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call cpm parameter with Seasonal Hub details call validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter with Seasonal Hub details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("SeasonalHub(Details)", "cpm", true);
}

@Test(priority = 260, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Seasonal Hub Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_SeasonalHub_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with Seasonal Hub details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call size parameter with Seasonal Hub details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with Seasonal Hub details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("SeasonalHub(Details)","size", true);
}

@Test(priority = 262, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Seasonal Hub Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_SeasonalHub_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with Seasonal Hub details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with Seasonal Hub details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Seasonal Hub details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("SeasonalHub(Details)","displayUrl", true);
}



@Test(priority = 264, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with boatAndBeach Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_boatAndBeach_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with boatAndBeach Details call====================");

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of boatAndBeach Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of boatAndBeach Details validation Started");

	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(boatAndBeach)","cpm", true);
}

@Test(priority = 268, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with boatAndBeach Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_boatAndBeach_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with boatAndBeach Details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call size parameter with boatAndBeach Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with boatAndBeach Details call validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(boatAndBeach)","size", true);
}

@Test(priority = 270, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with boatAndBeach Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_boatAndBeach_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with boatAndBeach Details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with boatAndBeach Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with boatAndBeach Details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Health(boatAndBeach)","displayUrl", true);
}



@Test(priority = 272, enabled = true)
@Description("Verify cpm parameter of Criteo SDK inapp v2 call with Running Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_cpm_parameter_with_Running_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call cpm parameter with Running Details call====================");

	System.out.println("****** Criteo SDK invapp v2 call cpm parameter of Running Details validation Started");
	logStep("****** Criteo SDK invapp v2 call cpm parameter of Running Details validation Started");

	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value( "Health(goRun)", "cpm",true);
}

@Test(priority = 274, enabled = true)
@Description("Verify size parameter of Criteo SDK inapp v2 call with Running Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_size_parameter_with_Running_details_gampad_call() throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call size parameter with Running Details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call size parameter with Running Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call size parameter with Running Details call validation Started");
	Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(goRun)", "size",true);
}

@Test(priority = 278, enabled = true)
@Description("Verify displayUrl parameter of Criteo SDK inapp v2 call with Running Details call")
public void Verify_Criteo_SDK_inapp_v2_Call_displayUrl_parameter_with_Running_details_gampad_call()
		throws Exception {
	System.out.println("==============================================");
	System.out.println(
			"=========================== Criteo SDK invapp v2 call displayUrl parameter with Running Details call====================");

	System.out.println(
			"****** Criteo SDK invapp v2 call displayUrl parameter with Running Details call validation Started");
	logStep("****** Criteo SDK invapp v2 call displayUrl parameter with Running Details call validation Started");
Functions.validate_Criteo_SDK_inapp_v2_call_param_value_with_gampad_param_value("Health(goRun)","displayUrl", true);

}
	
	
	

}
