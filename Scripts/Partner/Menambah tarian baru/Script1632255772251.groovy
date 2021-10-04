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

WebUI.click(findTestObject('Partner Dashboard Page/span_Sanggar'))

WebUI.click(findTestObject('Partner Dashboard Page/a_Paket'))

WebUI.click(findTestObject('Partner Dashboard Page/Index Package/span_Tambah Paket Baru'))

WebUI.setText(findTestObject('Partner Dashboard Page/Create Package/input_Nama Tarian_input-nama_tarian'), 'Tari Uka Uka')

WebUI.setText(findTestObject('Partner Dashboard Page/Create Package/input_Harga_input-harga_tarian'), '1000000')

WebUI.setText(findTestObject('Partner Dashboard Page/Create Package/input_Durasi_input-tambah-durasi_tarian'), '15 Menit')

WebUI.setText(findTestObject('Partner Dashboard Page/Create Package/textarea_Deskripsi Produk_input-tambah-deskripsi_tarian'), 
    'Tarian ini merupakan tarian yang berasal dari')

WebUI.uploadFileWithDragAndDrop(findTestObject('Partner Dashboard Page/Create Package/label_Choose a file or drop it here'), 
    'C:\\Users\\Yasha\\Pictures\\gambar sanggar\\917A9687.jpg')

WebUI.click(findTestObject('Partner Dashboard Page/Create Package/button_Tambah Produk'))

WebUI.delay(3)

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_menambah_tarian.png')

WebUI.closeBrowser()

