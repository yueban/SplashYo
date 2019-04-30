package com.yueban.yopic.util.matrix

import android.content.Context
import com.tencent.matrix.plugin.DefaultPluginListener
import com.tencent.matrix.report.Issue
import com.tencent.matrix.util.MatrixLog

/**
 * @author yueban
 * @date 2019-04-30
 * @email fbzhh007@gmail.com
 */
class TestPluginListener(context: Context) : DefaultPluginListener(context) {
    override fun onReportIssue(issue: Issue) {
        super.onReportIssue(issue)
        MatrixLog.e(TAG, issue.toString())

        //add your code to process data
    }

    companion object {
        const val TAG = "Matrix.TestPluginListener"
    }
}