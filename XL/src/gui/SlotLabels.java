package gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;

import model.Sheet;

public class SlotLabels extends GridPanel {
	private CurrentSlot currentSlot;
    private Sheet sheet;
    

    private List<SlotLabel> labelList;

    public SlotLabels(int rows, int cols, CurrentSlot currentSlot, Sheet sheet) {
        super(rows + 1, cols);
        this.currentSlot = currentSlot;
        this.sheet = sheet;
        labelList = new ArrayList<SlotLabel>(rows * cols);
        for (char ch = 'A'; ch < 'A' + cols; ch++) {
            add(new ColoredLabel(Character.toString(ch), Color.LIGHT_GRAY,
                    SwingConstants.CENTER));
        }
        for (int row = 1; row <= rows; row++) {
            for (char ch = 'A'; ch < 'A' + cols; ch++) {
            	StringBuilder sb = new StringBuilder();
            	sb.append(ch);
            	sb.append(row);
            	String slotName = sb.toString();
                SlotLabel label = new SlotLabel(slotName, currentSlot, sheet);
                add(label);
                labelList.add(label);
            }
        }
        SlotLabel firstLabel = labelList.get(0);
        firstLabel.setBackground(Color.YELLOW);
    }
}
