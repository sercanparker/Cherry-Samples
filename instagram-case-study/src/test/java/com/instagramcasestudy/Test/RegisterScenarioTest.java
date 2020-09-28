package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Parameters;
import static org.testng.Assert.assertTrue;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeClass; 
import io.appium.java_client.android.AndroidDriver;public class RegisterScenarioTest extends BaseTestNG{
	
	 private SignedOutFragmentActivityPage page0;

	@BeforeClass
	public void setup() throws InterruptedException
	{
		super.setup();
	page0= new SignedOutFragmentActivityPage(driver,wait);
	
	}

	
	@Test(priority=0)
	public void Given_PAGE_SignedOutFragmentActivity__is__OPENED() throws InterruptedException
	{
				WaitForUI();
	}

	@Test(priority=1)
	public void And_BUTTON_sign_up_with_email_or_phone_is__CLICKED() throws InterruptedException
	{
		page0.clickOnsign_up_with_email_or_phone();
	}

	@Test(priority=2)
	public void And_BUTTON_right_tab_is__CLICKED() throws InterruptedException
	{
		page0.clickOnright_tab();
	}

	@Parameters({"email"})
	@Test(priority=3)
	public void When_email__is__ENTERED_on__EDIT_TEXT_email_field(String param) throws InterruptedException
	{
		page0.setTextOnemail_field(param);
	}

	@Test(priority=4)
	public void And_BUTTON_button_text_is__CLICKED() throws InterruptedException
	{
		page0.clickOnbutton_text();
	}

	@Test(priority=5)
	public void Then_TEXT_VIEW_code_verification_instruction_is__SHOWN() throws InterruptedException
	{
		assertTrue(page0.isShowncode_verification_instruction());
	}
}
