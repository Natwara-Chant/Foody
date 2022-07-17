package com.example.foody

import com.example.foody.models.FoodRecipes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    @GET("https://api.spoonacular.com/recipes/complexSearch") //specific end point to request and receive data from our API
//---------------------------------------------------------------- the function to keep query inside the parameter ----------------------------------------------------------------//
    suspend fun getRecipes ( // this fun will use kotlin coroutines -- run on a background thread
        //specify the query
        //@QueryMap: Create hashmap to add all queries at once
        @QueryMap queries: Map<String, String>
    ): Response<FoodRecipes> //wrap FoodRecipes inside Response class
}