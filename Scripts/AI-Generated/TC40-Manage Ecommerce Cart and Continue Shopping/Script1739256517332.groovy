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

WebUI.takeScreenshot(reportLocation + '/TC40/Step 2-Click on ti object.png')

"Step 3: Click on link myCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_myCart'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 3-Click on link myCart.png')

"Step 4: Click on link viewCart -> Navigate to page 'ecommerce cart#store/*/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_viewCart'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 4-Click on link viewCart - Navigate to page ecommerce cartstorecart.png')

"Step 5: Click on div footerContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_footerContent'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 5-Click on div footerContent.png')

"Step 6: Click on p paragraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/p_paragraph'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 6-Click on p paragraph.png')

"Step 7: Click on div footerContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_footerContent'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 7-Click on div footerContent.png')

"Step 8: Click on p paragraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/p_paragraph'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 8-Click on p paragraph.png')

"Step 9: Click on div footerContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_footerContent2'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 9-Click on div footerContent2.png')

"Step 10: Click on div footerContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_footerContent2'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 10-Click on div footerContent2.png')

"Step 11: Click on div customReelsWarning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_customReelsWarning'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 11-Click on div customReelsWarning.png')

"Step 12: Click on div customReelsWarning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_customReelsWarning'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 12-Click on div customReelsWarning.png')

"Step 13: Click on div customReelsWarning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_customReelsWarning'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 13-Click on div customReelsWarning.png')

"Step 14: Click on div customReelsWarning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/div_customReelsWarning'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 14-Click on div customReelsWarning.png')

"Step 15: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 15-Click on ti storeCartGroup.png')

"Step 16: Enter input value in ti ecommerceCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_ecommerceCart'), ti_ecommerceCart)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 16-Enter input value in ti ecommerceCart.png')

"Step 17: Click on ti storeCartGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_storeCartGroup'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 17-Click on ti storeCartGroup.png')

"Step 18: Enter input value in ti ecommerceCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_ecommerceCart'), ti_ecommerceCart_1)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 18-Enter input value in ti ecommerceCart.png')

"Step 19: Click on atomic headerSearchBox -> Navigate to page 'internal resource#sitesearch/*/docs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'store/.*/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/atomic_headerSearchBox'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 19-Click on atomic headerSearchBox - Navigate to page internal resourcesitesearchdocs.png')

"Step 20: Click on ti gpnSnapshot -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sitesearch/.*/docs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_gpnSnapshot'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 20-Click on ti gpnSnapshot - Navigate to page productproduct.png')

"Step 21: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 21-Click on ti OrderNowTable.png')

"Step 22: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 22-Click on ti OrderNowTable.png')

"Step 23: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 23-Enter input value in ti OrderNowTable.png')

"Step 24: Click on ti errorDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_errorDialog'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 24-Click on ti errorDialog.png')

"Step 25: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 25-Click on ti OrderNowTable.png')

"Step 26: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_1)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 26-Enter input value in ti OrderNowTable.png')

"Step 27: Click on ti errorDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_errorDialog'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 27-Click on ti errorDialog.png')

"Step 28: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 28-Click on ti OrderNowTable.png')

"Step 29: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 29-Click on ti OrderNowTable.png')

"Step 30: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 30-Click on ti OrderNowTable.png')

"Step 31: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_2)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 31-Enter input value in ti OrderNowTable.png')

"Step 32: Click on ti errorDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_errorDialog'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 32-Click on ti errorDialog.png')

"Step 33: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 33-Click on ti OrderNowTable.png')

"Step 34: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_3)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 34-Enter input value in ti OrderNowTable.png')

"Step 35: Click on ti addedToCartDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_addedToCartDialog'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 35-Click on ti addedToCartDialog.png')

"Step 36: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 36-Click on ti OrderNowTable.png')

"Step 37: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_4)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 37-Enter input value in ti OrderNowTable.png')

"Step 38: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 38-Click on ti continueShopping.png')

"Step 39: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 39-Click on ti OrderNowTable.png')

"Step 40: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_5)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 40-Enter input value in ti OrderNowTable.png')

"Step 41: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 41-Click on ti continueShopping.png')

"Step 42: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 42-Click on ti OrderNowTable.png')

"Step 43: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_6)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 43-Enter input value in ti OrderNowTable.png')

"Step 44: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 44-Click on ti continueShopping.png')

"Step 45: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 45-Click on ti OrderNowTable.png')

"Step 46: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_7)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 46-Enter input value in ti OrderNowTable.png')

"Step 47: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 47-Click on ti continueShopping.png')

"Step 48: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 48-Click on ti OrderNowTable.png')

"Step 49: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_8)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 49-Enter input value in ti OrderNowTable.png')

"Step 50: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 50-Click on ti continueShopping.png')

"Step 51: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 51-Click on ti OrderNowTable.png')

"Step 52: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_9)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 52-Enter input value in ti OrderNowTable.png')

"Step 53: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 53-Click on ti continueShopping.png')

"Step 54: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 54-Click on ti OrderNowTable.png')

"Step 55: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_10)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 55-Enter input value in ti OrderNowTable.png')

"Step 56: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 56-Click on ti continueShopping.png')

"Step 57: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 57-Click on ti OrderNowTable.png')

"Step 58: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_11)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 58-Enter input value in ti OrderNowTable.png')

"Step 59: Click on ti errorDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_errorDialog'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 59-Click on ti errorDialog.png')

"Step 60: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 60-Click on ti OrderNowTable.png')

"Step 61: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_12)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 61-Enter input value in ti OrderNowTable.png')

"Step 62: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 62-Click on ti continueShopping.png')

"Step 63: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 63-Click on ti OrderNowTable.png')

"Step 64: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_13)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 64-Enter input value in ti OrderNowTable.png')

"Step 65: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 65-Click on ti continueShopping.png')

"Step 66: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 66-Click on ti OrderNowTable.png')

"Step 67: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 67-Click on ti OrderNowTable.png')

"Step 68: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_14)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 68-Enter input value in ti OrderNowTable.png')

"Step 69: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 69-Click on ti continueShopping.png')

"Step 70: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 70-Click on ti OrderNowTable.png')

"Step 71: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 71-Click on ti OrderNowTable.png')

"Step 72: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_15)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 72-Enter input value in ti OrderNowTable.png')

"Step 73: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 73-Click on ti OrderNowTable.png')

"Step 74: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_16)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 74-Enter input value in ti OrderNowTable.png')

"Step 75: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 75-Click on ti continueShopping.png')

"Step 76: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 76-Click on ti OrderNowTable.png')

"Step 77: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_17)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 77-Enter input value in ti OrderNowTable.png')

"Step 78: Click on ti continueShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 78-Click on ti continueShopping.png')

"Step 79: Click on ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 79-Click on ti OrderNowTable.png')

"Step 80: Enter input value in ti OrderNowTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/ti_OrderNowTable'), ti_OrderNowTable_18)

WebUI.takeScreenshot(reportLocation + '/TC40/Step 80-Enter input value in ti OrderNowTable.png')

"Step 81: Click on body product"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/body_product'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 81-Click on body product.png')

"Step 82: Click on ti continueShopping -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/ti_continueShopping'))

WebUI.takeScreenshot(reportLocation + '/TC40/Step 82-Click on ti continueShopping - Navigate to page .png')

"Step 83: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC40-Manage Ecommerce Cart and Continue Shopping_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}