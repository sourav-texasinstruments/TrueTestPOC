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

WebUI.takeScreenshot(reportLocation + '/TC37/Step 2-Click on ti object.png')

"Step 3: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 3-Click on ti object.png')

"Step 4: Click on ti object -> Navigate to page 'checkout management#checkoutprofile/web/*/add'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 4-Click on ti object - Navigate to page checkout managementcheckoutprofilewebadd.png')

"Step 5: Click on ti checkoutProfileInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileInformation'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 5-Click on ti checkoutProfileInformation.png')

"Step 6: Click on ti checkoutProfileInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileInformation'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 6-Click on ti checkoutProfileInformation.png')

"Step 7: Enter input value in ti checkoutProfileInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileInformation'), ti_checkoutProfileInformation)

WebUI.takeScreenshot(reportLocation + '/TC37/Step 7-Enter input value in ti checkoutProfileInformation.png')

"Step 8: Click on ti checkoutProfileAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileAddress'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 8-Click on ti checkoutProfileAddress.png')

"Step 9: Click on ti checkoutProfileAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileAddress'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 9-Click on ti checkoutProfileAddress.png')

"Step 10: Click on ti checkoutProfileAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileAddress'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 10-Click on ti checkoutProfileAddress.png')

"Step 11: Click on ti checkoutProfileAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileAddress'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 11-Click on ti checkoutProfileAddress.png')

"Step 12: Click on ti checkoutProfileAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileAddress'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 12-Click on ti checkoutProfileAddress.png')

"Step 13: Click on ti checkoutProfileTax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileTax'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 13-Click on ti checkoutProfileTax.png')

"Step 14: Click on ti checkoutProfileTax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileTax'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 14-Click on ti checkoutProfileTax.png')

"Step 15: Click on ti checkoutProfileTax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileTax'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 15-Click on ti checkoutProfileTax.png')

"Step 16: Click on ti checkoutProfileRegulation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileRegulation'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 16-Click on ti checkoutProfileRegulation.png')

"Step 17: Click on ti checkoutProfileRegulation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileRegulation'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 17-Click on ti checkoutProfileRegulation.png')

"Step 18: Click on ti checkoutProfileRegulation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileRegulation'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 18-Click on ti checkoutProfileRegulation.png')

"Step 19: Click on ti checkoutProfileRegulation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileRegulation'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 19-Click on ti checkoutProfileRegulation.png')

"Step 20: Click on ti checkoutProfileRegulation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileRegulation'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 20-Click on ti checkoutProfileRegulation.png')

"Step 21: Click on ti checkoutProfileRegulation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileRegulation'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 21-Click on ti checkoutProfileRegulation.png')

"Step 22: Click on ti checkoutProfileRegulation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileRegulation'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 22-Click on ti checkoutProfileRegulation.png')

"Step 23: Click on ti checkoutProfileShippingMethods"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileShippingMethods'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 23-Click on ti checkoutProfileShippingMethods.png')

"Step 24: Click on ti checkoutProfileShippingMethods"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfileShippingMethods'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 24-Click on ti checkoutProfileShippingMethods.png')

"Step 25: Click on ti checkoutProfilePayment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfilePayment'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 25-Click on ti checkoutProfilePayment.png')

"Step 26: Click on ti checkoutProfilePayment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfilePayment'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 26-Click on ti checkoutProfilePayment.png')

"Step 27: Click on ti checkoutProfilePayment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfilePayment'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 27-Click on ti checkoutProfilePayment.png')

"Step 28: Click on ti checkoutProfilePayment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfilePayment'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 28-Click on ti checkoutProfilePayment.png')

"Step 29: Click on ti checkoutProfilePayment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/ti_checkoutProfilePayment'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 29-Click on ti checkoutProfilePayment.png')

"Step 30: Click on link save -> Navigate to page 'internal resource#checkoutprofile/web/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkoutprofile/web/.*/add?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_management/link_save'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 30-Click on link save - Navigate to page internal resourcecheckoutprofileweb.png')

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC37-Manage Checkout Profile Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}