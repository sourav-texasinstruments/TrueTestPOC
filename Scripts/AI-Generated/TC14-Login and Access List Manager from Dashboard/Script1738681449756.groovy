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

"Step 2: Click on ti Login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_Login'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on ti Login.png')

"Step 3: Click on ti Login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_Login'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on ti Login.png')

"Step 4: Click on ti Login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_Login'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on ti Login.png')

"Step 5: Click on div InternetExplorerWarning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_InternetExplorerWarning'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on div InternetExplorerWarning.png')

"Step 6: Click on ti Login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_Login'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on ti Login.png')

"Step 7: Click on ti Login -> Navigate to page 'dashboard#myti-dashboard/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_Login'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on ti Login - Navigate to page dashboardmyti-dashboard.png')

"Step 8: Click on link ListManager -> Navigate to page 'list manager#list-manager/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti-dashboard/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dashboard/link_ListManager'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on link ListManager - Navigate to page list managerlist-manager.png')

"Step 9: Click on link MaddysList -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'list-manager/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_list_manager/link_MaddysList'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on link MaddysList - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Login and Access List Manager from Dashboard_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}