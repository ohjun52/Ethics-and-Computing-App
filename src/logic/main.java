/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package logic;

/**
 *
 * @author ohjun
 */
public class main
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		// TODO code application logic here
		PrivacyCase pc = new PrivacyCase("1", "2", "3");
		AlgorithmCase ac = new AlgorithmCase("1", "2", "3");
		MisinformationCase mc = new MisinformationCase("1", "2", "3");
		IntellectualPropertyCase ic = new IntellectualPropertyCase("1", "2", "3");
		pc.verdict = new Verdict("1", "2", "3");
		System.out.printf("privacy case data type: %s\n", pc.getDataType());
	}
}
