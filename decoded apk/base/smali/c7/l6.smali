.class public final Lc7/l6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/u7;

.field public final synthetic i:Lc7/k6;


# direct methods
.method public constructor <init>(Lc7/k6;Lc7/u7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/l6;->h:Lc7/u7;

    iput-object p1, p0, Lc7/l6;->i:Lc7/k6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc7/l6;->i:Lc7/k6;

    iget-object v1, p0, Lc7/l6;->h:Lc7/u7;

    invoke-static {v0, v1}, Lc7/k6;->c(Lc7/k6;Lc7/u7;)V

    iget-object v0, p0, Lc7/l6;->i:Lc7/k6;

    iget-object v1, p0, Lc7/l6;->h:Lc7/u7;

    iget-object v1, v1, Lc7/u7;->g:Lcom/google/android/gms/internal/measurement/zzdd;

    invoke-virtual {v0, v1}, Lc7/k6;->f(Lcom/google/android/gms/internal/measurement/zzdd;)V

    return-void
.end method
