/*#******************************************************************************************************************
        # @purpose :Demonstrate VendingMachine Logic.
        # @file  :VendingMachine.java
        # @author :Sandhya
   #***************************************************************************************************************/
package jUnitTesting;

public class VendingMachine {
	public static int countCurrency(int amt) {
		int[] notes = {2000,500,200,100,50,20,10,5,2,1};
		int[] noteCount = new int[10];
		int count=0;
		for(int i=0;i<10;i++) {
		if(amt>=notes[i]) {
			noteCount[i] = amt/notes[i];
			count++;
		amt = amt-noteCount[i]*notes[i];
		
		}}
		/*System.out.println("noteCounts");*/
		for(int i=0;i<10;i++) {
			if(noteCount[i]!=0) {
				System.out.println(notes[i]+ ":"+ noteCount[i]);
			
		}
		}
		return count;
		}


	public int countCurrency() {
		// TODO Auto-generated method stub
		return 0;
	}

}
