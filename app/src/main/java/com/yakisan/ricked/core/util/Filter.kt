package com.yakisan.ricked.core.util

// * Filtering general list method
fun <T> filterList(list: List<T>, query: String, updatedList: (T) -> String?): List<T> {
    val lowerCaseQuery = query.lowercase()
    return list.filter {
        updatedList(it)?.lowercase()?.contains(lowerCaseQuery) == true
    }
}