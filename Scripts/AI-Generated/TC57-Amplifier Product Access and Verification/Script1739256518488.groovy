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

"Step 2: Click on link resourceCategories (Products)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_resourceCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_resourceCategories', ['link_resourceCategories_internalRoleLinkName': link_resourceCategories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 2-Click on link resourceCategories Products.png')

"Step 3: Click on link Amplifiers -> Navigate to page 'internal resource#*/overview.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Amplifiers'))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 3-Click on link Amplifiers - Navigate to page internal resourceoverviewhtml.png')

"Step 4: Click on link ViewAllProducts -> Navigate to page 'internal resource#*/products.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/link_ViewAllProducts'))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 4-Click on link ViewAllProducts - Navigate to page internal resourceproductshtml.png')

"Step 5: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 5-Click on div object.png')

"Step 6: Click on ti object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_object9'))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 6-Click on ti object9.png')

"Step 7: Click on div Description -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/div_Description'))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 7-Click on div Description - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC57-Amplifier Product Access and Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}