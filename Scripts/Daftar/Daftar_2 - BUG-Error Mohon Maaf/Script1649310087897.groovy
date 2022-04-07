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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('https://dev.p2p.alamisharia.co.id/')

WebUI.click(findTestObject('Daftar/Button_Daftar disini'))

WebUI.click(findTestObject('Daftar/div_Pemberi Dana'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Daftar/input_Nama Lengkap_name'), 'Rahmat Sasongko')

WebUI.setText(findTestObject('Daftar/input_Email_email'), 'vaskotitor@inadtia.com')

WebUI.setText(findTestObject('Daftar/input_No. Handphone_phone'), '087781888808')

WebUI.setEncryptedText(findTestObject('Daftar/input_Password_password'), 
    '2a5piYK/fw1IjbFSjHzq9A==')

WebUI.click(findTestObject('Daftar/label_Individual'))

WebUI.setText(findTestObject('Daftar/input_Kode Referral (Opsional)_relamiCodeReferral'), 
    '')

WebUI.selectOptionByValue(findTestObject('Daftar/select_-- Silahkan Pilih --'), 
    '1', false)

WebUI.click(findTestObject('Daftar/button_Lanjutkan'))

'Scroll to \'Book Appointment\' button'
WebUI.scrollToElement(findTestObject('Daftar/Scroll Bawah'), 3)

WebUI.click(findTestObject('Daftar/CheckBox_SayaTertarik'))

WebUI.click(findTestObject('Daftar/CheckBox_SayaSudah'))

WebUI.click(findTestObject('Daftar/button_Lanjutkan_2'))

WebUI.verifyElementText(findTestObject('Daftar/Verify_Mohon Maaf'), 
    'Mohon Maaf')

WebUI.click(findTestObject('Daftar/button_OK'))

