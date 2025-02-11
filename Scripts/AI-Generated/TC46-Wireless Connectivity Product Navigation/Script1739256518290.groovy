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

"Step 2: Click on link resourceCategories (designDevelopment)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_resourceCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_resourceCategories', ['link_resourceCategories_internalRoleLinkName': link_resourceCategories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 2-Click on link resourceCategories designDevelopment.png')

"Step 3: Click on link wirelessConnectivity -> Navigate to page 'wireless connectivity automotive#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_wirelessConnectivity'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 3-Click on link wirelessConnectivity - Navigate to page wireless connectivity automotive.png')

"Step 4: Click on ti tabContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 4-Click on ti tabContainer.png')

"Step 5: Click on ti tabContainer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 5-Click on ti tabContainer2.png')

"Step 6: Click on ti tabContainer3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer3'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 6-Click on ti tabContainer3.png')

"Step 7: Click on ti tabContainer4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer3'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 7-Click on ti tabContainer4.png')

"Step 8: Click on ti tabContainer5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer3'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 8-Click on ti tabContainer5.png')

"Step 9: Click on ti tabContainer6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer3'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 9-Click on ti tabContainer6.png')

"Step 10: Click on ti tabContainer7 -> Navigate to page 'wireless connectivity low power 2 4 ghz#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 10-Click on ti tabContainer7 - Navigate to page wireless connectivity low power 2 4 ghz.png')

"Step 11: Click on ti tabContainers (tabContainer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 11-Click on ti tabContainers tabContainer.png')

"Step 12: Click on ti tabContainers (tabContainer2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 12-Click on ti tabContainers tabContainer2.png')

"Step 13: Click on ti tabContainers (tabContainer3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 13-Click on ti tabContainers tabContainer3.png')

"Step 14: Click on ti tabContainers (tabContainer4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 14-Click on ti tabContainers tabContainer4.png')

"Step 15: Click on ti tabContainers (tabContainerSimplifyDesign)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_4]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 15-Click on ti tabContainers tabContainerSimplifyDesign.png')

"Step 16: Click on ti tabContainers (tabContainerSimplifyDesign2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_5]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 16-Click on ti tabContainers tabContainerSimplifyDesign2.png')

"Step 17: Click on ti tabContainerJumpstartEvaluation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_low_power4_ghz/ti_tabContainerJumpstartEvaluation'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 17-Click on ti tabContainerJumpstartEvaluation.png')

"Step 18: Click on ti tabContainerJumpstartEvaluation2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_low_power4_ghz/ti_tabContainerJumpstartEvaluation'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 18-Click on ti tabContainerJumpstartEvaluation2.png')

"Step 19: Click on ti tabContainerJumpstartEvaluation3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_low_power4_ghz/ti_tabContainerJumpstartEvaluation'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 19-Click on ti tabContainerJumpstartEvaluation3.png')

"Step 20: Click on ti tabContainerJumpstartEvaluation4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_low_power4_ghz/ti_tabContainerJumpstartEvaluation'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 20-Click on ti tabContainerJumpstartEvaluation4.png')

"Step 21: Click on ti tabContainers (tabContainerSimplifyDesign)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_6]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 21-Click on ti tabContainers tabContainerSimplifyDesign.png')

"Step 22: Click on ti tabContainers (tabContainerSimplifyDesign2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_7]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 22-Click on ti tabContainers tabContainerSimplifyDesign2.png')

"Step 23: Click on ti tabContainerJumpstartEvaluation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_low_power4_ghz/ti_tabContainerJumpstartEvaluation'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 23-Click on ti tabContainerJumpstartEvaluation.png')

"Step 24: Click on ti tabContainerJumpstartEvaluation2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_low_power4_ghz/ti_tabContainerJumpstartEvaluation'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 24-Click on ti tabContainerJumpstartEvaluation2.png')

"Step 25: Click on ti tabContainerJumpstartEvaluation3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_low_power4_ghz/ti_tabContainerJumpstartEvaluation'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 25-Click on ti tabContainerJumpstartEvaluation3.png')

"Step 26: Click on ti tabContainers (tabContainer3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_8]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 26-Click on ti tabContainers tabContainer3.png')

"Step 27: Click on ti tabContainers (tabContainer4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_9]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 27-Click on ti tabContainers tabContainer4.png')

"Step 28: Click on ti tabContainers (tabContainer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_10]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 28-Click on ti tabContainers tabContainer.png')

"Step 29: Click on ti tabContainers (tabContainer2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_11]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 29-Click on ti tabContainers tabContainer2.png')

"Step 30: Click on ti tabContainers (tabContainer5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_12]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 30-Click on ti tabContainers tabContainer5.png')

"Step 31: Click on ti tabContainers (tabContainer2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_13]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 31-Click on ti tabContainers tabContainer2.png')

"Step 32: Click on ti tabContainers (tabContainer3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_14]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 32-Click on ti tabContainers tabContainer3.png')

"Step 33: Click on ti tabContainers (tabContainer4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_15]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 33-Click on ti tabContainers tabContainer4.png')

"Step 34: Click on ti tabContainers (tabContainerSimplifyDesign)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_16]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 34-Click on ti tabContainers tabContainerSimplifyDesign.png')

"Step 35: Click on ti tabContainers (tabContainerSimplifyDesign2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_wireless_connectivity_low_power4_ghz/ti_tabContainers', ['ti_tabContainers_internalHasText': ti_tabContainers_internalHasText_17]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 35-Click on ti tabContainers tabContainerSimplifyDesign2.png')

"Step 36: Click on ti tabContainerJumpstartEvaluation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_low_power4_ghz/ti_tabContainerJumpstartEvaluation'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 36-Click on ti tabContainerJumpstartEvaluation.png')

"Step 37: Click on ti tabContainerJumpstartEvaluation2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_low_power4_ghz/ti_tabContainerJumpstartEvaluation'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 37-Click on ti tabContainerJumpstartEvaluation2.png')

"Step 38: Click on ti tabContainerJumpstartEvaluation3 -> Navigate to page 'wireless connectivity automotive#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_low_power4_ghz/ti_tabContainerJumpstartEvaluation'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 38-Click on ti tabContainerJumpstartEvaluation3 - Navigate to page wireless connectivity automotive.png')

"Step 39: Click on ti tabContainer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 39-Click on ti tabContainer2.png')

"Step 40: Click on ti tabContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 40-Click on ti tabContainer.png')

"Step 41: Click on ti tabContainer3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer3'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 41-Click on ti tabContainer3.png')

"Step 42: Click on ti tabContainer4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer3'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 42-Click on ti tabContainer4.png')

"Step 43: Click on ti tabContainer5 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_wireless_connectivity_automotive/ti_tabContainer3'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 43-Click on ti tabContainer5 - Navigate to page .png')

"Step 44: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC46-Wireless Connectivity Product Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}