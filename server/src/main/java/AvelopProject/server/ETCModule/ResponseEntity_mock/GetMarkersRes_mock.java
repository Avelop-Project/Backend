package AvelopProject.server.ETCModule.ResponseEntity_mock;

public class GetMarkersRes_mock {
    private int marker_count;
    private String[] markers;

    public GetMarkersRes_mock() {
        this.marker_count = 3;
        this.markers = new String[3];

        markers[0] = "marker_1";
        markers[1] = "marker_2";
        markers[2] = "marker_3";
    }

    public int getMarker_count() {
        return marker_count;
    }

    public String[] getMarkers() {
        return markers;
    }
}
