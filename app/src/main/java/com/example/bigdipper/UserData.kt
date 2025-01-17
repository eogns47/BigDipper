package com.example.bigdipper

import java.io.Serializable

data class UserData(val Uid:String, val userId:String, val userPW:String, val NickName:String, val explain:String,
                    var lv:Int,
                    var bookClubList:ArrayList<BookClubData>?, val readedList:ArrayList<String>?,
                    val PostList:ArrayList<PostData>?
): Serializable {
    constructor() : this("","","","","",1, arrayListOf<BookClubData>(),
        arrayListOf<String>(), arrayListOf<PostData>())

}