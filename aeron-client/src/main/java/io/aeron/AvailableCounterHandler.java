/*
 * Copyright 2014-2019 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.aeron;

import org.agrona.concurrent.status.CountersReader;

/**
 * Interface for notification of{@link Counter}s becoming available via a {@link Aeron} client.
 */
@FunctionalInterface
public interface AvailableCounterHandler
{
    /**
     * Method called by Aeron to deliver notification of a {@link Counter} being available.
     *
     * @param countersReader for more detail on the counter.
     * @param registrationId for the counter.
     * @param counterId      that is available.
     */
    void onAvailableCounter(CountersReader countersReader, long registrationId, int counterId);
}
