package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateBacklogReport {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link BacklogReport3 -> Navigate to page 'project management#*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_documentation/link_BacklogReport3'))
        
        "Step 2: Click on ti select"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/ti_select'))
        
        "Step 3: Click on ti select"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/ti_select'))
        
        "Step 4: Click on ti select"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/ti_select'))
        
        "Step 5: Click on ti select"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/ti_select'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

