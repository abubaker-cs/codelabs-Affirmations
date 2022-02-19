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
 * Adapter for the [RecyclerView] in the [MainActivity]. Displays [Affirmation] data object.
 */
class ItemAdapter(
    private val context: Context,
    private val list: List<Affirmation>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    /**
     * A ViewHolder describes an item view and metadata about its place within the RecyclerView.
     *
     * It provides a reference to the views for each data item. Complex data items may need more
     * than one view per item, and you provide access to all the views for a data item in a view holder.
     *
     * Note that each data item is just an Affirmation object.
     */
    inner class ViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        // We are getting the current Context
        val layoutInflater = LayoutInflater.from(context)

        // Getting reference of the RecyclerView from the XML file to create a new view-item
        val mBinding: ListItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.list_item, parent, false)

        // Binding the ViewHolder
        return ViewHolder(mBinding)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]

        if (holder is ViewHolder) {

            // stringResourceId = parameter defined in the model/Affirmation.kt file
            holder.binding.itemTitle.text = context.resources.getString(item.stringResourceId)

        }

    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount(): Int {
        return list.size
    }
}