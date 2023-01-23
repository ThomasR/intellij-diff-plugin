/*
 Copyright 2023 Thomas Rosenau

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package de.thomasrosenau.diffplugin.highlighter;

import java.util.Map;
import javax.swing.*;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import de.thomasrosenau.diffplugin.DiffIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class DiffColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[] {
            new AttributesDescriptor("Changed lines//Inserted line", DiffSyntaxHighlighter.INSERTED),
            new AttributesDescriptor("Changed lines//Deleted line", DiffSyntaxHighlighter.DELETED),
            new AttributesDescriptor("Changed lines//Changed line", DiffSyntaxHighlighter.CHANGED),
            new AttributesDescriptor("Meta info//Console command", DiffSyntaxHighlighter.COMMAND),
            new AttributesDescriptor("Meta info//File names", DiffSyntaxHighlighter.FILE),
            new AttributesDescriptor("Meta info//Newline hint", DiffSyntaxHighlighter.EOL_HINT),
            new AttributesDescriptor("Hunk header", DiffSyntaxHighlighter.HUNK_HEAD),
            new AttributesDescriptor("Separator", DiffSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Text (default)", DiffSyntaxHighlighter.TEXT)};

    @Nullable
    @Override
    public Icon getIcon() {
        return DiffIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new DiffSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        // TODO: provide better example for multiple formats
        return """
                Only in lao: preamble
                diff -c lao/quote tzu/quote
                *** lao/quote\t2019-02-18 08:26:38.000000000 +0100
                --- tzu/quote\t2019-02-18 08:23:58.000000000 +0100
                ***************
                *** 1,7 ****
                - The Way that can be told of is not the eternal Way;
                - The name that can be named is not the eternal name.
                  The Nameless is the origin of Heaven and Earth;
                ! The Named is the mother of all things.
                  Therefore let there always be non-being,
                    so we may see their subtlety,
                  And let there always be being,
                --- 1,6 ----
                  The Nameless is the origin of Heaven and Earth;
                ! The named is the mother of all things.
                !
                  Therefore let there always be non-being,
                    so we may see their subtlety,
                  And let there always be being,
                ***************
                *** 9,11 ****
                --- 8,13 ----
                  The two are the same,
                  But after they are produced,
                    they have different names.
                + They both may be called deep and profound.
                + Deeper and more profound,
                + The door of all subtleties!
                Only in tzu: unquote
                \\ No newline at end of file
                """;
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return ".diff & .patch Files";
    }
}
