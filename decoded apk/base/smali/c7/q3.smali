.class public final synthetic Lc7/q3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc7/k4;


# static fields
.field public static final synthetic a:Lc7/q3;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lc7/q3;

    invoke-direct {v0}, Lc7/q3;-><init>()V

    sput-object v0, Lc7/q3;->a:Lc7/q3;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpu;->zza()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
