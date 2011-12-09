/*
 * Copyright 2009 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.handler.codec.serialization;

import java.util.concurrent.Executor;

import io.netty.channel.ChannelFactory;
import io.netty.channel.socket.nio.NioServerSocketChannelFactory;
import io.netty.channel.socket.oio.OioClientSocketChannelFactory;

/**
 * @author <a href="http://netty.io/">The Netty Project</a>
 * @author <a href="http://gleamynode.net/">Trustin Lee</a>
 */
public class OioNioSocketCompatibleObjectStreamEchoTest extends AbstractSocketCompatibleObjectStreamEchoTest {

    @Override
    protected ChannelFactory newClientSocketChannelFactory(Executor executor) {
        return new OioClientSocketChannelFactory(executor);
    }

    @Override
    protected ChannelFactory newServerSocketChannelFactory(Executor executor) {
        return new NioServerSocketChannelFactory(executor, executor);
    }

}