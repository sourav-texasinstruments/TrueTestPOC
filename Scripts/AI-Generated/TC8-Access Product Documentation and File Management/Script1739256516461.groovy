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

"Step 1: Navigate to product/*"

TrueTestScripts.navigate("product/${GlobalVariable.product_id}")

"Step 2: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on ti object.png')

"Step 3: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on ti object.png')

"Step 4: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on ti object.png')

"Step 5: Click on ti object -> Navigate to page 'internal documentation#myti-dashboard/docs/mytidashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on ti object - Navigate to page internal documentationmyti-dashboarddocsmytidashboard.png')

"Step 6: Click on link documentsAndFiles -> Navigate to page 'file management#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'myti-dashboard/docs/mytidashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/link_documentsAndFiles'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on link documentsAndFiles - Navigate to page file management.png')

"Step 7: Click on div documentsFiles -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_file_management/div_documentsFiles'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on div documentsFiles - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Access Product Documentation and File Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}