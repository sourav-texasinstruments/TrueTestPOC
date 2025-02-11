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

WebUI.takeScreenshot(reportLocation + '/TC34/Step 2-Click on body home.png')

"Step 3: Click on atomic searchBox -> Navigate to page 'internal resource#sitesearch/*/docs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/atomic_searchBox'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 3-Click on atomic searchBox - Navigate to page internal resourcesitesearchdocs.png')

"Step 4: Click on ti object -> Navigate to page 'product detail#product/*/part-details/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sitesearch/.*/docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 4-Click on ti object - Navigate to page product detailproductpart-details.png')

"Step 5: Click on span logInToOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*/part-details/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_detail/span_logInToOrder'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 5-Click on span logInToOrder.png')

"Step 6: Enter input value in ti addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*/part-details/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product_detail/ti_addToCart'), ti_addToCart)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 6-Enter input value in ti addToCart.png')

"Step 7: Click on link checkout2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*/part-details/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_detail/link_checkout2'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 7-Click on link checkout2.png')

"Step 8: Login and input details using tiObject3."

loginAndInputDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC34-Add to Cart and Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}