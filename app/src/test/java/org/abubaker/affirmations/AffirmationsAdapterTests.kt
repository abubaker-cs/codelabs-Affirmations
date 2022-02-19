package org.abubaker.affirmations

import org.abubaker.affirmations.adapter.ItemAdapter
import org.abubaker.affirmations.model.Affirmation
import org.junit.Test
import org.junit.Assert.assertEquals
import org.mockito.Mockito.mock
import android.content.Context

class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}