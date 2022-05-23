package com.jjulca.kotlinapp.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jjulca.kotlinapp.Prevention
import com.jjulca.kotlinapp.R

/**
 * @author Janett Julca
 */
class PreventionAdapter(
    private var preventionList: List<Prevention>, val itemAction: (item: Prevention) -> Unit
) : RecyclerView.Adapter<PreventionAdapter.PreventionViewHolder>() {

    //TODO onCreateViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreventionViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.row_prevention, parent, false)
        return PreventionViewHolder(view)
    }

    //TODO getItemCount
    override fun getItemCount(): Int = preventionList.size

    //TODO onBindViewHolder
    override fun onBindViewHolder(holder: PreventionViewHolder, position: Int) {
        holder.bind(preventionList[position])
    }

    //TODO update
    fun update(nPreventionList: List<Prevention>) {
        this.preventionList = nPreventionList
        notifyDataSetChanged()
    }

    //TODO ViewHolder
    inner class PreventionViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val imageView =
            view.findViewById<ImageView>(R.id.imageView)
        private val textViewTitle =
            view.findViewById<TextView>(R.id.textViewTitle)
        private val textViewDesc =
            view.findViewById<TextView>(R.id.textViewDesc)

        fun bind(entity: Prevention) {
            textViewTitle.text = entity.title
            textViewDesc.text = entity.desc
            imageView.setImageResource(entity.image)

            view.setOnClickListener {
                itemAction(entity)
            }
        }
    }

}