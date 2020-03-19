package home_task.home_task_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class checkingStringForA {
/*	Test Cases
*	1.First one A:“ABCD” => “BCD” 
    2.First two A's:“AACD” => “CD”  
    3.Second Alphabet A A:“BACD” => “BCD” 
    4.Last two A'sA:“BBAA” => “BBAA”        
    5.First and last two A's:“AABAA” => “BAA” 
* 
*/
RemoveIfFirstAFromString object;
	@BeforeEach
	void setUp() throws Exception {
		object=new RemoveIfFirstAFromString();	
	}
	@Test
	void remove_A_If_At_FirstPlace(){
	assertEquals("BCD",object.removeA("ABCD"));
	}
	@Test
	void remove_A_If_At_First_And_SecondPlace(){
	assertEquals("CD",object.removeA("AACD"));
	}
	@Test
	void remove_A_If_At_SecondPlace(){
	assertEquals("BCD",object.removeA("BACD"));
	}
	@Test
	void donot_Remove_A_Ifnotinfirstorsecondplace(){
	assertEquals("BBAA",object.removeA("BBAA"));
	}
	@Test
	void remove_Only_A_In_First_Twoplaces(){
	assertEquals("BAA",object.removeA("AABAA"));
	}
}