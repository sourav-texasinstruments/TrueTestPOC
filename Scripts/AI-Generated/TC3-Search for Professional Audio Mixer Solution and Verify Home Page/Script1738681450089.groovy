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

"Step 2: Click on link Applications -> Navigate to page 'application overview#applications/*/overview.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Applications'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link Applications - Navigate to page application overviewapplicationsoverviewhtml.png')

"Step 3: Click on link ProAudioVideo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_ProAudioVideo2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link ProAudioVideo2.png')

"Step 4: Click on atomic HeaderSearchBox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/atomic_HeaderSearchBox'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on atomic HeaderSearchBox.png')

"Step 5: Enter input value in atomic HeaderSearchBox -> Navigate to page 'professional audio mixer solution#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_application_overview/atomic_HeaderSearchBox'), atomic_HeaderSearchBox)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Enter input value in atomic HeaderSearchBox - Navigate to page professional audio mixer solution.png')

"Step 6: Click on div EncoderKnobs -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_mixer_solution/div_EncoderKnobs'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on div EncoderKnobs - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Search for Professional Audio Mixer Solution and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}