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

"Step 1: Navigate to applications/*/overview.html"

TrueTestScripts.navigate("applications/${GlobalVariable.applications_id}/overview.html")

"Step 2: Click on link applicationCategories (Applications)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories', ['link_applicationCategories_internalRoleLinkName': link_applicationCategories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link applicationCategories Applications.png')

"Step 3: Click on link ProAudioVideo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_ProAudioVideo'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link ProAudioVideo.png')

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Access Pro Audio Video Application Categories and Verify Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}