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

"Step 2: Click on link Applications"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Applications'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on link Applications.png')

"Step 3: Click on link AerospaceDefense -> Navigate to page 'application overview#applications/*/*/overview.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_AerospaceDefense'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on link AerospaceDefense - Navigate to page application overviewapplicationsoverviewhtml.png')

"Step 4: Click on div CollapsibleItemTrigger"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_CollapsibleItemTrigger'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on div CollapsibleItemTrigger.png')

"Step 5: Click on link Applications2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_Applications2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on link Applications2.png')

"Step 6: Click on link ProAudioVideo3 -> Navigate to page 'application overview#applications/*/overview.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_ProAudioVideo3'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on link ProAudioVideo3 - Navigate to page application overviewapplicationsoverviewhtml.png')

"Step 7: Click on ti searchField (SearchField)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/ti_searchField'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on ti searchField SearchField.png')

"Step 8: Enter input value in ti searchField (SearchField2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/ti_searchField'), ti_searchField)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Enter input value in ti searchField SearchField2.png')

"Step 9: Click on link ProfessionalAudioAmplifier2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_ProfessionalAudioAmplifier2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on link ProfessionalAudioAmplifier2.png')

"Step 10: Click on link applicationCategories (Applications) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories', ['link_applicationCategories_internalRoleLinkName': link_applicationCategories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on link applicationCategories Applications - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Search for Professional Audio Amplifier and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}