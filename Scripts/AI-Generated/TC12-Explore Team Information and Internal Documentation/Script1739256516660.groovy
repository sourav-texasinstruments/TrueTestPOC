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

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on ti object.png')

"Step 3: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on ti object.png')

"Step 4: Click on ti object -> Navigate to page 'internal documentation#myti-dashboard/docs/mytidashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on ti object - Navigate to page internal documentationmyti-dashboarddocsmytidashboard.png')

"Step 5: Click on link yourTeam2 -> Navigate to page 'internal documentation#myti/docs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti-dashboard/docs/mytidashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/link_yourTeam2'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on link yourTeam2 - Navigate to page internal documentationmytidocs.png')

"Step 6: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti/docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on div object.png')

"Step 7: Click on body internalDocumentation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti/docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/body_internalDocumentation'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on body internalDocumentation.png')

"Step 8: Click on ti object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti/docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/ti_object8'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on ti object8.png')

"Step 9: Click on ti object8 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti/docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/ti_object8'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on ti object8 - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Explore Team Information and Internal Documentation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}