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

"Step 1: Navigate to tool/*"

TrueTestScripts.navigate("tool/${GlobalVariable.tool_id}")

"Step 2: Click on span Z3DM368MOD"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'tool/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_tool/span_Z3DM368MOD'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 2-Click on span Z3DM368MOD.png')

"Step 3: Click on ti dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'tool/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_internal_tool/ti_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 3-Click on ti dynamicObject object2.png')

"Step 4: Click on ti dynamicObject (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'tool/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_internal_tool/ti_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 4-Click on ti dynamicObject object3.png')

"Step 5: Click on ti dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'tool/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_internal_tool/ti_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 5-Click on ti dynamicObject object2.png')

"Step 6: Click on link VisitPartnerSite -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'tool/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_tool/link_VisitPartnerSite'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 6-Click on link VisitPartnerSite - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC61-Internal Tool Navigation and Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}