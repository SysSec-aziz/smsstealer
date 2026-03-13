package com.vdodsodjsdt;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class S28Az6EscEakl8kzvM {
    public final WorkDatabase_Impl VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public S28Az6EscEakl8kzvM(WorkDatabase_Impl workDatabase_Impl, int i) {
        switch (i) {
            case 1:
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = workDatabase_Impl;
                break;
            default:
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = workDatabase_Impl;
                new xR0ZoYA1SdIBIre5oWm06m(workDatabase_Impl, 3);
                break;
        }
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58pl) {
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    public static xEETVD81ziRcL5BcSKUT7ajvxHmaB zzpBGItXfub0yWj(Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58pl) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new CnMoxC4NJwQrPljLd("work_spec_id", "TEXT", true, 1, null, 1));
        map.put("prerequisite_id", new CnMoxC4NJwQrPljLd("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new tlSvsGyHU88("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new tlSvsGyHU88("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new dz5NyGIwqDW6k3gnpAoL("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new dz5NyGIwqDW6k3gnpAoL("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8b = new lpiLuUvtGbMB3plSx8b("Dependency", map, hashSet, hashSet2);
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m = lpiLuUvtGbMB3plSx8b.VxUQ9tBhpHJ2AAEDNW8sghc4m(um0z2cMcEZpu6blUyqa58pl, "Dependency");
        if (!lpiluuvtgbmb3plsx8b.equals(lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m)) {
            return new xEETVD81ziRcL5BcSKUT7ajvxHmaB("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + lpiluuvtgbmb3plsx8b + "\n Found:\n" + lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m, false);
        }
        HashMap map2 = new HashMap(32);
        map2.put("id", new CnMoxC4NJwQrPljLd("id", "TEXT", true, 1, null, 1));
        map2.put("state", new CnMoxC4NJwQrPljLd("state", "INTEGER", true, 0, null, 1));
        map2.put("worker_class_name", new CnMoxC4NJwQrPljLd("worker_class_name", "TEXT", true, 0, null, 1));
        map2.put("input_merger_class_name", new CnMoxC4NJwQrPljLd("input_merger_class_name", "TEXT", true, 0, null, 1));
        map2.put("input", new CnMoxC4NJwQrPljLd("input", "BLOB", true, 0, null, 1));
        map2.put("output", new CnMoxC4NJwQrPljLd("output", "BLOB", true, 0, null, 1));
        map2.put("initial_delay", new CnMoxC4NJwQrPljLd("initial_delay", "INTEGER", true, 0, null, 1));
        map2.put("interval_duration", new CnMoxC4NJwQrPljLd("interval_duration", "INTEGER", true, 0, null, 1));
        map2.put("flex_duration", new CnMoxC4NJwQrPljLd("flex_duration", "INTEGER", true, 0, null, 1));
        map2.put("run_attempt_count", new CnMoxC4NJwQrPljLd("run_attempt_count", "INTEGER", true, 0, null, 1));
        map2.put("backoff_policy", new CnMoxC4NJwQrPljLd("backoff_policy", "INTEGER", true, 0, null, 1));
        map2.put("backoff_delay_duration", new CnMoxC4NJwQrPljLd("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        map2.put("last_enqueue_time", new CnMoxC4NJwQrPljLd("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        map2.put("minimum_retention_duration", new CnMoxC4NJwQrPljLd("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        map2.put("schedule_requested_at", new CnMoxC4NJwQrPljLd("schedule_requested_at", "INTEGER", true, 0, null, 1));
        map2.put("run_in_foreground", new CnMoxC4NJwQrPljLd("run_in_foreground", "INTEGER", true, 0, null, 1));
        map2.put("out_of_quota_policy", new CnMoxC4NJwQrPljLd("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        map2.put("period_count", new CnMoxC4NJwQrPljLd("period_count", "INTEGER", true, 0, "0", 1));
        map2.put("generation", new CnMoxC4NJwQrPljLd("generation", "INTEGER", true, 0, "0", 1));
        map2.put("next_schedule_time_override", new CnMoxC4NJwQrPljLd("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        map2.put("next_schedule_time_override_generation", new CnMoxC4NJwQrPljLd("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        map2.put("stop_reason", new CnMoxC4NJwQrPljLd("stop_reason", "INTEGER", true, 0, "-256", 1));
        map2.put("trace_tag", new CnMoxC4NJwQrPljLd("trace_tag", "TEXT", false, 0, null, 1));
        map2.put("required_network_type", new CnMoxC4NJwQrPljLd("required_network_type", "INTEGER", true, 0, null, 1));
        map2.put("required_network_request", new CnMoxC4NJwQrPljLd("required_network_request", "BLOB", true, 0, "x''", 1));
        map2.put("requires_charging", new CnMoxC4NJwQrPljLd("requires_charging", "INTEGER", true, 0, null, 1));
        map2.put("requires_device_idle", new CnMoxC4NJwQrPljLd("requires_device_idle", "INTEGER", true, 0, null, 1));
        map2.put("requires_battery_not_low", new CnMoxC4NJwQrPljLd("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        map2.put("requires_storage_not_low", new CnMoxC4NJwQrPljLd("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        map2.put("trigger_content_update_delay", new CnMoxC4NJwQrPljLd("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        map2.put("trigger_max_content_delay", new CnMoxC4NJwQrPljLd("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        map2.put("content_uri_triggers", new CnMoxC4NJwQrPljLd("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new dz5NyGIwqDW6k3gnpAoL("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new dz5NyGIwqDW6k3gnpAoL("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8b2 = new lpiLuUvtGbMB3plSx8b("WorkSpec", map2, hashSet3, hashSet4);
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m2 = lpiLuUvtGbMB3plSx8b.VxUQ9tBhpHJ2AAEDNW8sghc4m(um0z2cMcEZpu6blUyqa58pl, "WorkSpec");
        if (!lpiluuvtgbmb3plsx8b2.equals(lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m2)) {
            return new xEETVD81ziRcL5BcSKUT7ajvxHmaB("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + lpiluuvtgbmb3plsx8b2 + "\n Found:\n" + lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m2, false);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new CnMoxC4NJwQrPljLd("tag", "TEXT", true, 1, null, 1));
        map3.put("work_spec_id", new CnMoxC4NJwQrPljLd("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new tlSvsGyHU88("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new dz5NyGIwqDW6k3gnpAoL("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8b3 = new lpiLuUvtGbMB3plSx8b("WorkTag", map3, hashSet5, hashSet6);
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m3 = lpiLuUvtGbMB3plSx8b.VxUQ9tBhpHJ2AAEDNW8sghc4m(um0z2cMcEZpu6blUyqa58pl, "WorkTag");
        if (!lpiluuvtgbmb3plsx8b3.equals(lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m3)) {
            return new xEETVD81ziRcL5BcSKUT7ajvxHmaB("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + lpiluuvtgbmb3plsx8b3 + "\n Found:\n" + lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m3, false);
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new CnMoxC4NJwQrPljLd("work_spec_id", "TEXT", true, 1, null, 1));
        map4.put("generation", new CnMoxC4NJwQrPljLd("generation", "INTEGER", true, 2, "0", 1));
        map4.put("system_id", new CnMoxC4NJwQrPljLd("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new tlSvsGyHU88("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8b4 = new lpiLuUvtGbMB3plSx8b("SystemIdInfo", map4, hashSet7, new HashSet(0));
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m4 = lpiLuUvtGbMB3plSx8b.VxUQ9tBhpHJ2AAEDNW8sghc4m(um0z2cMcEZpu6blUyqa58pl, "SystemIdInfo");
        if (!lpiluuvtgbmb3plsx8b4.equals(lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m4)) {
            return new xEETVD81ziRcL5BcSKUT7ajvxHmaB("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + lpiluuvtgbmb3plsx8b4 + "\n Found:\n" + lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m4, false);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new CnMoxC4NJwQrPljLd("name", "TEXT", true, 1, null, 1));
        map5.put("work_spec_id", new CnMoxC4NJwQrPljLd("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new tlSvsGyHU88("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new dz5NyGIwqDW6k3gnpAoL("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8b5 = new lpiLuUvtGbMB3plSx8b("WorkName", map5, hashSet8, hashSet9);
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m5 = lpiLuUvtGbMB3plSx8b.VxUQ9tBhpHJ2AAEDNW8sghc4m(um0z2cMcEZpu6blUyqa58pl, "WorkName");
        if (!lpiluuvtgbmb3plsx8b5.equals(lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m5)) {
            return new xEETVD81ziRcL5BcSKUT7ajvxHmaB("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + lpiluuvtgbmb3plsx8b5 + "\n Found:\n" + lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m5, false);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new CnMoxC4NJwQrPljLd("work_spec_id", "TEXT", true, 1, null, 1));
        map6.put("progress", new CnMoxC4NJwQrPljLd("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new tlSvsGyHU88("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8b6 = new lpiLuUvtGbMB3plSx8b("WorkProgress", map6, hashSet10, new HashSet(0));
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m6 = lpiLuUvtGbMB3plSx8b.VxUQ9tBhpHJ2AAEDNW8sghc4m(um0z2cMcEZpu6blUyqa58pl, "WorkProgress");
        if (!lpiluuvtgbmb3plsx8b6.equals(lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m6)) {
            return new xEETVD81ziRcL5BcSKUT7ajvxHmaB("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + lpiluuvtgbmb3plsx8b6 + "\n Found:\n" + lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m6, false);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new CnMoxC4NJwQrPljLd("key", "TEXT", true, 1, null, 1));
        map7.put("long_value", new CnMoxC4NJwQrPljLd("long_value", "INTEGER", false, 0, null, 1));
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8b7 = new lpiLuUvtGbMB3plSx8b("Preference", map7, new HashSet(0), new HashSet(0));
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m7 = lpiLuUvtGbMB3plSx8b.VxUQ9tBhpHJ2AAEDNW8sghc4m(um0z2cMcEZpu6blUyqa58pl, "Preference");
        if (lpiluuvtgbmb3plsx8b7.equals(lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m7)) {
            return new xEETVD81ziRcL5BcSKUT7ajvxHmaB((String) null, true);
        }
        return new xEETVD81ziRcL5BcSKUT7ajvxHmaB("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + lpiluuvtgbmb3plsx8b7 + "\n Found:\n" + lpiluuvtgbmb3plsx8bVxUQ9tBhpHJ2AAEDNW8sghc4m7, false);
    }
}
