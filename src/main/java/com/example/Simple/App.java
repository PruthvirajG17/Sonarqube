package com.example.Simple;

public class App {
	public int  add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else if(number < 0){
            return false;
        }
        else if(number > 0){
            return true;
        }
        else {
        	return false;
        }
        
    }

    public static void main(String[] args) {
        App app=new App();
        System.out.println(app.add(5,6));
        System.out.println(app.sub(5, 6));
    }
}
