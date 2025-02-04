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

"Step 2: Click on link industryCategories (ProAudioVideo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_industryCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_industryCategories', ['link_industryCategories_tiBreadcrumbSection': link_industryCategories_tiBreadcrumbSection]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link industryCategories ProAudioVideo.png')

"Step 3: Click on link industryCategories (ProAudioVideo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_industryCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_industryCategories', ['link_industryCategories_tiBreadcrumbSection': link_industryCategories_tiBreadcrumbSection_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link industryCategories ProAudioVideo.png')

"Step 4: Click on header PageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/header_PageHeader'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on header PageHeader.png')

"Step 5: Click on header PageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/header_PageHeader'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on header PageHeader.png')

"Step 6: Click on header PageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/header_PageHeader'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on header PageHeader.png')

"Step 7: Click on header PageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/header_PageHeader'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on header PageHeader.png')

"Step 8: Click on header PageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/header_PageHeader'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on header PageHeader.png')

"Step 9: Click on header PageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/header_PageHeader'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on header PageHeader.png')

"Step 10: Click on header PageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/header_PageHeader'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on header PageHeader.png')

"Step 11: Click on div PageContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/div_PageContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on div PageContent.png')

"Step 12: Click on header PageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/header_PageHeader'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on header PageHeader.png')

"Step 13: Click on link industryCategories (ProAudioVideo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_industryCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_industryCategories', ['link_industryCategories_tiBreadcrumbSection': link_industryCategories_tiBreadcrumbSection_2]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on link industryCategories ProAudioVideo.png')

"Step 14: Click on link industryCategories (Industrial)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_industryCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_industryCategories', ['link_industryCategories_tiBreadcrumbSection': link_industryCategories_tiBreadcrumbSection_3]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on link industryCategories Industrial.png')

"Step 15: Click on header PageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/header_PageHeader'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on header PageHeader.png')

"Step 16: Click on header PageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pachinko_machine_solution/header_PageHeader'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on header PageHeader.png')

"Step 17: Click on link industryCategories (ProAudioVideo) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_industryCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_pachinko_machine_solution/link_industryCategories', ['link_industryCategories_tiBreadcrumbSection': link_industryCategories_tiBreadcrumbSection_4]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on link industryCategories ProAudioVideo - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Navigate through Industry Categories and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}