package com.codemen.message.domain.network

interface OperationCallback {
    fun onSuccess(obj:Any?)
    fun onError(obj:Any?)
}