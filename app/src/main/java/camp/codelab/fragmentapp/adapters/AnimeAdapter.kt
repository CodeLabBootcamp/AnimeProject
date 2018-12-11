package camp.codelab.fragmentapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import camp.codelab.fragmentapp.R
import camp.codelab.fragmentapp.models.Anime
import kotlinx.android.synthetic.main.item_anime.view.*

class AnimeAdapter(val animeList: List<Anime>) : RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_anime, parent, false)
        return AnimeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return animeList.size
    }

    override fun onBindViewHolder(viewHolder: AnimeViewHolder, position: Int) {
        viewHolder.setAnime(animeList[position])
    }


    inner class AnimeViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun setAnime(anime: Anime) {

            view.animeTitleTextView.text = anime.title

        }

    }
}