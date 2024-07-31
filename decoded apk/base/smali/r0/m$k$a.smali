.class public final Lr0/m$k$a;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/m$k;->a(Lsd/p;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1"
    f = "SingleProcessDataStore.kt"
    l = {
        0x1f7,
        0x151,
        0x153
    }
    m = "updateData"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lr0/m$k;

.field public o:I


# direct methods
.method public constructor <init>(Lr0/m$k;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/m$k;",
            "Ljd/d<",
            "-",
            "Lr0/m$k$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr0/m$k$a;->n:Lr0/m$k;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr0/m$k$a;->m:Ljava/lang/Object;

    iget p1, p0, Lr0/m$k$a;->o:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr0/m$k$a;->o:I

    iget-object p1, p0, Lr0/m$k$a;->n:Lr0/m$k;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lr0/m$k;->a(Lsd/p;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
