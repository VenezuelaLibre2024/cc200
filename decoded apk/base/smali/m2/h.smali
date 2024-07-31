.class public Lm2/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public h:Ld2/i;

.field public i:Ljava/lang/String;

.field public j:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Ld2/i;Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/h;->h:Ld2/i;

    iput-object p2, p0, Lm2/h;->i:Ljava/lang/String;

    iput-object p3, p0, Lm2/h;->j:Landroidx/work/WorkerParameters$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lm2/h;->h:Ld2/i;

    invoke-virtual {v0}, Ld2/i;->m()Ld2/d;

    move-result-object v0

    iget-object v1, p0, Lm2/h;->i:Ljava/lang/String;

    iget-object v2, p0, Lm2/h;->j:Landroidx/work/WorkerParameters$a;

    invoke-virtual {v0, v1, v2}, Ld2/d;->k(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)Z

    return-void
.end method
