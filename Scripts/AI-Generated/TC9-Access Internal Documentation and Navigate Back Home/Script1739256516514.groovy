import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.accessInternalDocumentation
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

"Step 2: Access internal documentation from the home page."

accessInternalDocumentation.execute()

"Step 3: Enter input value in ti object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_list_manager_page/ti_object'), ti_object)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Enter input value in ti object.png')

"Step 4: Click on ti object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_list_manager_page/ti_object2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on ti object2.png')

"Step 5: Click on ti object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_list_manager_page/ti_object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on ti object3.png')

"Step 6: Click on ti object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_list_manager_page/ti_object4'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on ti object4.png')

"Step 7: Click on ti object4 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_list_manager_page/ti_object4'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on ti object4 - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Access Internal Documentation and Navigate Back Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}