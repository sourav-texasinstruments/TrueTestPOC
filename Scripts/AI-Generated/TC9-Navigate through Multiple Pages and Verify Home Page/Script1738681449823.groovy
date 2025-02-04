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

"Step 2: Click on header PageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_flight_control_unit_solution/header_PageHeader'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on header PageHeader.png')

"Step 3: Click on link AerospaceDefense"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_flight_control_unit_solution/link_AerospaceDefense'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link AerospaceDefense.png')

"Step 4: Click on link Applications"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_flight_control_unit_solution/link_Applications'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link Applications.png')

"Step 5: Click on link PowerDelivery -> Navigate to page 'application overview#applications/*/*/overview.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_flight_control_unit_solution/link_PowerDelivery'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on link PowerDelivery - Navigate to page application overviewapplicationsoverviewhtml.png')

"Step 6: Click on ti searchField (SearchField3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/ti_searchField_1'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on ti searchField SearchField3.png')

"Step 7: Enter input value in ti searchField (SearchField4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/ti_searchField_1'), ti_searchField)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Enter input value in ti searchField SearchField4.png')

"Step 8: Click on link ProfessionalAudioAmplifier3 -> Navigate to page 'professional audio amplifier solution#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_ProfessionalAudioAmplifier3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on link ProfessionalAudioAmplifier3 - Navigate to page professional audio amplifier solution.png')

"Step 9: Click on main PageMain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_amplifier_solution/main_PageMain'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on main PageMain.png')

"Step 10: Click on main PageMain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_amplifier_solution/main_PageMain'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on main PageMain.png')

"Step 11: Click on main PageMain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_amplifier_solution/main_PageMain'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on main PageMain.png')

"Step 12: Click on div ProductsReferenceDesigns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_amplifier_solution/div_ProductsReferenceDesigns'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on div ProductsReferenceDesigns.png')

"Step 13: Click on div ProductsReferenceDesigns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_amplifier_solution/div_ProductsReferenceDesigns'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on div ProductsReferenceDesigns.png')

"Step 14: Click on main PageMain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_amplifier_solution/main_PageMain'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on main PageMain.png')

"Step 15: Click on main PageMain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_amplifier_solution/main_PageMain'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on main PageMain.png')

"Step 16: Click on main PageMain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_amplifier_solution/main_PageMain'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on main PageMain.png')

"Step 17: Click on main PageMain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_amplifier_solution/main_PageMain'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on main PageMain.png')

"Step 18: Click on div HomeApplications"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_amplifier_solution/div_HomeApplications'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on div HomeApplications.png')

"Step 19: Click on ti Breadcrumb"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_professional_audio_amplifier_solution/ti_Breadcrumb'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on ti Breadcrumb.png')

"Step 20: Click on div pageContent (PageContent)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_professional_audio_amplifier_solution/div_pageContent'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on div pageContent PageContent.png')

"Step 21: Click on link applicationCategories (Applications)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_professional_audio_amplifier_solution/link_applicationCategories'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Click on link applicationCategories Applications.png')

"Step 22: Click on link applicationCategories (Applications2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_professional_audio_amplifier_solution/link_applicationCategories'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Click on link applicationCategories Applications2.png')

"Step 23: Click on div pageContent (PageContent2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_professional_audio_amplifier_solution/div_pageContent'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Click on div pageContent PageContent2.png')

"Step 24: Click on div pageContent (PageContent2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_professional_audio_amplifier_solution/div_pageContent'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on div pageContent PageContent2.png')

"Step 25: Click on div pageContent (PageContent2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_professional_audio_amplifier_solution/div_pageContent'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Click on div pageContent PageContent2 - Navigate to page .png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Navigate through Multiple Pages and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}