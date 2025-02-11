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

"Step 2: Click on body home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/body_home'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Click on body home.png')

"Step 3: Click on link crossReferenceSearch -> Navigate to page 'internal tool#cross-reference-search'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_crossReferenceSearch'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on link crossReferenceSearch - Navigate to page internal toolcross-reference-search.png')

"Step 4: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cross-reference-search?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_tool/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on ti object.png')

"Step 5: Enter input value in ti object -> Navigate to page 'internal resource#cross-reference-search/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cross-reference-search?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_internal_tool/ti_object'), ti_object)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Enter input value in ti object - Navigate to page internal resourcecross-reference-search.png')

"Step 6: Click on ti object3 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cross-reference-search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object3'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on ti object3 - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Perform Cross Reference Search and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}