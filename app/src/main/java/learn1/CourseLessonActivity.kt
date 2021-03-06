package learn1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.letsbuildthatapp.kotlinyoutubelbta.R
import kotlinx.android.synthetic.main.activity_course_lesson.*

/**
 * Created by brianvoong on 12/21/17.
 */

class CourseLessonActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_course_lesson)
//        webview_course_lesson.setBackgroundColor(Color.YELLOW)

        val courseLink = intent.getStringExtra(CourseDetailActivity.CourseLessonViewHolder.COURSE_LESSON_LINK_KEY)

        webview_course_lesson.settings.javaScriptEnabled = true
        webview_course_lesson.settings.loadWithOverviewMode = true
        webview_course_lesson.settings.useWideViewPort = true

        webview_course_lesson.loadUrl(courseLink)
    }

}