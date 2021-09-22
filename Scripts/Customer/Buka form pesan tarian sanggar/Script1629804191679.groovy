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

WebUI.callTestCase(findTestCase('Guest/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Buka detail sanggar - Order'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Order Sanggar Page/Form Order/input_Nama Pemesan___BVID__159'), 'Jon')

WebUI.setText(findTestObject('Object Repository/Order Sanggar Page/Form Order/input_Email Pemesan___BVID__161'), 'jonsnow@gmail.com')

WebUI.setText(findTestObject('Object Repository/Order Sanggar Page/Form Order/input_Nomor HP Pemesan___BVID__163'), '0882279128371923')

WebUI.setText(findTestObject('Object Repository/Order Sanggar Page/Form Order/input_Alamat Pemesan___BVID__165'), 'Jl. Durian 15C ')

WebUI.setText(findTestObject('Object Repository/Order Sanggar Page/Form Order/input_Alamat Acara___BVID__167'), 'Jl. Medika 16A')

WebUI.setText(findTestObject('Object Repository/Order Sanggar Page/Form Order/input_Lokasi  Nama Acara___BVID__169'), 'Ulang Tahun SV ke-10')

WebUI.setText(findTestObject('Object Repository/Order Sanggar Page/Form Order/input_Kota Acara___BVID__171'), 'Sleman')

WebUI.setText(findTestObject('Object Repository/Order Sanggar Page/Form Order/input_Provinsi___BVID__173'), 'Daerah Istimewa Yogyakarta')

WebUI.click(findTestObject('Object Repository/Order Sanggar Page/Form Order/button_Tanggal acara_example-datepicker'))

WebUI.click(findTestObject('Object Repository/Order Sanggar Page/Form Order/span_3'))

WebUI.check(findTestObject('Object Repository/Order Sanggar Page/Form Order/button_Pesan dan Bayar'))

WebUI.delay(2)

WebUI.closeBrowser()

