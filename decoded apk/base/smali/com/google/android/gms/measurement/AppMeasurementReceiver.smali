.class public final Lcom/google/android/gms/measurement/AppMeasurementReceiver;
.super Lc1/a;
.source ""

# interfaces
.implements Lc7/s5$a;


# instance fields
.field public j:Lc7/s5;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc1/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p1, p2}, Lc1/a;->c(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->j:Lc7/s5;

    if-nez v0, :cond_0

    new-instance v0, Lc7/s5;

    invoke-direct {v0, p0}, Lc7/s5;-><init>(Lc7/s5$a;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->j:Lc7/s5;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->j:Lc7/s5;

    invoke-virtual {v0, p1, p2}, Lc7/s5;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
