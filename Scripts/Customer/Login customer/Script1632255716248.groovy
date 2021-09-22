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

WebUI.click(findTestObject('Object Repository/Auth Page_i-tallenta/Login Page/svg_Bergabung Menjadi Mitra_bi-person-fill _8f5b30'))

WebUI.click(findTestObject('Auth Page_i-tallenta/a_Login (1)'))

WebUI.setText(findTestObject('Object Repository/Auth Page_i-tallenta/Login Page/input_Email_InputEmail'), 'jonsnow@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Auth Page_i-tallenta/Login Page/input_Password_password (1)'), 
    'OgbrUcIZsoQToGN7Jc/4FA==')

WebUI.click(findTestObject('Object Repository/Auth Page_i-tallenta/Login Page/button_Login'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(3)

