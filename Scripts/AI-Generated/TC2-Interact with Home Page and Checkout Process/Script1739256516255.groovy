import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.interactWithHomePage
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

"Step 2: Interact with objects on the home page and input data."

interactWithHomePage.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on ti object2.png')

"Step 4: Click on atomic searchBox -> Navigate to page 'internal resource#sitesearch/*/docs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/atomic_searchBox'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on atomic searchBox - Navigate to page internal resourcesitesearchdocs.png')

"Step 5: Click on ti object -> Navigate to page 'product detail#product/*/part-details/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sitesearch/.*/docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on ti object - Navigate to page product detailproductpart-details.png')

"Step 6: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*/part-details/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_detail/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on ti object.png')

"Step 7: Click on link checkout -> Navigate to page 'store#store/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*/part-details/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_detail/link_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link checkout - Navigate to page storestore.png')

"Step 8: Enter input value in ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_store/ti_object'), ti_object)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Enter input value in ti object.png')

"Step 9: Click on ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_store/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on ti object2.png')

"Step 10: Click on ti object2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_store/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on ti object2 - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Interact with Home Page and Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}