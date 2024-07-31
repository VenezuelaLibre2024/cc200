.class public final synthetic Lu4/i0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/b0$a;


# instance fields
.field public final synthetic a:Lx3/p;


# direct methods
.method public synthetic constructor <init>(Lx3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/i0;->a:Lx3/p;

    return-void
.end method


# virtual methods
.method public final a(Lt3/s1;)Lu4/b0;
    .locals 1

    iget-object v0, p0, Lu4/i0;->a:Lx3/p;

    invoke-static {v0, p1}, Lu4/h0$b;->a(Lx3/p;Lt3/s1;)Lu4/b0;

    move-result-object p1

    return-object p1
.end method
