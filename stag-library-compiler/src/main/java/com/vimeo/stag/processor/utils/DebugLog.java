/*
 * The MIT License (MIT)
 * <p/>
 * Copyright (c) 2016 Vimeo
 * <p/>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p/>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.vimeo.stag.processor.utils;

import com.vimeo.stag.processor.StagProcessor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DebugLog {

    private static final String TAG = "Stag";

    private DebugLog() {
    }

    public static void log(@Nullable CharSequence message) {
        if (StagProcessor.DEBUG) {
            //noinspection UseOfSystemOutOrSystemErr
            System.out.println(TAG + ": " + message);
        }
    }

    public static void log(@NotNull CharSequence tag, @Nullable CharSequence message) {
        if (StagProcessor.DEBUG) {
            //noinspection UseOfSystemOutOrSystemErr
            System.out.println(TAG + ":" + tag + ": " + message);
        }
    }

}
