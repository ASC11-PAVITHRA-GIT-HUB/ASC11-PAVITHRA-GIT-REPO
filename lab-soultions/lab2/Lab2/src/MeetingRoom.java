public class MeetingRoom {
    String roomId;
    int capacity;
    int floor;

    public MeetingRoom(String roomId, int capacity, int floor) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floor = floor;
    }

    public void Display_detailes() {
        System.out.println("RoomId: " + roomId + ",Capacity: " + capacity + ",Floor: " + floor);
    }
}
    class zoomMeeting extends MeetingRoom{
    String zoomMettingId ;
    String zoomAccountId;
    public zoomMeeting(String roomId,int capacity,int floor,String zoomMettingId,String zoomAccountId){
        super(roomId,capacity,floor);
        this.zoomMettingId=zoomMettingId;
        this.zoomAccountId =zoomAccountId;
    }
    @Override
    public void Display_detailes(){
        super.Display_detailes();
        System.out.println("Zoom Device Id: "+ zoomMettingId + " Zoom Account Id "+ zoomAccountId);
    }
}
class Booking{
    String employeeId;
    String roomId;
    String date;
    String time;
    int duration;
    public Booking(String employeeId,String roomId, String date,String time, int duration){
        this.employeeId=employeeId;
        this.roomId = roomId;
        this.date = date;
        this.time=time;
        this.duration=duration;
    }
    public void Display_detailes(){
        System.out.println("Employee Id: "+ employeeId + ", Room Id "+ roomId + ", Date:"+ date + ", Time :"+ time + ", Duartion:"+ duration+ " minus");
    }
}
class MeetingRoomManager{
    MeetingRoom[] rooms = new MeetingRoom[10];
    Booking[] bookings  = new Booking[50];
    int roomCount =0;
    int bookingCount= 0;
    public void addRoom(MeetingRoom room){
        if(roomCount<rooms.length){
            rooms[roomCount++]=room;
        }
    }
    public void bookRoom(String employeeId,String roomId,String date,String time,int duration){
        if(bookingCount<bookings.length){
            bookings[bookingCount++]=new Booking(employeeId,roomId,date,time,duration);
        }
    }
    public void showBookingByDate(String date){
        System.out.println("Bookings on " +date +":");
        for(int i=0;i<bookingCount;i++){
            if(bookings[i].date.equals(date)){
                bookings[i].Display_detailes();
            }
        }
    }
}
 class Main{
    public static void main(String[] args) {
        MeetingRoomManager manger = new MeetingRoomManager();
        manger.addRoom(new MeetingRoom("PA01",10,1));
        manger.addRoom(new MeetingRoom("SA01",20,20));
        manger.bookRoom("E01","PA01","2025-07-20","10:00",60);
        manger.bookRoom("E02","PA01","2025-07-22","10:00",30);
        manger.bookRoom("E03","SA01","2025-07-20","12:00",60);
        manger.bookRoom("E02","SA01","2025-07-20","11:00",60);
        manger.showBookingByDate("2025-07-20");

    }
}

