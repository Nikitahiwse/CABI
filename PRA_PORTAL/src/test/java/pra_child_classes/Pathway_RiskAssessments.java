package pra_child_classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import pra_package.PRA_Home;

public class Pathway_RiskAssessments extends PRA_Home{

	@FindBy(linkText = "Select assessment")
	WebElement select_assessment;
	
	@FindBy(xpath="//input[@class='btn btn-pra-red btn-submit-form margin-top-20' and @value='Rapid assessment']")
	WebElement rapid_assessment;
	
	@FindBy(name="RapidAssessmentSections.RapidAssessmentQuestions[0].PotentialEstablishmentSpread")
	WebElement potential_for_establishment_option;
	
	@FindBy(id="RapidAssessmentSections_RapidAssessmentQuestions_0__PotentialEstablishmentSpread")
	WebElement option_1;
	
	@FindBy(name="RapidAssessmentSections.RapidAssessmentQuestions[1].PotentialEconomicEtcConsequences")
	WebElement potential_for_economic_option;
	
	@FindBy(id="RapidAssessmentSections_RapidAssessmentQuestions_1__PotentialEconomicEtcConsequences")
	WebElement option_2;
	
	@FindBy(xpath="//button[@class='btn btn-pra-red']")
	WebElement save;
	
	@FindBy(xpath="//button[@class='btn btn-pra-gray valid margin-top-20' and text()='No']")
	WebElement not_required;
	
	
	//Assessment with YES Option
	
	@FindBy(linkText = "Select assessment")
	WebElement select_black_borer;
	
	@FindBy(xpath="//input[@class='btn btn-pra-red btn-submit-form margin-top-20' and @value='Rapid assessment']")
	WebElement rapid_assessment_button;
	
	@FindBy(name="RapidAssessmentSections.RapidAssessmentQuestions[0].PotentialEstablishmentSpread")
	WebElement potential_for_establishment_spread_option;
	
	@FindBy(id="RapidAssessmentSections_RapidAssessmentQuestions_0__PotentialEstablishmentSpread")
	WebElement select_option_1;
	
	@FindBy(name="RapidAssessmentSections.RapidAssessmentQuestions[1].PotentialEconomicEtcConsequences")
	WebElement potential_for_environmental_option;
	
	@FindBy(id="RapidAssessmentSections_RapidAssessmentQuestions_1__PotentialEconomicEtcConsequences")
	WebElement select_option_2;
	
	@FindBy(xpath="//button[@class='btn btn-pra-red']")
	WebElement save_button;
	
	@FindBy(xpath="//button[@class='btn btn-pra-gray valid margin-top-20']")
	WebElement No;
	
	
	
	//Full risk Assessment
	
	
	@FindBy(linkText = "Select assessment")
	WebElement Apate_monachus_assessment;
	
	@FindBy(xpath="//input[@class='btn btn-pra-red btn-submit-form margin-top-20' and @value='Full assessment']")
	WebElement Full_Assessment;
	
	@FindBy(xpath="//select[@class='form-control ga_Rating_ForQuestionType_ProbabilityOfEntry_ForQuestion_WhatIsTheProbabilityOfThePestBeingAssociatedWithTheCommodityAtOrigin']")
	WebElement probability_of_pest_1;
	
	@FindBy(xpath="//select[@class='form-control ga_Rating_ForQuestionType_ProbabilityOfEntry_ForQuestion_WhatIsTheProbabilityOfThePestBeingAssociatedWithTheCommodityAtOrigin']")
	WebElement rating_1;
	
	@FindBy(xpath="//select[@class='form-control ga_ConfidenceLevel_ForQuestionType_ProbabilityOfEntryForQuestion_WhatIsTheProbabilityOfThePestBeingAssociatedWithTheCommodityAtOrigin']")
	WebElement probability_of_pest_2;
	
	@FindBy(xpath="//select[@class='form-control ga_ConfidenceLevel_ForQuestionType_ProbabilityOfEntryForQuestion_WhatIsTheProbabilityOfThePestBeingAssociatedWithTheCommodityAtOrigin']")
	WebElement rating_2;
	
	@FindBy(xpath="//*[@id=\"form0\"]/div[7]/div[2]/div/div/div/div[2]/div/input[1]")
	WebElement save_button_entrypage;
	
	@FindBy(xpath="//*[@id=\"form0\"]/div[7]/div[2]/div/div/div/div[2]/div/input[2]")
	WebElement next1;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_1__RiskAssessmentQuestions_1__SelectedRating\"]")
	WebElement vector1;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_1__RiskAssessmentQuestions_1__SelectedRating\"]")
	WebElement select_vector_1;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_1__RiskAssessmentQuestions_1__SelectedConfidenceLevel\"]")
	WebElement vector2;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_1__RiskAssessmentQuestions_1__SelectedConfidenceLevel\"]")
	WebElement select_vector_2;
	
	@FindBy(xpath="//*[@id=\"form1\"]/div[9]/div[2]/div/div/div/div[2]/div/input[1]")
	WebElement save_button_establishment;
	
	@FindBy(xpath="//*[@id=\"form1\"]/div[9]/div[2]/div/div/div/div[2]/div/input[2]")
	WebElement next2;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_2__RiskAssessmentQuestions_2__SelectedRating\"]")
	WebElement probability_rate_spread;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_2__RiskAssessmentQuestions_2__SelectedRating\"]")
	WebElement select_rate_spread_1;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_2__RiskAssessmentQuestions_2__SelectedConfidenceLevel\"]")
	WebElement probability_spread;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_2__RiskAssessmentQuestions_2__SelectedConfidenceLevel\"]")
	WebElement select_rate_spread_2;
	
	@FindBy(xpath="//*[@id=\"form2\"]/div[8]/div[2]/div/div/div/div[2]/div/input[1]")
	WebElement save_spread;
	
	@FindBy(xpath="//*[@id=\"form2\"]/div[8]/div[2]/div/div/div/div[2]/div/input[2]")
	WebElement next3;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_3__RiskAssessmentQuestions_0__SelectedRating\"]")
	WebElement economic_loss;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_3__RiskAssessmentQuestions_0__SelectedRating\"]")
	WebElement loss_1;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_3__RiskAssessmentQuestions_0__SelectedConfidenceLevel\"]")
	WebElement eco_loss;
	
	@FindBy(xpath="//*[@id=\"RiskAssessmentSections_3__RiskAssessmentQuestions_0__SelectedConfidenceLevel\"]")
	WebElement loss_2;
	
	@FindBy(xpath="//*[@id=\"form3\"]/div[11]/div[2]/div/div/div/div[2]/div/input[1]")
	WebElement save_4;
	
	@FindBy(xpath="//*[@id=\"form3\"]/div[11]/div[2]/div/div/div/div[2]/div/input[2]")
	WebElement next4;
	
	@FindBy(xpath="//input[@class='ga_IsPhytosanitaryMeasuresYes']")
	WebElement yes;
	
	@FindBy(xpath="//input[@id='btnGoToManagement']")
	WebElement save_management;
	
	@FindBy(xpath="//input[@value='Save and return to pest list' and @class='btn-pra-green']")
	WebElement save_return_pestlist;
	
	
	
	
	
	
	
	
	
	///Rapid Assessment With "NO" Option 
	
	public void rapid_assessments() throws Throwable {
		Thread.sleep(3000);
		select_assessment.click();
		Logger7.log(Status.PASS, "Assessment selected(Peach twig borer)");
		Thread.sleep(3000);
		rapid_assessment.click();
		Logger7.log(Status.PASS, "Rapid Assessment button clicked successfully");
		Thread.sleep(2000);
		potential_for_establishment_option.click();
		Logger7.log(Status.PASS, "Clicked On First Option");
		Select s1= new Select(option_1);
		s1.selectByValue("2");
		Logger7.log(Status.PASS, "No Option Selected");
		Thread.sleep(3000);
		potential_for_economic_option.click();
		Logger7.log(Status.PASS, "Clicked on Second Option");
		Select s2= new Select(option_2);
		s2.selectByValue("2");
		Logger7.log(Status.PASS, "No Option Selected");
		Thread.sleep(3000);
		save.click();
		Logger7.log(Status.PASS, "Save Button Clicked successfully");
		Thread.sleep(3000);
		not_required.click();
		Logger7.log(Status.PASS, "Full risk assessment is not required");
		
	
		
		//Rapid Assessment With Yes Option
		
		Thread.sleep(3000);
		select_black_borer.click();
		Logger7.log(Status.PASS, " Apate monachus Assessment selected(black borer)");
		Thread.sleep(2000);
		rapid_assessment_button.click();
		Logger7.log(Status.PASS, "Rapid Assessment button clicked successfully");
		Thread.sleep(2000);
		potential_for_establishment_spread_option.click();
		Select potential = new Select(select_option_1);
		potential.selectByValue("1");
		Logger7.log(Status.PASS, "Yes Option Selected");
		Thread.sleep(3000);
		potential_for_environmental_option.click();
		Select environmental = new Select(select_option_2);
		environmental.selectByValue("1");
		Logger7.log(Status.PASS, "Yes Option Selected");
		Thread.sleep(3000);
		save_button.click();
		Logger7.log(Status.PASS, "Save Button Clicked successfully");
		Thread.sleep(3000);
		No.click();
		Logger7.log(Status.PASS, "Full PRA not required");
		Thread.sleep(5000);
		
		
	}
	
	
	
	public void full_risk_assessment() throws Throwable
	{
		Thread.sleep(3000);
		Apate_monachus_assessment.click();
		Logger7.log(Status.PASS, " Apate monachus Assessment selected(black borer)");
		Thread.sleep(3000);
		Full_Assessment.click();
		Logger7.log(Status.PASS, " Full Assessment Button Clicked Successfully ");
		Thread.sleep(5000);
		probability_of_pest_1.click();
		Select r= new Select(rating_1);
		r.selectByValue("3");
		Logger7.log(Status.PASS, " Rating selected Successfully ");
		Thread.sleep(2000);
		probability_of_pest_2.click();
		Select rating= new Select(rating_2);
		rating.selectByValue("2");
		Logger7.log(Status.PASS, " Rating selected Successfully ");
		Thread.sleep(5000);
		save_button_entrypage.click();
		Logger7.log(Status.PASS, " Information Saved Successfully ");
		Thread.sleep(3000);
		next1.click();
		Logger7.log(Status.PASS, " Next Button Got Clicked Successfully ");
		Thread.sleep(3000);
		vector1.click();
		Select v= new Select(select_vector_1);
		v.selectByValue("2");
		Logger7.log(Status.PASS, " Rating selected Successfully ");
		Thread.sleep(3000);
		vector2.click();
		Select vector= new Select(select_vector_2);
		vector.selectByValue("1");
		Logger7.log(Status.PASS, " Rating selected Successfully ");
		Thread.sleep(3000);
		save_button_establishment.click();
		Logger7.log(Status.PASS, " Information Saved Successfully ");
		Thread.sleep(3000);
		next2.click();
		Logger7.log(Status.PASS, " Next Button Got Clicked Successfully ");
		Thread.sleep(3000);
		probability_rate_spread.click();
		Select spread= new Select(select_rate_spread_1);
		spread.selectByValue("2");
		Logger7.log(Status.PASS, " Rating selected Successfully ");
		Thread.sleep(3000);
		probability_spread.click();
		Select spread_rate= new Select(select_rate_spread_2);
		spread_rate.selectByValue("2");
		Logger7.log(Status.PASS, " Rating selected Successfully ");
		Thread.sleep(3000);
		save_spread.click();
		Logger7.log(Status.PASS, " Information Saved Successfully ");
		Thread.sleep(3000);
		next3.click();
		Logger7.log(Status.PASS, " Next Button Got Clicked Successfully ");
		Thread.sleep(5000);
		economic_loss.click();
		Select economic= new Select(loss_1);
		economic.selectByValue("2");
		Logger7.log(Status.PASS, " Rating selected Successfully ");
		Thread.sleep(3000);
		eco_loss.click();
		Select economic1= new Select(loss_2);
		economic1.selectByValue("2");
		Logger7.log(Status.PASS, " Rating selected Successfully ");
		Thread.sleep(3000);
		save_4.click();
		Logger7.log(Status.PASS, " Information Saved Successfully ");
		Thread.sleep(3000);
		next4.click();
		Logger7.log(Status.PASS, " Next Button Got Clicked Successfully ");
		Thread.sleep(3000);
		yes.click();
		Logger7.log(Status.PASS, "phytosanitary measures selected to yes");
		Thread.sleep(3000);
		save_return_pestlist.click();
		Logger7.log(Status.PASS, "Saved and Return to pest list button Clicked successfully");
		
		
		
		
		
	}
	
	

}