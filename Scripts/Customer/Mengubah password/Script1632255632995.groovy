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

WebUI.callTestCase(findTestCase('Customer/Login customer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile Navbar/svg_Bergabung Menjadi Mitra_bi-person-fill _8f5b30'))

WebUI.click(findTestObject('Profile Navbar/a_Profil'))

WebUI.click(findTestObject('Change Password/a_Ubah Password'))

WebUI.click(findTestObject('Change Password/button_Ubah Password'))

WebUI.setEncryptedText(findTestObject('Change Password/input_Password Lama_old-password'), 'cVN1MKHDK0c=')

WebUI.setEncryptedText(findTestObject('Change Password/input_Password Baru_password'), 'i3qmFh1miHY=')

WebUI.setEncryptedText(findTestObject('Change Password/input_Konfirmasi Password Baru_password_confirmation'), 'OgbrUcIZsoQToGN7Jc/4FA==')

WebUI.click(findTestObject('Change Password/button_Ubah'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'mengubah_password_pass-baru-tak-valid.png')

WebUI.clearText(findTestObject('Change Password/input_Password Baru_password'), FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Change Password/input_Password Baru_password'), 'U+k+KkGNzIbq2mZrBuLWYQ==')

WebUI.click(findTestObject('Change Password/button_Ubah'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'mengubah_password_kombinasi-salah.png')

WebUI.clearText(findTestObject('Change Password/input_Konfirmasi Password Baru_password_confirmation'), FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Change Password/input_Konfirmasi Password Baru_password_confirmation'), 'U+k+KkGNzIbq2mZrBuLWYQ==')

WebUI.click(findTestObject('Change Password/button_Ubah'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'mengubah_password_pass-lama-salah.png')

WebUI.setEncryptedText(findTestObject('Change Password/input_Password Lama_old-password'), 'U+k+KkGNzIZnQw0BJHfeBQ==')

WebUI.setEncryptedText(findTestObject('Change Password/input_Password Baru_password'), 'U+k+KkGNzIbq2mZrBuLWYQ==')

WebUI.setEncryptedText(findTestObject('Change Password/input_Konfirmasi Password Baru_password_confirmation'), 'U+k+KkGNzIbq2mZrBuLWYQ==')

WebUI.click(findTestObject('Change Password/button_Ubah'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'mengubah_password_berhasil.png')

WebUI.closeBrowser()

