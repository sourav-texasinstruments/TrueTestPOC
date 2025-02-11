package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class interactWithHomePage {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on body home"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/body_home'))
        
        "Step 2: Click on ti object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object'))
        
        "Step 3: Click on ti object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object2'))
        
        "Step 4: Click on ti object2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ti_object2'))
        
        "Step 5: Enter input value in ti object2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_home/ti_object2'), data['ti_object2'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['ti_object2'] = testData.getValue('ti_object2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['ti_object2'] = 'default_data'
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

