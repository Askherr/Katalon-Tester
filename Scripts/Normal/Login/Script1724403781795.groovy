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

WebUI.openBrowser('https://warehouse.diset.my.id/admin/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login/Page_Admin - Voyager/input_E-mail_email'), 'admin@admin.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Admin - Voyager/input_Password_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Login/Page_Admin - Voyager/span_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Voyager - Welcome to Voyager. The Miss_b8989c/h3_Dashboard'), 
    'Dashboard')

