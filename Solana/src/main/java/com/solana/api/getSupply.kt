package com.solana.api

import com.solana.models.Supply

fun Api.getSupply(onComplete: ((Result<Supply>) -> Unit)){
    router.call("getSupply", ArrayList(), Supply::class.java, onComplete)
}