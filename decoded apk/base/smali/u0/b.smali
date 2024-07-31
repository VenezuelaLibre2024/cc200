.class public final Lu0/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr0/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/f<",
        "Lu0/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lr0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/f<",
            "Lu0/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr0/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/f<",
            "Lu0/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/b;->a:Lr0/f;

    return-void
.end method


# virtual methods
.method public a(Lsd/p;Ljd/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/p<",
            "-",
            "Lu0/d;",
            "-",
            "Ljd/d<",
            "-",
            "Lu0/d;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljd/d<",
            "-",
            "Lu0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lu0/b;->a:Lr0/f;

    new-instance v1, Lu0/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lu0/b$a;-><init>(Lsd/p;Ljd/d;)V

    invoke-interface {v0, v1, p2}, Lr0/f;->a(Lsd/p;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getData()Lfe/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfe/b<",
            "Lu0/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lu0/b;->a:Lr0/f;

    invoke-interface {v0}, Lr0/f;->getData()Lfe/b;

    move-result-object v0

    return-object v0
.end method
