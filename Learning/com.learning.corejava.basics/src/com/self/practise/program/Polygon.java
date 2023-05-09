package com.self.practise.program;

class Polygon {

	  // method to render a shape
	  public void render() {
	    System.out.println("Rendering Polygon...");
	  }
	}

	class Square extends Polygon {

	  // renders Square
	  public void render() {
	    System.out.println("Rendering Square...");
	  }
	}

	class Circle extends Polygon {

	  // renders circle
	  public void render() {
	    System.out.println("Rendering Circle...");
	  }
	}