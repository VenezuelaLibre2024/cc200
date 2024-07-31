.class public Lhb/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lia/q;


# instance fields
.field public a:Lhb/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lia/p;)V
    .locals 1

    iget-object v0, p0, Lhb/k;->a:Lhb/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhb/i;->a(Lia/p;)V

    :cond_0
    return-void
.end method

.method public b(Lhb/i;)V
    .locals 0

    iput-object p1, p0, Lhb/k;->a:Lhb/i;

    return-void
.end method
