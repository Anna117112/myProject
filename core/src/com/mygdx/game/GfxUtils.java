package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class GfxUtils {
    public static Vector2 getPosition() {

        float x = Gdx.input.getX()-120;
       float y =(Gdx.graphics.getHeight()-Gdx.input.getY())-120;
       // float y =Gdx.graphics.getHeight()-300;
        return  new Vector2(x,y);

    }
}
