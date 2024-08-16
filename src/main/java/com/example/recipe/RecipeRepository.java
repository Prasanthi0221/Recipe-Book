// Write your code here
package com.example.recipe;

import java.util.*;

public interface RecipeRepository {
    ArrayList<Recipe> getRecipes();

    Recipe getRecipeById(int RecipeId);

    Recipe addRecipe(Recipe recipe);

    Recipe updateRecipe(int RecipeId, Recipe recipe);

    void deleteRecipe(int RecipeId);
}