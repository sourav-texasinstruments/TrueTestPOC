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

"Step 1: Navigate to */overview.html"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/overview.html")

"Step 2: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 2-Click on div object2.png')

"Step 3: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 3-Click on div object3.png')

"Step 4: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 4-Click on div object4.png')

"Step 5: Click on ti object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object10'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 5-Click on ti object10.png')

"Step 6: Click on ti object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object10'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 6-Click on ti object10.png')

"Step 7: Click on ti object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object10'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 7-Click on ti object10.png')

"Step 8: Click on ti object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object10'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 8-Click on ti object10.png')

"Step 9: Click on ti object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object10'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 9-Click on ti object10.png')

"Step 10: Click on ti object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object10'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 10-Click on ti object10.png')

"Step 11: Click on ti object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object10'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 11-Click on ti object10.png')

"Step 12: Click on ti object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object10'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 12-Click on ti object10.png')

"Step 13: Click on button WirelessInfrastructure"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/button_WirelessInfrastructure'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 13-Click on button WirelessInfrastructure.png')

"Step 14: Click on ti object11 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object11'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 14-Click on ti object11 - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC59-Wireless Infrastructure Product Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}