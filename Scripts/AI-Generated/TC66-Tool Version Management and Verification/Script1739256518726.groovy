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

"Step 2: Click on span Download"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'tool/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_tool/span_Download'))

WebUI.takeScreenshot(reportLocation + '/TC66/Step 2-Click on span Download.png')

"Step 3: Click on link ViewAllVersions3 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'tool/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_tool/link_ViewAllVersions3'))

WebUI.takeScreenshot(reportLocation + '/TC66/Step 3-Click on link ViewAllVersions3 - Navigate to page .png')

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC66-Tool Version Management and Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}