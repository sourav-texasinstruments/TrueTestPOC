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

"Step 1: Navigate to about-ti/*/*"

TrueTestScripts.navigate("about-ti/${GlobalVariable.about_ti_id}/${GlobalVariable.path_param_3}")

"Step 2: Click on body EventsBasePage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/body_EventsBasePage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 2-Click on body EventsBasePage.png')

"Step 3: Click on ti TabContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_TabContainer'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 3-Click on ti TabContainer.png')

"Step 4: Click on ti TabContainer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_TabContainer'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on ti TabContainer2.png')

"Step 5: Click on link learnMore (LearnMoreWiFi)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_internal_resource/link_learnMore"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_internal_resource/link_learnMore', ['link_learnMore_internalRoleLinkName': link_learnMore_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Click on link learnMore LearnMoreWiFi.png')

"Step 6: Click on ti tabContainers (TabContainer3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_internal_resource/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_internal_resource/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on ti tabContainers TabContainer3.png')

"Step 7: Click on ti tabContainers (TabContainer4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_internal_resource/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_internal_resource/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 7-Click on ti tabContainers TabContainer4.png')

"Step 8: Click on button PlayVideo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/button_PlayVideo'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 8-Click on button PlayVideo.png')

"Step 9: Click on button Pause"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/button_Pause'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 9-Click on button Pause.png')

"Step 10: Click on div StoryWithTabs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/div_StoryWithTabs'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 10-Click on div StoryWithTabs.png')

"Step 11: Click on body EventsBasePage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/body_EventsBasePage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 11-Click on body EventsBasePage2.png')

"Step 12: Click on ti TabContainer5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_TabContainer5'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 12-Click on ti TabContainer5.png')

"Step 13: Click on ti TabContainer6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_TabContainer5'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 13-Click on ti TabContainer6.png')

"Step 14: Click on ti TabContainer5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_TabContainer5'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 14-Click on ti TabContainer5.png')

"Step 15: Click on ti TabContainer6 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'about-ti/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_internal_resource/ti_TabContainer5'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 15-Click on ti TabContainer6 - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Explore Events and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}