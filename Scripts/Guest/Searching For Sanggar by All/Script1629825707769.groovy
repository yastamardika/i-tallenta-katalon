import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://i-tallenta.vercel.app/')

WebUI.click(findTestObject('Home Page_i-tallenta/a_Jelajah'))

WebUI.delay(3)

WebUI.focus(findTestObject('Object Repository/Search and Explore Page/input_Cari dan temukan sanggar yang tepat u_b6d194'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Search and Explore Page/input_Cari dan temukan sanggar yang tepat u_b6d194'), 
    'Bantu')

WebUI.setText(findTestObject('Object Repository/Search and Explore Page/input_Cari dan temukan sanggar yang tepat u_b6d194'), 
    'Bantul')

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/Search and Explore Page/div_Sanggar Tari Saraswati                 _a0cc5b'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Search and Explore Page/div_Sanggar Tari Saraswati                 _a0cc5b'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Search and Explore Page/input_Cari dan temukan sanggar yang tepat u_b6d194'), 
    'Artha')

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/Search and Explore Page/div_Artha Dance                  Bantul'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Search and Explore Page/div_Artha Dance                  Bantul'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Search and Explore Page/input_Cari dan temukan sanggar yang tepat u_b6d194'), 
    'Daerah Istimewa')

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/Search and Explore Page/div_Sanggar Tari Saraswati                 _3c757f'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Search and Explore Page/div_Sanggar Tari Saraswati                 _3c757f'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

