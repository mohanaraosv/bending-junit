package com.pholser.junit;

import java.io.File;

import com.pholser.junit.categories.InvolvingRules;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.*;

public class TempFolderDemo {
    @Rule public final TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    @Category(InvolvingRules.class)
    public void makeSomeFiles() throws Exception {
        File folder = tempFolder.newFolder("aFolder");
        File file = tempFolder.newFile("aFile");

        assertEquals(tempFolder.getRoot(), folder.getParentFile());
        assertEquals(tempFolder.getRoot(), file.getParentFile());
    }
}
