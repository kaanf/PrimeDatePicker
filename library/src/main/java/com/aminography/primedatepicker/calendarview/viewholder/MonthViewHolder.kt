package com.aminography.primedatepicker.calendarview.viewholder

import com.aminography.primeadapter.PrimeViewHolder
import com.aminography.primeadapter.callback.PrimeDelegate
import com.aminography.primecalendar.base.BaseCalendar
import com.aminography.primedatepicker.OnDayPickedListener
import com.aminography.primedatepicker.PickType
import com.aminography.primedatepicker.R
import com.aminography.primedatepicker.calendarview.callback.IMonthViewHolderCallback
import com.aminography.primedatepicker.calendarview.dataholder.MonthDataHolder
import com.aminography.primedatepicker.monthview.PrimeMonthView
import kotlinx.android.synthetic.main.list_item_month_view.view.*

/**
 * @author aminography
 */
class MonthViewHolder(
        delegate: PrimeDelegate,
        private val callback: IMonthViewHolderCallback?
) : PrimeViewHolder<MonthDataHolder>(delegate, R.layout.list_item_month_view),
        OnDayPickedListener,
        PrimeMonthView.OnHeightDetectListener {

    override fun bindDataToView(dataHolder: MonthDataHolder) {
        with(itemView) {
            dataHolder.apply {
                monthView.onDayPickedListener = this@MonthViewHolder
                monthView.onHeightDetectListener = this@MonthViewHolder
                callback?.apply {
                    monthView.internalFontTypeface = fontTypeface
                    monthView.internalMinDateCalendar = minDateCalendar
                    monthView.internalMaxDateCalendar = maxDateCalendar
                    monthView.internalPickedSingleDayCalendar = pickedSingleDayCalendar
                    monthView.internalPickedStartRangeCalendar = pickedStartRangeCalendar
                    monthView.internalPickedEndRangeCalendar = pickedEndRangeCalendar
                    monthView.internalPickType = pickType
                }
                monthView.setDate(calendarType, year, month)
            }
        }
    }

    override fun onDayPicked(pickType: PickType, singleDay: BaseCalendar?, startDay: BaseCalendar?, endDay: BaseCalendar?) {
        callback?.onDayPicked(pickType, singleDay, startDay, endDay)
    }

    override fun onHeightDetect(height: Float) {
        callback?.onHeightDetect(height)
    }

}