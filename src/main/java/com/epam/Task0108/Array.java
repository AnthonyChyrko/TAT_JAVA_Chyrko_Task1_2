package main.java.com.epam.Task0108;

public class Array {	
	private int[] arr;
	
	public Array(int size){
		if(size < 0){
			throw new IllegalArgumentException("Size can not be a negative number");
		}
		arrInit(size);		
	}
	
	public Array(int[] arr){
		this.arr = arr;		
	}
	
	private int[] arrInit(int size){
		arr = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = (int)(Math.random()*1000);
		}
		return arr;
	}
	
	public int sum(int k){
        int sum = 0;

        for (int i : arr){
            if (i < 0){
                throw new IllegalArgumentException("elements of array should be a positive number");
            }

            if (i%k == 0){
                sum += i;
            }
        }
        
        return sum;
    }
	
	public int[] getArr(){
		return arr;
	}
	

}
