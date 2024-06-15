package lonnwolf031.textedit.gui.mediator;

import lonnwolf031.textedit.gui.components.MainController;
import lonnwolf031.textedit.gui.TabSpace;
import lonnwolf031.textedit.gui.components.FindReplaceToolBar;
import lonnwolf031.textedit.gui.components.MainMenuBar;

import java.nio.file.Path;
import java.util.List;

public interface IMediator {

    void setMenuBar(MainMenuBar mainMenuBar);
    void setTabSpaces(List<TabSpace> tabSpaces);
    void setMainController(MainController mainController);
    void setFindReplaceToolBar(FindReplaceToolBar findReplaceToolBar);

    String getText();
    Path getFilePath();
    boolean isFileSaved();
    boolean shouldExit();
    boolean isMatchCase();
    Mediator.EventBuilder getEventBuilder();

    String getMediatorText();
    Path getMediatorFilePath();

}