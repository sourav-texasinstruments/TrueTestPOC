import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.loginAfterCheckoutCancel
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

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on ti object.png')

"Step 3: Click on ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on ti object2.png')

"Step 4: Click on ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on ti object2.png')

"Step 5: Enter input value in ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/ti_object2'), ti_object2)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Enter input value in ti object2.png')

"Step 6: Click on link myCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_myCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on link myCart.png')

"Step 7: Click on link viewCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_viewCart'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on link viewCart.png')

"Step 8: Login again after canceling the checkout process."

loginAfterCheckoutCancel.execute(data_path_0, Integer.valueOf(index_0))

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Manage Cart and Checkout Process After Cancellation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}