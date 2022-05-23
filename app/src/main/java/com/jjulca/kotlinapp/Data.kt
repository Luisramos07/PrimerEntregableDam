package com.jjulca.kotlinapp

/**
 * @author Janett Julca
 */
object Data {

    fun getPreventions() = listOf(
        Prevention(
            1, "Wear face mask", "Since the start of the coronavirus outbreak " +
                    "some places have fully embraced wearing face " +
                    "masks, and anyone caught without one risks " +
                    "becoming a social pariah.", R.drawable.imagen4
        ),
        Prevention(
            2, "Wash your hands", "These diseases include gastrointestinal " +
                    "infections, such as Salmonella, and respiratory " +
                    "infections, such as influenza.", R.drawable.ic_item_hands
        ),
        Prevention(
            3, "Wear face mask", "Since the start of the coronavirus outbreak " +
                    "some places have fully embraced wearing face " +
                    "masks, and anyone caught without one risks " +
                    "becoming a social pariah.", R.drawable.imagen4
        ),
        Prevention(
            4, "Wash your hands", "These diseases include gastrointestinal " +
                    "infections, such as Salmonella, and respiratory " +
                    "infections, such as influenza.", R.drawable.ic_item_hands
        ),
        Prevention(
            5, "Wear face mask", "Since the start of the coronavirus outbreak " +
                    "some places have fully embraced wearing face " +
                    "masks, and anyone caught without one risks " +
                    "becoming a social pariah.", R.drawable.imagen4
        )
    )

    fun getPreventionsDB() = listOf(
        PreventionDb(
            1, "Wear face mask", "Since the start of the coronavirus outbreak\n" +
                    "some places have fully embraced wearing face\n" +
                    "masks, and anyone caught without one risks\n" +
                    "becoming a social pariah.", R.drawable.imagen4
        ),
        PreventionDb(
            2, "Wash your hands", "These diseases include gastrointestinal\n" +
                    "infections, such as Salmonella, and respiratory\n" +
                    "infections, such as influenza.", R.drawable.ic_item_hands
        ),
        PreventionDb(
            3, "Wear face mask", "Since the start of the coronavirus outbreak\n" +
                    "some places have fully embraced wearing face\n" +
                    "masks, and anyone caught without one risks\n" +
                    "becoming a social pariah.", R.drawable.imagen4
        ),
        PreventionDb(
            4, "Wash your hands", "These diseases include gastrointestinal\n" +
                    "infections, such as Salmonella, and respiratory\n" +
                    "infections, such as influenza.", R.drawable.imagen4
        ),
        PreventionDb(
            5, "Wear face mask", "Since the start of the coronavirus outbreak\n" +
                    "some places have fully embraced wearing face\n" +
                    "masks, and anyone caught without one risks\n" +
                    "becoming a social pariah.", R.drawable.imagen4
        )
    )

}