package com.Hospiol.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hospiol.qa.base.BaseTest;
import com.Hospiol.qa.utils.ActionClass;
import com.Hospiol.qa.utils.UtilTest;

public class AppointmentPage extends BaseTest {

	// after clicking appointment
	@FindBy(xpath = "//a[normalize-space()='Add Appointment']")
	@CacheLookup
	private WebElement addAppointment;

//	@FindBy(xpath = "//a[normalize-space()='Add Appointment']")
//	@CacheLookup
//	private WebElement addAppointment;

//	@FindBy(className = "btn btn-primary btn-sm addappointment")
//	@CacheLookup
//	private WebElement addAppointment;

	@FindBy(partialLinkText = "Doctor Wi")
	@CacheLookup
	private WebElement doctorWise;

	@FindBy(xpath = "//a[text()=\" Queue\"]")
	@CacheLookup
	private WebElement queue;

	// after clicking add appointment
	@FindBy(xpath = "//span[text()=\"New Patient\"]")
	@CacheLookup
	private WebElement newPatient;

	@FindBy(xpath = "//span[@class=\"select2 select2-container select2-container--default select2-container--below\"]//span[@role=\"combobox\"]")
	@CacheLookup
	private WebElement searchbox;

	@FindBy(xpath = "//span[@id='select2-doctorid-container']")
	@CacheLookup
	private WebElement Doctor;

	@FindBy(id = "doctor_fees")
	@CacheLookup
	private WebElement doctorFees;

	@FindBy(id = "select2-global_shift-container")
	@CacheLookup
	private WebElement shift;

	@FindBy(id = "datetimepicker")
	@CacheLookup
	private WebElement appointmentdate;

	@FindBy(id = "slot")
	@CacheLookup
	private WebElement slot;

	@FindBy(id = "select2-priority-4d-container")
	@CacheLookup
	private WebElement appontmentPriority;

	@FindBy(name = "payment_mode")
	@CacheLookup
	private WebElement paymentmode;

	@FindBy(xpath = "//div[@class=\"col-sm-8\"]//textarea[@id=\"note\"]")
	@CacheLookup
	private WebElement message;

	@FindBy(id = "live_consult")
	@CacheLookup
	private WebElement liveConsultant;

	@FindBy(name = "save_print")
	@CacheLookup
	private WebElement saveAndPrint;

	@FindBy(id = "formaddbtn")
	@CacheLookup
	private WebElement saveBtn;

	// after clicking add new patient

	@FindBy(id = "name")
	@CacheLookup
	private WebElement name;

	@FindBy(name = "guardian_name")
	@CacheLookup
	private WebElement guardianName;

	@FindBy(id = "addformgender")
	@CacheLookup
	private WebElement gender;

	@FindBy(id = "birth_date")
	@CacheLookup
	private WebElement dob;

	@FindBy(id = "age_year")
	@CacheLookup
	private WebElement year;

	@FindBy(id = "age_month")
	@CacheLookup
	private WebElement month;

	@FindBy(id = "age_day")
	@CacheLookup
	private WebElement day;

	@FindBy(name = "blood_group")
	@CacheLookup
	private WebElement bloodgroup;

	@FindBy(name = "marital_status")
	@CacheLookup
	private WebElement maritialStatus;

	@FindBy(id = "file")
	@CacheLookup
	private WebElement fileUpload;

	@FindBy(id = "number")
	@CacheLookup
	private WebElement phone;

	@FindBy(id = "addformemail")
	@CacheLookup
	private WebElement email;

	@FindBy(name = "address")
	@CacheLookup
	private WebElement address;

	@FindBy(name = "note")
	@CacheLookup
	private WebElement remarks;

	@FindBy(name = "known_allergies")
	@CacheLookup
	private WebElement knownAllergies;

	@FindBy(name = "insurance_id")
	@CacheLookup
	private WebElement TPAId;

	@FindBy(name = "validity")
	@CacheLookup
	private WebElement TPAvalidity;

	@FindBy(name = "identification_number")
	@CacheLookup
	private WebElement nationalidentificationNumber;

	@FindBy(id = "formaddpabtn")
	@CacheLookup
	private WebElement save;

	public AppointmentPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}

	public void verifyAddAppointmentBtn() throws InterruptedException {

		addAppointment.click();
		Thread.sleep(1200);
	}

	public void verifyTheAddAppointmentPageByAddingNewPatientData() throws Throwable {

		;
//		newPatient.click();
//		Thread.sleep(1200);
//		// name.sendKeys("Ramulu");
//		name.sendKeys(UtilTest.randomestring());
//		guardianName.sendKeys("Ram");
//		UtilTest.dropdownmethod(gender, "Male");
//		dob.sendKeys("02/02/2019");
////		year.sendKeys("2020");
////		month.sendKeys("02");
////		day.sendKeys("01");
//		UtilTest.dropdownmethod(bloodgroup, "A +ve");
//		UtilTest.dropdownmethod(maritialStatus, "Single");
//
////		phone.sendKeys("7894577990");
////		email.sendKeys("abcd1223@gmail.com");
//
//		phone.sendKeys(UtilTest.RandomPhoneNumber());
//		email.sendKeys(UtilTest.randomeEmail());
//		address.sendKeys("kondapur, Hyderabad");
//		remarks.sendKeys("need appointment");
//		knownAllergies.sendKeys("No");
//		TPAId.sendKeys("256");
//		TPAvalidity.sendKeys("01/05/2024");
//		nationalidentificationNumber.sendKeys("1230");
//		save.click();

		Thread.sleep(1000);
		// UtilTest.implicitWait(driver, 10);
		// UtilTest.Explicitywaitmethod(Doctor);
		ActionClass.selectByVisibleText("Ravi  (MT-0254)", Doctor);
		// UtilTest.dropdownmethod(Doctor, "Ravi (MT-0254)");
		//UtilTest.dropdownmethod(shift, "General");
		ActionClass.selectByVisibleText("General", shift);
		appointmentdate.sendKeys("01/04/2024");
		ActionClass.selectByVisibleText("11:01 AM - 11:30 AM", slot);
		ActionClass.selectByVisibleText("High", appontmentPriority);
		ActionClass.selectByVisibleText("Cash", paymentmode);
//		UtilTest.dropdownmethod(slot, "11:01 AM - 11:30 AM");
//		UtilTest.dropdownmethod(appontmentPriority, " High");
//		UtilTest.dropdownmethod(paymentmode, "Cash");
		message.sendKeys("please book the appointment");
		ActionClass.selectByVisibleText("No                          ", liveConsultant);
		// UtilTest.dropdownmethod(liveConsultant, "No ");
		saveBtn.click();

	}

}
