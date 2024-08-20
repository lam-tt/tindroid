package com.gfs.messenger.db;

import com.gfs.chatsdk.LocalData;
import com.gfs.chatsdk.model.Subscription;

/**
 * Subscription record
 */
public class StoredSubscription implements LocalData.Payload {
    public long id;
    public long topicId;
    public long userId;
    public BaseDb.Status status;

    public static long getId(Subscription sub) {
        StoredSubscription ss = (StoredSubscription) sub.getLocal();
        return ss == null ? -1 : ss.id;
    }
}
