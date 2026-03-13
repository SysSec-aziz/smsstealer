package com.vdodsodjsdt;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class FbuZzoqAiJLuQzTy extends pwZBKEudH0MwQ4P {
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FbuZzoqAiJLuQzTy(WorkDatabase workDatabase, int i) {
        super(workDatabase);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }

    @Override // com.vdodsodjsdt.pwZBKEudH0MwQ4P
    public final String V57tEvNfxZVVcOCAOih5PKr() {
        switch (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            case 0:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 1:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return "DELETE from WorkProgress where work_spec_id=?";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return "DELETE FROM WorkProgress";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case 9:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            case 10:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            case 11:
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            case 12:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            case 13:
                return "DELETE FROM workspec WHERE id=?";
            case 14:
                return "UPDATE workspec SET state=? WHERE id=?";
            case 15:
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            case 16:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            case 17:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 18:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            case 19:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            default:
                return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }
}
