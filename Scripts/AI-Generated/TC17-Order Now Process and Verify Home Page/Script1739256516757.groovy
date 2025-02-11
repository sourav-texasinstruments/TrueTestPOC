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

"Step 2: Click on link OrderNow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_OrderNow'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 2-Click on link OrderNow.png')

"Step 3: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 3-Click on ti OrderNowTable.png')

"Step 4: Click on main MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/main_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 4-Click on main MainContent.png')

"Step 5: Click on main MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/main_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 5-Click on main MainContent.png')

"Step 6: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on ti OrderNowTable.png')

"Step 7: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 7-Click on ti OrderNowTable.png')

"Step 8: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 8-Click on ti OrderNowTable.png')

"Step 9: Click on atomic HeaderSearchBox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/atomic_HeaderSearchBox'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 9-Click on atomic HeaderSearchBox.png')

"Step 10: Enter input value in atomic HeaderSearchBox -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/atomic_HeaderSearchBox'), atomic_HeaderSearchBox)

WebUI.takeScreenshot(reportLocation + '/TC17/Step 10-Enter input value in atomic HeaderSearchBox - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Order Now Process and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}