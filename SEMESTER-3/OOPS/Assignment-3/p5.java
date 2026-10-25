class Sensor {
    int id;
    String location;
    String type;
    double value;

    Sensor(int i, String l, String t, double v) {
        id = i;
        location = l;
        type = t;
        value = v;
    }

    void display() {
        System.out.println("\nSensor ID: " + id);
        System.out.println("Location: " + location);
        System.out.println("Type: " + type);

        switch (type) {
            case "Temperature":
                System.out.println("Temperature: " + value + " °C");
                break;
            case "Humidity":
                System.out.println("Humidity: " + value + " %");
                break;
            case "PPM":
                System.out.println("PPM: " + value);
                break;
            case "AQI":
                System.out.println("AQI: " + (int)value);
                break;
        }
    }
}

public class p5 {
    public static void main(String[] args) {
        Sensor[] sensors = {
            new Sensor(101, "Room A", "Temperature", 28.5),
            new Sensor(102, "Room A", "Humidity", 65.2),
            new Sensor(103, "Lab", "PPM", 420.5),
            new Sensor(104, "Outdoor", "AQI", 85)
        };

        for (Sensor s : sensors)
            s.display();
    }
}