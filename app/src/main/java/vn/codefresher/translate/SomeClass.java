package vn.codefresher.translate;

import androidx.annotation.Nullable;

/**
 * Created by hungnm24 on 10/5/20
 * Copyright (c) {2020} VinID. All rights reserved.
 */

class SomeClass {
    int someVariable;
    @Override
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof SomeClass)
                && ((SomeClass)obj).someVariable == this.someVariable;
    }
}
