.class public final Lc7/va;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/ra;


# direct methods
.method public constructor <init>(Lc7/ra;)V
    .locals 0

    iput-object p1, p0, Lc7/va;->h:Lc7/ra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc7/va;->h:Lc7/ra;

    iget-object v0, v0, Lc7/ra;->j:Lc7/y9;

    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, p0, Lc7/va;->h:Lc7/ra;

    iget-object v2, v2, Lc7/ra;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v2

    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lc7/y9;->D(Lc7/y9;Landroid/content/ComponentName;)V

    return-void
.end method
