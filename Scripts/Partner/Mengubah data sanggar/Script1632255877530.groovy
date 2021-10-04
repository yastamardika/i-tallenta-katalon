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

WebUI.click(findTestObject('Partner Dashboard Page/button_Panel Mitra'))

WebUI.click(findTestObject('Partner Dashboard Page/a_Ubah Informasi Sanggar'))

WebUI.setText(findTestObject('Partner Dashboard Page/Edit sanggar info/input_Sanggar Name_input-sanggar-edit-name'), 'Sanggar kembang sakra')

WebUI.setText(findTestObject('Partner Dashboard Page/Edit sanggar info/input_Sanggar email address_input-sanggar-edit-email'), 
    'sanggarkembangsakra@gmail.com')

WebUI.setText(findTestObject('Partner Dashboard Page/Edit sanggar info/input_Nomor Hp Sanggar_sanggar-edit-phone'), '0889283742')

WebUI.setText(findTestObject('Partner Dashboard Page/Edit sanggar info/input_sanggar-edit-address'), 'Jl Apel 10A')

WebUI.setText(findTestObject('Partner Dashboard Page/Edit sanggar info/textarea_Deskripsi Sanggar_textarea-sanggar-edit-desc'), 
    'Automation testing on desc textarea')

WebUI.setText(findTestObject('Partner Dashboard Page/Edit sanggar info/input_Youtube video link_input-sanggar-edit-youtube'), 
    'https://youtu.be/QTfnUBFcFq8')

WebUI.setText(findTestObject('Partner Dashboard Page/Edit sanggar info/input_sanggar-edit-google-map'), 'https://goo.gl/maps/oKN1Ln7yKRqt4t9s9')

WebUI.setText(findTestObject('Partner Dashboard Page/Edit sanggar info/input_sanggar-edit-postal'), '55571')

WebUI.setText(findTestObject('Partner Dashboard Page/Edit sanggar info/input_sanggar-edit-province'), 'Daerah Istimewa Yogyakarta')

WebUI.setText(findTestObject('Partner Dashboard Page/Edit sanggar info/input_sanggar-edit-city'), 'Kabupaten Sleman')

WebUI.click(findTestObject('Partner Dashboard Page/Edit sanggar info/button_ubah gambar'))

WebUI.uploadFileWithDragAndDrop(findTestObject('Partner Dashboard Page/Edit sanggar info/label_Choose a file or drop it here'), 
    'C:\\Users\\Yasha\\Pictures\\gambar sanggar\\917A9687.jpg')

WebUI.click(findTestObject('Partner Dashboard Page/Edit sanggar info/button_Ubah Data'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_change.png')

WebUI.delay(3)

WebUI.closeBrowser()

