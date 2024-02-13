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

Mobile.startApplication('C:\\Users\\USER\\Downloads\\Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/Search/android.widget.LinearLayout'), 0)

search = Mobile.tap(findTestObject('Object Repository/Search/android.widget.EditText - Search'), 0)

if (search == true) {
	
	Mobile.tap(findTestObject('Object Repository/Search/android.widget.EditText - Search'), 0)
	
    Mobile.setText(findTestObject('Object Repository/Search/android.widget.EditText - Search'), 'tablets', 0)

    Mobile.delay(2)

    Mobile.tap(findTestObject('Object Repository/Search/android.widget.ImageView'), 0)

    Mobile.tap(findTestObject('Object Repository/Search/android.widget.TextView - HP ELITEPAD 1000 G2 TABLET'), 0)

    Mobile.delay(2)

    Mobile.tap(findTestObject('Object Repository/Search/android.widget.Button - ADD TO CART'), 0)

    Mobile.delay(2)
} else {
	
    Mobile.tap(findTestObject('Object Repository/Search/android.widget.TextView - LAPTOPS'), 0)

    Mobile.delay(2)

//    WebUI.verifyElementText(findTestObject('Search/android.widget.TextView - Laptops (11)'), laptop)
}

Mobile.closeApplication()

Mobile.delay(2)

