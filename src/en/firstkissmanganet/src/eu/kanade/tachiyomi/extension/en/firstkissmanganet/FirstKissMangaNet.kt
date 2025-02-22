package eu.kanade.tachiyomi.extension.en.firstkissmanganet
import eu.kanade.tachiyomi.multisrc.madara.Madara

class FirstKissMangaNet : Madara(
    "1st-Kiss Manga.net",
    "https://1st-kissmanga.net",
    "en",
) {
    override val useLoadMoreRequest = LoadMoreStrategy.Never
    override val useNewChapterEndpoint = false
}
