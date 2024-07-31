.class public final Lc7/a6;
.super Lu/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lu/e<",
        "Ljava/lang/String;",
        "Lcom/google/android/gms/internal/measurement/zzb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lc7/u5;


# direct methods
.method public constructor <init>(Lc7/u5;I)V
    .locals 0

    iput-object p1, p0, Lc7/a6;->a:Lc7/u5;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, Lu/e;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final synthetic create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lc7/a6;->a:Lc7/u5;

    invoke-static {v0, p1}, Lc7/u5;->w(Lc7/u5;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzb;

    move-result-object p1

    return-object p1
.end method
