import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.checkoutTaxDetails
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

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on ti object.png')

"Step 3: Click on atomic searchBox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/atomic_searchBox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on atomic searchBox.png')

"Step 4: Click on atomic searchBox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/atomic_searchBox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on atomic searchBox.png')

"Step 5: Enter input value in atomic searchBox -> Navigate to page 'internal resource#sitesearch/*/docs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/atomic_searchBox'), atomic_searchBox)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Enter input value in atomic searchBox - Navigate to page internal resourcesitesearchdocs.png')

"Step 6: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sitesearch/.*/docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on ti object.png')

"Step 7: Enter input value in ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sitesearch/.*/docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_internal_resource/ti_object'), ti_object)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in ti object.png')

"Step 8: Click on link checkout -> Navigate to page 'ecommerce cart#store/*/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sitesearch/.*/docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/link_checkout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link checkout - Navigate to page ecommerce cartstorecart.png')

"Step 9: Click on ti cartOrderDetails (object) -> Navigate to page 'checkout#store/*/checkout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on ti cartOrderDetails object - Navigate to page checkoutstorecheckout.png')

"Step 10: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on ti object.png')

"Step 11: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on ti object.png')

"Step 12: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on ti object.png')

"Step 13: Click on ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on ti object2.png')

"Step 14: Click on ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on ti object2.png')

"Step 15: Click on ti object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on ti object3.png')

"Step 16: Click on ti object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on ti object3.png')

"Step 17: Enter input value in ti object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout/ti_object3'), ti_object3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Enter input value in ti object3.png')

"Step 18: Click on ti object4 -> Navigate to page 'ecommerce cart#store/*/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object4'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on ti object4 - Navigate to page ecommerce cartstorecart.png')

"Step 19: Click on ti cartOrderDetails (object2) -> Navigate to page 'checkout#store/*/checkout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on ti cartOrderDetails object2 - Navigate to page checkoutstorecheckout.png')

"Step 20: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on ti object.png')

"Step 21: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on ti object.png')

"Step 22: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on ti object.png')

"Step 23: Click on ti object4 -> Navigate to page 'ecommerce cart#store/*/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object4'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on ti object4 - Navigate to page ecommerce cartstorecart.png')

"Step 24: Click on ti object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_object3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on ti object3.png')

"Step 25: Click on ti object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_object3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on ti object3.png')

"Step 26: Enter input value in ti object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_object3'), ti_object3_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Enter input value in ti object3.png')

"Step 27: Click on ti cartOrderDetails (object4) -> Navigate to page 'checkout#store/*/checkout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on ti cartOrderDetails object4 - Navigate to page checkoutstorecheckout.png')

"Step 28: Click on ti object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object5'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on ti object5.png')

"Step 29: Click on ti object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object5'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on ti object5.png')

"Step 30: Click on ti dynamicObject (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_checkout/ti_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_checkout/ti_dynamicObject', ['ti_dynamicObject_internalText': ti_dynamicObject_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on ti dynamicObject object6.png')

"Step 31: Access checkout tax details and finalize selections."

checkoutTaxDetails.execute()

"Step 32: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on ti object.png')

"Step 33: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on ti object.png')

"Step 34: Click on ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on ti object2.png')

"Step 35: Click on ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on ti object2.png')

"Step 36: Click on ti object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on ti object3.png')

"Step 37: Click on ti object3 -> Navigate to page 'order confirmation#store/*/order-confirmation/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/checkout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on ti object3 - Navigate to page order confirmationstoreorder-confirmation.png')

"Step 38: Click on ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/order-confirmation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_order_confirmation/ti_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on ti object.png')

"Step 39: Enter input value in ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/order-confirmation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_order_confirmation/ti_object'), ti_object_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Enter input value in ti object.png')

"Step 40: Click on ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/order-confirmation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_order_confirmation/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on ti object2.png')

"Step 41: Click on main orderConfirmation -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/order-confirmation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_order_confirmation/main_orderConfirmation'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Click on main orderConfirmation - Navigate to page .png')

"Step 42: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Finalize Checkout Process with Multiple Selections_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}