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

"Step 1: Navigate to store/*/cart"

TrueTestScripts.navigate("store/${GlobalVariable.store_id}/cart")

"Step 2: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 2-Click on ti storeCartGroup.png')

"Step 3: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 3-Enter input value in ti storeCartGroup.png')

"Step 4: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 4-Click on ti storeCartGroup.png')

"Step 5: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup_1)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 5-Enter input value in ti storeCartGroup.png')

"Step 6: Click on ti checkoutDialogLauncher"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_checkoutDialogLauncher'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 6-Click on ti checkoutDialogLauncher.png')

"Step 7: Click on link myCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/link_myCart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 7-Click on link myCart.png')

"Step 8: Click on link viewCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/link_viewCart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 8-Click on link viewCart.png')

"Step 9: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 9-Click on ti storeCartGroup.png')

"Step 10: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 10-Click on ti storeCartGroup.png')

"Step 11: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup_2)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 11-Enter input value in ti storeCartGroup.png')

"Step 12: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 12-Click on ti storeCartGroup.png')

"Step 13: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup_3)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 13-Enter input value in ti storeCartGroup.png')

"Step 14: Click on ti checkoutDialogLauncher"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_checkoutDialogLauncher'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 14-Click on ti checkoutDialogLauncher.png')

"Step 15: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 15-Click on ti storeCartGroup.png')

"Step 16: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 16-Click on ti storeCartGroup.png')

"Step 17: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup_4)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 17-Enter input value in ti storeCartGroup.png')

"Step 18: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 18-Click on header cart.png')

"Step 19: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 19-Click on header cart.png')

"Step 20: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 20-Click on header cart.png')

"Step 21: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 21-Click on header cart.png')

"Step 22: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 22-Click on header cart.png')

"Step 23: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 23-Click on header cart.png')

"Step 24: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 24-Click on header cart.png')

"Step 25: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 25-Click on header cart.png')

"Step 26: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 26-Click on header cart.png')

"Step 27: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 27-Click on header cart.png')

"Step 28: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 28-Click on header cart.png')

"Step 29: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 29-Click on header cart.png')

"Step 30: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 30-Click on div orderNumber.png')

"Step 31: Click on ti cartOrderDetails (cartOrderDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 31-Click on ti cartOrderDetails cartOrderDetails.png')

"Step 32: Click on ti cartOrderDetails (cartOrderDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 32-Click on ti cartOrderDetails cartOrderDetails.png')

"Step 33: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 33-Click on header cart.png')

"Step 34: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 34-Click on header cart.png')

"Step 35: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 35-Click on header cart.png')

"Step 36: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 36-Click on header cart.png')

"Step 37: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 37-Click on header cart.png')

"Step 38: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 38-Click on header cart.png')

"Step 39: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 39-Click on header cart.png')

"Step 40: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 40-Click on header cart.png')

"Step 41: Click on ti cartShoppingCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_cartShoppingCart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 41-Click on ti cartShoppingCart.png')

"Step 42: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 42-Click on header cart.png')

"Step 43: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 43-Click on header cart.png')

"Step 44: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 44-Click on header cart.png')

"Step 45: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 45-Click on header cart.png')

"Step 46: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 46-Click on header cart.png')

"Step 47: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 47-Click on header cart.png')

"Step 48: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 48-Click on header cart.png')

"Step 49: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 49-Click on header cart.png')

"Step 50: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 50-Click on header cart.png')

"Step 51: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 51-Click on header cart.png')

"Step 52: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 52-Click on header cart.png')

"Step 53: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 53-Click on header cart.png')

"Step 54: Click on ti cartWrapper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_cartWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 54-Click on ti cartWrapper.png')

"Step 55: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 55-Click on header cart.png')

"Step 56: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 56-Click on header cart.png')

"Step 57: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 57-Click on header cart.png')

"Step 58: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 58-Click on header cart.png')

"Step 59: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 59-Click on header cart.png')

"Step 60: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 60-Click on header cart.png')

"Step 61: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 61-Click on ti storeCartGroup.png')

"Step 62: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 62-Click on header cart.png')

"Step 63: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 63-Click on header cart.png')

"Step 64: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 64-Click on header cart.png')

"Step 65: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 65-Click on header cart.png')

"Step 66: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 66-Click on header cart.png')

"Step 67: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 67-Click on header cart.png')

"Step 68: Click on div customReelsWarning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_customReelsWarning'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 68-Click on div customReelsWarning.png')

"Step 69: Click on ti cartOrderDetails (cartOrderDetails2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 69-Click on ti cartOrderDetails cartOrderDetails2.png')

"Step 70: Click on ti cartOrderDetails (cartOrderDetails2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 70-Click on ti cartOrderDetails cartOrderDetails2.png')

"Step 71: Click on ti cartOrderDetails (cartOrderDetails2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_4]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 71-Click on ti cartOrderDetails cartOrderDetails2.png')

"Step 72: Click on div customReelsWarning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_customReelsWarning'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 72-Click on div customReelsWarning.png')

"Step 73: Click on ti cartOrderDetails (cartOrderDetails2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_5]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 73-Click on ti cartOrderDetails cartOrderDetails2.png')

"Step 74: Click on div customReelsWarning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_customReelsWarning'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 74-Click on div customReelsWarning.png')

"Step 75: Click on div customReelsWarning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_customReelsWarning'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 75-Click on div customReelsWarning.png')

"Step 76: Click on nav menu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/nav_menu'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 76-Click on nav menu.png')

"Step 77: Click on ti cartOrderDetails (cartOrderDetails)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_6]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 77-Click on ti cartOrderDetails cartOrderDetails.png')

"Step 78: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 78-Click on ti storeCartGroup.png')

"Step 79: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup_5)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 79-Enter input value in ti storeCartGroup.png')

"Step 80: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 80-Click on ti storeCartGroup.png')

"Step 81: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup_6)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 81-Enter input value in ti storeCartGroup.png')

"Step 82: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup_7)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 82-Enter input value in ti storeCartGroup.png')

"Step 83: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 83-Click on ti storeCartGroup.png')

"Step 84: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup_8)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 84-Enter input value in ti storeCartGroup.png')

"Step 85: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 85-Click on ti storeCartGroup.png')

"Step 86: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup_9)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 86-Enter input value in ti storeCartGroup.png')

"Step 87: Click on ti checkoutDialogLauncher"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_checkoutDialogLauncher'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 87-Click on ti checkoutDialogLauncher.png')

"Step 88: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 88-Click on ti storeCartGroup.png')

"Step 89: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup_10)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 89-Enter input value in ti storeCartGroup.png')

"Step 90: Enter input value in ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'), ti_storeCartGroup_11)

WebUI.takeScreenshot(reportLocation + '/TC41/Step 90-Enter input value in ti storeCartGroup.png')

"Step 91: Click on ti checkoutDialogLauncher"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_checkoutDialogLauncher'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 91-Click on ti checkoutDialogLauncher.png')

"Step 92: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 92-Click on div orderNumber.png')

"Step 93: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 93-Click on div orderNumber.png')

"Step 94: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 94-Click on div orderNumber.png')

"Step 95: Click on ti cartOrderDetails (cartOrderSummary)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_7]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 95-Click on ti cartOrderDetails cartOrderSummary.png')

"Step 96: Click on ti cartOrderDetails (cartOrderSummary)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_8]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 96-Click on ti cartOrderDetails cartOrderSummary.png')

"Step 97: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 97-Click on div orderNumber.png')

"Step 98: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 98-Click on div orderNumber.png')

"Step 99: Click on ti cartOrderDetails (cartOrderSummary)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_9]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 99-Click on ti cartOrderDetails cartOrderSummary.png')

"Step 100: Click on ti cartOrderDetails (cartOrderSummary)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_10]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 100-Click on ti cartOrderDetails cartOrderSummary.png')

"Step 101: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 101-Click on div orderNumber.png')

"Step 102: Click on ti cartOrderDetails (cartOrderSummary)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_11]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 102-Click on ti cartOrderDetails cartOrderSummary.png')

"Step 103: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 103-Click on div orderNumber.png')

"Step 104: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 104-Click on div orderNumber.png')

"Step 105: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 105-Click on div orderNumber.png')

"Step 106: Click on ti cartOrderDetails (cartOrderSummary)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_12]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 106-Click on ti cartOrderDetails cartOrderSummary.png')

"Step 107: Click on ti cartOrderDetails (cartOrderSummary)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_13]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 107-Click on ti cartOrderDetails cartOrderSummary.png')

"Step 108: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 108-Click on header cart.png')

"Step 109: Click on ti cartWrapper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_cartWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 109-Click on ti cartWrapper.png')

"Step 110: Click on ti cartOrderDetails (cartOrderSummary)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_14]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 110-Click on ti cartOrderDetails cartOrderSummary.png')

"Step 111: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 111-Click on header cart.png')

"Step 112: Click on header cart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/header_cart'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 112-Click on header cart.png')

"Step 113: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 113-Click on div orderNumber.png')

"Step 114: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 114-Click on div orderNumber.png')

"Step 115: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 115-Click on div orderNumber.png')

"Step 116: Click on ti cartOrderDetails (cartOrderSummary)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_15]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 116-Click on ti cartOrderDetails cartOrderSummary.png')

"Step 117: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 117-Click on div orderNumber.png')

"Step 118: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 118-Click on div orderNumber.png')

"Step 119: Click on div orderNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_orderNumber'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 119-Click on div orderNumber.png')

"Step 120: Click on ti cartOrderDetails (cartOrderSummary) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': ti_cartOrderDetails_internalHasText_16]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 120-Click on ti cartOrderDetails cartOrderSummary - Navigate to page .png')

"Step 121: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC41-Manage Shopping Cart and Checkout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}