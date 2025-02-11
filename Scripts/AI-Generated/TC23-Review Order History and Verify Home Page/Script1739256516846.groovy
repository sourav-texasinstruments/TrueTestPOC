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

"Step 1: Navigate to orderhistory/order/*"

TrueTestScripts.navigate("orderhistory/order/${GlobalVariable.order_id}")

"Step 2: Click on div TotalAmount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orderhistory/order/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_order_history/div_TotalAmount'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 2-Click on div TotalAmount.png')

"Step 3: Click on span OrderDetail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orderhistory/order/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_order_history/span_OrderDetail'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 3-Click on span OrderDetail.png')

"Step 4: Click on link orderDetails (ViewProformaInvoice) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'orderhistory/order/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_order_history/link_orderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_order_history/link_orderDetails', ['link_orderDetails_internalRoleLinkName': link_orderDetails_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on link orderDetails ViewProformaInvoice - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Review Order History and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}