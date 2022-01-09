package com.example.academy.ui.reader.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.academy.data.ModuleEntity
import com.example.academy.databinding.ItemsModuleListCustomBinding
import java.util.*
import kotlin.collections.ArrayList

class ModuleListAdapter internal constructor(private val listener: MyAdapterClickListener):
    RecyclerView.Adapter<ModuleListAdapter.ModuleViewHolder>() {
    private val listModules = ArrayList<ModuleEntity>()

    internal fun setModules(modules: List<ModuleEntity>?){
        if (modules == null) return
        this.listModules.clear()
        this.listModules.addAll(modules)
    }

    inner class ModuleViewHolder(private val binding: ItemsModuleListCustomBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(module: ModuleEntity){
            binding.textModuleTitle.text = module.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
        val binding = ItemsModuleListCustomBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ModuleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        val module = listModules[position]
        holder.bind(module)
        holder.itemView.setOnClickListener {
//            listener.onItemClicked(holder.adapterPosition, listModules[holder.adapterPosition].moduleId)
            listener.onItemClicked(holder.bindingAdapterPosition, listModules[holder.bindingAdapterPosition].moduleId)
        }
    }

    override fun getItemCount(): Int = listModules.size
}

internal interface MyAdapterClickListener {
    fun onItemClicked(position: Int, moduleId: String)
}
