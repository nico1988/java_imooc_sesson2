package com.imooc.abstractDemo;

public class Triangle extends Shape {
	public String color;
	public String testA() {
		this.color = "red";
		return this.color;
	}
	public static void main(String[] args) {
		System.out.println(new Triangle().testA());
	}
}
