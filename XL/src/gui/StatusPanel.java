package gui;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.WEST;

public class StatusPanel extends BorderPanel {
    protected StatusPanel(StatusLabel statusLabel, CurrentSlot cs, Controller c) {
        add(WEST, new CurrentLabel(cs, c));
        add(CENTER, statusLabel);
    }
}