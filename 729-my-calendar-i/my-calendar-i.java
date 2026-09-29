class MyCalendar {

    List<int[]> bookings;

    public MyCalendar() {
        bookings = new ArrayList<>();
    }

    public boolean book(int start, int end) {

        for (int[] event : bookings) {

            int s = event[0];
            int e = event[1];

            if (start < e && end > s) {
                return false;
            }
        }

        bookings.add(new int[]{start, end});
        return true;
    }
}
/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */