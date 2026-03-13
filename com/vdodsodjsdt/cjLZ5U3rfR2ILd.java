package com.vdodsodjsdt;

import android.content.ContentValues;
import android.text.TextUtils;
import androidx.work.OverwritingInputMerger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class cjLZ5U3rfR2ILd extends SsiwtF6NFC0P {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public static final cjLZ5U3rfR2ILd ZfQNn8hdWlEQ5cR94249PDsLR = new cjLZ5U3rfR2ILd(11, 12, 0);
    public static final cjLZ5U3rfR2ILd LaeGQIruHQu81hfJldjMOQSVblH3x = new cjLZ5U3rfR2ILd(12, 13, 1);
    public static final cjLZ5U3rfR2ILd zIvmSL0wzmmKGc3X39b2Gw2mUGE = new cjLZ5U3rfR2ILd(15, 16, 2);
    public static final cjLZ5U3rfR2ILd ZLZeBXTMq0zDztBxtRTuCHrapQ = new cjLZ5U3rfR2ILd(16, 17, 3);
    public static final cjLZ5U3rfR2ILd NSjgqmGjEzuugn2SsG1mZFP = new cjLZ5U3rfR2ILd(1, 2, 4);
    public static final cjLZ5U3rfR2ILd GI83zq0G8e7zkn = new cjLZ5U3rfR2ILd(3, 4, 5);
    public static final cjLZ5U3rfR2ILd M9e7PWhFYLD2lOGMker = new cjLZ5U3rfR2ILd(4, 5, 6);
    public static final cjLZ5U3rfR2ILd HzCpKshMOoaw76hFcbOVRYMeRd = new cjLZ5U3rfR2ILd(6, 7, 7);
    public static final cjLZ5U3rfR2ILd KUYypEB4eNWOZWVDpH = new cjLZ5U3rfR2ILd(7, 8, 8);
    public static final cjLZ5U3rfR2ILd q1wNbhk2O6 = new cjLZ5U3rfR2ILd(8, 9, 9);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cjLZ5U3rfR2ILd(int i, int i2, int i3) {
        super(i, i2);
        this.V57tEvNfxZVVcOCAOih5PKr = i3;
    }

    @Override // com.vdodsodjsdt.SsiwtF6NFC0P
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58pl) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("DROP TABLE `SystemIdInfo`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH(cOlXApCgdZbIeiSW0kkEbYYt6zIn.wR7sbzHKf9hYV1lxoS6nqyszepWvN("UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                "));
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("DROP TABLE `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("DROP TABLE IF EXISTS alarmInfo");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                return;
            case 9:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            case 10:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("DROP TABLE `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                return;
            case 11:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("DROP TABLE `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                Object[] objArr = new Object[0];
                um0z2cMcEZpu6blUyqa58pl.getClass();
                if (contentValues.size() == 0) {
                    throw new IllegalArgumentException("Empty values");
                }
                int size = contentValues.size();
                int length = objArr.length + size;
                Object[] objArr2 = new Object[length];
                StringBuilder sb = new StringBuilder("UPDATE ");
                sb.append(Um0z2cMcEZpu6blUyqa58pl.ZfQNn8hdWlEQ5cR94249PDsLR[3]);
                sb.append("WorkSpec SET ");
                int i = 0;
                for (String str : contentValues.keySet()) {
                    sb.append(i > 0 ? "," : "");
                    sb.append(str);
                    objArr2[i] = contentValues.get(str);
                    sb.append("=?");
                    i++;
                }
                for (int i2 = size; i2 < length; i2++) {
                    objArr2[i2] = objArr[i2 - size];
                }
                if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                    sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                }
                String string = sb.toString();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "StringBuilder().apply(builderAction).toString()");
                cGYUoKJ5QrSVTXdZE1f88VdPb3 cgyuokj5qrsvtxdze1f88vdpb3LaeGQIruHQu81hfJldjMOQSVblH3x = um0z2cMcEZpu6blUyqa58pl.LaeGQIruHQu81hfJldjMOQSVblH3x(string);
                hRrPPME7ytOB7ba.zzpBGItXfub0yWj(cgyuokj5qrsvtxdze1f88vdpb3LaeGQIruHQu81hfJldjMOQSVblH3x, objArr2);
                cgyuokj5qrsvtxdze1f88vdpb3LaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR.executeUpdateDelete();
                return;
            case 12:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("DROP TABLE `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                return;
            case 13:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
                return;
            case 14:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
                return;
            case 15:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("DROP TABLE `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                return;
            case 16:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
                return;
            default:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjLZ5U3rfR2ILd(int i) {
        super(14, 15);
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        switch (i) {
            case 15:
                super(19, 20);
                break;
            default:
                break;
        }
    }
}
