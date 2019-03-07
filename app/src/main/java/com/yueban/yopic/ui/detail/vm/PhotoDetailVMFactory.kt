package com.yueban.yopic.ui.detail.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.yueban.yopic.data.repo.PhotoRepo
import com.yueban.yopic.util.di.scope.AppScope
import javax.inject.Inject

/**
 * @author yueban
 * @date 2019/1/18
 * @email fbzhh007@gmail.com
 */
@AppScope
class PhotoDetailVMFactory
@Inject constructor(private val photoRepo: PhotoRepo) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PhotoDetailVM(photoRepo) as T
    }
}