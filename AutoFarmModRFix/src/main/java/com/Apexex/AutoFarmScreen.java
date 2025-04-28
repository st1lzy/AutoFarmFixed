package com.Apexex;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.text.LiteralText;

public class AutoFarmScreen extends Screen {

    protected AutoFarmScreen() {
        super(new LiteralText("AutoFarm Настройки"));
    }

    @Override
    protected void init() {
        this.addDrawableChild(new ButtonWidget(
                this.width / 2 - 50,
                this.height / 2 - 10,
                100,
                20,
                new LiteralText("Закрыть"),
                button -> this.close()
        ));
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
