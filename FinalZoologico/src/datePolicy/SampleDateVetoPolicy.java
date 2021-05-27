package datePolicy;

import com.github.lgooddatepicker.optionalusertools.DateVetoPolicy;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

/**
     * SampleDateVetoPolicy, A veto policy is a way to disallow certain dates
     * from being selected in calendar. A vetoed date cannot be selected by
     * using the keyboard or the mouse.
     */
    public class SampleDateVetoPolicy implements DateVetoPolicy {

       List<DayOfWeek> dias;
       public SampleDateVetoPolicy(List<DayOfWeek> dias){
           this.dias = dias;
       }
        
        /**
         * isDateAllowed, Return true if a date should be allowed, or false if a
         * date should be vetoed.
         */
        @Override
        public boolean isDateAllowed(LocalDate date) {
            for (DayOfWeek dia : dias) {
                if (date.getDayOfWeek() == dia) {
                    return false;
                }
            }
//            // Disallow days 7 to 11.
//            if ((date.getDayOfMonth() >= 7) && (date.getDayOfMonth() <= 11)) {
//                return false;
//            }
//            // Disallow odd numbered saturdays.
//            if ((date.getDayOfWeek() == DayOfWeek.SATURDAY) && ((date.getDayOfMonth() % 2) == 1)) {
//                return false;
//            }
            // Allow all other days.
            return true;
        }
    }
    