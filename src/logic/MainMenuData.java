/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author ohjun
 */
public class MainMenuData
{
	public static EthicsCase[] cases = new EthicsCase[]
	{
		new PrivacyCase("The Always-On Microphone",
                        "A smart speaker company recorded household conversations even when the device was not activated. Employees reviewed the recordings.", 
                        "audio recordings"),
                new MisinformationCase ("The Deepfake Politician", 
                        "A deepfake video of a candidate saying things they never said spread widely online during an election before being identified as fake.", 
                        "deepfake video"),
                new AlgorithmCase("The Predictive Policing Bias", 
                        "A city's law enforcement AI disproportionately targeted minority neighborhoods for increased patrols based on flawed historical data.", 
                        "racial bias"),
                new MisinformationCase("The AI Medical Miracle Hoax", 
                        "An AI-generated article falsely claimed a common household ingredient could completely cure a serious illness, leading to widespread public panic.", 
                        "AI-generated fake article"),
                new IntellectualPropertyCase("AI Trained on Artist Work", 
                        "An AI image generator was trained on millions of artworks scraped without permission. Artists receive no credit or payment.", 
                        "AI-generated art"),
                new AlgorithmCase("The Biased Hiring Bot",
                        "A tech company's AI screening tool ranked male applicants higher than equally qualified female applicants.",
                        "gender bias"),
                new IntellectualPropertyCase("The Code Scraper", 
                        "An AI coding assistant was trained on millions of lines of open-source repositories without respecting the original attribution licenses.", 
                        "AI-generated code"),
                new PrivacyCase("The Health Tracker Leak", 
                        "A fitness app leaked users' precise real-time location data and medical history due to an unencrypted cloud server.", 
                        "location and medical data"),
	};
}
