package ru.dgu.testryceclerviewviewbinding

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.dgu.testryceclerviewviewbinding.databinding.ItemLayoutBinding

class MainAdapter(private val context: Context, private var memberList: MutableList<ModelMebel.Item>):RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder (private val itemBinding: ItemLayoutBinding)
        :RecyclerView.ViewHolder(itemBinding.root){
            fun bindItem(mebel: ModelMebel.Item){
                itemBinding.mainPrice.text = mebel.name
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val mebel = memberList[position]
        holder.bindItem(mebel)
    }

    override fun getItemCount(): Int {
        return memberList.size
    }
}