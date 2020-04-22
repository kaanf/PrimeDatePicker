package com.aminography.primedatepicker.picker.theme

import android.view.animation.Interpolator
import android.view.animation.OvershootInterpolator
import com.aminography.primedatepicker.LabelFormatter
import com.aminography.primedatepicker.R
import com.aminography.primedatepicker.calendarview.PrimeCalendarView

/**
 * @author aminography
 */
abstract class BaseNormalThemeFactory : BaseThemeFactory() {

    override val monthLabelTextSize: Int
        get() = getDimension(R.dimen.defaultMonthLabelTextSize)

    override val weekLabelTextSize: Int
        get() = getDimension(R.dimen.defaultWeekLabelTextSize)

    override val dayLabelTextSize: Int
        get() = getDimension(R.dimen.defaultDayLabelTextSize)

    override val monthLabelTopPadding: Int
        get() = getDimension(R.dimen.defaultMonthLabelTopPadding)

    override val monthLabelBottomPadding: Int
        get() = getDimension(R.dimen.defaultMonthLabelBottomPadding)

    override val weekLabelTopPadding: Int
        get() = getDimension(R.dimen.defaultWeekLabelTopPadding)

    override val weekLabelBottomPadding: Int
        get() = getDimension(R.dimen.defaultWeekLabelBottomPadding)

    override val dayLabelVerticalPadding: Int
        get() = getDimension(R.dimen.defaultDayLabelVerticalPadding)

    override val showTwoWeeksInLandscape: Boolean
        get() = getBoolean(R.bool.defaultShowTwoWeeksInLandscape)

    override val animateSelection: Boolean
        get() = getBoolean(R.bool.defaultAnimateSelection)

    override val animationDuration: Int
        get() = getInteger(R.integer.defaultAnimationDuration)

    override val animationInterpolator: Interpolator
        get() = OvershootInterpolator()

    override val dividerThickness: Int
        get() = getDimension(R.dimen.defaultDividerThickness)

    override val dividerInsetLeft: Int
        get() = getDimension(R.dimen.defaultDividerInsetLeft)

    override val dividerInsetRight: Int
        get() = getDimension(R.dimen.defaultDividerInsetRight)

    override val dividerInsetTop: Int
        get() = getDimension(R.dimen.defaultDividerInsetTop)

    override val dividerInsetBottom: Int
        get() = getDimension(R.dimen.defaultDividerInsetBottom)

    override val loadFactor: Int
        get() = getInteger(R.integer.defaultLoadFactor)

    override val maxTransitionLength: Int
        get() = getInteger(R.integer.defaultMaxTransitionLength)

    override val transitionSpeedFactor: Float
        get() = getFloat(R.string.defaultTransitionSpeedFactor)

    override val flingOrientation: PrimeCalendarView.FlingOrientation
        get() = PrimeCalendarView.FlingOrientation.VERTICAL

    override val typefacePath: String?
        get() = null

    override val buttonBarTextSize: Int
        get() = getDimension(R.dimen.defaultButtonTextSize)

    override val monthLabelFormatter: LabelFormatter
        get() = { primeCalendar -> "${primeCalendar.monthName} ${primeCalendar.year}" }

    override val weekLabelFormatter: LabelFormatter
        get() = { primeCalendar -> primeCalendar.weekDayNameShort }

    override val developerOptionsShowGuideLines: Boolean
        get() = false

    override val gotoTextSize: Int
        get() = getDimension(R.dimen.defaultGotoTextSize)

    override val singleDayLabelFormatter: LabelFormatter
        get() = { primeCalendar -> primeCalendar.shortDateString }

    override val rangeDaysLabelFormatter: LabelFormatter
        get() = { primeCalendar -> primeCalendar.shortDateString }

    override val multipleDaysItemFirstLabelFormatter: LabelFormatter
        get() = { primeCalendar -> primeCalendar.shortDateString.split("/")[2] }

    override val multipleDaysItemSecondLabelFormatter: LabelFormatter
        get() = { primeCalendar ->
            primeCalendar.shortDateString.split("/").let {
                val year = it[0].substring(2)
                val month = primeCalendar.monthNameShort
                String.format("%s '%s", month, year)
            }
        }

    override val multipleDaysItemFirstLabelTextSize: Int
        get() = getDimension(R.dimen.text_size_header_multi_large)

    override val multipleDaysItemSecondLabelTextSize: Int
        get() = getDimension(R.dimen.text_size_header_multi_small)

    override val singleDayItemFirstLabelTextSize: Int
        get() = getDimension(R.dimen.text_size_small)

    override val singleDayItemSecondLabelTextSize: Int
        get() = getDimension(R.dimen.text_size_normal)

    override val rangeDaysItemFirstLabelTextSize: Int
        get() = getDimension(R.dimen.text_size_small)

    override val rangeDaysItemSecondLabelTextSize: Int
        get() = getDimension(R.dimen.text_size_normal)

    override val singleDayItemGapBetweenLines: Int
        get() = getDimension(R.dimen.defaultGapBetweenLines)

    override val rangeDaysItemGapBetweenLines: Int
        get() = getDimension(R.dimen.defaultGapBetweenLines)

    override val multipleDaysItemGapBetweenLines: Int
        get() = 0

}