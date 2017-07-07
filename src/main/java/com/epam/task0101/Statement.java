package main.java.com.epam.task0101;

public class Statement {
	private static final int MIN_VAVULE = 1000;
	private static final int MAX_VALUE = 9999;
	private int i;
	
	public Statement(int i){
		if(i < MIN_VAVULE || i > MAX_VALUE){
			throw new IllegalArgumentException("Argument must be a 4-digit pisitive number.");			
		}
		this.i = i;
	}
	
	public boolean isStatementCorrect(){		
        char[] ch = String.valueOf(i).toCharArray();

        int[] intArr = new int[ch.length];

        for (int j = 0; j < ch.length; j++){
            intArr[j] = Character.getNumericValue(ch[j]);
        }

        return (intArr[0] + intArr[1]) == (intArr[2] + intArr[3]);
    }

}
