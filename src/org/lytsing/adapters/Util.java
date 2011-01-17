/*
 * Copyright (C) 2010 lytsing.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lytsing.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Util 
 *
 */
public class Util {

    private Util() {
    }
    
    /**
     * Inflate a new view hierarchy from the specified XML resource.
     * 
     * @param resource ID for an XML layout resource to load (e.g.,
     *        <code>R.layout.asset_info_section_header</code>)
     * @param context The current context.
     * @return The root View of the inflated XML file.
     */
    public static View inflateView(int resource, Context context) {

        return inflateView(resource, context, null);
    }

    /**
     * Inflate a new view hierarchy from the specified xml resource.
     * 
     * @param resourceID for an XML layout resource to load (e.g.,
     * @param context The current context.
     * @param parent simply an object that provides a set of LayoutParams
     *        values for root of the returned hierarchy
     * @return The root View of the inflated XML file.
     */
    public static View inflateView(int resource, Context context, ViewGroup parent) {
        LayoutInflater vi = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        return  vi.inflate(resource, parent, false);
    }
}

