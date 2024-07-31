.class public final Lr0/m$m;
.super Lld/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/m;->v(Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lld/f;
    c = "androidx.datastore.core.SingleProcessDataStore"
    f = "SingleProcessDataStore.kt"
    l = {
        0x137
    }
    m = "readAndInitOrPropagateFailure"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lr0/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field public k:I


# direct methods
.method public constructor <init>(Lr0/m;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/m<",
            "TT;>;",
            "Ljd/d<",
            "-",
            "Lr0/m$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr0/m$m;->j:Lr0/m;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr0/m$m;->i:Ljava/lang/Object;

    iget p1, p0, Lr0/m$m;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr0/m$m;->k:I

    iget-object p1, p0, Lr0/m$m;->j:Lr0/m;

    invoke-static {p1, p0}, Lr0/m;->l(Lr0/m;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
