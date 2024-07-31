.class public final synthetic La4/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/a$d;


# instance fields
.field public final synthetic a:Lx3/t;


# direct methods
.method public synthetic constructor <init>(Lx3/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/a;->a:Lx3/t;

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 1

    iget-object v0, p0, La4/a;->a:Lx3/t;

    invoke-virtual {v0, p1, p2}, Lx3/t;->i(J)J

    move-result-wide p1

    return-wide p1
.end method
