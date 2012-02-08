/*
 * Copyright 2011 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.channel;

/**
 * The {@link CompleteChannelFuture} which is succeeded already.  It is
 * recommended to use {@link Channels#succeededFuture(Channel)} instead of
 * calling the constructor of this future.
 */
public class SucceededChannelFuture extends CompleteChannelFuture {

    /**
     * Creates a new instance.
     *
     * @param channel the {@link Channel} associated with this future
     */
    public SucceededChannelFuture(Channel channel) {
        super(channel);
    }

    @Override
    public Throwable getCause() {
        return null;
    }

    @Override
    public boolean isSuccess() {
        return true;
    }

    @Override
    public ChannelFuture rethrowIfFailed() throws Exception {
        return this;
    }
}