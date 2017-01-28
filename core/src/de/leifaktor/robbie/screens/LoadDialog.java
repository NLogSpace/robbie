package de.leifaktor.robbie.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.TextInputListener;
import com.badlogic.gdx.files.FileHandle;

import de.leifaktor.robbie.io.IO;

public class LoadDialog implements TextInputListener {
    
    EditorSelectionData data;
  
    public LoadDialog(EditorSelectionData data) {
        this.data = data;
    }
    
    @Override
    public void input(String text) {
        FileHandle file = Gdx.files.local(text);
        data.episode = IO.load(file);
    }

    @Override
    public void canceled () {
        
    }

 }
