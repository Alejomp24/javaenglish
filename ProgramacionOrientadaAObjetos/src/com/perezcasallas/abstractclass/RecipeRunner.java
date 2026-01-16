package com.perezcasallas.abstractclass;

public class RecipeRunner {

	public static void main(String[] args) {
		Receipe1 recipe = new Receipe1();
		recipe.execute();

		RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
		recipeWithMicrowave.execute();
	}
}
