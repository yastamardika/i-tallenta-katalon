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

WebUI.click(findTestObject('Partner Dashboard Page/a_Transaksi'))

WebUI.click(findTestObject('Partner Dashboard Page/Index Order/button_2'))

WebUI.click(findTestObject('Partner Dashboard Page/Index Order/a_Lihat Detail - 384'))

WebUI.delay(3)

WebUI.click(findTestObject('Partner Dashboard Page/Detail Order/button_Tolak Pesanan'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_menolak-pesanan-dialog.png')

WebUI.click(findTestObject('Partner Dashboard Page/Detail Order/a_Batal'))

WebUI.click(findTestObject('Partner Dashboard Page/Detail Order/button_Tolak Pesanan'))

WebUI.click(findTestObject('Partner Dashboard Page/Detail Order/a_Tolak'))

WebUI.delay(2)

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_menolak-pesanan-success.png')

WebUI.closeBrowser()

