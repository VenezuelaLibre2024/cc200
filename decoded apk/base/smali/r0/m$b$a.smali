.class public final Lr0/m$b$a;
.super Lr0/m$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/m$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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
.field public final a:Lr0/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/n<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr0/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/n<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lr0/m$b;-><init>(Ltd/g;)V

    iput-object p1, p0, Lr0/m$b$a;->a:Lr0/n;

    return-void
.end method


# virtual methods
.method public a()Lr0/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr0/n<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lr0/m$b$a;->a:Lr0/n;

    return-object v0
.end method
