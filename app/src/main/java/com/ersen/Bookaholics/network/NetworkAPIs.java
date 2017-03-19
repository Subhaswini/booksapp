package com.ersen.Bookaholics.network;

import com.ersen.Bookaholics.constants.FaxiConstants;
import com.ersen.Bookaholics.models.Book;
import com.ersen.Bookaholics.models.BookList;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.Url;

public interface NetworkAPIs {

    @GET(FaxiConstants.URLConstants.GOOGLE_BOOKS_API_SEARCH_VOLUMES)
    Call<BookList> searchForBooks(@Query(FaxiConstants.URLParamConstants.GOOGLE_BOOKS_API_SEARCH_PARAM) String searchQuery, @Query(FaxiConstants.URLParamConstants.GOOGLE_BOOKS_API_START_INDEX) int startIndex);

    @GET
    Call<Book> getDetailsOfBook(@Url String urlToSelfLink);
}
