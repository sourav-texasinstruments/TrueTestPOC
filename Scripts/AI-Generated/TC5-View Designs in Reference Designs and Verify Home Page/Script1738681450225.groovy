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

"Step 1: Navigate to */*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/${GlobalVariable.path_param_2}")

"Step 2: Click on link applicationCategories (DesignDevelopment)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_applicationCategories'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link applicationCategories DesignDevelopment.png')

"Step 3: Click on link applicationCategories (Applications)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_applicationCategories'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on link applicationCategories Applications.png')

"Step 4: Click on link ReferenceDesigns -> Navigate to page 'index#*/index.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/link_ReferenceDesigns'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on link ReferenceDesigns - Navigate to page indexindexhtml.png')

"Step 5: Select option with input value from select Combobox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/index.html?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_index/select_Combobox'), select_Combobox)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Select option with input value from select Combobox.png')

"Step 6: Select option with input value from select Combobox2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/index.html?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_index/select_Combobox2'), select_Combobox2)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Select option with input value from select Combobox2.png')

"Step 7: Click on button View152Designs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/index.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_index/button_View152Designs'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button View152Designs.png')

"Step 8: Click on link Applications -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/index.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_index/link_Applications'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on link Applications - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-View Designs in Reference Designs and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}