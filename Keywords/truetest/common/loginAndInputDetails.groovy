package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class loginAndInputDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on ti object3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_object3'))
        
        "Step 2: Click on ti object3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_object3'))
        
        "Step 3: Enter input value in ti object3"
        
        WebUI.setText(findTestObject('AI-Generated/Page_ecommerce_cart/ti_object3'), data['ti_object3'])
        
        "Step 4: Click on ti Login"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_Login'))
        
        "Step 5: Click on ti Login"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_ecommerce_cart/ti_Login'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['ti_object3'] = testData.getValue('ti_object3', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['ti_object3'] = 'default_data'
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

