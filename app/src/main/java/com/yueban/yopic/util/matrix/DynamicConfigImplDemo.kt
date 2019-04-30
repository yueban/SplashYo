package com.yueban.yopic.util.matrix

import com.tencent.mrs.plugin.IDynamicConfig

/**
 * @author yueban
 * @date 2019-04-30
 * @email fbzhh007@gmail.com
 */
class DynamicConfigImplDemo : IDynamicConfig {

    val isFPSEnable: Boolean
        get() = true
    val isTraceEnable: Boolean
        get() = true
    val isMatrixEnable: Boolean
        get() = true
    val isDumpHprof: Boolean
        get() = false

    override fun get(key: String, defStr: String): String {
        //hook to change default values
        return defStr
    }

    override fun get(key: String, defInt: Int): Int {
        //hook to change default values
        return defInt
    }

    override fun get(key: String, defLong: Long): Long {
        //hook to change default values
        return defLong
    }

    override fun get(key: String, defBool: Boolean): Boolean {
        //hook to change default values
        return defBool
    }

    override fun get(key: String, defFloat: Float): Float {
        //hook to change default values
        return defFloat
    }
}