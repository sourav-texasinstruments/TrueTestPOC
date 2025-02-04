import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to */*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/${GlobalVariable.path_param_2}")

"Step 2: Click on div KeyCustomerMessages"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_design_simulation_tools/div_KeyCustomerMessages'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on div KeyCustomerMessages.png')

"Step 3: Click on link DesignDevelopment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_design_simulation_tools/link_DesignDevelopment'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on link DesignDevelopment.png')

"Step 4: Click on div PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_design_simulation_tools/div_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on div PageContent.png')

"Step 5: Click on div KeyCustomerMessages"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_design_simulation_tools/div_KeyCustomerMessages'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on div KeyCustomerMessages.png')

"Step 6: Click on header SimplifyDesignProcess"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_design_simulation_tools/header_SimplifyDesignProcess'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on header SimplifyDesignProcess.png')

"Step 7: Click on header SimplifyDesignProcess -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_design_simulation_tools/header_SimplifyDesignProcess'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on header SimplifyDesignProcess - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Access Design Development Messages and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}