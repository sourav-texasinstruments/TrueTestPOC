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

"Step 1: Navigate to applications/*/overview.html"

TrueTestScripts.navigate("applications/${GlobalVariable.applications_id}/overview.html")

"Step 2: Click on div IndustrialEngineering"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_IndustrialEngineering'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Click on div IndustrialEngineering.png')

"Step 3: Click on link applicationCategories (Applications)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories', ['link_applicationCategories_internalRoleLinkName': link_applicationCategories_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on link applicationCategories Applications.png')

"Step 4: Click on div FlexContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_FlexContainer'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on div FlexContainer.png')

"Step 5: Click on body marketLevelPage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/body_marketLevelPage2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on body marketLevelPage2.png')

"Step 6: Click on body marketLevelPage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/body_marketLevelPage2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on body marketLevelPage2.png')

"Step 7: Click on body marketLevelPage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/body_marketLevelPage2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on body marketLevelPage2.png')

"Step 8: Click on section MainSection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/section_MainSection'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on section MainSection.png')

"Step 9: Click on div ApplicationHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_ApplicationHeader'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on div ApplicationHeader.png')

"Step 10: Click on div ApplicationHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_ApplicationHeader'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on div ApplicationHeader.png')

"Step 11: Click on div ApplicationHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_ApplicationHeader'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Click on div ApplicationHeader.png')

"Step 12: Click on div ApplicationHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_ApplicationHeader'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on div ApplicationHeader.png')

"Step 13: Click on div ApplicationHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_ApplicationHeader'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on div ApplicationHeader.png')

"Step 14: Click on div ApplicationHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_ApplicationHeader'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on div ApplicationHeader.png')

"Step 15: Click on div ApplicationHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_ApplicationHeader'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Click on div ApplicationHeader.png')

"Step 16: Click on div ApplicationHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_ApplicationHeader'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Click on div ApplicationHeader.png')

"Step 17: Click on div IndustrialEngineering"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_IndustrialEngineering'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on div IndustrialEngineering.png')

"Step 18: Click on section MainSection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/section_MainSection'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on section MainSection.png')

"Step 19: Click on div IndustrialEngineering"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_IndustrialEngineering'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 19-Click on div IndustrialEngineering.png')

"Step 20: Click on div IndustrialEngineering"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_IndustrialEngineering'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 20-Click on div IndustrialEngineering.png')

"Step 21: Click on div IndustrialEngineering"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_IndustrialEngineering'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 21-Click on div IndustrialEngineering.png')

"Step 22: Click on div CategoriesListing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/div_CategoriesListing'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 22-Click on div CategoriesListing.png')

"Step 23: Click on body marketLevelPage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/body_marketLevelPage2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 23-Click on body marketLevelPage2.png')

"Step 24: Click on link applicationCategories (Applications)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories', ['link_applicationCategories_internalRoleLinkName': link_applicationCategories_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 24-Click on link applicationCategories Applications.png')

"Step 25: Click on link applicationCategories (Products)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories', ['link_applicationCategories_internalRoleLinkName': link_applicationCategories_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 25-Click on link applicationCategories Products.png')

"Step 26: Click on link applicationCategories (DesignDevelopment)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_application_overview/link_applicationCategories', ['link_applicationCategories_internalRoleLinkName': link_applicationCategories_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 26-Click on link applicationCategories DesignDevelopment.png')

"Step 27: Click on list DesignSimulationTools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/list_DesignSimulationTools'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 27-Click on list DesignSimulationTools.png')

"Step 28: Click on link ReferenceDesigns -> Navigate to page 'index#*/index.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'applications/.*/overview.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_application_overview/link_ReferenceDesigns'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 28-Click on link ReferenceDesigns - Navigate to page indexindexhtml.png')

"Step 29: Click on atomic HeaderSearchBox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/index.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_index/atomic_HeaderSearchBox'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 29-Click on atomic HeaderSearchBox.png')

"Step 30: Enter input value in atomic HeaderSearchBox -> Navigate to page 'site search#sitesearch/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/index.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_index/atomic_HeaderSearchBox'), atomic_HeaderSearchBox)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 30-Enter input value in atomic HeaderSearchBox - Navigate to page site searchsitesearch.png')

"Step 31: Click on atomic CategoryFacet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sitesearch/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_site_search/atomic_CategoryFacet'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 31-Click on atomic CategoryFacet.png')

"Step 32: Click on atomic CategoryFacet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sitesearch/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_site_search/atomic_CategoryFacet'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 32-Click on atomic CategoryFacet.png')

"Step 33: Click on main MainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sitesearch/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_site_search/main_MainContent'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 33-Click on main MainContent.png')

"Step 34: Click on atomic CategoryFacet -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'sitesearch/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_site_search/atomic_CategoryFacet'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 34-Click on atomic CategoryFacet - Navigate to page .png')

"Step 35: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Explore Industrial Engineering Applications and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}