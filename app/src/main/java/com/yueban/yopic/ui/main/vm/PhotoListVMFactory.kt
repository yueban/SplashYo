package com.yueban.yopic.ui.main.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.yueban.yopic.data.repo.PhotoRepo
import com.yueban.yopic.util.di.scope.AppScope
import javax.inject.Inject

/**
 * @author yueban
 * @date 2019/1/15
 * @email fbzhh007@gmail.com
 */
@AppScope
class PhotoListVMFactory
@Inject constructor(private val photoRepo: PhotoRepo) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PhotoListVM(photoRepo) as T
    }
}