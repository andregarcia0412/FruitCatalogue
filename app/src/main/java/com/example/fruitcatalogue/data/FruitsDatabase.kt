package com.example.fruitcatalogue.data

import com.example.fruitcatalogue.R


object FruitsDatabase {

    private val fruits = listOf(
        Fruit(
            id = 1,
            name = "Abacate",
            description = "O abacate, também conhecido como pera-abacate[1], é o fruto comestível do abacateiro (nome científico: Persea americana), uma árvore da família da Lauraceae nativa do México e da América do Sul, hoje extensamente cultivada em regiões tropicais e subtropicais, inclusive nas Ilhas Canárias, na Ilha da Madeira e na Sicília.",
            photo = R.drawable.abacate
        ),
        Fruit(
            id = 2,
            name = "Acerola",
            description = "A acerola, azerola, cerejeira-do-pará, cerejeira-de-barbados ou cerejeira-das-antilhas (Malpighia emarginata) é um arbusto da família das malpighiáceas. O fruto se dá numa árvore chamada aceroleira. Tem origem nas Antilhas, América Central e norte da América do Sul.",
            photo = R.drawable.acerola
        ),
        Fruit(
            id = 3,
            name = "Graviola",
            description = "A gravioleira (nome científico: Annona muricata) é uma planta originária das Antilhas, onde se encontra em estado silvestre. É nativa das regiões tropicais das Américas e do Caribe e é amplamente propagada. É do mesmo gênero (Annona) que a cherimoya e os araticuns e está na família Annonaceae.",
            photo = R.drawable.graviola
        ),
        Fruit(
            id = 4,
            name = "Jambo",
            description = "O jambo-rosa, ou jambo, é o fruto de uma espécie de Jambeiro, Syzygium jambos (L.) Alston. Pertence ao gênero Syzygium e à família Myrtaceae, que inclui também a goiaba, a pitanga, o jamelão, a jabuticaba e o eucalipto.",
            photo = R.drawable.jambo
        ),
        Fruit(
            id = 5,
            name = "Laranja",
            description = "A laranja é um fruto de várias espécies cítricas da família Rutaceae. Refere-se principalmente ao fruto da espécie Citrus × sinensis,[1] que também é chamado de laranja-doce, para distingui-lo do relacionado Citrus × aurantium, referido como laranja-azeda.",
            photo = R.drawable.laranja
        ),
        Fruit(
            id = 6,
            name = "Limão",
            description = "Limão (Citrus × limon) é o fruto do limoeiro, uma pequena árvore de folha perene originária da região sudeste da Ásia, da família das rutáceas. No Brasil é também popularmente denominado limão-siciliano, de forma a distingui-lo de três outras espécies de citrinos chamadas de \"limões\" no Brasil e \"limas\" nos restantes países lusófonos: Citrus × latifolia ou limão-taiti, Citrus × aurantiifolia ou limão-galego, Citrus × limonia ou limão-cravo.",
            photo = R.drawable.limao
        ),
        Fruit(
            id = 7,
            name = "Manga",
            description = "A manga é o fruto da mangueira (Mangifera indica L.), árvore frutífera da família Anacardiaceae, nativa do sul e do sudeste asiático [1] desde o leste da Índia até as Filipinas, e introduzida com sucesso no Brasil, em Angola, em Moçambique, Portugal e Espanha.",
            photo = R.drawable.manga
        ),
        Fruit(
            id = 8,
            name = "Melão",
            description = "Melão (Cucumis melo L.) é uma fruta provavelmente nativa do Oriente Médio. Existem inúmeras variedades cultivadas em regiões semiáridas de todo o mundo, todas apresentando frutos mais ou menos esféricos, com casca espessa e polpa carnosa e suculenta, com muitas sementes achatadas no centro.",
            photo = R.drawable.melao
        ),
        Fruit(
            id = 9,
            name = "Pitaia",
            description = "A pitaia,[1] também conhecida como fruta-do-dragão,[2] é o fruto de várias espécies de cactos epífitos dos gêneros Hylocereus e Selenicereus, nativas de regiões da América Central e México, também cultivadas em Israel, no Brasil e na China.",
            photo = R.drawable.pitaia
        ),
        Fruit(
            id = 10,
            name = "Uva",
            description = "A uva é o fruto da videira (nome científico: Vitis sp.), uma planta da família das Vitaceae. É utilizada frequentemente para produzir sucos, doces, geleias, vinhos e passas, podendo também ser consumida ao natural.",
            photo = R.drawable.uva
        ),
    )

    fun findAll() = fruits

    fun findById(id:Int) = fruits.find { it.id == id }

}