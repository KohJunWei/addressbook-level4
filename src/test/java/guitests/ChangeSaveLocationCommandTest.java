package guitests;

import static seedu.taskmanager.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import org.junit.Test;

import seedu.taskmanager.commons.core.Messages;
import seedu.taskmanager.logic.commands.ChangeSaveLocationCommand;

public class ChangeSaveLocationCommandTest extends TaskManagerGuiTest {

    public static final String INVALID_SAVE_LOCATION = "Invalid input for save location";
/*
    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder();

    private String temporaryFilePath = "";

    @Before
    public void setUp() {
        temporaryFilePath = testFolder.getRoot().getPath();
    }
*/
    // @@author A0142418L
    @Test
    public void changeSaveLocationInvalidCommand() {
        commandBox.runCommand("SAVEdata");
        assertResultMessage(Messages.MESSAGE_UNKNOWN_COMMAND);
    }

    @Test
    public void changeSaveLocationInvalidSaveLocation() {
        commandBox.runCommand("SAVE hello");
        assertResultMessage(INVALID_SAVE_LOCATION + "\n" + ChangeSaveLocationCommand.MESSAGE_USAGE);
    }

    @Test
    public void changeSaveLocationInvalidCommandFormat() {
        commandBox.runCommand("SAVE");
        assertResultMessage(String.format(MESSAGE_INVALID_COMMAND_FORMAT, ChangeSaveLocationCommand.MESSAGE_USAGE));
    }
/*
    @Test
    public void changeSaveLocationValidSaveLocation() {
        String temporaryFilePath = "C:\\Users\\Alvin Loh\\Documents\\NUS Sem 4\\CS2103\\Project\\main\\src\\test\\data"
                + "\\XmlTaskManagerStorageTest";
        commandBox.runCommand("SAVE " + temporaryFilePath);
        String fileLocation = "Save location changed to: " + temporaryFilePath + "\\" + "taskmanager.xml";
        assertResultMessage(fileLocation);
        assertEquals(temporaryFilePath + "\\" + "taskmanager.xml", XmlTaskManagerStorage.giveTaskManagerFilePath());
        commandBox.runCommand("SAVE data");
    }
*/
}
