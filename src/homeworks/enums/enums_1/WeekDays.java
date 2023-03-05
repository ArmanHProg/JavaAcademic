package homeworks.enums.enums_1;

public enum WeekDays {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public static int getDayNumber(WeekDays day){
        switch (day){
            case SUNDAY:
                return 1;
            case MONDAY:
                return 2;
            case TUESDAY:
                return 3;
            case WEDNESDAY:
                return 4;
            case THURSDAY:
                return 5;
            case FRIDAY:
                return 6;
            case SATURDAY:
                return 7;
            }
        return 0;
    }

    }

