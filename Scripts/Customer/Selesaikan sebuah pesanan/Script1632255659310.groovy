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

WebUI.click(findTestObject('Profile Navbar/a_Pesanan Saya'))

WebUI.delay(2)

WebUI.click(findTestObject('History order page/a_2'))

WebUI.click(findTestObject('Order Detail Page/item-order-processed_by_sanggar'))

WebUI.click(findTestObject('Order Detail Page/button_Selesai'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_detail-order-prompt-dialog.png')

WebUI.click(findTestObject('Order Detail Page/a_Selesai'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_detail-order-clicked.png')

WebUI.delay(2)

