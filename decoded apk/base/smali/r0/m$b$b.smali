.class public final Lr0/m$b$b;
.super Lr0/m$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/m$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lr0/m$b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "TT;",
            "Ljd/d<",
            "-TT;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lce/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/x<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lr0/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/n<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Ljd/g;


# direct methods
.method public constructor <init>(Lsd/p;Lce/x;Lr0/n;Ljd/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/p<",
            "-TT;-",
            "Ljd/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lce/x<",
            "TT;>;",
            "Lr0/n<",
            "TT;>;",
            "Ljd/g;",
            ")V"
        }
    .end annotation

    const-string v0, "transform"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ack"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callerContext"

    invoke-static {p4, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lr0/m$b;-><init>(Ltd/g;)V

    iput-object p1, p0, Lr0/m$b$b;->a:Lsd/p;

    iput-object p2, p0, Lr0/m$b$b;->b:Lce/x;

    iput-object p3, p0, Lr0/m$b$b;->c:Lr0/n;

    iput-object p4, p0, Lr0/m$b$b;->d:Ljd/g;

    return-void
.end method


# virtual methods
.method public final a()Lce/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lce/x<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lr0/m$b$b;->b:Lce/x;

    return-object v0
.end method

.method public final b()Ljd/g;
    .locals 1

    iget-object v0, p0, Lr0/m$b$b;->d:Ljd/g;

    return-object v0
.end method

.method public c()Lr0/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr0/n<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lr0/m$b$b;->c:Lr0/n;

    return-object v0
.end method

.method public final d()Lsd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsd/p<",
            "TT;",
            "Ljd/d<",
            "-TT;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lr0/m$b$b;->a:Lsd/p;

    return-object v0
.end method
