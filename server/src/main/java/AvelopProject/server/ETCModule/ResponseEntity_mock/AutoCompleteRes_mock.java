package AvelopProject.server.ETCModule.ResponseEntity_mock;

public class AutoCompleteRes_mock {
    private int example_count;
    private String[] examples;

    public AutoCompleteRes_mock() {
        this.example_count = 3;
        this.examples = new String[3];

        examples[0] = "example_1";
        examples[1] = "example_2";
        examples[2] = "example_3";
    }

    public int getExample_count() {
        return example_count;
    }

    public String[] getExamples() {
        return examples;
    }
}
