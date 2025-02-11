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

"Step 2: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 2-Click on ti object.png')

"Step 3: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 3-Click on ti object.png')

"Step 4: Click on header ResponsiveHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_ResponsiveHeader'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 4-Click on header ResponsiveHeader.png')

"Step 5: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 5-Click on ti object.png')

"Step 6: Click on ti object -> Navigate to page 'internal documentation#myti-dashboard/docs/mytidashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 6-Click on ti object - Navigate to page internal documentationmyti-dashboarddocsmytidashboard.png')

"Step 7: Click on div PersonalAccount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti-dashboard/docs/mytidashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/div_PersonalAccount'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 7-Click on div PersonalAccount.png')

"Step 8: Click on link PersonalInformation -> Navigate to page 'internal documentation#myti/docs/updateprofile'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti-dashboard/docs/mytidashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/link_PersonalInformation'))

WebUI.takeScreenshot(reportLocation + '/TC69/Step 8-Click on link PersonalInformation - Navigate to page internal documentationmytidocsupdateprofile.png')

"Step 9: Select option with input value from select Role -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti/docs/updateprofile?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_internal_documentation/select_Role'), select_Role)

WebUI.takeScreenshot(reportLocation + '/TC69/Step 9-Select option with input value from select Role - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC69-Personal Account Management and Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}