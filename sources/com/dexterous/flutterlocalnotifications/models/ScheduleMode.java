package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
import com.google.gson.AbstractC1374j;
import com.google.gson.InterfaceC1306h;
import com.google.gson.InterfaceC1307i;
import java.lang.reflect.Type;

@Keep
/* loaded from: classes.dex */
public enum ScheduleMode {
    alarmClock,
    exact,
    exactAllowWhileIdle,
    inexact,
    inexactAllowWhileIdle;

    /* loaded from: classes.dex */
    public static class Deserializer implements InterfaceC1307i<ScheduleMode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.InterfaceC1307i
        public ScheduleMode deserialize(AbstractC1374j abstractC1374j, Type type, InterfaceC1306h interfaceC1306h) {
            try {
                return ScheduleMode.valueOf(abstractC1374j.mo5621e());
            } catch (Exception unused) {
                return abstractC1374j.mo5620a() ? ScheduleMode.exactAllowWhileIdle : ScheduleMode.exact;
            }
        }
    }

    public boolean useAlarmClock() {
        return this == alarmClock;
    }

    public boolean useAllowWhileIdle() {
        return this == exactAllowWhileIdle || this == inexactAllowWhileIdle;
    }

    public boolean useExactAlarm() {
        return this == exact || this == exactAllowWhileIdle;
    }
}
