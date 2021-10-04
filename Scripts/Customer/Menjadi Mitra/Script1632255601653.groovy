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

WebUI.click(findTestObject('Profile Navbar/button_Bergabung Menjadi Mitra'))

WebUI.setText(findTestObject('Partner Register Page/input_Nama Sanggar_input-nama-sanggar'), 'Sanggar muntilan')

WebUI.setText(findTestObject('Partner Register Page/input_Nomor Handphone Sanggar_input-phone'), '084798274231')

WebUI.setText(findTestObject('Partner Register Page/input_Alamat Sanggar_input-address'), 'Jl. Pohrubuh No 5 Muntilan')

WebUI.setText(findTestObject('Partner Register Page/textarea_Deskripsi Sanggar_textarea-description-sanggar'), 'Sanggar ini merupakan sanggar yang terintegrasi dengan peternakan dan usaha tani')

WebUI.setText(findTestObject('Partner Register Page/input_Youtube video link_input-video_profile'), 'https://youtu.be/2ei6yOpw5aE')

WebUI.setText(findTestObject('Partner Register Page/input_Alamat Sanggar_input-google_map_link'), 'https://goo.gl/maps/rhejAZcS6DXT8YDQA')

WebUI.setText(findTestObject('Partner Register Page/input_Alamat Sanggar_input-postal-code'), '56238')

WebUI.uploadFileWithDragAndDrop(findTestObject('Partner Register Page/label_No file chosen'), 'C:\\Users\\Yasha\\Pictures\\gambar sanggar\\pradita1.jpg')

//WebUI.click(findTestObject('Partner Register Page/select_Pilih provinsi'))
WebUI.selectOptionByLabel(findTestObject('Partner Register Page/select_Pilih provinsi'), 'Jawa Tengah', false)

WebUI.selectOptionByLabel(findTestObject('Partner Register Page/select_Pilih Kota'), 'Kabupaten Magelang', false)

WebUI.click(findTestObject('Partner Register Page/button_Submit'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_register-partner_dialog.png')

WebUI.click(findTestObject('Partner Register Page/a_Batal'))

WebUI.click(findTestObject('Partner Register Page/button_Submit'))

WebUI.click(findTestObject('Partner Register Page/a_Terima'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_register-accepted.png')
