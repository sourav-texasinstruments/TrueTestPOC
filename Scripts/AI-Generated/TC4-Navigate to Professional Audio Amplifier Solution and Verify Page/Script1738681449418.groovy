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

"Step 2: Click on link ProAudioVideo -> Navigate to page 'application overview#applications/*/overview.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_ProAudioVideo'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link ProAudioVideo - Navigate to page application overviewapplicationsoverviewhtml.png')

"Step 3: Click on link MotorDrives -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_MotorDrives'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link MotorDrives - Navigate to page .png')

"Step 4: Click on link Applications"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Applications'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on link Applications.png')

"Step 5: Click on link ProAudioVideo -> Navigate to page 'application overview#applications/*/overview.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_ProAudioVideo'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on link ProAudioVideo - Navigate to page application overviewapplicationsoverviewhtml.png')

"Step 6: Click on ti searchField (SearchField)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/ti_searchField'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on ti searchField SearchField.png')

"Step 7: Enter input value in ti searchField (SearchField2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/ti_searchField'), ti_searchField)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Enter input value in ti searchField SearchField2.png')

"Step 8: Click on link ProfessionalAudioAmplifier -> Navigate to page 'professional audio amplifier solution#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_ProfessionalAudioAmplifier'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on link ProfessionalAudioAmplifier - Navigate to page professional audio amplifier solution.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Navigate to Professional Audio Amplifier Solution and Verify Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}