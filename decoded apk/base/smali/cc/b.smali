.class public Lcc/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcc/e;


# instance fields
.field public final a:Lcc/f;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcc/f;

    invoke-direct {v0, p1, p2}, Lcc/f;-><init>(II)V

    iput-object v0, p0, Lcc/b;->a:Lcc/f;

    return-void
.end method


# virtual methods
.method public a(Lcc/f;)Lcc/f;
    .locals 0

    iget-object p1, p0, Lcc/b;->a:Lcc/f;

    return-object p1
.end method
