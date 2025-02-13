package io.libp2p.core

import io.netty.channel.Channel

/**
 * A Connection is a high-level wrapper around a Netty Channel representing the conduit to a peer.
 *
 * It exposes libp2p components and semantics via methods and properties.
 */
data class Connection(val ch: Channel) {
    val muxerSession by lazy { ch.attr(MUXER_SESSION) }
    val secureSession by lazy { ch.attr(SECURE_SESSION) }
}
