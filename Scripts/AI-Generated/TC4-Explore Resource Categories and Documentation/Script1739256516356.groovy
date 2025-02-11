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

"Step 2: Click on link resourceCategories (orderingResources)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_resourceCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_resourceCategories', ['link_resourceCategories_internalRoleLinkName': link_resourceCategories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link resourceCategories orderingResources.png')

"Step 3: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on ti object.png')

"Step 4: Click on ti object -> Navigate to page 'internal documentation#myti-dashboard/docs/mytidashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on ti object - Navigate to page internal documentationmyti-dashboarddocsmytidashboard.png')

"Step 5: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti-dashboard/docs/mytidashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on ti object.png')

"Step 6: Click on ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti-dashboard/docs/mytidashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on ti object2.png')

"Step 7: Click on main internalDocumentation (internalDocumentation) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti-dashboard/docs/mytidashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_internal_documentation/main_internalDocumentation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_internal_documentation/main_internalDocumentation', ['main_internalDocumentation_internalText': main_internalDocumentation_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on main internalDocumentation internalDocumentation - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Explore Resource Categories and Documentation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}