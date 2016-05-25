package se.learning.home.smarthomeandroidclient.interfaces;

import DTO.Schedule;

/**
 * Created by Alexander on 2016-04-28.
 */
public interface ScheduleObserver {
    //void getWholeSchedule(Schedule schedule);
    //void updateSchedule(ScheduledEvent newScheduledEvent);

    void updateSchedule(Schedule schedule);
}
