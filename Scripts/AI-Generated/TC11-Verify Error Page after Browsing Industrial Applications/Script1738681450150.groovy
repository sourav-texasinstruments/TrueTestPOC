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

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on link Applications.png')

"Step 3: Click on link Industrial2 -> Navigate to page 'application overview#applications/*/overview.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Industrial2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on link Industrial2 - Navigate to page application overviewapplicationsoverviewhtml.png')

"Step 4: Click on link BrowseApplications"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_BrowseApplications'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on link BrowseApplications.png')

"Step 5: Click on div EnhancedAutomation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_EnhancedAutomation'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on div EnhancedAutomation.png')

"Step 6: Click on link ProAudioVideo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_ProAudioVideo2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on link ProAudioVideo2.png')

"Step 7: Click on link ProAudioVideo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_ProAudioVideo2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on link ProAudioVideo2.png')

"Step 8: Click on div EnhancedAutomation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_EnhancedAutomation'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on div EnhancedAutomation.png')

"Step 9: Click on div EnhancedAutomation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_EnhancedAutomation'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on div EnhancedAutomation.png')

"Step 10: Click on div EnhancedAutomation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_EnhancedAutomation'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Click on div EnhancedAutomation.png')

"Step 11: Click on link BrowseApplications -> Navigate to page 'error#staging/error404.htm'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_BrowseApplications'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on link BrowseApplications - Navigate to page errorstagingerror404htm.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Verify Error Page after Browsing Industrial Applications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}