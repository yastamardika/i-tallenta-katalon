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

WebUI.callTestCase(findTestCase('Partner/Login mitra'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile Navbar/button_Bergabung Menjadi Mitra'))

WebUI.setText(findTestObject('Partner Register Page/input_Nama Sanggar_input-nama-sanggar'), '')

WebUI.setText(findTestObject('Partner Register Page/input_Nomor Handphone Sanggar_input-phone'), '')

WebUI.setText(findTestObject('Partner Register Page/input_Alamat Sanggar_input-address'), '')

WebUI.setText(findTestObject('Partner Register Page/textarea_Deskripsi Sanggar_textarea-description-sanggar'), '')

WebUI.setText(findTestObject('Partner Register Page/input_Youtube video link_input-video_profile'), '')

WebUI.setText(findTestObject('Partner Register Page/input_Alamat Sanggar_input-google_map_link'), '')

WebUI.setText(findTestObject('Partner Register Page/input_Alamat Sanggar_input-postal-code'), '')

WebUI.uploadFile(findTestObject('Partner Register Page/label_No file chosen'), '')

WebUI.selectOptionByLabel(findTestObject('Partner Register Page/select_Pilih Kota'), '', false)

WebUI.selectOptionByLabel(findTestObject('Partner Register Page/select_Pilih provinsi'), '', false)

WebUI.click(findTestObject('Partner Register Page/button_Reset'))

