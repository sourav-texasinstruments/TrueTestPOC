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

"Step 1: Navigate to partner/*"

TrueTestScripts.navigate("partner/${GlobalVariable.partner_id}")

"Step 2: Click on main object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'partner/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/main_object2'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 2-Click on main object2.png')

"Step 3: Click on link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'partner/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 3-Click on link object.png')

"Step 4: Click on main object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'partner/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/main_object2'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 4-Click on main object2.png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC60-Partner Resource Navigation and Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}