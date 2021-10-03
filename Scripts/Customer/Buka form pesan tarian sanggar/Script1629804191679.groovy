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

WebUI.click(findTestObject('Home Page_i-tallenta/a_Jelajah'))

WebUI.click(findTestObject('Search and Explore Page/img_Bantul_sanggarImage-74'))

WebUI.click(findTestObject('Order Sanggar Page/p_Tari Sakura                   Rp. 4.000.000                        12 Menit                                      detail'))

WebUI.click(findTestObject('Order Sanggar Page/button_Pesan Tarian Ini'))

WebUI.click(findTestObject('Order Sanggar Page/Form order/p_gunakan identitas sesuai akun'))

WebUI.sendKeys(findTestObject('Order Sanggar Page/Form order/input_Nomor HP Pemesan_nomorHPPemesan'), '0882279128371923')

WebUI.setText(findTestObject('Order Sanggar Page/Form order/input_Alamat Pemesan_alamatPemesan'), 'Jl. Durian 15C ')

WebUI.setText(findTestObject('Order Sanggar Page/Form order/input_Alamat Acara_AlamatAcaraPemesan'), 'Jl. Medika 16A')

WebUI.setText(findTestObject('Order Sanggar Page/Form order/input_Lokasi  Nama Acara_LokasiAcaraPemesan'), 'Ulang Tahun SV ke-10')

WebUI.setText(findTestObject('Order Sanggar Page/Form order/input_Kota Acara_KotaPemesan'), 'Sleman')

WebUI.setText(findTestObject('Order Sanggar Page/Form order/input_Provinsi_ProvinsiPemesan'), 'Daerah Istimewa Yogyakarta')

WebUI.click(findTestObject('Order Sanggar Page/Form order/button_Tanggal acara_TanggalPesan'))

WebUI.click(findTestObject('Order Sanggar Page/Form order/span_8'))

WebUI.delay(2)

WebUI.closeBrowser()

