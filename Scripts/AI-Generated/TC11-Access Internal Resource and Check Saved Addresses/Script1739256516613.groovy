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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on ti object.png')

"Step 3: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on ti object.png')

"Step 4: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on ti object.png')

"Step 5: Click on ti object -> Navigate to page 'internal documentation#myti-dashboard/docs/mytidashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on ti object - Navigate to page internal documentationmyti-dashboarddocsmytidashboard.png')

"Step 6: Click on link addresses -> Navigate to page 'internal resource#checkoutprofile/web/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti-dashboard/docs/mytidashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/link_addresses'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on link addresses - Navigate to page internal resourcecheckoutprofileweb.png')

"Step 7: Click on div noSavedAddresses -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/div_noSavedAddresses'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on div noSavedAddresses - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Access Internal Resource and Check Saved Addresses_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}