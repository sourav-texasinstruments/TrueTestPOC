import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.loginAndInputDetails
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

"Step 2: Click on body home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/body_home'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 2-Click on body home.png')

"Step 3: Click on atomic searchBox -> Navigate to page 'internal resource#sitesearch/*/docs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/atomic_searchBox'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 3-Click on atomic searchBox - Navigate to page internal resourcesitesearchdocs.png')

"Step 4: Click on ti object -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sitesearch/.*/docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 4-Click on ti object - Navigate to page productproduct.png')

"Step 5: Click on link OrderNow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_OrderNow'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 5-Click on link OrderNow.png')

"Step 6: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 6-Click on ti OrderNowTable.png')

"Step 7: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 7-Click on ti OrderNowTable.png')

"Step 8: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable)

WebUI.takeScreenshot(reportLocation + '/TC33/Step 8-Enter input value in ti OrderNowTable.png')

"Step 9: Click on link checkout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 9-Click on link checkout.png')

"Step 10: Login and input details using tiObject3."

loginAndInputDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC33-Order Now Process and Checkout with Product_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}