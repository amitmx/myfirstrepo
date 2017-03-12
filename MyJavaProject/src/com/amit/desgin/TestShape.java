package com.amit.desgin;

public class TestShape {

	public static void main(String[] args) {
		
		DrawEditor editor = new DrawEditor();
		editor.drawShape(new Circle());
		editor.drawShape(new Rectangle());
		editor.drawShape(new Square());

	}

}
