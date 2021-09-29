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

WebUI.navigateToUrl('https://i-tallenta.vercel.app/users/password-reset?token=07600bb445593a470fff8a98354cac65fdARlySwlkH1XtVSqUe9AdPjaxcHD8WPksAhtRnJIKw%3D')

WebUI.setEncryptedText(findTestObject('Auth Page_i-tallenta/Reset Pass/input_Password Baru_password'), 'OgbrUcIZsoTzrsFM1LFGvQ==')

WebUI.setEncryptedText(findTestObject('Auth Page_i-tallenta/Reset Pass/input_Konfirmasi Password Baru_password_confirmation'), 
    'OgbrUcIZsoS3fy/qvzO3vw==')

WebUI.setEncryptedText(findTestObject('Auth Page_i-tallenta/Reset Pass/input_Password Baru_password'), 'U+k+KkGNzIbq2mZrBuLWYQ==')

WebUI.setEncryptedText(findTestObject('Auth Page_i-tallenta/Reset Pass/input_Konfirmasi Password Baru_password_confirmation'), 
    'OgbrUcIZsoS6MLFyVUXh9A==')

WebUI.setEncryptedText(findTestObject('Auth Page_i-tallenta/Reset Pass/input_Password Baru_password'), 'U+k+KkGNzIbq2mZrBuLWYQ==')

WebUI.setEncryptedText(findTestObject('Auth Page_i-tallenta/Reset Pass/input_Konfirmasi Password Baru_password_confirmation'), 
    'U+k+KkGNzIbq2mZrBuLWYQ==')

WebUI.click(findTestObject('Auth Page_i-tallenta/Reset Pass/button_Reset Password'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_reset_pass_fail.png')

WebUI.closeBrowser()