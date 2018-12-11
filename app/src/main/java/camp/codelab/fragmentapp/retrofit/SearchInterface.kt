package camp.codelab.fragmentapp.retrofit

import camp.codelab.fragmentapp.models.AnimeSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchInterface {


    @GET("search/anime")
    fun searchAnime(@Query("q") searchQuery: String): Call<AnimeSearchResponse>


}