package pages;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
public class SignedOutFragmentActivityPage extends BasePage{
		public boolean isShowncode_verification_instruction() throws InterruptedException
	{
		return super.isShown("code_verification_instruction");
	}

		public void clickOnsign_up_with_email_or_phone() throws InterruptedException
	{
		super.click("sign_up_with_email_or_phone");
	}
	public void clickOnright_tab() throws InterruptedException
	{
		super.click("right_tab");
	}
	public void clickOnbutton_text() throws InterruptedException
	{
		super.click("button_text");
	}

		public void setTextOnemail_field(String param) throws InterruptedException
	{
		super.setText("email_field",param);
	}

	public SignedOutFragmentActivityPage(AndroidDriver driver,WebDriverWait wait)
	{
		 super(driver,wait);
	}
}
