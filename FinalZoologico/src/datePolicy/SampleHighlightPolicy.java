package datePolicy;


import com.github.lgooddatepicker.optionalusertools.DateHighlightPolicy;
import com.github.lgooddatepicker.zinternaltools.HighlightInformation;
import java.awt.Color;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

/**
     * SampleHighlightPolicy, A highlight policy is a way to visually highlight
     * certain dates in the calendar. These may be holidays, or weekends, or
     * other significant dates.
     */
    public class SampleHighlightPolicy implements DateHighlightPolicy {

        List<DayOfWeek> days;
        public SampleHighlightPolicy(List<DayOfWeek> days){
            this.days = days;
        }
        
        /**
         * getHighlightInformationOrNull, Implement this function to indicate if
         * a date should be highlighted, and what highlighting details should be
         * used for the highlighted date.
         *
         * If a date should be highlighted, then return an instance of
         * HighlightInformation. If the date should not be highlighted, then
         * return null.
         *
         * You may (optionally) fill out the fields in the HighlightInformation
         * class to give any particular highlighted day a unique foreground
         * color, background color, or tooltip text. If the color fields are
         * null, then the default highlighting colors will be used. If the
         * tooltip field is null (or empty), then no tooltip will be displayed.
         *
         * Dates that are passed to this function will never be null.
         */
        @Override
        public HighlightInformation getHighlightInformationOrNull(LocalDate date) {
            // Highlight a chosen date, with a tooltip and a red background color.
//            if (date.getDayOfMonth() == 25) {
//                return new HighlightInformation(Color.red, null, "It's the 25th!");
//            }
            
            for (DayOfWeek day : days) {
                if (date.getDayOfWeek() == day) {
                    return new HighlightInformation(null, null, "It's Sunday!");
                }
            }
//            // Highlight all Saturdays with a unique background and foreground color.
//            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
//                return new HighlightInformation(Color.orange, Color.yellow, "It's Saturday!");
//            }
//            // Highlight all Sundays with default colors and a tooltip.
//            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
//                return new HighlightInformation(null, null, "It's Sunday!");
//            }
            // All other days should not be highlighted.
            return null;
        }
    }