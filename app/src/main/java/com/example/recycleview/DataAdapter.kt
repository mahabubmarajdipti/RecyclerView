package com.example.recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.databinding.ViewLayoutBinding

class DataAdapter(private val dataList: ArrayList<Data>) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>() {
    var onClick: ((Data) -> Unit)? = null

    class ViewHolder(val binding: ViewLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ViewLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]

        holder.binding.apply {
            dataTitle.text = data.title
            dataDetail.text = data.detail
            dataImage.setImageResource(data.image)
        }
        holder.itemView.setOnClickListener {
            onClick?.invoke(data)
        }
    }
}