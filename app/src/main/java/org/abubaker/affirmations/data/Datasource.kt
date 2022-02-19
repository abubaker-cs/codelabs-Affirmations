package org.abubaker.affirmations.data

import org.abubaker.affirmations.R
import org.abubaker.affirmations.model.Affirmation

class Datasource {

    // This will include references to affirmation01-10 stored in the strings.xml
    fun loadAffirmations(): List<Affirmation> {

        // We are declaring List<Affirmation> as the return type of the method loadAffirmations()
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )

    }

}