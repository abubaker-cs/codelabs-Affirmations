package org.abubaker.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import org.abubaker.affirmations.R
import org.abubaker.affirmations.databinding.ListItemBinding
import org.abubaker.affirmations.model.Affirmation

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */
class ItemAdapter(
    private val context: Context,
    private val list: List<Affirmation>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    /**
     * A ViewHolder describes an item view and metadata about its place within the RecyclerView.
     */
    inner class ViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        // create a new view
        // val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        val layoutInflater = LayoutInflater.from(context)

        val mBinding: ListItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.list_item, parent, false)

        return ViewHolder(mBinding)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]

        if (holder is ViewHolder) {
            // holder.textView.text = context.resources.getString(item.stringResourceId)
            holder.binding.itemTitle.text = context.resources.getString(item.stringResourceId)
        }

    }

    /**
     * Gets the number of items in the list
     */
    override fun getItemCount(): Int {
        return list.size
    }
}