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

WebUI.callTestCase(findTestCase('Administrator/Login admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin Dashboard Page/button_Admin Panel'))

WebUI.click(findTestObject('Admin Dashboard Page/span_Manajemen Pengguna'))

WebUI.click(findTestObject('Admin Dashboard Page/a_Seluruh Pengguna'))

WebUI.click(findTestObject('Admin Dashboard Page/Index user/button_3'))

WebUI.click(findTestObject('Admin Dashboard Page/Index user/a_Detail Pengguna page 3'))

WebUI.click(findTestObject('Admin Dashboard Page/Detail user page/button_Tolak'))

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_admin-tolak-calon-mitra-dialog.png')

WebUI.click(findTestObject('Admin Dashboard Page/Detail user page/a_Cancel'))

WebUI.click(findTestObject('Admin Dashboard Page/Detail user page/button_Tolak'))

WebUI.click(findTestObject('Admin Dashboard Page/Detail user page/a_Tolak'))

WebUI.delay(1)

WebUI.takeScreenshot(GlobalVariable.SDirectory + 'test_admin-tolak-calon-mitra-success.png')

WebUI.closeBrowser()

