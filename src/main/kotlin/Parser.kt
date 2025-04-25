package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {

    val strUrl = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    val doc: Document = Jsoup.connect(strUrl).get()

    println(doc.title())

    val quotes = doc.select(".sc-2aegk7-2")
    println("\nВсего цитат на странице: ${quotes.count()}\n")

    for (quote in quotes) {
        println("${quote.text()}\n")
    }

}


