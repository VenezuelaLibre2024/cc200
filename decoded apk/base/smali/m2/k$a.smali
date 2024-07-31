.class public Lm2/k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm2/k;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ln2/c;

.field public final synthetic i:Lm2/k;


# direct methods
.method public constructor <init>(Lm2/k;Ln2/c;)V
    .locals 0

    iput-object p1, p0, Lm2/k$a;->i:Lm2/k;

    iput-object p2, p0, Lm2/k$a;->h:Ln2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lm2/k$a;->h:Ln2/c;

    iget-object v1, p0, Lm2/k$a;->i:Lm2/k;

    iget-object v1, v1, Lm2/k;->k:Landroidx/work/ListenableWorker;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->d()Ll7/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln2/c;->r(Ll7/f;)Z

    return-void
.end method
