package com.example.shared.data



/**
 * Created by Himanshu Verma on 27/06/24.
 **/
interface LoginRepo {
    suspend fun loginUser(name: String, result: ((Result<Any>) -> Unit))
}