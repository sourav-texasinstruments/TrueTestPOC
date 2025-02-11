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

"Step 1: Navigate to video/*"

TrueTestScripts.navigate("video/${GlobalVariable.video_id}")

"Step 2: Click on ti Container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'video/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_media_content/ti_Container'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 2-Click on ti Container.png')

"Step 3: Click on button PlayVideo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'video/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_media_content/button_PlayVideo'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 3-Click on button PlayVideo.png')

"Step 4: Click on button Pause -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'video/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_media_content/button_Pause'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 4-Click on button Pause - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC64-Media Content Video Playback_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}