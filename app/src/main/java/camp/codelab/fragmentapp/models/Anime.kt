package camp.codelab.fragmentapp.models

import com.google.gson.annotations.SerializedName

data class Anime(
    @SerializedName("mal_id")
    var malId: Int = 0, // 7580
    @SerializedName("url")
    var url: String = "", // https://myanimelist.net/anime/7580/Ikkitousen__Xtreme_Xecutor
    @SerializedName("image_url")
    var imageUrl: String = "", // https://cdn.myanimelist.net/images/anime/2/18209.jpg?s=17387dbd01b8d7ff42e8ef4573da36db
    @SerializedName("title")
    var title: String = "", // Ikkitousen: Xtreme Xecutor
    @SerializedName("airing")
    var airing: Boolean = false, // false
    @SerializedName("synopsis")
    var synopsis: String = "", // Life gets crazy for Hakufu when she takes on a pupil that acts just like her! A tournament between the school heads start, but due to Hakufu's negligence, her pupil ends up taking her place. The tourn...
    @SerializedName("type")
    var type: String = "", // TV
    @SerializedName("episodes")
    var episodes: Int = 0, // 12
    @SerializedName("score")
    var score: Double = 0.0, // 6.89
    @SerializedName("start_date")
    var startDate: String = "", // 2010-03-26T00:00:00+00:00
    @SerializedName("end_date")
    var endDate: String = "", // 2010-06-11T00:00:00+00:00
    @SerializedName("members")
    var members: Int = 0, // 34990
    @SerializedName("rated")
    var rated: String = "" // R+
)