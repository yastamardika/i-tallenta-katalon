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

WebUI.click(findTestObject('Auth Page_i-tallenta/div_Selamat Datang di               I-Talle_8fbe36'))

WebUI.click(findTestObject('Auth Page_i-tallenta/svg_Bergabung Menjadi Mitra_bi-person-fill _8f5b30'))

WebUI.click(findTestObject('Auth Page_i-tallenta/a_Register'))

WebUI.setText(findTestObject('Auth Page_i-tallenta/input_Email_email'), 'rudityacandra@mail.ugm.ac.id')

WebUI.setText(findTestObject('Auth Page_i-tallenta/input_Username_username'), 'rudii')

WebUI.setEncryptedText(findTestObject('Auth Page_i-tallenta/input_Password_password'), 'OgbrUcIZsoQToGN7Jc/4FA==')

WebUI.setEncryptedText(findTestObject('Auth Page_i-tallenta/input_Konfirmasi Password_password_confirmation'), 'OgbrUcIZsoQToGN7Jc/4FA==')

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_register_pass_validation.png')

WebUI.setEncryptedText(findTestObject('Auth Page_i-tallenta/input_Password_password'), 'U+k+KkGNzIbq2mZrBuLWYQ==')

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_register_confirm_pass_val.png')

WebUI.setEncryptedText(findTestObject('Auth Page_i-tallenta/input_Konfirmasi Password_password_confirmation'), 'U+k+KkGNzIbq2mZrBuLWYQ==')

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_register_ready.png')

WebUI.click(findTestObject('Auth Page_i-tallenta/Register Page/button_Register'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_register_submit.png')

WebUI.closeBrowser()

