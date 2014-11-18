/*
 * Copyright 2014 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.impl.lazy.parallel.set;

import java.util.TreeSet;

import com.gs.collections.api.set.ParallelSetIterable;
import com.gs.collections.impl.lazy.parallel.AbstractUnsupportedParallelIterableTestCase;
import com.gs.collections.impl.set.sorted.mutable.SortedSetAdapter;
import com.gs.collections.impl.set.sorted.mutable.TreeSortedSet;

public class SortedSetAdapterParallelSetIterableTest extends AbstractUnsupportedParallelIterableTestCase
{
    @Override
    protected ParallelSetIterable<Integer> classUnderTest()
    {
        return SortedSetAdapter.adapt(new TreeSet<Integer>(TreeSortedSet.newSetWith(1, 2, 2, 3, 3, 3, 4, 4, 4, 4))).asParallel(this.executorService, 2);
    }
}