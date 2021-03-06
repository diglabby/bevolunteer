package org.dzedzich.volunteers.tasks.ui.views.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import org.dzedzich.volunteers.R
import org.dzedzich.volunteers.tasks.ui.views.impl.CompletedTasksFragment
import org.dzedzich.volunteers.tasks.ui.views.impl.TasksFragment
import org.dzedzich.volunteers.tasks.ui.views.impl.UserTasksFragment

/**
 * Created by alexscrobot on 15.05.17.
 */
class TaskPagerAdapter(private val context: Context, fragmentManager: androidx.fragment.app.FragmentManager) : androidx.fragment.app.FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): androidx.fragment.app.Fragment? {

        when(position) {
            0 -> return TasksFragment.instance
            1 -> return UserTasksFragment.instance
            2 -> return CompletedTasksFragment.instance
        }

        return null
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return context.getString(R.string.tasks_all_tab_title)
            1 -> return context.getString(R.string.tasks_user_tab_title)
            2 -> return context.getString(R.string.tasks_completed_tab_title)
        }
        return null
    }

}