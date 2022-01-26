package com.github.msemys.esjc.node.cluster;

public enum VNodeState {
    Initializing,
    Unknown,
    PreReplica,
    CatchingUp,
    Clone,
    Slave,
    Follower,
    PreMaster,
    PreLeader,
    Master,
    Leader,
    Manager,
    ShuttingDown,
    Shutdown
}
