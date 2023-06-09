package Pages;


import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Aulas_Base.BaseTest;


public class UserManagement extends BaseTest {
	LoginClass LC= new LoginClass();
	HomePage1 HP=new HomePage1();
	@FindBy(xpath = "//a[@href='/user-management']")
	WebElement UserManagement;
	@FindBy(xpath = "(//*[@class='ant-layout-content'])[1]")
	WebElement PageContent;
	@FindBy(xpath = "(//span[@class='anticon anticon-arrow-left'])[1]")
	WebElement Backbutton;
	/**************** Manually Add A User Creation ************************/

	@FindBy(xpath = "(//button[@class='sc-bdvvtL gfCDdx r-c-c'])[1]")
	WebElement AddUser;
	@FindBy(xpath = "(//*[@class='ant-modal-body']/div/div)[1]")
	WebElement CreateYourOwn;
	@FindBy(xpath = "//*[text()='NEXT']")
	WebElement Next;
	@FindBy(xpath = "(//*[@class='ant-select-selector'])[2]")
	WebElement UserTypeSelector;
	@FindBy(xpath = "(//*[@class='rc-virtual-list-holder-inner']/div/div)[1]")
	WebElement Student;
	@FindBy(xpath = "(//*[@class='rc-virtual-list-holder-inner']/div/div)[2]")
	WebElement Teacher;
	@FindBy(xpath = "(//*[@class='rc-virtual-list-holder-inner']/div/div)[3]")
	WebElement DataOperator;
	@FindBy(xpath = "(//*[@class='rc-virtual-list-holder-inner']/div/div)[4]")
	WebElement Operation;
	@FindBy(xpath = "(//*[@class='ant-input full-width'])[1]")
	WebElement Name;
	@FindBy(xpath = "(//*[@class='ant-input'])[1]")
	WebElement Name1;
	@FindBy(xpath = "//*[@class='PhoneInputInput']")
	WebElement Number;
	@FindBy(xpath = "(//input[@class='ant-input full-width'])[2]")
	WebElement Email;
	@FindBy(xpath = "(//*[@class='ant-input'])[2]")
	WebElement Email1;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[1]")
	WebElement Admin;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[2]")
	WebElement Planner;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[3]")
	WebElement Feemanager;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[4]")
	WebElement Institutesupport;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[5]")
	WebElement Attendancemarker;
	@FindBy(xpath = "(//div[@class='ant-col ant-col-8']/label)[6]")
	WebElement LeaveManager;
	@FindBy(xpath = "//span[text()='ADD']")
	WebElement AddButton;
	@FindBy(xpath = "//*[text()='BACK']")
	WebElement BackButton;
	@FindBy(xpath = "//*[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement IntoMark;
	@FindBy(xpath = "(//*[@class='border-16 recentlyAddedCards'])[1]")
	WebElement Usercard;
	@FindBy(xpath = "//*[text()='DELETE']")
	WebElement UserDelete;
	@FindBy(xpath = "//*[text()='Yes']")
	WebElement DeleteYes;
	@FindBy(xpath = "//*[text()='No']")
	WebElement DeleteNo;
	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement CancelButton;
	
	@FindBy(xpath = "(//div[@class='ant-modal-content']/div[3]/button[1])[2]")
	WebElement CancelButton1;
	@FindBy(xpath = "(//*[text()='CANCEL'])[1]")
	WebElement CANCEL;
	

	/* ***************View More******************************* */
	@FindBy(xpath = "(//*[@class='roleDetailCard'])[1]")
	WebElement StudentViewMore;
	@FindBy(xpath = "(//*[@class='roleDetailCard'])[2]")
	WebElement TeacherViewMore;
	@FindBy(xpath = "(//*[@class='roleDetailCard'])[3]")
	WebElement DataOperatorViewMore;
	@FindBy(xpath = "(//*[@class='roleDetailCard'])[4]")
	WebElement OperationViewMore;
	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement AddButtonViewMore;
	@FindBy(xpath = "(//button[@class='ant-btn'])[1]")
	WebElement CancelButtonViewMore;
	@FindBy(xpath = "(//span[@class='anticon anticon-close ant-modal-close-icon'])[1]")
	WebElement IntoMarkViewMore;

	@FindBy(xpath = "//*[@class='text-mdl m-t-10 cursor-pointer']")
	WebElement ViewMoreBackButton;
	@FindBy(xpath = "//*[@class='anticon anticon-arrow-left']")
	WebElement UserProfileBackButton;

	/* Registration Requests */

	@FindBy(xpath = "(//*[@class='m-l-5']/p/span)[1]")
	WebElement ChangeSettings;
	@FindBy(xpath = "//div[@class='ant-select approvalMenu ant-select-single ant-select-show-arrow']/div")
	WebElement SettingsSelector;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	WebElement Autoapproval;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[2]")
	WebElement Manualapproval;
	@FindBy(xpath = "//button[@class='ant-modal-close']")
	WebElement SettingsIntoMark;
	@FindBy(xpath = "(//span[@class='anticon anticon-close-circle styleCloseCircleOutlinedB'])[1]")
	WebElement RedIntoMark;
	@FindBy(xpath = "(//span[@class='anticon anticon-check-circle styleCheckCircleOutlinedB'])[1]")
	WebElement GreenRightMark;
	@FindBy(xpath = "(//span[@class='anticon anticon-check-circle styleCheckCircleOutlinedB'])[2]")
	WebElement GreenRightMark1;
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement YesButton;
	@FindBy(xpath = "//span[text()='No']")
	WebElement NoButton;
	@FindBy(xpath = "(//button[@class='ant-modal-close'])[2]")
	WebElement IntoMarkButton;

	/* Registration Requests View All && Student ViewAll */

	@FindBy(xpath = "(//*[@class='ant-btn ant-btn-link'])[1]")
	WebElement ViewAll;
	@FindBy(xpath = "//div[@class='ant-tabs-tab ant-tabs-tab-active']")
	WebElement Pending;
	@FindBy(xpath = "//div[@class='ant-tabs-tab']")
	WebElement Rejected;
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[1]")
	WebElement AllSelector;
	@FindBy(xpath = "//input[@class='ant-input ant-input-lg']")
	WebElement SearchByName;
	@FindBy(xpath = "//span[@class='ant-input-group-addon']")
	WebElement Search;
	@FindBy(xpath = "(//span[@class='ant-input-suffix'])[1]")
	WebElement SearchCancel;
	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement ViewAllYesButton;

	/* Growth summary */

	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement GrowthSelector;
	@FindBy(xpath = "//*[text()='Week']")
	WebElement GrowthWeek;
	@FindBy(xpath = "(//*[@class='ant-select-item-option-content'])[2]")   //Months
	WebElement GrowthMonth;
	//@FindBy(xpath = "//span[@class='anticon anticon-calendar ant-popover-open']")  //span[@class='anticon anticon-calendar']
	@FindBy(xpath = "(//*[@class='anticon anticon-calendar'])[1]")  
	WebElement GrowthCalendar;
	@FindBy(xpath = "//*[@class='ant-picker-input ant-picker-input-active']")
	WebElement GrowthStartDateSelector;
	@FindBy(xpath = "//div[@class='ant-picker-input']")
	WebElement GrowthEndDateSelector;
	@FindBy(xpath = "(//td[@class='ant-picker-cell ant-picker-cell-in-view'])[1]")
	WebElement GrowthStartDate2;
	@FindBy(xpath = "(//td[@class='ant-picker-cell ant-picker-cell-in-view'])[9]")
	WebElement GrowthEndDate11;
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
	WebElement GrowthOK;

	/* ***************Student View More******************************* */

	@FindBy(xpath = "//*[text()='VIEW ALL']")
	WebElement UnassignedStudentViewAll;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement UnassignedStudentAllSelector;
	@FindBy(xpath = "//div[@class='ant-page-header-back-button']")
	WebElement ViewAllBackButton;
	@FindBy(xpath = "(//*[@class='classCard'])[1]")
	WebElement Section;
	/******** View more *********/
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement NewestFirstSelector;
	@FindBy(xpath = "(//*[@class='border-16 recentlyAddedCards'])[1]")
	WebElement User1;
	@FindBy(xpath = "(//*[@class='rc-virtual-list-holder-inner']/div)[1]")
	WebElement Oldestfirst;
	@FindBy(xpath = "(//*[@class='rc-virtual-list-holder-inner']/div)[2]")
	WebElement Newestfirst;
	@FindBy(xpath = "(//*[@class='rc-virtual-list-holder-inner']/div)[3]")
	WebElement Alphabeticalorders;
	@FindBy(xpath = "//*[@class='ant-picker-input']")
	WebElement SelectDate;
	@FindBy(xpath = "//*[text()='Today']")
	WebElement TodayDate;
	@FindBy(xpath = "//*[@class='cursor-pointer']")
	WebElement SelectAll;
	@FindBy(xpath = "//*[@class='sc-furwcr bzEsQr']")
	WebElement SearchByUser;

	/* ************************ Student Profile *********************** */

	@FindBy(xpath = "(//div[@class='userCardStyle'])[1]")
	WebElement Student1;

	/*********** Basic information ***********/
	@FindBy(xpath = "(//input[@class='ant-input'])[1]")
	WebElement ProfileName;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement Gender;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	WebElement Male;
	@FindBy(xpath = "(//input[@class='PhoneInputInput'])[1]")
	WebElement PhoneNo;
	@FindBy(xpath = "(//input[@class='ant-input'])[2]")
	WebElement ProfileEmailId;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement BloodGroup;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[4]")
	WebElement Aplus;

	@FindBy(xpath = "(//input[@class='ant-input'])[3]")
	WebElement CurrentHouseNo;
	@FindBy(xpath = "(//input[@class='ant-input'])[4]")
	WebElement CurrentState;
	@FindBy(xpath = "(//input[@class='ant-input'])[5]")
	WebElement CurrentPincode;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[6]")
	WebElement CurrentNoPinCode;
	@FindBy(xpath = "(//input[@class='ant-input'])[6]")
	WebElement CurrentDistrict;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[7]")
	WebElement SameAsCurrentAddress;
	@FindBy(xpath = "(//input[@class='ant-input'])[7]")
	WebElement PermanentHouseNo;
	@FindBy(xpath = "(//input[@class='ant-input'])[8]")
	WebElement PermanentState;
	@FindBy(xpath = "(//input[@class='ant-input'])[9]")
	WebElement PermanentPincode;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[8]")
	WebElement PermenenttNoPinCode;
	@FindBy(xpath = "(//input[@class='ant-input'])[10]")
	WebElement PermanentDistrict;
	@FindBy(xpath = "(//input[@class='ant-input'])[11]")
	WebElement EmergencyContactName;
	@FindBy(xpath = "(//input[@class='PhoneInputInput'])[2]")
	WebElement EmergencyContactPhoneNo;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
	WebElement Relationship;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[16]")
	WebElement Brother;
	
	/**** Course and fee *********/
	@FindBy(xpath = "//h3[text()='Course and fee']")
	WebElement Courseandfee;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement ClassSelector;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[1]/div/div/div/div[1]")
	WebElement Class1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement SectionSelector;
	@FindBy(xpath = "(//div[@class='rc-virtual-list'])[2]/div/div/div/div[1]")
	WebElement Section1;
	@FindBy(xpath = "(//div[@class='ant-picker datePicker'])[1]")
	WebElement DateSelector;
	@FindBy(xpath = "(//td[@class='ant-picker-cell ant-picker-cell-in-view ant-picker-cell-today'])[1]")
	WebElement CourseStartDateToday;
	@FindBy(xpath = "(//button[@class='ant-picker-header-next-btn'])[1]")
	WebElement nextMonth;
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[10]")
	WebElement nextMonthDate;
	@FindBy(xpath = "(//*[text()='SAVE'])[1]")
	WebElement CourseSave;
	@FindBy(xpath = "(//span[text()='ADD A COURSE'])[1]")
	WebElement AddACourse;
	@FindBy(xpath = "((//*[@class='box-shadow'])[2]/div/div[2])[1]")
	WebElement AddACourse1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
	WebElement CourseNameSelector;
	@FindBy(xpath = "(//*[@class='rc-virtual-list']/div/div/div)[3]/div[1]")
	WebElement CourseName;
	@FindBy(xpath = "(//*[@class='rc-virtual-list']/div/div/div)[1]/div[1]")
	WebElement CourseName1;
	@FindBy(xpath = "(//*[@class='rc-virtual-list']/div/div/div)[1]/div[2]")
	WebElement CourseName2;
	@FindBy(xpath = "(//*[@class='rc-virtual-list']/div/div/div)[1]/div[3]")
	WebElement CourseName3;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[1]")
	WebElement Shiftcourse;
	@FindBy(xpath = "(//div[@class='box-shadow flex_row_center'])[1]")
	WebElement CourseOpen;
	@FindBy(xpath = "//*[@class='ant-modal-body']/div/div[4]/div/div[2]/button[1]")
	WebElement ActivateButton;

	@FindBy(xpath = "(//*[text()='NO'])[1]")
	WebElement CourseDeleteNo;
	@FindBy(xpath = "(//*[text()='YES'])[1]")
	WebElement CourseDeleteYes;
	@FindBy(xpath = "(//*[text()='DELETE'])[2]")
	WebElement CourseDelete;
	
	
	@FindBy(xpath = "(//button[@class='ant-btn'])[4]")
	WebElement CourseCancel;
	
	@FindBy(xpath = "(//button[@class='ant-btn'])[3]")
	WebElement UNASSIGN;
	@FindBy(xpath = "(//button[@class='ant-btn'])[2]")
	WebElement Save;
	@FindBy(xpath = "(//button[@class='ant-btn'])[1]")
	WebElement Delete;

	@FindBy(xpath = "//*[@class='ant-dropdown-trigger']")
	WebElement DottedLogout;
	@FindBy(xpath = "//span[text()='Logout']")
	WebElement Logout;
	
	// Change user type
	@FindBy(xpath = "//*[@class='flex-1 display-flex']/div/div/div[2]/span")
	WebElement UsersSelector;
	@FindBy(xpath = "(//*[@class='ant-dropdown-menu-title-content'])[1]")
	WebElement Students;
	@FindBy(xpath = "(//*[@class='ant-dropdown-menu-title-content'])[2]")
	WebElement Teachers;
	@FindBy(xpath = "(//*[@class='ant-dropdown-menu-title-content'])[3]")
	WebElement DataOperators;
	@FindBy(xpath = "(//*[@class='ant-dropdown-menu-title-content'])[4]")
	WebElement Operations;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public UserManagement() {
		PageFactory.initElements(driver, this);
	}

	/************ USERS CREATIONS 
	 * @throws InterruptedException ******************/
	

	public void clickUserManagement() throws InterruptedException {
		Wait(UserManagement);
		UserManagement.click();
		System.out.println("Clicked on UserManagement");
		
	}
    public void addaUser(String selectRole,String Priv1,String Priv2,String Priv3,String Priv4,String Priv5,String Priv6) throws InterruptedException
    {
    	Wait(AddUser);
    	AddUser.click();
    	System.out.println("Clicked on ADD USER(S) Button");
    	WaitTil(2000);
    	CreateYourOwn.click();
    	System.out.println("Selected Create Your Own");
    	WaitTil(2000);
    	Next.click();
    	System.out.println("Clicked on Next Button");
    	WaitTil(2000);
		UserTypeSelector.click();
		System.out.println("Clicked on User Type Selector");
    	WaitTil(2000);
    	if(selectRole.equalsIgnoreCase("Student")) {
    		Student.click();
    		System.out.println("Selected Student");
    		
    	}
    	if(selectRole.equalsIgnoreCase("Teacher")) {
    		Teacher.click();
    		System.out.println("Selected Teacher");
    	}
    	if(selectRole.equalsIgnoreCase("DataOperator")) {
    		DataOperator.click();
    		System.out.println("Selected Data Operator");
    	}
    	if(selectRole.equalsIgnoreCase("Operation")) {
    		Operation.click();
    		System.out.println("Selected Operation");
    	}
    	WaitTil(2000);
    	String chars = "abcdefghijklmnopqrstuvwxyz";
		//String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name.append(chars.charAt(rnd.nextInt(chars.length())));
			//name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
    	WaitTil(2000);
    	Name.sendKeys(name);
    	System.out.println(" Given User Name is :-"+name);
    	WaitTil(2000);
    	long phoneNumber=Math.round(Math.random()*1000000000L);
		Number.sendKeys("9"+phoneNumber);
		System.out.println(" Given User Phone Number is :-"+"9"+phoneNumber);
		WaitTil(2000);
		String mail ="abcdefghijklmnopqrstuvwxyz"+"0123456789";
		Random id = new Random();
		StringBuilder Gmail = new StringBuilder(9);
		for (int n = 0; n < 9; n++)
		{
			Gmail.append(mail.charAt(id.nextInt(mail.length())));
		}
		Email.sendKeys("brigosha."+Gmail+"@gmail.com");
		System.out.println(" Given User Email is :-"+"brigosha."+Gmail+"@gmail.com");
		WaitTil(2000);	
    	if(Priv1.equalsIgnoreCase("Priv1")) {
    		WaitTil(2000);
    		Admin.click();
    		String Prive1=Admin.getText();
    		System.out.println("Selected Privelage is :-"+Prive1);
    	}
    	if(Priv1.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	if(Priv2.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	if(Priv2.equalsIgnoreCase("Priv2")) {
    		WaitTil(2000);
    		Planner.click();
    		String Prive1=Planner.getText();
    		System.out.println("Selected Privelage is :-"+Prive1);
    	}
    	if(Priv3.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	if(Priv3.equalsIgnoreCase("Priv3")) {
    		WaitTil(2000);
    		Feemanager.click();
    		String Prive1=Feemanager.getText();
    		System.out.println("Selected Privelage is :-"+Prive1);
    	}
    	if(Priv4.equalsIgnoreCase("Priv4")) {
    		WaitTil(2000);
    		Institutesupport.click();
    		String Prive1=Institutesupport.getText();
    		System.out.println("Selected Privelage is :-"+Prive1);
    	}
    	if(Priv4.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	if(Priv5.equalsIgnoreCase("Priv5")) {
    		WaitTil(2000);
    		Attendancemarker.click();
    		String Prive1=Attendancemarker.getText();
    		System.out.println("Selected Privelage is :-"+Prive1);
    	}
    	if(Priv5.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	if(Priv6.equalsIgnoreCase("Priv6")) {
    		WaitTil(2000);
    		LeaveManager.click();
    		String Prive1=LeaveManager.getText();
    		System.out.println("Selected Privelage is :-"+Prive1);
    	}
    	if(Priv6.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	WaitTil(2000);
    	AddButton.click();
    	System.out.println("Clicked on Add Button");
    	WaitTil(2000);
		verifyPopUp();
		WaitTil(2000);
    	
    }
    
    public void DeleteUser() throws InterruptedException
    {
    	WaitTil(2000);
    	Usercard.click();
    	System.out.println("Clicked on A User");
    	WaitTil(2000);
    	UserDelete.click();
    	System.out.println("Clicked on Detele Button");
    	WaitTil(2000);
    	DeleteNo.click();
    	System.out.println("Clicked on Detele No");
    	WaitTil(2000);
    	UserDelete.click();
    	System.out.println("Clicked on Detele Button");
    	WaitTil(2000);
    	DeleteYes.click();
    	System.out.println("Clicked on Detele Yes");
    	WaitTil(1000);
    	WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String act = text.getText();
		String exp = "User Deleted";
		if (exp.equals(act)) {
			System.out.println("The success message is:  " + act);

		} else {
			System.out.println("The The failure messgae is: " + act);
		}
    	
    }
    
  
	
	
	public void verifyPopUp() throws InterruptedException
	{
		WaitTil(2000);
		WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "success";
		//String exp =expected;
		WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String message = text.getText();
		if (exp.equals(act)) {
			System.out.println("The success message is:  " + message);

		} else {
			System.out.println("The The failure messgae is: " + message);
			BackButton.click();
			WaitTil(2000);
			IntoMark.click();
		}
	}
	public void popupContent()
	{
		WaitTil(1000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
	}


	public void validateUserManagementPage() throws InterruptedException {
		
		WaitTil(5000);
		StudentViewMore.click();
		System.out.println("Clicked on Students Card");
		WaitTil(5000);
		ViewMoreBackButton.click();
		System.out.println("Clicked on Back Button");
		WaitTil(5000);
		TeacherViewMore.click();
		System.out.println("Clicked on Teachers Card");
		WaitTil(5000);
		ViewMoreBackButton.click();
		System.out.println("Clicked on Back Button");
		WaitTil(5000);
		DataOperatorViewMore.click();
		System.out.println("Clicked on DataOperators Card");
		WaitTil(5000);
		ViewMoreBackButton.click();
		System.out.println("Clicked on Back Button");
		WaitTil(5000);
		OperationViewMore.click();
		System.out.println("Clicked on Operations Card");
		WaitTil(5000);
		ViewMoreBackButton.click();
		System.out.println("Clicked on Back Button");
		/*WaitTil(5000);
		ChangeSettings.click();
		System.out.println("Clicked on Change Settings");
		WaitTil(5000);
		SettingsIntoMark.click();
		System.out.println("Clicked on Into Mark");
		WaitTil(5000);
		ViewAll.click();
		System.out.println("Clicked on View All");
		WaitTil(5000);
		Backbutton.click();
		System.out.println("Clicked on View All Back Button");*/
		WaitTil(5000);
		growthSummary();
		WaitTil(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WaitTil(5000);
		WebElement RecentlyAddedUser = driver.findElement(By.xpath("//h2[text()='Recently added user(s)']"));
		WaitTil(5000);
		js.executeScript("arguments[0].scrollIntoView(true)", RecentlyAddedUser);
		WaitTil(5000);
		Usercard.click();
		System.out.println("Clicked on A User");
		WaitTil(5000);
		Backbutton.click();
		System.out.println("Clicked on Back Button");
		WaitTil(5000);

	}

	/************** USERS VIEW MORE PAGE  ***********************/
	
	public void BackButton() throws InterruptedException
	{
		WaitTil(2000);
		ViewMoreBackButton.click();
		System.out.println("Clicked on Back Button");
	}
	public void vieworeAddaUser(String Priv1,String Priv2,String Priv3,String Priv4,String Priv5,String Priv6) throws InterruptedException
    {
    	Wait(AddUser);
    	AddUser.click();
    	System.out.println("Clicked on ADD A USER");
    	WaitTil(2000);
    	String chars = "abcdefghijklmnopqrstuvwxyz";
		//String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name.append(chars.charAt(rnd.nextInt(chars.length())));
			//name.append(captals.charAt(rnd.nextInt(captals.length())));
		}
    	WaitTil(2000);
    	Name1.sendKeys(name);
    	System.out.println("Given name is :-" +name);
    	WaitTil(2000);
    	long phoneNumber=Math.round(Math.random()*1000000000L);
		Number.sendKeys("9"+phoneNumber);
		System.out.println("Given Phone Number is :-" +phoneNumber);
		WaitTil(2000);
		String mail ="abcdefghijklmnopqrstuvwxyz"+"0123456789";
		Random id = new Random();
		StringBuilder Gmail = new StringBuilder(9);
		for (int n = 0; n < 9; n++)
		{
			Gmail.append(mail.charAt(id.nextInt(mail.length())));
		}
		Email1.sendKeys("brigosha."+Gmail+"@gmail.com");
		System.out.println("Given Email is :-" +"brigosha."+Gmail+"@gmail.com");
    	if(Priv1.equalsIgnoreCase("Priv1")) {
    		WaitTil(2000);
    		Admin.click();
    		String priv=Admin.getText();
    		System.out.println("Selected Privelege is :-" +priv);
    	}
    	if(Priv1.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	if(Priv2.equalsIgnoreCase("Priv2")) {
    		WaitTil(2000);
    		Feemanager.click();
    		String priv=Feemanager.getText();
    		System.out.println("Selected Privelege is :-" +priv);
    	}
    	if(Priv2.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	if(Priv3.equalsIgnoreCase("Priv3")) {
    		WaitTil(2000);
    		Planner.click();
    		String priv=Planner.getText();
    		System.out.println("Selected Privelege is :-" +priv);
    	}
    	if(Priv3.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	if(Priv4.equalsIgnoreCase("Priv4")) {
    		WaitTil(2000);
    		Institutesupport.click();
    		String priv=Institutesupport.getText();
    		System.out.println("Selected Privelege is :-" +priv);
    	}
    	if(Priv4.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	if(Priv5.equalsIgnoreCase("Priv5")) {
    		WaitTil(2000);
    		Attendancemarker.click();
    		String priv=Attendancemarker.getText();
    		System.out.println("Selected Privelege is :-" +priv);
    	}
    	if(Priv5.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	if(Priv6.equalsIgnoreCase("Priv6")) {
    		WaitTil(2000);
    		LeaveManager.click();
    		String priv=LeaveManager.getText();
    		System.out.println("Selected Privelege is :-" +priv);
    	}
    	if(Priv6.equalsIgnoreCase("NoPriv")) {
    		System.out.println(" ");
    	}
    	AddButton.click();
    	System.out.println("Clicked on Add Button");
    	WaitTil(2000);
		WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "success";
		//String exp =expected;
		WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String message = text.getText();
		if (exp.equals(act)) {
			WaitTil(1000);
			System.out.println("The success message is:  " + message);

		} else {
			WaitTil(1000);
			System.out.println("The The failure messgae is: " + message);
			CancelButton.click();
		}
		
    	
    }
	public void changeUsersType() throws InterruptedException
	{
		clickUserManagement();
		WaitTil(2000);
		studentViewMoreClick();
		WaitTil(2000);
		UsersSelector.click();
		System.out.println("Clicked on Users Selectors");
		WaitTil(2000);
		Teachers.click();
		System.out.println("Clicked on Teachers");
		WaitTil(2000);
		UsersSelector.click();
		System.out.println("Clicked on Users Selectors");
		WaitTil(2000);
		DataOperators.click();
		System.out.println("Clicked on Data Operators");
		WaitTil(2000);
		UsersSelector.click();
		System.out.println("Clicked on Users Selectors");
		WaitTil(2000);
		Operations.click();
		System.out.println("Clicked on Operations");
		WaitTil(2000);
		UsersSelector.click();
		System.out.println("Clicked on Users Selectors");
		WaitTil(2000);
		Students.click();
		System.out.println("Clicked on Students");
		WaitTil(2000);
		BackButton();
		
	}
//student page
	public void studentViewMoreClick() throws InterruptedException {
	
		WaitTil(4000);
		Wait(StudentViewMore);
		StudentViewMore.click();
		System.out.println("Clicked on Students Card");
		WaitTil(2000);
	}

	public void viewmoreCancelStudentCreation() throws InterruptedException {
		Wait(AddUser);
		AddUser.click();
		WaitTil(2000);
		CancelButton1.click();
		WaitTil(2000);
		AddUser.click();
		WaitTil(2000);
		IntoMarkViewMore.click();

	}
     public void verifyPopUp1() throws InterruptedException
     {
    	 WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
 		String act = messagElement.getText();
 		System.out.println("The actual text is:" + act);
 		String exp = "success";
 		WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
 		String message = text.getText();
 		if (exp.equals(act)) {
 			System.out.println("The success message is:  " + message);

 		} else {
 			System.out.println("The The failure messgae is: " + message);
 			CancelButton1.click();
 			Thread.sleep(2000);
 		} 
     }

	public void validateUnassignedViewAllPage() throws InterruptedException, AWTException {
		WaitTil(2000);
		UnassignedStudentViewAll.click();
		WaitTil(2000);
		Usercard.click();
		WaitTil(2000);
		Backbutton.click();
		WaitTil(2000);
		//SelectAll.click();
		//WaitTil(2000);
		validateSortingSelector();
		WaitTil(2000);
		SelectDate.click();
		WaitTil(2000);
		TodayDate.click();
		WaitTil(2000);
		searchUserName();
		WaitTil(2000);
		Backbutton.click();
		WaitTil(2000);
		Section.click();
		WaitTil(2000);
		searchUserName();
		WaitTil(2000);
		ViewMoreBackButton.click();
		WaitTil(2000);
		searchUserName();
	
	}
	public void searchUserName() throws AWTException
	{
		String chars = "abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		WaitTil(2000);
		SearchByUser.sendKeys(name);
		WaitTil(2000);
		SearchByUser.sendKeys(Keys.ENTER);
		WaitTil(2000);
	}
	
	public void searchName()
	{
		String chars = "abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			name.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		WaitTil(2000);
		SearchByName.sendKeys(name);
		WaitTil(2000);
		Search.click();
		WaitTil(2000);
		SearchCancel.click();
		WaitTil(2000);
	}


	// ********** TEACHER VIEWMORE ***************//
	public void clickTeacherViewMore() throws InterruptedException {

		WaitTil(2000);
		Wait(TeacherViewMore);
		TeacherViewMore.click();
		System.out.println("Clicked on Teachers");
		WaitTil(2000);

	}

	public void validateSortingSelector() throws InterruptedException {
		WaitTil(2000);
		NewestFirstSelector.click();
		System.out.println("Clicked on Selector");
		WaitTil(2000);
		Oldestfirst.click();
		System.out.println("Clicked on Oldestfirst");
		WaitTil(2000);
		NewestFirstSelector.click();
		System.out.println("Clicked on Selector");
		WaitTil(2000);
		Newestfirst.click();
		System.out.println("Clicked on Newestfirst");
		WaitTil(2000);
		NewestFirstSelector.click();
		System.out.println("Clicked on Selector");
		WaitTil(2000);
		Alphabeticalorders.click();
		System.out.println("Clicked on Alphabeticalorders");
		WaitTil(2000);
	}
	public void validateEditUserProfile() throws InterruptedException {
		User1.click();
		WaitTil(2000);
		fillBasicInfo();
		WaitTil(2000);
		//selectPrivalagePage();
		//WaitTil(2000);
		enterAdressDeatils();
		WaitTil(2000);
		enterEmargencyContacts();
		WaitTil(2000);
	}
	public void validateEditStudentProfile() throws InterruptedException {
		User1.click();
		WaitTil(2000);
		studentBasicInfo();
		WaitTil(2000);
		enterAdressDeatils();
		WaitTil(2000);
		studentEmargencyContacts();
		WaitTil(2000);
	}
	public void adminValidateViewMorePage() throws InterruptedException {
		Thread.sleep(2000);
		growthSummary();
		Thread.sleep(2000);
		WebElement AllTeachers = driver.findElement(By.xpath("(//h3[text()='Newest first'])[1]"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", AllTeachers);
		Thread.sleep(2000);
		NewestFirstSelector.click();
		Thread.sleep(2000);
		Oldestfirst.click();
		Thread.sleep(6000);
		Wait(NewestFirstSelector);
		NewestFirstSelector.click();
		Thread.sleep(2000);
		Newestfirst.click();
		Thread.sleep(6000);
		Wait(NewestFirstSelector);
		NewestFirstSelector.click();
		Thread.sleep(2000);
		Alphabeticalorders.click();
		Thread.sleep(6000);
		Wait(User1);
		User1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='ant-layout-content']/div/div[2]/div/div[1]/h3)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='ant-layout-content']/div/div[2]/div/div[1]/h3)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='ant-layout-content']/div/div[2]/div/div[1]/h3)[3]")).click();
		Thread.sleep(2000);
		Backbutton.click();
		Thread.sleep(1000);
		searchName();
		Thread.sleep(2000);
		Backbutton.click();
		Thread.sleep(2000);
	}

	public void viewmoreCancelTeacherCreation() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[1]")));
			
		AddUser.click();
		Thread.sleep(2000);
		CancelButton1.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		IntoMarkViewMore.click();
		Thread.sleep(2000);

	}

	// ************ DATA OPERATOR VIEW MORE ***********//

	public void clickDataoperatorViewMore() throws InterruptedException {
		
		Thread.sleep(2000);
		Wait(DataOperatorViewMore);
		DataOperatorViewMore.click();
		System.out.println("Clicked on Data Operators");
		Thread.sleep(2000);

	}

	public void viewmoreCancelDataoperatorCreation() throws InterruptedException {
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		CancelButton1.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		IntoMarkViewMore.click();
		Thread.sleep(2000);

	}

	// *********************** OPERATION VIEW MORE **********************//

	public void clickOperationViewMore() throws InterruptedException {

		Thread.sleep(6000);
		Wait(OperationViewMore);
		OperationViewMore.click();
		System.out.println("Clicked on Operations");
		Thread.sleep(6000);
	}

	public void viewmoreCancelOperationCreation() throws InterruptedException {
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		CancelButton1.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		IntoMarkViewMore.click();
		Thread.sleep(2000);

	}

	/************************ Validate-UserManagementPage ************************/
	public void growthSummary() throws InterruptedException {
		Wait(GrowthCalendar);
		GrowthCalendar.click();
		System.out.println("Clicked on Calender Icon");
		Wait(GrowthStartDateSelector);
		GrowthStartDateSelector.click();
		System.out.println("Clicked on Selector");
		Wait(GrowthStartDate2);
		GrowthStartDate2.click();
		System.out.println("Selected Start Date");
		Wait(GrowthOK);
		GrowthOK.click();
		System.out.println("Clicked on OK");
		Wait(GrowthEndDate11);
		GrowthEndDate11.click();
		System.out.println("Selected End Date");
		Wait(GrowthOK);
		GrowthOK.click();
		System.out.println("Clicked on OK");
		Wait(GrowthSelector);
		GrowthSelector.click();
		System.out.println("Clicked on Selector");
		Wait(GrowthMonth);
		GrowthMonth.click();
		System.out.println("Clicked on Month");
		WaitTil(2000);
	}


	public void registrationRequestsApprovals() throws InterruptedException {
		WebElement registrationRequestsContent = driver.findElement(By.xpath("(//*[@class='ant-col ant-col-md-24 ant-col-lg-10'])[1]"));
		String RequestsContent = registrationRequestsContent.getText();
		System.out.println("Content Of registrationRequests is : " + RequestsContent);
		WaitTil(2000);
		ChangeSettings.click();
        System.out.println("Clicked on ChangeSettings");
		WaitTil(2000);
		WebElement ApprovalElement = driver.findElement(By.xpath("(//span[@class='ant-select-selection-item'])[2]"));
		String ApprovalType = ApprovalElement.getText();
		System.out.println(" Actual Approval Request type is : " + ApprovalType);
		String ExpectedApproval = "Auto approval";
		System.out.println("Expected Approval Request type is : " + ExpectedApproval);
		if (ExpectedApproval.equals(ApprovalType)) {
			Wait(SettingsSelector);
			SettingsSelector.click();
			Wait(Manualapproval);
			Manualapproval.click();
			System.out.println("Clicked on Manualapproval");
			WaitTil(2000);
			popupContent();

		} else {
			Wait(SettingsSelector);
			SettingsSelector.click();
			Wait(Autoapproval);
			Autoapproval.click();
			System.out.println("Clicked on Autoapproval");
			WaitTil(2000);
			popupContent();
		}
		WebElement ele = driver.findElement(By.xpath("(//div[@class='ant-col ant-col-md-24 ant-col-lg-10']/div/div/div/h2)[1]"));
		String actual = ele.getText();
		System.out.println("The Total Requests are :-" + actual);
		String exp = "Registration Request(s) (" + "0" + ")";
		if (exp.equals(actual)) {
			System.out.println("There is No Registration request(s)");
			
		}
		else
		{
			WaitTil(2000);
			RedIntoMark.click();
			WaitTil(2000);
			NoButton.click();
			WaitTil(2000);
			GreenRightMark.click();
			WaitTil(2000);
			NoButton.click();
			WaitTil(2000);
			RedIntoMark.click();
			WaitTil(2000);
			YesButton.click();
			WaitTil(2000);
			popupContent();
			WebElement ele1 = driver.findElement(By.xpath("(//div[@class='ant-col ant-col-md-24 ant-col-lg-10']/div/div/div/h2)[1]"));
			String actual1 = ele1.getText();
			System.out.println("The Total Requests are :-" + actual1);
			String exp1 = "Registration request(s) (" + "0" + ")";
			if (exp1.equals(actual1)) {
				System.out.println("There is No Registration request(s)");
				
			}
			else
			{
				WaitTil(2000);
				GreenRightMark.click();
				WaitTil(2000);
				YesButton.click();
				WaitTil(2000);
				popupContent();	
			}
			
		}
	}

	/* Registration Requests View All */

	public void validateRegistrationRequestsPage() throws InterruptedException {
		Wait(ViewAll);
		ViewAll.click();
		WaitTil(2000);
		Pending.click();
		WaitTil(2000);
		WebElement ele5 = driver.findElement(By.xpath("//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']/div/div[1]"));
		String actual3= ele5.getText();
		System.out.println("The Total Requests are :-" + actual3);
		WaitTil(2000);
		WebElement ele1 = driver.findElement(By.xpath("(//*[@class='ant-page-header-heading-title'])[1]"));
		String actual1 = ele1.getText();
		System.out.println("The Total Requests are :-" + actual1);
		String exp1 = "Registration request(s) (0)";
		if (exp1.equals(actual1)) {
			System.out.println("There is No Registration request(s)");
			
		}
		else
		{
			WaitTil(2000);
			RedIntoMark.click();
			WaitTil(2000);
			NoButton.click();
			WaitTil(2000);
			GreenRightMark.click();
			WaitTil(2000);
			NoButton.click();
			WaitTil(2000);
			RedIntoMark.click();
			WaitTil(2000);
			YesButton.click();
			WaitTil(2000);
			popupContent();
			WebElement ele2 = driver.findElement(By.xpath("(//*[@class='ant-page-header-heading-title'])[1]"));
			String actual= ele2.getText();
			System.out.println("The Total Requests are :-" + actual);
			String exp = "Registration request(s) (0)";
			if (exp.equals(actual)) {
				System.out.println("There is No Registration request(s)");	
			}
			else
			{
				WaitTil(2000);
				GreenRightMark.click();
				WaitTil(2000);
				YesButton.click();
				WaitTil(2000);
				popupContent();
			}
		}
		
		Rejected.click();
		WaitTil(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']"));
		int size = ele.size();
		for (int i=0; i<size; i++) {
			WaitTil(2000);;
			AllSelector.click();
			WaitTil(2000);
			ele.get(i).click();
			WaitTil(2000);
		}
		searchName();
		WaitTil(2000);
		SearchCancel.click();
		WaitTil(2000);
		Backbutton.click();
		WaitTil(2000);
	}

	

	// ************ Student PROFILE UPDATE *********************//
	
	  public void deleteUser() throws InterruptedException {
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//span[text()='DELETE']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='No']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='DELETE']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Yes']")).click();
			Thread.sleep(2000);
	  }
	
	  public void verifyPopUp2() throws InterruptedException
		{
			Thread.sleep(2000);
			WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
			String act = messagElement.getText();
			System.out.println("The actual text is:" + act);
			String exp = "success";
			WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
			String message = text.getText();
			if (exp.equals(act)) {
				System.out.println("The success message is:  " + message);

			} else {
				System.out.println("The The failure messgae is: " + message);
				CANCEL.click();
				Thread.sleep(2000);
			}
		}
		public void studentCourseAndFeeDetailsUpdate() throws InterruptedException {
			Thread.sleep(2000);
			studentViewMoreClick();
			Thread.sleep(2000);
			WebElement Unassigned = driver.findElement(By.xpath("//h2[text()='Unassigned']"));
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView(true)", Unassigned);
			Thread.sleep(2000);
			User1.click();
			Thread.sleep(2000);
			Courseandfee.click();
			Thread.sleep(2000);
			ClassSelector.click();
			Thread.sleep(2000);
			Class1.click();
			Thread.sleep(2000);
			SectionSelector.click();
			Thread.sleep(2000);
			Section1.click();
			WaitTil(2000);
			driver.navigate().refresh();
			WaitTil(4000);
			Backbutton.click();
			
		    /*
			DateSelector.click();
			Thread.sleep(2000);
			CourseStartDateToday.click();
			Thread.sleep(2000);
			CourseSave.click();
			Thread.sleep(2000);
			popupContent();
			
			WaitTil(2000);
			WebElement AllClasses = driver.findElement(By.xpath("//h2[text()='All Classes']"));
			js.executeScript("arguments[0].scrollIntoView(true)", AllClasses);
			WaitTil(2000);
			Section.click();
			WaitTil(2000);
			Student1.click();
			WaitTil(2000);
			Courseandfee.click();
			WaitTil(2000);
			WebElement ele=driver.findElement(By.xpath("(//*[@class='box-shadow'])[2]/div[2]/div/div[1]"));
			String text=ele.getText();
			System.out.println(text);
			String ExpText="";
			System.out.println(ExpText);
			if(text.equals(ExpText))
			{
				WaitTil(4000);
				AddACourse.click();
				WaitTil(4000);
				CANCEL.click();
				WaitTil(2000);
				AddACourse.click();
				WaitTil(2000);
				CourseNameSelector.click();
				WaitTil(2000);
				CourseName1.click();
				WaitTil(2000);
				DateSelector.click();
				WaitTil(2000);
				CourseStartDateToday.click();
				WaitTil(2000);
				CourseSave.click();
				WaitTil(2000);
				popupContent();
				
			}
			else
			{
				WaitTil(2000);
				AddACourse1.click();
				WaitTil(2000);
				CANCEL.click();
				WaitTil(2000);
				AddACourse1.click();
				WaitTil(2000);
				CourseNameSelector.click();
				WaitTil(2000);
				CourseName2.click();
				WaitTil(2000);
				DateSelector.click();
				WaitTil(2000);
				CourseStartDateToday.click();
				WaitTil(2000);
				CourseSave.click();
				WaitTil(2000);
				verifyPopUp2();
				WaitTil(2000);
				AddACourse1.click();
				WaitTil(2000);
				CourseNameSelector.click();
				WaitTil(2000);
				CourseName3.click();
				WaitTil(2000);
				DateSelector.click();
				WaitTil(2000);
				CourseStartDateToday.click();
				WaitTil(2000);
				Shiftcourse.click();
				WaitTil(2000);
				CourseSave.click();
				WaitTil(2000);
				verifyPopUp2();
				WaitTil(2000);
				CourseOpen.click();
				WaitTil(2000);
				CANCEL.click();
				WaitTil(2000);
				CourseOpen.click();
				WaitTil(2000);
				DateSelector.click();
				WaitTil(2000);
				nextMonth.click();
				WaitTil(2000);
				nextMonthDate.click();
				WaitTil(2000);
				ActivateButton.click();
				verifyPopUp2();
				WaitTil(2000);
				CourseOpen.click();
				WaitTil(2000);
				CourseDelete.click();
				WaitTil(2000);
				CourseDeleteNo.click();
				WaitTil(2000);
				CourseDeleteYes.click();
				WaitTil(2000);
			
public void generate()
	{
		long i=Math.round(Math.random()*900000000L);
		String j = UUID.randomUUID().toString();
		final String k= UUID.randomUUID().toString().replace("-", "");
		UUID l = UUID.randomUUID();
	
		System.out.println("i=9"+i);
		System.out.println("j="+j);
		System.out.println("k="+k+"@gmail.com");
		System.out.println("l="+l);
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
		for (int m = 0; m < 8; m++)
		{
			Random r = new Random();
			StringBuilder sl = new StringBuilder(8);
		
				sl.append(alphabet.charAt(r.nextInt(alphabet.length())));
			System.out.println("sb="+sl);
			
			}
		
		  String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
          +"lmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(8);
		for (int n = 0; n < 8; n++)
		{
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		System.out.println("sb="+sb);
		
		}
		
	}
			*/
		}
          
	
		
		public void studentBasicInfo() throws InterruptedException {
			Thread.sleep(3000);
			String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			Random rnd = new Random();
			StringBuilder name = new StringBuilder(8);
			for (int n = 0; n < 8; n++)
			{
				name.append(chars.charAt(rnd.nextInt(chars.length())));
			}
			WebElement Element1 = driver.findElement(By.xpath("(//*[@class='ant-input'])[1]"));
			Element1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Element1.sendKeys(Keys.DELETE);
			Element1.sendKeys("KALAM"+" "+name);
			Thread.sleep(3000);
			long phoneNumber=Math.round(Math.random()*1000000000L);
			WebElement Element2 = driver.findElement(By.xpath("(//*[@class='PhoneInputInput'])[1]"));
			Element2.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Element2.sendKeys(Keys.DELETE);
			Element2.sendKeys("+91 8"+phoneNumber);
			Thread.sleep(3000);
			String mail ="abcdefghijklmnopqrstuvwxyz"+"0123456789";
			Random id = new Random();
			StringBuilder Gmail = new StringBuilder(9);
			for (int n = 0; n < 9; n++)
			{
				Gmail.append(mail.charAt(id.nextInt(mail.length())));
			}
			WaitTil(2000);
			WebElement Element3 = driver.findElement(By.xpath("(//*[@class='ant-input'])[2]"));
			Element3.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Element3.sendKeys(Keys.DELETE);
			Element3.sendKeys("abdulkalam."+Gmail+"@brigosha.com");
			//gender selector
			driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='rc-virtual-list-holder-inner'])[1]/div[1]")).click();  // gender
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[1]")).click();        // Blood group selector
			Thread.sleep(3000);
			 WaitTil(1000);
			driver.findElement(By.xpath("(//*[@class='ant-select-item-option-content'])[4]")).click();   // blood group 
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='ant-picker-input']")).click();
			for (int i = 0; i < 18; i++) {
                WaitTil(1000);
				driver.findElement(By.xpath("//*[@class='ant-picker-header-super-prev-btn']")).click();
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='ant-picker-cell ant-picker-cell-in-view'])[12]")).click();
			
			System.out.println("-- Basic Details Updated --");
		}
		
		public void studentEmargencyContacts() throws InterruptedException {
			Thread.sleep(3000);
			String chars = "abcdefghijklmnopqrstuvwxyz";
			Random rnd = new Random();
			StringBuilder name = new StringBuilder(7);
			for (int n = 0; n < 7; n++)
			{
				name.append(chars.charAt(rnd.nextInt(chars.length())));
			}
			WebElement EmergencyContact = driver.findElement(By.xpath("//h2[text()='Emergency Contact']")); 
			js.executeScript("arguments[0].scrollIntoView();", EmergencyContact);
			WebElement Name=driver.findElement(By.xpath("(//*[@class='ant-input'])[6]"));
			Name.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			Name.sendKeys(Keys.DELETE);
			Name.sendKeys(name);
			Thread.sleep(3000);
			long phoneNumber=Math.round(Math.random()*1000000000L);
			WebElement PhNumber=driver.findElement(By.xpath("(//*[@class='PhoneInputInput'])[2]"));
			PhNumber.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			PhNumber.sendKeys(Keys.DELETE);
			PhNumber.sendKeys("+91 7"+phoneNumber);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='rc-virtual-list-holder-inner'])[3]/div[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='SAVE']")).click();
			Thread.sleep(2000);
			popupContent();
			Thread.sleep(2000);
			UserProfileBackButton.click();
			System.out.println("--------Emergency Details Updated -----");
		}
	
	
	
	

	public void fillBasicInfo() throws InterruptedException {
		Thread.sleep(3000);
		String chars = "abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(7);
		for (int n = 0; n < 7; n++)
		{
			name.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		WebElement Element1 = driver.findElement(By.xpath("(//*[@class='ant-input'])[1]"));
		Element1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Element1.sendKeys(Keys.DELETE);
		Element1.sendKeys(name);
		Thread.sleep(3000);
		long phoneNumber=Math.round(Math.random()*1000000000L);
		WebElement Element2 = driver.findElement(By.xpath("(//*[@class='PhoneInputInput'])[1]"));
		Element2.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Element2.sendKeys(Keys.DELETE);
		Element2.sendKeys("+91 7"+phoneNumber);
		Thread.sleep(3000);
		String mail ="abcdefghijklmnopqrstuvwxyz"+"0123456789";
		Random id = new Random();
		StringBuilder Gmail = new StringBuilder(9);
		for (int n = 0; n < 9; n++)
		{
			Gmail.append(mail.charAt(id.nextInt(mail.length())));
		}
		WebElement Element3 = driver.findElement(By.xpath("(//*[@class='ant-input'])[2]"));
		Element3.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Element3.sendKeys(Keys.DELETE);
		Element3.sendKeys(name+"."+Gmail+"@brigosha.com");
		driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[1]")).click();  //gender selector
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='rc-virtual-list-holder-inner'])[1]/div[1]")).click();  // gender
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-select-selector'])[2]")).click();       // Blood group selector
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='rc-virtual-list-holder-inner'])[2]/div[7]")).click();   // blood group 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker datePicker'])[1]")).click();
		for (int i = 0; i < 18; i++) {
			WebElement ele=driver.findElement(By.xpath("//*[@class='ant-picker-header-super-prev-btn']"));
			Wait(ele);
			ele.click();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ant-picker-cell ant-picker-cell-in-view'])[12]")).click();
		
		System.out.println("-- Basic Details Updated --");
	}

	public void selectPrivalagePage() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Privileges = driver.findElement(By.xpath("//h2[text()='Privileges']")); 
		js.executeScript("arguments[0].scrollIntoView();", Privileges);
        Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='ant-checkbox-input'])[3]")).click();
		System.out.println("-- Privileges Updated ---");
	}

	public void enterAdressDeatils() throws InterruptedException {
		Thread.sleep(3000);
		 List<String> House = new ArrayList<>();
		 House.add("56");
		 House.add("67");
		 House.add("78");
		 House.add("03");
		 House.add("45");
		 House.add("22");
		 House.add("89");
	     Random rand = new Random();
	     String HouseNumber=House.get(rand.nextInt(House.size()));
	     System.out.println("Selected House Number is :- "+HouseNumber);
		WebElement Currentaddress = driver.findElement(By.xpath("//h2[text()='Current address']")); 
		js.executeScript("arguments[0].scrollIntoView();", Currentaddress);
		WebElement HouseNo= driver.findElement(By.xpath("(//*[@class='ant-input'])[3]"));
		HouseNo.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		HouseNo.sendKeys(Keys.DELETE);
		HouseNo.sendKeys(HouseNumber);
		Thread.sleep(3000);
		/*
		 List<String> pin = new ArrayList<>();
		 pin.add("505528");
		 pin.add("500001");
		 pin.add("560001");
		 pin.add("506001");
		 pin.add("110002");
	     Random pincode = new Random();
	     String pinNumber=pin.get(pincode.nextInt(pin.size()));
	     System.out.println("Selected PinCode is :- "+pinNumber);
	     WebElement PinCodeNumber= driver.findElement(By.xpath("(//*[@placeholder='Enter Pincode'])[1]"));
	     PinCodeNumber.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	     PinCodeNumber.sendKeys(Keys.DELETE);
	     PinCodeNumber.sendKeys(pinNumber);
	     */
	    driver.findElement(By.xpath("//div[@id='currentAddress']/div/div[2]/div/label")).click();
		WaitTil(3000);
		
		List<String> State = new ArrayList<>();
		State.add("Telangana");
		State.add("Assam");
		State.add("Karnataka");
		State.add("Maharashtra");
		State.add("Kerala");
		State.add("Odisha");
		State.add("Goa");
	    Random randamState = new Random();
	    String SelectedState=State.get(randamState.nextInt(State.size()));
	    System.out.println("Selected State is :- "+SelectedState);
		WebElement state = driver.findElement(By.xpath("(//*[@class='ant-input'])[4]"));
		state.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		state.sendKeys(Keys.DELETE);
		state.sendKeys(SelectedState);
		Thread.sleep(3000);
		List<String> Distric = new ArrayList<>();
		Distric.add("Hyderabad");
		Distric.add("Warangal");
		Distric.add("Karimnagar");
		Distric.add("Rajanna Sircilla");
		Distric.add("Siddipet");
		Distric.add("Bengaluru");
		Distric.add("Bengaluru");
	    Random randomDistric = new Random();
	    String SelectedDistric=Distric.get(randomDistric.nextInt(Distric.size()));
	    System.out.println("Selected Distric is :- "+SelectedDistric);
		WebElement distric = driver.findElement(By.xpath("(//*[@class='ant-input'])[5]"));
		distric.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		distric.sendKeys(Keys.DELETE);
		distric.sendKeys(SelectedDistric);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Same as current address']")).click();
		System.out.println("--Current Address Updated --");
		
	}

	public void enterEmargencyContacts() throws InterruptedException {
		Thread.sleep(3000);
		String chars = "abcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder name = new StringBuilder(7);
		for (int n = 0; n < 7; n++)
		{
			name.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		WebElement EmergencyContact = driver.findElement(By.xpath("//h2[text()='Emergency Contact']")); 
		js.executeScript("arguments[0].scrollIntoView();", EmergencyContact);
		WebElement Name=driver.findElement(By.xpath("(//*[@class='ant-input'])[6]"));
		Name.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Name.sendKeys(Keys.DELETE);
		Name.sendKeys("ambedkar"+" "+name);
		Thread.sleep(3000);
		long phoneNumber=Math.round(Math.random()*1000000000L);
		WebElement PhNumber=driver.findElement(By.xpath("(//*[@class='PhoneInputInput'])[2]"));
		PhNumber.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		PhNumber.sendKeys(Keys.DELETE);
		PhNumber.sendKeys("+91 8"+phoneNumber);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Brother'])[1]")).click();
		Thread.sleep(3000);
		System.out.println("--------Emergency Details Updated -----");
		driver.findElement(By.xpath("//*[text()='SAVE']")).click();
		Thread.sleep(3000);
		popupContent();
		Thread.sleep(2000);
		UserProfileBackButton.click();
		
	}

	public void clickCameraToUpload() throws InterruptedException, AWTException {
		wait(3000);
		
		driver.findElement(By.xpath("//*[contains(@href,'/user-management')]")).click();
		System.out.println("Clicked on User Management module...");
		WebElement re=driver.findElement(By.xpath("//*[text()='Recently added user(s)']"));
		scrollByElement(re);
		wait(3000);
		driver.findElement(By.xpath("(//*[@class='userCardStyle'])[1]")).click();
		System.out.println("Clicked one of the usercard");
		selectPhoto();
		//copyFileLocation();
		
		
	}
public void selectPhoto() {
	wait(3000);
	driver.findElement(By.xpath("//*[@class='anticon anticon-camera']")).click();
	System.out.println("Clicked Camera...");
	wait(3000);
	List<WebElement> elements = driver.findElements(By.xpath("//*[@class='ant-btn']"));
	int size = elements.size();
	System.out.println("The size  is :" + size);
	for (int i = 1; i < size; i++) {
		String subjectName = driver
				.findElement(By.xpath("(//*[@class='ant-btn'])[" + i + "]")).getText();
		//System.out.println("The subject name is :" + " " + subjectName);
		if (subjectName.equalsIgnoreCase("BROWSE PHOTO")) {
			wait(3000);
			driver.findElement(By.xpath("(//*[@class='ant-btn'])[" + i + "]")).click();
			System.out.println("----The selection of subject  "+subjectName+" is successfull----");
			break;
		}
}
	
}	
public HomePage1 addaUserPrev(String selectRole,String Priv1,String Priv2,String Priv3,String Priv4,String Priv5,String Priv6,String DefaultOTP) throws InterruptedException
{
	WaitTil(2000);
	HP = LC.MobileLogin(prop.getProperty("SuperAdminNumber"), prop.getProperty("DefaultOTP"));
	WaitTil(2000);
	UserManagement.click();
	WaitTil(2000);
	Wait(AddUser);
	AddUser.click();
	System.out.println("Clicked on ADD USER(S) Button");
	WaitTil(2000);
	CreateYourOwn.click();
	System.out.println("Selected Create Your Own");
	WaitTil(2000);
	Next.click();
	System.out.println("Clicked on Next Button");
	WaitTil(2000);
	UserTypeSelector.click();
	System.out.println("Clicked on User Type Selector");
	WaitTil(2000);
	if(selectRole.equalsIgnoreCase("Student")) {
		Student.click();
		System.out.println("Selected Student");
		
	}
	if(selectRole.equalsIgnoreCase("Teacher")) {
		Teacher.click();
		System.out.println("Selected Teacher");
	}
	if(selectRole.equalsIgnoreCase("DataOperator")) {
		DataOperator.click();
		System.out.println("Selected Data Operator");
	}
	if(selectRole.equalsIgnoreCase("Operation")) {
		Operation.click();
		System.out.println("Selected Operation");
	}
	WaitTil(2000);
	String chars = "abcdefghijklmnopqrstuvwxyz";
	//String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	Random rnd = new Random();
	StringBuilder name = new StringBuilder(8);
	for (int n = 0; n < 8; n++)
	{
		name.append(chars.charAt(rnd.nextInt(chars.length())));
		//name.append(captals.charAt(rnd.nextInt(captals.length())));
	}
	WaitTil(2000);
	Name.sendKeys(name);
	System.out.println(" Given User Name is :-"+name);
	WaitTil(2000);
	long phoneNumber=Math.round(Math.random()*1000000000L);
	Number.sendKeys("9"+phoneNumber);
	System.out.println(" Given User Phone Number is :-"+"9"+phoneNumber);
	WaitTil(2000);
	String mail ="abcdefghijklmnopqrstuvwxyz"+"0123456789";
	Random id = new Random();
	StringBuilder Gmail = new StringBuilder(9);
	for (int n = 0; n < 9; n++)
	{
		Gmail.append(mail.charAt(id.nextInt(mail.length())));
	}
	Email.sendKeys("brigosha."+Gmail+"@gmail.com");
	System.out.println(" Given User Email is :-"+"brigosha."+Gmail+"@gmail.com");
	WaitTil(2000);	
	if(Priv1.equalsIgnoreCase("Priv1")) {
		WaitTil(2000);
		Admin.click();
		String Prive1=Admin.getText();
		System.out.println("Selected Privelage is :-"+Prive1);
	}
	if(Priv1.equalsIgnoreCase("NoPriv")) {
		System.out.println(" ");
	}
	if(Priv2.equalsIgnoreCase("NoPriv")) {
		System.out.println(" ");
	}
	if(Priv2.equalsIgnoreCase("Priv2")) {
		WaitTil(2000);
		Planner.click();
		String Prive1=Planner.getText();
		System.out.println("Selected Privelage is :-"+Prive1);
	}
	if(Priv3.equalsIgnoreCase("NoPriv")) {
		System.out.println(" ");
	}
	if(Priv3.equalsIgnoreCase("Priv3")) {
		WaitTil(2000);
		Feemanager.click();
		String Prive1=Feemanager.getText();
		System.out.println("Selected Privelage is :-"+Prive1);
	}
	if(Priv4.equalsIgnoreCase("Priv4")) {
		WaitTil(2000);
		Institutesupport.click();
		String Prive1=Institutesupport.getText();
		System.out.println("Selected Privelage is :-"+Prive1);
	}
	if(Priv4.equalsIgnoreCase("NoPriv")) {
		System.out.println(" ");
	}
	if(Priv5.equalsIgnoreCase("Priv5")) {
		WaitTil(2000);
		Attendancemarker.click();
		String Prive1=Attendancemarker.getText();
		System.out.println("Selected Privelage is :-"+Prive1);
	}
	if(Priv5.equalsIgnoreCase("NoPriv")) {
		System.out.println(" ");
	}
	if(Priv6.equalsIgnoreCase("Priv6")) {
		WaitTil(2000);
		LeaveManager.click();
		String Prive1=LeaveManager.getText();
		System.out.println("Selected Privelage is :-"+Prive1);
	}
	if(Priv6.equalsIgnoreCase("NoPriv")) {
		System.out.println(" ");
	}
	WaitTil(2000);
	AddButton.click();
	System.out.println("Clicked on Add Button");
	WaitTil(2000);
	verifyPopUp();
	WaitTil(2000);
	LC.LogOut();
	WaitTil(2000);
	LC.EnterMobileNumber.sendKeys("9"+phoneNumber);
	WaitTil(2000);
	LC.VERIFY.click();
	WaitTil(2000);
	LC.EnterOTP.sendKeys(DefaultOTP);
	WaitTil(2000);
	LC.VerifyOTP.click();
	WaitTil(3000);
    return new HomePage1();
	
}
/*
public void copyFileLocation() throws InterruptedException, AWTException {
	// File Location
	StringSelection select = new StringSelection("C:\\Users\\Prabhakar\\Pictures\\Camera Roll\\BhanuPriya.PNG");
	// Copy to clipboard
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
	
	Thread.sleep(6000);
	// Create object of Robot class
	Robot robot = new Robot();
	Thread.sleep(1000);



	// Press CTRL+V
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);



	// Wait
	Thread.sleep(1000);
	



	// Release CTRL+V
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);



	// Wait
	Thread.sleep(1000);
	// Press Enter
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	//driver.findElement(By.xpath("(//*[@class='ant-btn ant-btn-primary'])[2]")).click();
	//Thread.sleep(4000);

	System.out.println("---successfull upload---");
} 
*/
}
