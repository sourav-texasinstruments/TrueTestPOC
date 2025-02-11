package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class loginAfterCheckoutCancel {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on ti cartOrderDetails -> Navigate to page 'checkout#store/*/checkout'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_ecommerce_cart/ti_cartOrderDetails', ['ti_cartOrderDetails_internalHasText': data['ti_cartOrderDetails_internalHasText']]))
        
        "Step 2: Click on div shippingBillingAddress"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/div_shippingBillingAddress'))
        
        "Step 3: Click on ti object5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_object5'))
        
        "Step 4: Click on ti checkoutDialogCancel"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_checkoutDialogCancel'))
        
        "Step 5: Click on ti login"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_login'))
        
        "Step 6: Click on ti login"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout/ti_login'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['ti_cartOrderDetails_internalHasText'] = testData.getValue('ti_cartOrderDetails_internalHasText', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['ti_cartOrderDetails_internalHasText'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

